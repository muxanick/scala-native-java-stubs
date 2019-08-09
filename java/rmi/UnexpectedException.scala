package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// An UnexpectedException is thrown if the client of a
// remote method call receives, as a result of the call, a checked
// exception that is not among the checked exception types declared in the
// throws clause of the method in the remote interface.
class UnexpectedException extends RemoteException {

    @stub
    // Constructs an UnexpectedException with the specified
    // detail message.
    def this(s: String) = ???
}
