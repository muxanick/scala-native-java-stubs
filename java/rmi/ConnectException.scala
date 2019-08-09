package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A ConnectException is thrown if a connection is refused
 *  to the remote host for a remote method call.
 */
class ConnectException extends RemoteException {

    /** Constructs a ConnectException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a ConnectException with the specified
     *  detail message and nested exception.
     */
    @stub
    def this(s: String, ex: Exception) = ???
}
