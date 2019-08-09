package java.rmi

import java.lang.{Exception, Object, Throwable}

// An AlreadyBoundException is thrown if an attempt
// is made to bind an object in the registry to a name that already
// has an associated binding.
class AlreadyBoundException extends Exception {

    @stub
    // Constructs an AlreadyBoundException with no
    // specified detail message.
    def this() = ???
}
