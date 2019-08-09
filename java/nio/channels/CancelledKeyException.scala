package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to use
 *  a selection key that is no longer valid.
 */
class CancelledKeyException extends IllegalStateException {
}
