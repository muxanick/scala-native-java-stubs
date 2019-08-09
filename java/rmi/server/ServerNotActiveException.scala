package java.rmi.server

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** An ServerNotActiveException is an Exception
 *  thrown during a call to RemoteServer.getClientHost if
 *  the getClientHost method is called outside of servicing a remote
 *  method call.
 */
class ServerNotActiveException extends Exception {

    /** Constructs an ServerNotActiveException with no specified
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an ServerNotActiveException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
