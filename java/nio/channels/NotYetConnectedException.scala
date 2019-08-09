package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to invoke an I/O
 *  operation upon a socket channel that is not yet connected.
 */
class NotYetConnectedException extends IllegalStateException {
}
