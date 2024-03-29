package java.net

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents a Network Interface address. In short it's an
 *  IP address, a subnet mask and a broadcast address when the address is
 *  an IPv4 one. An IP address and a network prefix length in the case
 *  of IPv6 address.
 */
class InterfaceAddress extends Object {

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns an InetAddress for this address. */
    @stub
    def getAddress(): InetAddress = ???

    /** Returns an InetAddress for the broadcast address
     *  for this InterfaceAddress.
     */
    @stub
    def getBroadcast(): InetAddress = ???

    /** Returns the network prefix length for this address. */
    @stub
    def getNetworkPrefixLength(): Short = ???

    /** Returns a hashcode for this Interface address. */
    @stub
    def hashCode(): Int = ???

    /** Converts this Interface address to a String. */
    @stub
    def toString(): String = ???
}
