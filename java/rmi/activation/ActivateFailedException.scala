package java.rmi.activation

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException
import scala.scalanative.annotation.stub

/** This exception is thrown by the RMI runtime when activation
 *  fails during a remote call to an activatable object.
 */
class ActivateFailedException extends RemoteException {

    /** Constructs an ActivateFailedException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs an ActivateFailedException with the specified
     *  detail message and nested exception.
     */
    @stub
    def this(s: String, ex: Exception) = ???
}
