package java.nio.file

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to invoke a method on an
// object created by one file system provider with a parameter created by a
// different file system provider.
class ProviderMismatchException extends IllegalArgumentException {

    @stub
    // Constructs an instance of this class.
    def this() = ???
}
