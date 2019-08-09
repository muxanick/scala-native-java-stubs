package java.rmi.server

import java.lang.{Exception, Object, Throwable}

// An ServerNotActiveException is an Exception
// thrown during a call to RemoteServer.getClientHost if
// the getClientHost method is called outside of servicing a remote
// method call.
class ServerNotActiveException extends Exception {

    @stub
    // Constructs an ServerNotActiveException with no specified
    // detail message.
    def this() = ???
}
