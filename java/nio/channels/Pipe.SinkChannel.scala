package java.nio.channels

import java.lang.Object
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel}

// A channel representing the writable end of a Pipe.
object abstract Pipe.SinkChannel extends AbstractSelectableChannel with WritableByteChannel, with GatheringByteChannel {
