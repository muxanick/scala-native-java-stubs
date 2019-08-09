package java.security

import java.lang.{Exception, Object, Throwable}

// This exception is thrown if a key in the keystore cannot be recovered.
class UnrecoverableKeyException extends UnrecoverableEntryException {

    @stub
    // Constructs an UnrecoverableKeyException with no detail message.
    def this() = ???
}