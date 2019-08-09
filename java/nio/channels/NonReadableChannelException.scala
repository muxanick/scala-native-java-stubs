package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to read
 *  from a channel that was not originally opened for reading.
 */
class NonReadableChannelException extends IllegalStateException {
}
