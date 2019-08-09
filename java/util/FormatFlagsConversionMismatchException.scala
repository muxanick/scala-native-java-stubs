package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

// Unchecked exception thrown when a conversion and flag are incompatible.
//
//  Unless otherwise specified, passing a null argument to any
// method or constructor in this class will cause a NullPointerException to be thrown.
class FormatFlagsConversionMismatchException extends IllegalFormatException {

    @stub
    // Returns the incompatible conversion.
    def getConversion(): Char = ???

    @stub
    // Returns the incompatible flag.
    def getFlags(): String = ???
}
