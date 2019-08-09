package java.io

import java.lang.{Exception, Object, Throwable}

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
}
