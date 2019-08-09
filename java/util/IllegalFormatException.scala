package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when a format string contains an illegal syntax
 *  or a format specifier that is incompatible with the given arguments.  Only
 *  explicit subtypes of this exception which correspond to specific errors
 *  should be instantiated.
 */
class IllegalFormatException extends IllegalArgumentException {
}
