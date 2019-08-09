package java.util

import java.lang.{Class, Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when the argument corresponding to the format
 *  specifier is of an incompatible type.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class IllegalFormatConversionException extends IllegalFormatException {

    /** Constructs an instance of this class with the mismatched conversion and
     *  the corresponding argument class.
     */
    @stub
    def this(c: Char, arg: Class[_]) = ???

    /** Returns the class of the mismatched argument. */
    @stub
    def getArgumentClass(): Class[_] = ???

    /** Returns the inapplicable conversion. */
    @stub
    def getConversion(): Char = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???
}
