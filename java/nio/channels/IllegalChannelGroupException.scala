package java.nio.channels

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to open a channel
 *  in a group that was not created by the same provider.
 */
class IllegalChannelGroupException extends IllegalArgumentException {
}
