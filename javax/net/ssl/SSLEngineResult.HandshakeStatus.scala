package javax.net.ssl

import java.lang.{Enum, Object, String}

/** An SSLEngineResult enum describing the current
 *  handshaking state of this SSLEngine.
 */
class SSLEngineResult.HandshakeStatus private (name: String, ordinal: Int) extends Enum[SSLEngineResult.HandshakeStatus](name, ordinal) {
}

object SSLEngineResult.HandshakeStatus {
    /** The SSLEngine has just finished handshaking. */
    final val FINISHED = new SSLEngineResult.HandshakeStatus(FINISHED, 0)

    /** The SSLEngine needs the results of one (or more)
     *  delegated tasks before handshaking can continue.
     */
    final val NEED_TASK = new SSLEngineResult.HandshakeStatus(NEED_TASK, 1)

    /** The SSLEngine needs to receive data from the
     *  remote side before handshaking can continue.
     */
    final val NEED_UNWRAP = new SSLEngineResult.HandshakeStatus(NEED_UNWRAP, 2)

    /** The SSLEngine must send data to the remote side
     *  before handshaking can continue, so SSLEngine.wrap()
     *  should be called.
     */
    final val NEED_WRAP = new SSLEngineResult.HandshakeStatus(NEED_WRAP, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SSLEngineResult.HandshakeStatus = ???
}
