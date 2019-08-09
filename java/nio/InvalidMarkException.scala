package java.nio

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to reset a buffer
 *  when its mark is not defined.
 */
class InvalidMarkException extends IllegalStateException {
}
