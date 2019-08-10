package javax.net.ssl

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** An encapsulation of the result state produced by
 *  SSLEngine I/O calls.
 * 
 *   A SSLEngine provides a means for establishing
 *  secure communication sessions between two peers.  SSLEngine
 *  operations typically consume bytes from an input buffer and produce
 *  bytes in an output buffer.  This class provides operational result
 *  values describing the state of the SSLEngine, including
 *  indications of what operations are needed to finish an
 *  ongoing handshake.  Lastly, it reports the number of bytes consumed
 *  and produced as a result of this operation.
 */
class SSLEngineResult extends Object {

    /** Initializes a new instance of this class. */
    @stub
    def this(status: SSLEngineResult.Status, handshakeStatus: SSLEngineResult.HandshakeStatus, bytesConsumed: Int, bytesProduced: Int) = ???

    /** Returns the number of bytes consumed from the input buffer. */
    @stub
    def bytesConsumed(): Int = ???

    /** Returns the number of bytes written to the output buffer. */
    @stub
    def bytesProduced(): Int = ???

    /** Gets the handshake status of this SSLEngine
     *  operation.
     */
    @stub
    def getHandshakeStatus(): SSLEngineResult.HandshakeStatus = ???

    /** Gets the return value of this SSLEngine operation. */
    @stub
    def getStatus(): SSLEngineResult.Status = ???

    /** Returns a String representation of this object. */
    @stub
    def toString(): String = ???
}

object SSLEngineResult {
    /** An SSLEngineResult enum describing the current
     *  handshaking state of this SSLEngine.
     */
    class HandshakeStatus private (name: String, ordinal: Int) extends Enum[HandshakeStatus](name, ordinal) {
    }

    object HandshakeStatus {
        /** The SSLEngine has just finished handshaking. */
        final val FINISHED: HandshakeStatus = new HandshakeStatus("FINISHED", 0)

        /** The SSLEngine needs the results of one (or more)
         *  delegated tasks before handshaking can continue.
         */
        final val NEED_TASK: HandshakeStatus = new HandshakeStatus("NEED_TASK", 1)

        /** The SSLEngine needs to receive data from the
         *  remote side before handshaking can continue.
         */
        final val NEED_UNWRAP: HandshakeStatus = new HandshakeStatus("NEED_UNWRAP", 2)

        /** The SSLEngine must send data to the remote side
         *  before handshaking can continue, so SSLEngine.wrap()
         *  should be called.
         */
        final val NEED_WRAP: HandshakeStatus = new HandshakeStatus("NEED_WRAP", 3)

        /** The SSLEngine is not currently handshaking. */
        final val NOT_HANDSHAKING: HandshakeStatus = new HandshakeStatus("NOT_HANDSHAKING", 4)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): HandshakeStatus = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[HandshakeStatus] = ???
    }


    /** An SSLEngineResult enum describing the overall result
     *  of the SSLEngine operation.
     * 
     *  The Status value does not reflect the
     *  state of a SSLEngine handshake currently
     *  in progress.  The SSLEngineResult's HandshakeStatus
     *  should be consulted for that information.
     */
    class Status private (name: String, ordinal: Int) extends Enum[Status](name, ordinal) {
    }

    object Status {
        /** The SSLEngine was not able to process the
         *  operation because there are not enough bytes available in the
         *  destination buffer to hold the result.
         */
        final val BUFFER_OVERFLOW: Status = new Status("BUFFER_OVERFLOW", 0)

        /** The SSLEngine was not able to unwrap the
         *  incoming data because there were not enough source bytes
         *  available to make a complete packet.
         */
        final val BUFFER_UNDERFLOW: Status = new Status("BUFFER_UNDERFLOW", 1)

        /** The operation just closed this side of the
         *  SSLEngine, or the operation
         *  could not be completed because it was already closed.
         */
        final val CLOSED: Status = new Status("CLOSED", 2)

        /** The SSLEngine completed the operation, and
         *  is available to process similar calls.
         */
        final val OK: Status = new Status("OK", 3)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Status = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Status] = ???
    }

}
