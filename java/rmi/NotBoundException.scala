package java.rmi

import java.lang.{Exception, Object, Throwable}

// A NotBoundException is thrown if an attempt
// is made to lookup or unbind in the registry a name that has
// no associated binding.
class NotBoundException extends Exception {

    @stub
    // Constructs a NotBoundException with no
    // specified detail message.
    def this() = ???
}
