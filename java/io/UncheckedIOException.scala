package java.io

import java.lang.{Exception, Object, RuntimeException, Throwable}

// Wraps an IOException with an unchecked exception.
class UncheckedIOException extends RuntimeException {

    @stub
    // Constructs an instance of this class.
    def this(cause: IOException) = ???
}
