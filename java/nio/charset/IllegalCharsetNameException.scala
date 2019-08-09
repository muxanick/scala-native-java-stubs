package java.nio.charset

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when a string that is not a
 *  legal charset name is used as such.
 */
class IllegalCharsetNameException extends IllegalArgumentException {
}
