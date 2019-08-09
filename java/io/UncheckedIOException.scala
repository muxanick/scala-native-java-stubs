package java.io

import java.lang.{Exception, Object, RuntimeException, Throwable}

/** Wraps an IOException with an unchecked exception. */
class UncheckedIOException extends RuntimeException {

    /** Constructs an instance of this class. */
    @stub
    def this(cause: IOException) = ???
}
