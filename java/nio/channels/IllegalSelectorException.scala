package java.nio.channels

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to register a channel
 *  with a selector that was not created by the provider that created the
 *  channel.
 */
class IllegalSelectorException extends IllegalArgumentException {
}
