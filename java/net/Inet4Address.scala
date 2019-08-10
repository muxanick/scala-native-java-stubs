package java.net

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents an Internet Protocol version 4 (IPv4) address.
 *  Defined by 
 *  RFC 790: Assigned Numbers,
 *  
 *  RFC 1918: Address Allocation for Private Internets,
 *  and RFC 2365:
 *  Administratively Scoped IP Multicast
 * 
 *   Textual representation of IP addresses 
 * 
 *  Textual representation of IPv4 address used as input to methods
 *  takes one of the following forms:
 * 
 *  
 *  d.d.d.d
 *  d.d.d
 *  d.d
 *  d
 *  
 * 
 *   When four parts are specified, each is interpreted as a byte of
 *  data and assigned, from left to right, to the four bytes of an IPv4
 *  address.
 * 
 *   When a three part address is specified, the last part is
 *  interpreted as a 16-bit quantity and placed in the right most two
 *  bytes of the network address. This makes the three part address
 *  format convenient for specifying Class B net- work addresses as
 *  128.net.host.
 * 
 *   When a two part address is supplied, the last part is
 *  interpreted as a 24-bit quantity and placed in the right most three
 *  bytes of the network address. This makes the two part address
 *  format convenient for specifying Class A network addresses as
 *  net.host.
 * 
 *   When only one part is given, the value is stored directly in
 *  the network address without any byte rearrangement.
 * 
 *   For methods that return a textual representation as output
 *  value, the first form, i.e. a dotted-quad string, is used.
 * 
 *   The Scope of a Multicast Address 
 * 
 *  Historically the IPv4 TTL field in the IP header has doubled as a
 *  multicast scope field: a TTL of 0 means node-local, 1 means
 *  link-local, up through 32 means site-local, up through 64 means
 *  region-local, up through 128 means continent-local, and up through
 *  255 are global. However, the administrative scoping is preferred.
 *  Please refer to 
 *  RFC 2365: Administratively Scoped IP Multicast
 */
final class Inet4Address extends InetAddress {

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the raw IP address of this InetAddress
     *  object.
     */
    @stub
    def getAddress(): Array[Byte] = ???

    /** Returns the IP address string in textual presentation form. */
    @stub
    def getHostAddress(): String = ???

    /** Returns a hashcode for this IP address. */
    @stub
    def hashCode(): Int = ???

    /** Utility routine to check if the InetAddress in a wildcard address. */
    @stub
    def isAnyLocalAddress(): Boolean = ???

    /** Utility routine to check if the InetAddress is an link local address. */
    @stub
    def isLinkLocalAddress(): Boolean = ???

    /** Utility routine to check if the InetAddress is a loopback address. */
    @stub
    def isLoopbackAddress(): Boolean = ???

    /** Utility routine to check if the multicast address has global scope. */
    @stub
    def isMCGlobal(): Boolean = ???

    /** Utility routine to check if the multicast address has link scope. */
    @stub
    def isMCLinkLocal(): Boolean = ???

    /** Utility routine to check if the multicast address has node scope. */
    @stub
    def isMCNodeLocal(): Boolean = ???

    /** Utility routine to check if the multicast address has organization scope. */
    @stub
    def isMCOrgLocal(): Boolean = ???

    /** Utility routine to check if the multicast address has site scope. */
    @stub
    def isMCSiteLocal(): Boolean = ???

    /** Utility routine to check if the InetAddress is an
     *  IP multicast address.
     */
    @stub
    def isMulticastAddress(): Boolean = ???

    /** Utility routine to check if the InetAddress is a site local address. */
    @stub
    def isSiteLocalAddress(): Boolean = ???
}
