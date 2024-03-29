package java.rmi.server

import java.io.{OutputStream, PrintStream}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The RemoteServer class is the common superclass to server
 *  implementations and provides the framework to support a wide range
 *  of remote reference semantics.  Specifically, the functions needed
 *  to create and export remote objects (i.e. to make them remotely
 *  available) are provided abstractly by RemoteServer and
 *  concretely by its subclass(es).
 */
abstract class RemoteServer extends RemoteObject {

    /** Constructs a RemoteServer. */
    @stub
    protected def this() = ???

    /** Constructs a RemoteServer with the given reference type. */
    @stub
    protected def this(ref: RemoteRef) = ???
}

object RemoteServer {
    /** Returns a string representation of the client host for the
     *  remote method invocation being processed in the current thread.
     */
    @stub
    def getClientHost(): String = ???

    /** Returns stream for the RMI call log. */
    @stub
    def getLog(): PrintStream = ???

    /** Log RMI calls to the output stream out. */
    @stub
    def setLog(out: OutputStream): Unit = ???
}
