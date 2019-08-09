package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to write
// to a channel that was not originally opened for writing.
class NonWritableChannelException extends IllegalStateException {
}
