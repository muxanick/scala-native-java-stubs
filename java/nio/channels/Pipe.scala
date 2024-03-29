package java.nio.channels

import java.lang.Object
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel, SelectorProvider}
import scala.scalanative.annotation.stub

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

    /** Initializes a new instance of this class. */
    @stub
    protected def this() = ???

    /** Returns this pipe's sink channel. */
    def sink(): Pipe.SinkChannel

    /** Returns this pipe's source channel. */
    def source(): Pipe.SourceChannel
}

object Pipe {
    /** A channel representing the writable end of a Pipe. */
    abstract object SinkChannel extends AbstractSelectableChannel with WritableByteChannel with GatheringByteChannel {

        /** Initializes a new instance of this class. */
        @stub
        protected def apply(provider: SelectorProvider) = ???

        /** Returns an operation set identifying this channel's supported
         *  operations.
         */
        @stub
        def validOps(): Int = ???
    }


    /** A channel representing the readable end of a Pipe. */
    abstract object SourceChannel extends AbstractSelectableChannel with ReadableByteChannel with ScatteringByteChannel {

        /** Constructs a new instance of this class. */
        @stub
        protected def apply(provider: SelectorProvider) = ???

        /** Returns an operation set identifying this channel's supported
         *  operations.
         */
        @stub
        def validOps(): Int = ???
    }


    /** Opens a pipe. */
    @stub
    def open(): Pipe = ???
}
