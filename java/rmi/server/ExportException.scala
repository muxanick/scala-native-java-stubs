package java.rmi.server

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException
import scala.scalanative.annotation.stub

/** An ExportException is a RemoteException
 *  thrown if an attempt to export a remote object fails.  A remote object is
 *  exported via the constructors and exportObject methods of
 *  java.rmi.server.UnicastRemoteObject and
 *  java.rmi.activation.Activatable.
 */
class ExportException extends RemoteException {

    /** Constructs an ExportException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs an ExportException with the specified
     *  detail message and nested exception.
     */
    @stub
    def this(s: String, ex: Exception) = ???
}
