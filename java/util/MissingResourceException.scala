package java.util

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that a resource is missing. */
class MissingResourceException extends RuntimeException {

    /** Constructs a MissingResourceException with the specified information. */
    @stub
    def this(s: String, className: String, key: String) = ???

    /** Gets parameter passed by constructor. */
    @stub
    def getClassName(): String = ???

    /** Gets parameter passed by constructor. */
    @stub
    def getKey(): String = ???
}
