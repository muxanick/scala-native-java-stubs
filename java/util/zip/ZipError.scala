package java.util.zip

import java.lang.{Error, InternalError, Object, String, Throwable, VirtualMachineError}
import scala.scalanative.annotation.stub

/** Signals that an unrecoverable error has occurred. */
class ZipError extends InternalError {

    /** Constructs a ZipError with the given detail message. */
    @stub
    def this(s: String) = ???
}
