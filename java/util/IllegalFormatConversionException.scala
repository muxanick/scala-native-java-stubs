package java.util

import java.lang.{Class, Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when the argument corresponding to the format
// specifier is of an incompatible type.
//
//  Unless otherwise specified, passing a null argument to any
// method or constructor in this class will cause a NullPointerException to be thrown.
class IllegalFormatConversionException extends IllegalFormatException {

    @stub
    // Returns the class of the mismatched argument.
    def getArgumentClass(): Class[_] = ???

    @stub
    // Returns the inapplicable conversion.
    def getConversion(): Char = ???
}
