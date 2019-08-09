package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to construct a channel in 
// a group that is shutdown or the completion handler for an I/O operation 
// cannot be invoked because the channel group has terminated.
class ShutdownChannelGroupException extends IllegalStateException {
}
