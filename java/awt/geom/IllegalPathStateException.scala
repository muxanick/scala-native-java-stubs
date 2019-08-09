package java.awt.geom

import java.lang.{Exception, Object, RuntimeException, Throwable}

// The IllegalPathStateException represents an
// exception that is thrown if an operation is performed on a path
// that is in an illegal state with respect to the particular
// operation being performed, such as appending a path segment
// to a GeneralPath without an initial moveto.
class IllegalPathStateException extends RuntimeException {

    @stub
    // Constructs an IllegalPathStateException with no
    // detail message.
    def this() = ???
}
