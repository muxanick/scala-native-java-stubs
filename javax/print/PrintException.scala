package javax.print

import java.lang.{Exception, Object, String, Throwable}

// Class PrintException encapsulates a printing-related error condition that
// occurred while using a Print Service instance. This base class
// furnishes only a string description of the error. Subclasses furnish more
// detailed information if applicable.
class PrintException extends Exception {

    @stub
    // Construct a print exception with no detail message.
    def this() = ???

    @stub
    // Construct a print exception chaining the supplied exception.
    def this(e: Exception) = ???

    @stub
    // Construct a print exception with the given detail message.
    def this(s: String) = ???
}
