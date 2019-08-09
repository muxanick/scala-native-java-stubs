package java.net

import java.lang.Object

// This class represents a Network Interface address. In short it's an
// IP address, a subnet mask and a broadcast address when the address is
// an IPv4 one. An IP address and a network prefix length in the case
// of IPv6 address.
class InterfaceAddress extends Object {

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns an InetAddress for this address.
    def getAddress(): InetAddress = ???

    @stub
    // Returns an InetAddress for the broadcast address
    // for this InterfaceAddress.
    def getBroadcast(): InetAddress = ???

    @stub
    // Returns the network prefix length for this address.
    def getNetworkPrefixLength(): Short = ???

    @stub
    // Returns a hashcode for this Interface address.
    def hashCode(): Int = ???
}
