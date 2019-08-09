package java.net

import java.lang.{Object, String}

// This class implements an IP Socket Address (IP address + port number)
// It can also be a pair (hostname + port number), in which case an attempt
// will be made to resolve the hostname. If resolution fails then the address
// is said to be unresolved but can still be used on some circumstances
// like connecting through a proxy.
// 
// It provides an immutable object used by sockets for binding, connecting, or
// as returned values.
// 
// The wildcard is a special local IP address. It usually means "any"
// and can only be used for bind operations.
class InetSocketAddress extends SocketAddress {

    @stub
    // Creates a socket address from an IP address and a port number.
    def this(addr: InetAddress, port: Int) = ???

    @stub
    // Creates a socket address where the IP address is the wildcard address
    // and the port number a specified value.
    def this(port: Int) = ???

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the InetAddress.
    def getAddress(): InetAddress = ???

    @stub
    // Gets the hostname.
    def getHostName(): String = ???

    @stub
    // Returns the hostname, or the String form of the address if it
    // doesn't have a hostname (it was created using a literal).
    def getHostString(): String = ???

    @stub
    // Gets the port number.
    def getPort(): Int = ???

    @stub
    // Returns a hashcode for this socket address.
    def hashCode(): Int = ???

    @stub
    // Checks whether the address has been resolved or not.
    def isUnresolved(): Boolean = ???
}

object InetSocketAddress {
    @stub
    // Creates an unresolved socket address from a hostname and a port number.
    def createUnresolved(host: String, port: Int): InetSocketAddress = ???
}
