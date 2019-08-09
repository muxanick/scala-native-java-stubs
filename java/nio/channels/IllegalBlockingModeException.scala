package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when a blocking-mode-specific operation
 *  is invoked upon a channel in the incorrect blocking mode.
 */
class IllegalBlockingModeException extends IllegalStateException {
}
