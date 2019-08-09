package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

// Unchecked exception thrown when an unknown flag is given.
//
//  Unless otherwise specified, passing a null argument to any
// method or constructor in this class will cause a NullPointerException to be thrown.
class UnknownFormatFlagsException extends IllegalFormatException {

    @stub
    // Returns the set of flags which contains an unknown flag.
    def getFlags(): String = ???
}
