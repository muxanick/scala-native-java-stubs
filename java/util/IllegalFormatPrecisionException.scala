package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when the precision is a negative value other than
 *  -1, the conversion does not support a precision, or the value is
 *  otherwise unsupported.
 */
class IllegalFormatPrecisionException extends IllegalFormatException {

    /** Constructs an instance of this class with the specified precision. */
    @stub
    def this(p: Int) = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???

    /** Returns the precision */
    @stub
    def getPrecision(): Int = ???
}
