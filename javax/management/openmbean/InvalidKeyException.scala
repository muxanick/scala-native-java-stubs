package javax.management.openmbean

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

// This runtime exception is thrown to indicate that a method parameter which was expected to be
// an item name of a composite data or a row index of a tabular data is not valid.
class InvalidKeyException extends IllegalArgumentException {

    @stub
    // An InvalidKeyException with no detail message.
    def this() = ???
}