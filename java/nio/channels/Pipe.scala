package java.nio.channels

import java.lang.Object

/** A pair of channels that implements a unidirectional pipe.
 * 
 *   A pipe consists of a pair of channels: A writable sink channel and a readable source
 *  channel.  Once some bytes are written to the sink channel they can be read
 *  from source channel in exactlyAthe order in which they were written.
 * 
 *   Whether or not a thread writing bytes to a pipe will block until another
 *  thread reads those bytes, or some previously-written bytes, from the pipe is
 *  system-dependent and therefore unspecified.  Many pipe implementations will
 *  buffer up to a certain number of bytes between the sink and source channels,
 *  but such buffering should not be assumed.  
 */
abstract class Pipe extends Object {

    /** Returns this pipe's sink channel. */
    def sink(): Pipe.SinkChannel
}

object Pipe {
    /** A channel representing the writable end of a Pipe. */
    @stub
    object SinkChannel extends Pipe.SinkChannel

    /** Opens a pipe. */
    @stub
    def open(): Pipe = ???
}
