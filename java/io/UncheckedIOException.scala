package java.io

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Wraps an IOException with an unchecked exception. */
class UncheckedIOException extends RuntimeException {

    /** Constructs an instance of this class. */
    @stub
    def this(cause: IOException) = ???

    /** Constructs an instance of this class. */
    @stub
    def this(message: String, cause: IOException) = ???

    /** Returns the cause of this exception. */
    @stub
    def getCause(): IOException = ???
}
