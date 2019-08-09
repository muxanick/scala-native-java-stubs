package java.rmi.server

import java.io.PrintStream
import java.lang.{Object, String}

// The RemoteServer class is the common superclass to server
// implementations and provides the framework to support a wide range
// of remote reference semantics.  Specifically, the functions needed
// to create and export remote objects (i.e. to make them remotely
// available) are provided abstractly by RemoteServer and
// concretely by its subclass(es).
abstract class RemoteServer extends RemoteObject {

    @stub
    // Constructs a RemoteServer.
    protected def this() = ???
}

object RemoteServer {
    @stub
    // Returns a string representation of the client host for the
    // remote method invocation being processed in the current thread.
    def getClientHost(): String = ???

    @stub
    // Returns stream for the RMI call log.
    def getLog(): PrintStream = ???
}
