package java.security.cert

import java.lang.{Object, String}

// Parameters used as input for the LDAP CertStore algorithm.
// 
// This class is used to provide necessary configuration parameters (server
// name and port number) to implementations of the LDAP CertStore
// algorithm.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class LDAPCertStoreParameters extends Object with CertStoreParameters {

    @stub
    // Creates an instance of LDAPCertStoreParameters with the
    // default parameter values (server name "localhost", port 389).
    def this() = ???

    @stub
    // Creates an instance of LDAPCertStoreParameters with the
    // specified server name and a default port of 389.
    def this(serverName: String) = ???

    @stub
    // Returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Returns the port number of the LDAP server.
    def getPort(): Int = ???

    @stub
    // Returns the DNS name of the LDAP server.
    def getServerName(): String = ???
}
