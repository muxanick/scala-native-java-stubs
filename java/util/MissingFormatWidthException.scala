package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when the format width is required.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class MissingFormatWidthException extends IllegalFormatException {

    /** Constructs an instance of this class with the specified format
     *  specifier.
     */
    @stub
    def this(s: String) = ???

    /** Returns the format specifier which does not have a width. */
    @stub
    def getFormatSpecifier(): String = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???
}
