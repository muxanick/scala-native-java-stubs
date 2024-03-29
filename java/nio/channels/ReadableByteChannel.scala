package java.nio.channels

import java.nio.ByteBuffer
import scala.scalanative.annotation.stub

/** A channel that can read bytes.
 * 
 *   Only one read operation upon a readable channel may be in progress at
 *  any given time.  If one thread initiates a read operation upon a channel
 *  then any other thread that attempts to initiate another read operation will
 *  block until the first operation is complete.  Whether or not other kinds of
 *  I/O operations may proceed concurrently with a read operation depends upon
 *  the type of the channel. 
 */
trait ReadableByteChannel extends Channel {

    /** Reads a sequence of bytes from this channel into the given buffer. */
    @stub
    def read(dst: ByteBuffer): Int = ???
}
