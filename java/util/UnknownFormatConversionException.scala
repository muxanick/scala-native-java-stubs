package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an unknown conversion is given.
 * 
 *   Unless otherwise specified, passing a null argument to
 *  any method or constructor in this class will cause a NullPointerException to be thrown.
 */
class UnknownFormatConversionException extends IllegalFormatException {

    /** Constructs an instance of this class with the unknown conversion. */
    @stub
    def this(s: String) = ???

    /** Returns the unknown conversion. */
    @stub
    def getConversion(): String = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???
}
