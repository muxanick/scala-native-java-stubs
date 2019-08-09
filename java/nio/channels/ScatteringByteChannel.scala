package java.nio.channels

import java.nio.ByteBuffer

/** A channel that can read bytes into a sequence of buffers.
 * 
 *   A scattering read operation reads, in a single invocation, a
 *  sequence of bytes into one or more of a given sequence of buffers.
 *  Scattering reads are often useful when implementing network protocols or
 *  file formats that, for example, group data into segments consisting of one
 *  or more fixed-length headers followed by a variable-length body.  Similar
 *  gathering write operations are defined in the GatheringByteChannel interface.  
 */
trait ScatteringByteChannel extends ReadableByteChannel {

    /** Reads a sequence of bytes from this channel into the given buffers. */
    @stub
    def read(dsts: Array[ByteBuffer]): Long = ???
}
