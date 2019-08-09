package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to read from an
// asynchronous socket channel and a previous read has not completed.
class ReadPendingException extends IllegalStateException {
}
