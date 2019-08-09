package javax.xml.ws

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

/** This class defines web service permissions.
 *  
 *  Web service Permissions are identified by name (also referred to as
 *  a "target name") alone. There are no actions associated
 *  with them.
 *  
 *  The following permission target name is defined:
 *  
 *  
 *    publishEndpoint
 *  
 *  
 *  The publishEndpoint permission allows publishing a
 *  web service endpoint using the publish methods
 *  defined by the javax.xml.ws.Endpoint class.
 *  
 *  Granting publishEndpoint allows the application to be
 *  exposed as a network service. Depending on the security of the runtime and
 *  the security of the application, this may introduce a security hole that
 *  is remotely exploitable.
 */
final class WebServicePermission extends BasicPermission {

    /** Creates a new permission with the specified name. */
    @stub
    def this(name: String) = ???
}
