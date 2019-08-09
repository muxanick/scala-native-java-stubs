package java.nio.channels

import java.nio.ByteBuffer

/** A channel that can write bytes from a sequence of buffers.
 * 
 *   A gathering write operation writes, in a single invocation, a
 *  sequence of bytes from one or more of a given sequence of buffers.
 *  Gathering writes are often useful when implementing network protocols or
 *  file formats that, for example, group data into segments consisting of one
 *  or more fixed-length headers followed by a variable-length body.  Similar
 *  scattering read operations are defined in the ScatteringByteChannel interface.  
 */
trait GatheringByteChannel extends WritableByteChannel {

    /** Writes a sequence of bytes to this channel from the given buffers. */
    @stub
    def write(srcs: Array[ByteBuffer]): Long = ???
}
