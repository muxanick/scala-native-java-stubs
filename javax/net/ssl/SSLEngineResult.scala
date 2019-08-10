package javax.net.ssl

import java.lang.{Object, String}
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
    type HandshakeStatus = SSLEngineResult_HandshakeStatus

    /** An SSLEngineResult enum describing the overall result
     *  of the SSLEngine operation.
     */
    type Status = SSLEngineResult_Status
}
