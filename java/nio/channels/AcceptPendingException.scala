package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to initiate an accept
 *  operation on a channel and a previous accept operation has not completed.
 */
class AcceptPendingException extends IllegalStateException {
}
