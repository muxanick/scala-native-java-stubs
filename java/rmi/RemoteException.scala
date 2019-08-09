package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// A RemoteException is the common superclass for a number of
// communication-related exceptions that may occur during the execution of a
// remote method call.  Each method of a remote interface, an interface that
// extends java.rmi.Remote, must list
// RemoteException in its throws clause.
//
// As of release 1.4, this exception has been retrofitted to conform to
// the general purpose exception-chaining mechanism.  The "wrapped remote
// exception" that may be provided at construction time and accessed via
// the public detail field is now known as the cause, and
// may be accessed via the Throwable.getCause() method, as well as
// the aforementioned "legacy field."
//
// Invoking the method Throwable.initCause(Throwable) on an
// instance of RemoteException always throws IllegalStateException.
class RemoteException extends IOException {

    @stub
    // Constructs a RemoteException.
    def this() = ???

    @stub
    // Constructs a RemoteException with the specified
    // detail message.
    def this(s: String) = ???

    @stub
    // Returns the cause of this exception.
    def getCause(): Throwable = ???
}
