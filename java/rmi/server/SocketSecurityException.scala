package java.rmi.server

import java.io.IOException
import java.lang.{Deprecated, Exception, Object, String, Throwable}
import java.rmi.RemoteException
import scala.scalanative.annotation.stub

/** An obsolete subclass of ExportException. */
@Deprecated class SocketSecurityException extends ExportException {

    /** Deprecated.  */
    @stub
    def this(s: String) = ???

    /** Deprecated.  */
    @stub
    def this(s: String, ex: Exception) = ???
}
