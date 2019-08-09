package javax.security.auth.kerberos

import java.io.Serializable
import java.lang.Object
import java.net.InetAddress
import java.util.Date
import javax.crypto.SecretKey
import javax.security.auth.{Destroyable, Refreshable}

// This class encapsulates a Kerberos ticket and associated
// information as viewed from the client's point of view. It captures all
// information that the Key Distribution Center (KDC) sends to the client
// in the reply message KDC-REP defined in the Kerberos Protocol
// Specification (RFC 4120).
// 
// All Kerberos JAAS login modules that authenticate a user to a KDC should
// use this class. Where available, the login module might even read this
// information from a ticket cache in the operating system instead of
// directly communicating with the KDC. During the commit phase of the JAAS
// authentication process, the JAAS login module should instantiate this
// class and store the instance in the private credential set of a
// Subject.
//
// It might be necessary for the application to be granted a
// PrivateCredentialPermission if it needs to access a KerberosTicket
// instance from a Subject. This permission is not needed when the
// application depends on the default JGSS Kerberos mechanism to access the
// KerberosTicket. In that case, however, the application will need an
// appropriate
// ServicePermission.
// 
// Note that this class is applicable to both ticket granting tickets and
// other regular service tickets. A ticket granting ticket is just a
// special case of a more generalized service ticket.
class KerberosTicket extends Object with Destroyable, with Refreshable, with Serializable {

    @stub
    // Destroys the ticket and destroys any sensitive information stored in
    // it.
    def destroy(): Unit = ???

    @stub
    // Compares the specified Object with this KerberosTicket for equality.
    def equals(other: Object): Boolean = ???

    @stub
    // Returns the time that the client was authenticated.
    def getAuthTime(): Date = ???

    @stub
    // Returns the client principal associated with this ticket.
    def getClient(): KerberosPrincipal = ???

    @stub
    // Returns a list of addresses from where the ticket can be used.
    def getClientAddresses(): Array[InetAddress] = ???

    @stub
    // Returns an ASN.1 encoding of the entire ticket.
    def getEncoded(): Array[Byte] = ???

    @stub
    // Returns the expiration time for this ticket's validity period.
    def getEndTime(): Date = ???

    @stub
    // Returns the flags associated with this ticket.
    def getFlags(): Array[Boolean] = ???

    @stub
    // Returns the latest expiration time for this ticket, including all
    // renewals.
    def getRenewTill(): Date = ???

    @stub
    // Returns the service principal associated with this ticket.
    def getServer(): KerberosPrincipal = ???

    @stub
    // Returns the session key associated with this ticket.
    def getSessionKey(): SecretKey = ???

    @stub
    // Returns the key type of the session key associated with this
    // ticket as defined by the Kerberos Protocol Specification.
    def getSessionKeyType(): Int = ???

    @stub
    // Returns the start time for this ticket's validity period.
    def getStartTime(): Date = ???

    @stub
    // Returns a hashcode for this KerberosTicket.
    def hashCode(): Int = ???

    @stub
    // Determines if this ticket is still current.
    def isCurrent(): Boolean = ???

    @stub
    // Determines if this ticket has been destroyed.
    def isDestroyed(): Boolean = ???

    @stub
    // Determines if this ticket is forwardable.
    def isForwardable(): Boolean = ???

    @stub
    // Determines if this ticket had been forwarded or was issued based on
    // authentication involving a forwarded ticket-granting ticket.
    def isForwarded(): Boolean = ???

    @stub
    // Determines if this ticket was issued using the Kerberos AS-Exchange
    // protocol, and not issued based on some ticket-granting ticket.
    def isInitial(): Boolean = ???

    @stub
    // Determines is this ticket is post-dated.
    def isPostdated(): Boolean = ???

    @stub
    // Determines if this ticket is proxiable.
    def isProxiable(): Boolean = ???

    @stub
    // Determines is this ticket is a proxy-ticket.
    def isProxy(): Boolean = ???

    @stub
    // Determines is this ticket is renewable.
    def isRenewable(): Boolean = ???

    @stub
    // Extends the validity period of this ticket.
    def refresh(): Unit = ???
}
