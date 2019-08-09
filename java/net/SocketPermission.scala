package java.net

import java.io.Serializable
import java.lang.{Object, String}
import java.security.{Permission, PermissionCollection}
import scala.scalanative.annotation.stub

/** This class represents access to a network via sockets.
 *  A SocketPermission consists of a
 *  host specification and a set of "actions" specifying ways to
 *  connect to that host. The host is specified as
 *  
 *     host = (hostname | IPv4address | iPv6reference) [:portrange]
 *     portrange = portnumber | -portnumber | portnumber-[portnumber]
 *  
 *  The host is expressed as a DNS name, as a numerical IP address,
 *  or as "localhost" (for the local machine).
 *  The wildcard "*" may be included once in a DNS name host
 *  specification. If it is included, it must be in the leftmost
 *  position, as in "*.sun.com".
 *  
 *  The format of the IPv6reference should follow that specified in RFC 2732: Format
 *  for Literal IPv6 Addresses in URLs:
 *  
 *     ipv6reference = "[" IPv6address "]"
 * 
 *  For example, you can construct a SocketPermission instance
 *  as the following:
 *  
 *     String hostAddress = inetaddress.getHostAddress();
 *     if (inetaddress instanceof Inet6Address) {
 *         sp = new SocketPermission("[" + hostAddress + "]:" + port, action);
 *     } else {
 *         sp = new SocketPermission(hostAddress + ":" + port, action);
 *     }
 *  
 *  or
 *  
 *     String host = url.getHost();
 *     sp = new SocketPermission(host + ":" + port, action);
 *  
 *  
 *  The full uncompressed form of
 *  an IPv6 literal address is also valid.
 *  
 *  The port or portrange is optional. A port specification of the
 *  form "N-", where N is a port number, signifies all ports
 *  numbered N and above, while a specification of the
 *  form "-N" indicates all ports numbered N and below.
 *  The special port value 0 refers to the entire ephemeral
 *  port range. This is a fixed range of ports a system may use to
 *  allocate dynamic ports from. The actual range may be system dependent.
 *  
 *  The possible ways to connect to the host are
 *  
 *  accept
 *  connect
 *  listen
 *  resolve
 *  
 *  The "listen" action is only meaningful when used with "localhost" and
 *  means the ability to bind to a specified port.
 *  The "resolve" action is implied when any of the other actions are present.
 *  The action "resolve" refers to host/ip name service lookups.
 *  
 *  The actions string is converted to lowercase before processing.
 *  As an example of the creation and meaning of SocketPermissions,
 *  note that if the following permission:
 * 
 *  
 *    p1 = new SocketPermission("puffin.eng.sun.com:7777", "connect,accept");
 *  
 * 
 *  is granted to some code, it allows that code to connect to port 7777 on
 *  puffin.eng.sun.com, and to accept connections on that port.
 * 
 *  Similarly, if the following permission:
 * 
 *  
 *    p2 = new SocketPermission("localhost:1024-", "accept,connect,listen");
 *  
 * 
 *  is granted to some code, it allows that code to
 *  accept connections on, connect to, or listen on any port between
 *  1024 and 65535 on the local host.
 * 
 *  Note: Granting code permission to accept or make connections to remote
 *  hosts may be dangerous because malevolent code can then more easily
 *  transfer and share confidential data among parties who may not
 *  otherwise have access to the data.
 */
final class SocketPermission extends Permission with Serializable {

    /** Creates a new SocketPermission object with the specified actions. */
    @stub
    def this(host: String, action: String) = ???

    /** Checks two SocketPermission objects for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the canonical string representation of the actions. */
    @stub
    def getActions(): String = ???

    /** Returns the hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this socket permission object "implies" the
     *  specified permission.
     */
    @stub
    def implies(p: Permission): Boolean = ???

    /** Returns a new PermissionCollection object for storing SocketPermission
     *  objects.
     */
    @stub
    def newPermissionCollection(): PermissionCollection = ???
}
