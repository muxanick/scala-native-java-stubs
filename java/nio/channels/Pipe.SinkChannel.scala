package java.nio.channels

import java.lang.Object
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel, SelectorProvider}
import scala.scalanative.annotation.stub

/** A channel representing the writable end of a Pipe. */
object abstract Pipe_SinkChannel extends AbstractSelectableChannel with WritableByteChannel with GatheringByteChannel {

    /** Initializes a new instance of this class. */
    @stub
    protected def SinkChannel(provider: SelectorProvider) = ???

    /** Returns an operation set identifying this channel's supported
     *  operations.
     */
    @stub
    def validOps(): Int = ???
}
