package javax.net.ssl

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** An SSLEngineResult enum describing the overall result
 *  of the SSLEngine operation.
 * 
 *  The Status value does not reflect the
 *  state of a SSLEngine handshake currently
 *  in progress.  The SSLEngineResult's HandshakeStatus
 *  should be consulted for that information.
 */
class SSLEngineResult_Status private (name: String, ordinal: Int) extends Enum[SSLEngineResult.Status](name, ordinal) {
}

object SSLEngineResult_Status {
    /** The SSLEngine was not able to process the
     *  operation because there are not enough bytes available in the
     *  destination buffer to hold the result.
     */
    final val BUFFER_OVERFLOW = new SSLEngineResult.Status(BUFFER_OVERFLOW, 0)

    /** The SSLEngine was not able to unwrap the
     *  incoming data because there were not enough source bytes
     *  available to make a complete packet.
     */
    final val BUFFER_UNDERFLOW = new SSLEngineResult.Status(BUFFER_UNDERFLOW, 1)

    /** The operation just closed this side of the
     *  SSLEngine, or the operation
     *  could not be completed because it was already closed.
     */
    final val CLOSED = new SSLEngineResult.Status(CLOSED, 2)

    /** The SSLEngine completed the operation, and
     *  is available to process similar calls.
     */
    final val OK = new SSLEngineResult.Status(OK, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SSLEngineResult.Status = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[SSLEngineResult.Status] = ???
}
