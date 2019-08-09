package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to write to an
// asynchronous socket channel and a previous write has not completed.
class WritePendingException extends IllegalStateException {
}
