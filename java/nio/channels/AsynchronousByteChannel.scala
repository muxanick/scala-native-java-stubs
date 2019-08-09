package java.nio.channels

import java.lang.Integer
import java.nio.ByteBuffer
import java.util.concurrent.Future
import scala.scalanative.annotation.stub

/** An asynchronous channel that can read and write bytes.
 * 
 *   Some channels may not allow more than one read or write to be outstanding
 *  at any given time. If a thread invokes a read method before a previous read
 *  operation has completed then a ReadPendingException will be thrown.
 *  Similarly, if a write method is invoked before a previous write has completed
 *  then WritePendingException is thrown. Whether or not other kinds of
 *  I/O operations may proceed concurrently with a read operation depends upon
 *  the type of the channel.
 * 
 *   Note that ByteBuffers are not safe for use by
 *  multiple concurrent threads. When a read or write operation is initiated then
 *  care must be taken to ensure that the buffer is not accessed until the
 *  operation completes.
 */
trait AsynchronousByteChannel extends AsynchronousChannel {

    /** Reads a sequence of bytes from this channel into the given buffer. */
    @stub
    def read(dst: ByteBuffer): Future[Integer] = ???

    /** Reads a sequence of bytes from this channel into the given buffer. */
    @stub
    def read[A](dst: ByteBuffer, attachment: A, handler: CompletionHandler[Integer, _ >: A]): Unit = ???

    /** Writes a sequence of bytes to this channel from the given buffer. */
    @stub
    def write(src: ByteBuffer): Future[Integer] = ???

    /** Writes a sequence of bytes to this channel from the given buffer. */
    @stub
    def write[A](src: ByteBuffer, attachment: A, handler: CompletionHandler[Integer, _ >: A]): Unit = ???
}
