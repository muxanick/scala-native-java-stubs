package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// A StubNotFoundException is thrown if a valid stub class
// could not be found for a remote object when it is exported.
// A StubNotFoundException may also be
// thrown when an activatable object is registered via the
// java.rmi.activation.Activatable.register method.
class StubNotFoundException extends RemoteException {

    @stub
    // Constructs a StubNotFoundException with the specified
    // detail message.
    def this(s: String) = ???
}
