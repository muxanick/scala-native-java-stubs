package java.rmi.server

import java.io.IOException
import java.lang.{Deprecated, Exception, Object, String, Throwable}
import java.rmi.RemoteException

/** An obsolete subclass of ExportException. */
@Deprecated class SocketSecurityException extends ExportException {

    /** Deprecated.  */
    @stub
    def this(s: String) = ???
}
