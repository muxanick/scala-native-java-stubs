package java.nio.channels

import java.nio.ByteBuffer

/** A byte channel that maintains a current position and allows the
 *  position to be changed.
 * 
 *   A seekable byte channel is connected to an entity, typically a file,
 *  that contains a variable-length sequence of bytes that can be read and
 *  written. The current position can be queried and
 *  modified. The channel also provides access to
 *  the current size of the entity to which the channel is connected. The
 *  size increases when bytes are written beyond its current size; the size
 *  decreases when it is truncated.
 * 
 *   The position and truncate methods
 *  which do not otherwise have a value to return are specified to return the
 *  channel upon which they are invoked. This allows method invocations to be
 *  chained. Implementations of this interface should specialize the return type
 *  so that method invocations on the implementation class can be chained.
 */
trait SeekableByteChannel extends ByteChannel {

    /** Returns this channel's position. */
    @stub
    def position(): Long = ???

    /** Sets this channel's position. */
    @stub
    def position(newPosition: Long): SeekableByteChannel = ???

    /** Reads a sequence of bytes from this channel into the given buffer. */
    @stub
    def read(dst: ByteBuffer): Int = ???

    /** Returns the current size of entity to which this channel is connected. */
    @stub
    def size(): Long = ???

    /** Truncates the entity, to which this channel is connected, to the given
     *  size.
     */
    @stub
    def truncate(size: Long): SeekableByteChannel = ???
}
