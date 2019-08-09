package java.net

import java.lang.{Object, String}

// This class represents a proxy setting, typically a type (http, socks) and
// a socket address.
// A Proxy is an immutable object.
class Proxy extends Object {

    @stub
    // Returns the socket address of the proxy, or
    // null if its a direct connection.
    def address(): SocketAddress = ???

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns a hashcode for this Proxy.
    def hashCode(): Int = ???

    @stub
    // Constructs a string representation of this Proxy.
    def toString(): String = ???
}
