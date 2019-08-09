package java.lang.reflect

import java.lang.{ClassFormatError, Error, LinkageError, Object, Throwable}

// Thrown when a syntactically malformed signature attribute is
// encountered by a reflective method that needs to interpret the
// generic signature information for a type, method or constructor.
class GenericSignatureFormatError extends ClassFormatError {

    @stub
    // Constructs a new GenericSignatureFormatError.
    def this() = ???
}
