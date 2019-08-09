package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

// Unchecked exception thrown when an illegal combination flags is given.
//
//  Unless otherwise specified, passing a null argument to any
// method or constructor in this class will cause a NullPointerException to be thrown.
class IllegalFormatFlagsException extends IllegalFormatException {

    @stub
    // Returns the set of flags which contains an illegal combination.
    def getFlags(): String = ???
}
