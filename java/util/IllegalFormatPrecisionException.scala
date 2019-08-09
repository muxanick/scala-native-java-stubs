package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

/** Unchecked exception thrown when the precision is a negative value other than
 *  -1, the conversion does not support a precision, or the value is
 *  otherwise unsupported.
 */
class IllegalFormatPrecisionException extends IllegalFormatException {

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???
}
