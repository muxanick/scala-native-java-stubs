package java.io

import java.lang.{Exception, Object, String, Throwable}

// Signals that an I/O exception of some sort has occurred. This
// class is the general class of exceptions produced by failed or
// interrupted I/O operations.
class IOException extends Exception {

    @stub
    // Constructs an IOException with null
    // as its error detail message.
    def this() = ???

    @stub
    // Constructs an IOException with the specified detail message.
    def this(message: String) = ???

    @stub
    // Constructs an IOException with the specified detail message
    // and cause.
    def this(message: String, cause: Throwable) = ???
}
