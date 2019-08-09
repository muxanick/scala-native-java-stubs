package java.util

import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// Signals that a resource is missing.
class MissingResourceException extends RuntimeException {

    @stub
    // Gets parameter passed by constructor.
    def getClassName(): String = ???
}
