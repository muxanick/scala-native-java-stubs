package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** An UnknownHostException is thrown if a
 *  java.net.UnknownHostException occurs while creating
 *  a connection to the remote host for a remote method call.
 */
class UnknownHostException extends RemoteException {

    /** Constructs an UnknownHostException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs an UnknownHostException with the specified
     *  detail message and nested exception.
     */
    @stub
    def this(s: String, ex: Exception) = ???
}
