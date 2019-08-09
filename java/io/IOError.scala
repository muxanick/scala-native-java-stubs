package java.io

import java.lang.{Error, Object, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when a serious I/O error has occurred. */
class IOError extends Error {

    /** Constructs a new instance of IOError with the specified cause. */
    @stub
    def this(cause: Throwable) = ???
}
