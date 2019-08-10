package javax.management.remote

import java.lang.Object
import javax.security.auth.Subject
import scala.scalanative.annotation.stub

/** Interface to define how remote credentials are converted into a
 *  JAAS Subject.  This interface is used by the RMI Connector Server,
 *  and can be used by other connector servers.
 * 
 *  The user-defined authenticator instance is passed to the
 *  connector server in the environment map as the value of the
 *  attribute JMXConnectorServer.AUTHENTICATOR.  For connector
 *  servers that use only this authentication system, if this attribute
 *  is not present or its value is null then no user
 *  authentication will be performed and full access to the methods
 *  exported by the MBeanServerConnection object will be
 *  allowed.
 * 
 *  If authentication is successful then an authenticated
 *  subject filled in with its associated
 *  principals is returned. Authorization checks
 *  will be then performed based on the given set of principals.
 */
trait JMXAuthenticator {

    /** Authenticates the MBeanServerConnection client
     *  with the given client credentials.
     */
    @stub
    def authenticate(credentials: Any): Subject = ???
}
