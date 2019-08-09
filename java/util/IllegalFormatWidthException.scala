package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

// Unchecked exception thrown when the format width is a negative value other
// than -1 or is otherwise unsupported.
class IllegalFormatWidthException extends IllegalFormatException {

    @stub
    // Returns the detail message string of this throwable.
    def getMessage(): String = ???
}
