package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that an I/O operation has been interrupted. An
 *  InterruptedIOException is thrown to indicate that an
 *  input or output transfer has been terminated because the thread
 *  performing it was interrupted. The field bytesTransferred
 *  indicates how many bytes were successfully transferred before
 *  the interruption occurred.
 */
class InterruptedIOException extends IOException {

    /** Constructs an InterruptedIOException with
     *  null as its error detail message.
     */
    @stub
    def this() = ???

    /** Constructs an InterruptedIOException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???

    /** Reports how many bytes had been transferred as part of the I/O
     *  operation before it was interrupted.
     */
    @stub
    val bytesTransferred: Int = ???
}
