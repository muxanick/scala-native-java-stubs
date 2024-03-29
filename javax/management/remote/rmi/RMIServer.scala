package javax.management.remote.rmi

import java.lang.{Object, String}
import java.rmi.Remote
import scala.scalanative.annotation.stub

/** RMI object used to establish connections to an RMI connector.
 *  There is one Remote object implementing this interface for each RMI
 *  connector.
 * 
 *  User code does not usually refer to this interface.  It is
 *  specified as part of the public API so that different
 *  implementations of that API will interoperate.
 */
trait RMIServer extends Remote {

    /** The version of the RMI Connector Protocol understood by this
     *  connector server.
     */
    @stub
    def getVersion(): String = ???

    /** Makes a new connection through this RMI connector. */
    @stub
    def newClient(credentials: Any): RMIConnection = ???
}
