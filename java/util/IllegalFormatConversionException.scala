package java.util

import java.lang.{Class, Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when the argument corresponding to the format
 *  specifier is of an incompatible type.
 * 
 *   Unless otherwise specified, passing a null argument to any
 *  method or constructor in this class will cause a NullPointerException to be thrown.
 */
class IllegalFormatConversionException extends IllegalFormatException {

    /** Returns the class of the mismatched argument. */
    @stub
    def getArgumentClass(): Class[_] = ???

    /** Returns the inapplicable conversion. */
    @stub
    def getConversion(): Char = ???
}
