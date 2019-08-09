package java.rmi.server

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException

// An ExportException is a RemoteException
// thrown if an attempt to export a remote object fails.  A remote object is
// exported via the constructors and exportObject methods of
// java.rmi.server.UnicastRemoteObject and
// java.rmi.activation.Activatable.
class ExportException extends RemoteException {

    @stub
    // Constructs an ExportException with the specified
    // detail message.
    def this(s: String) = ???
}
