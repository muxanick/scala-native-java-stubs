package javax.security.auth.kerberos

import java.io.Serializable
import java.lang.{Object, String}
import java.net.InetAddress
import java.util.Date
import javax.crypto.SecretKey
import javax.security.auth.{Destroyable, Refreshable}
import scala.scalanative.annotation.stub

/** This class encapsulates a Kerberos ticket and associated
 *  information as viewed from the client's point of view. It captures all
 *  information that the Key Distribution Center (KDC) sends to the client
 *  in the reply message KDC-REP defined in the Kerberos Protocol
 *  Specification (RFC 4120).
 *  
 *  All Kerberos JAAS login modules that authenticate a user to a KDC should
 *  use this class. Where available, the login module might even read this
 *  information from a ticket cache in the operating system instead of
 *  directly communicating with the KDC. During the commit phase of the JAAS
 *  authentication process, the JAAS login module should instantiate this
 *  class and store the instance in the private credential set of a
 *  Subject.
 * 
 *  It might be necessary for the application to be granted a
 *  PrivateCredentialPermission if it needs to access a KerberosTicket
 *  instance from a Subject. This permission is not needed when the
 *  application depends on the default JGSS Kerberos mechanism to access the
 *  KerberosTicket. In that case, however, the application will need an
 *  appropriate
 *  ServicePermission.
 *  
 *  Note that this class is applicable to both ticket granting tickets and
 *  other regular service tickets. A ticket granting ticket is just a
 *  special case of a more generalized service ticket.
 */
class KerberosTicket extends Object with Destroyable with Refreshable with Serializable {

    /** Constructs a KerberosTicket using credentials information that a
     *  client either receives from a KDC or reads from a cache.
     */
    @stub
    def this(asn1Encoding: Array[Byte], client: KerberosPrincipal, server: KerberosPrincipal, sessionKey: Array[Byte], keyType: Int, flags: Array[Boolean], authTime: Date, startTime: Date, endTime: Date, renewTill: Date, clientAddresses: Array[InetAddress]) = ???

    /** Destroys the ticket and destroys any sensitive information stored in
     *  it.
     */
    @stub
    def destroy(): Unit = ???

    /** Compares the specified Object with this KerberosTicket for equality. */
    @stub
    def equals(other: Any): Boolean = ???

    /** Returns the time that the client was authenticated. */
    @stub
    def getAuthTime(): Date = ???

    /** Returns the client principal associated with this ticket. */
    @stub
    def getClient(): KerberosPrincipal = ???

    /** Returns a list of addresses from where the ticket can be used. */
    @stub
    def getClientAddresses(): Array[InetAddress] = ???

    /** Returns an ASN.1 encoding of the entire ticket. */
    @stub
    def getEncoded(): Array[Byte] = ???

    /** Returns the expiration time for this ticket's validity period. */
    @stub
    def getEndTime(): Date = ???

    /** Returns the flags associated with this ticket. */
    @stub
    def getFlags(): Array[Boolean] = ???

    /** Returns the latest expiration time for this ticket, including all
     *  renewals.
     */
    @stub
    def getRenewTill(): Date = ???

    /** Returns the service principal associated with this ticket. */
    @stub
    def getServer(): KerberosPrincipal = ???

    /** Returns the session key associated with this ticket. */
    @stub
    def getSessionKey(): SecretKey = ???

    /** Returns the key type of the session key associated with this
     *  ticket as defined by the Kerberos Protocol Specification.
     */
    @stub
    def getSessionKeyType(): Int = ???

    /** Returns the start time for this ticket's validity period. */
    @stub
    def getStartTime(): Date = ???

    /** Returns a hashcode for this KerberosTicket. */
    @stub
    def hashCode(): Int = ???

    /** Determines if this ticket is still current. */
    @stub
    def isCurrent(): Boolean = ???

    /** Determines if this ticket has been destroyed. */
    @stub
    def isDestroyed(): Boolean = ???

    /** Determines if this ticket is forwardable. */
    @stub
    def isForwardable(): Boolean = ???

    /** Determines if this ticket had been forwarded or was issued based on
     *  authentication involving a forwarded ticket-granting ticket.
     */
    @stub
    def isForwarded(): Boolean = ???

    /** Determines if this ticket was issued using the Kerberos AS-Exchange
     *  protocol, and not issued based on some ticket-granting ticket.
     */
    @stub
    def isInitial(): Boolean = ???

    /** Determines is this ticket is post-dated. */
    @stub
    def isPostdated(): Boolean = ???

    /** Determines if this ticket is proxiable. */
    @stub
    def isProxiable(): Boolean = ???

    /** Determines is this ticket is a proxy-ticket. */
    @stub
    def isProxy(): Boolean = ???

    /** Determines is this ticket is renewable. */
    @stub
    def isRenewable(): Boolean = ???

    /** Extends the validity period of this ticket. */
    @stub
    def refresh(): Unit = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
