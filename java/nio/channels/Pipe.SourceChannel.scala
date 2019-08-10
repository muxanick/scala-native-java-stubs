package java.nio.channels

import java.lang.Object
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel, SelectorProvider}
import scala.scalanative.annotation.stub

/** A channel representing the readable end of a Pipe. */
object abstract Pipe_SourceChannel extends AbstractSelectableChannel with ReadableByteChannel with ScatteringByteChannel {

    /** Constructs a new instance of this class. */
    @stub
    protected def SourceChannel(provider: SelectorProvider) = ???

    /** Returns an operation set identifying this channel's supported
     *  operations.
     */
    @stub
    def validOps(): Int = ???
}
