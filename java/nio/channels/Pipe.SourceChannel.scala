package java.nio.channels

import java.lang.Object
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel}

// A channel representing the readable end of a Pipe.
object abstract Pipe.SourceChannel extends AbstractSelectableChannel with ReadableByteChannel, with ScatteringByteChannel {
