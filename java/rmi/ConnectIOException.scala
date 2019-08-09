package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A ConnectIOException is thrown if an
 *  IOException occurs while making a connection
 *  to the remote host for a remote method call.
 */
class ConnectIOException extends RemoteException {

    /** Constructs a ConnectIOException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a ConnectIOException with the specified
     *  detail message and nested exception.
     */
    @stub
    def this(s: String, ex: Exception) = ???
}
