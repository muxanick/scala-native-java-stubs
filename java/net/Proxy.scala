package java.net

import java.lang.{Object, String}

/** This class represents a proxy setting, typically a type (http, socks) and
 *  a socket address.
 *  A Proxy is an immutable object.
 */
class Proxy extends Object {

    /** Returns the socket address of the proxy, or
     *  null if its a direct connection.
     */
    @stub
    def address(): SocketAddress = ???

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns a hashcode for this Proxy. */
    @stub
    def hashCode(): Int = ???

    /** Constructs a string representation of this Proxy. */
    @stub
    def toString(): String = ???
}
