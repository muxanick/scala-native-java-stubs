package javax.security.auth.kerberos

import java.io.Serializable
import java.lang.{Object, String}
import java.security.Principal
import scala.scalanative.annotation.stub

/** This class encapsulates a Kerberos principal. */
final class KerberosPrincipal extends Object with Principal with Serializable {

    /** Constructs a KerberosPrincipal from the provided string input. */
    @stub
    def this(name: String) = ???

    /** Constructs a KerberosPrincipal from the provided string and
     *  name type input.
     */
    @stub
    def this(name: String, nameType: Int) = ???

    /** Compares the specified Object with this Principal for equality. */
    @stub
    def equals(other: Any): Boolean = ???

    /** The returned string corresponds to the single-string
     *  representation of a Kerberos Principal name as specified in
     *  Section 2.1 of RFC 1964.
     */
    @stub
    def getName(): String = ???

    /** Returns the name type of the KerberosPrincipal. */
    @stub
    def getNameType(): Int = ???

    /** Returns the realm component of this Kerberos principal. */
    @stub
    def getRealm(): String = ???

    /** Returns a hashcode for this principal. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object KerberosPrincipal {
    /** user principal name type. */
    @stub
    val KRB_NT_PRINCIPAL: Int = ???

    /** service with host name as instance (telnet, rcommands) name type. */
    @stub
    val KRB_NT_SRV_HST: Int = ???

    /** service and other unique instance (krbtgt) name type. */
    @stub
    val KRB_NT_SRV_INST: Int = ???

    /** service with host as remaining components name type. */
    @stub
    val KRB_NT_SRV_XHST: Int = ???

    /** unique ID name type. */
    @stub
    val KRB_NT_UID: Int = ???

    /** unknown name type. */
    @stub
    val KRB_NT_UNKNOWN: Int = ???
}
