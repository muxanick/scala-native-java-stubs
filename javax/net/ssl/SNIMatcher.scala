package javax.net.ssl

import java.lang.Object

/** Instances of this class represent a matcher that performs match
 *  operations on an SNIServerName instance.
 *  
 *  Servers can use Server Name Indication (SNI) information to decide if
 *  specific SSLSocket or SSLEngine instances should accept
 *  a connection.  For example, when multiple "virtual" or "name-based"
 *  servers are hosted on a single underlying network address, the server
 *  application can use SNI information to determine whether this server is
 *  the exact server that the client wants to access.  Instances of this
 *  class can be used by a server to verify the acceptable server names of
 *  a particular type, such as host names.
 *  
 *  SNIMatcher objects are immutable.  Subclasses should not provide
 *  methods that can change the state of an instance once it has been created.
 */
abstract class SNIMatcher extends Object {

    /** Returns the server name type of this SNIMatcher object. */
    def getType(): Int
}
