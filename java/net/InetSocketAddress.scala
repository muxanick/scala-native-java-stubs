package java.net

import java.lang.{Object, String}

/** This class implements an IP Socket Address (IP address + port number)
 *  It can also be a pair (hostname + port number), in which case an attempt
 *  will be made to resolve the hostname. If resolution fails then the address
 *  is said to be unresolved but can still be used on some circumstances
 *  like connecting through a proxy.
 *  
 *  It provides an immutable object used by sockets for binding, connecting, or
 *  as returned values.
 *  
 *  The wildcard is a special local IP address. It usually means "any"
 *  and can only be used for bind operations.
 */
class InetSocketAddress extends SocketAddress {

    /** Creates a socket address from an IP address and a port number. */
    @stub
    def this(addr: InetAddress, port: Int) = ???

    /** Creates a socket address where the IP address is the wildcard address
     *  and the port number a specified value.
     */
    @stub
    def this(port: Int) = ???

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the InetAddress. */
    @stub
    def getAddress(): InetAddress = ???

    /** Gets the hostname. */
    @stub
    def getHostName(): String = ???

    /** Returns the hostname, or the String form of the address if it
     *  doesn't have a hostname (it was created using a literal).
     */
    @stub
    def getHostString(): String = ???

    /** Gets the port number. */
    @stub
    def getPort(): Int = ???

    /** Returns a hashcode for this socket address. */
    @stub
    def hashCode(): Int = ???

    /** Checks whether the address has been resolved or not. */
    @stub
    def isUnresolved(): Boolean = ???
}

object InetSocketAddress {
    /** Creates an unresolved socket address from a hostname and a port number. */
    @stub
    def createUnresolved(host: String, port: Int): InetSocketAddress = ???
}
