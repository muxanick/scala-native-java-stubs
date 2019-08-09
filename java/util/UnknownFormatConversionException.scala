package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

// Unchecked exception thrown when an unknown conversion is given.
//
//  Unless otherwise specified, passing a null argument to
// any method or constructor in this class will cause a NullPointerException to be thrown.
class UnknownFormatConversionException extends IllegalFormatException {

    @stub
    // Returns the unknown conversion.
    def getConversion(): String = ???
}
