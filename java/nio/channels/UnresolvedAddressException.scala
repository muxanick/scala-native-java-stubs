package java.nio.channels

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to invoke a network
 *  operation upon an unresolved socket address.
 */
class UnresolvedAddressException extends IllegalArgumentException {
}
