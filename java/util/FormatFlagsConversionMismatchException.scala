package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when a conversion and flag are incompatible.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class FormatFlagsConversionMismatchException extends IllegalFormatException {

    /** Constructs an instance of this class with the specified flag
     *  and conversion.
     */
    @stub
    def this(f: String, c: Char) = ???

    /** Returns the incompatible conversion. */
    @stub
    def getConversion(): Char = ???

    /** Returns the incompatible flag. */
    @stub
    def getFlags(): String = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???
}
