package javax.security.auth.kerberos

import java.io.Serializable
import java.lang.{Object, String}
import java.security.Principal

// This class encapsulates a Kerberos principal.
final class KerberosPrincipal extends Object with Principal, with Serializable {

    @stub
    // Constructs a KerberosPrincipal from the provided string input.
    def this(name: String) = ???

    @stub
    // Compares the specified Object with this Principal for equality.
    def equals(other: Object): Boolean = ???

    @stub
    // The returned string corresponds to the single-string
    // representation of a Kerberos Principal name as specified in
    // Section 2.1 of RFC 1964.
    def getName(): String = ???

    @stub
    // Returns the name type of the KerberosPrincipal.
    def getNameType(): Int = ???

    @stub
    // Returns the realm component of this Kerberos principal.
    def getRealm(): String = ???

    @stub
    // Returns a hashcode for this principal.
    def hashCode(): Int = ???
}

object KerberosPrincipal {
    @stub
    // user principal name type.
    def KRB_NT_PRINCIPAL: Int = ???

    @stub
    // service with host name as instance (telnet, rcommands) name type.
    def KRB_NT_SRV_HST: Int = ???

    @stub
    // service and other unique instance (krbtgt) name type.
    def KRB_NT_SRV_INST: Int = ???

    @stub
    // service with host as remaining components name type.
    def KRB_NT_SRV_XHST: Int = ???

    @stub
    // unique ID name type.
    def KRB_NT_UID: Int = ???
}
