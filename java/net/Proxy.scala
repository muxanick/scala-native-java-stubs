package java.net

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents a proxy setting, typically a type (http, socks) and
 *  a socket address.
 *  A Proxy is an immutable object.
 */
class Proxy extends Object {

    /** Creates an entry representing a PROXY connection. */
    @stub
    def this(type: Proxy.Type, sa: SocketAddress) = ???

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

    /** Returns the proxy type. */
    @stub
    def type(): Proxy.Type = ???
}

object Proxy {
    /** Represents the proxy type. */
    @stub
    object Type extends Proxy.Type

    /** A proxy setting that represents a DIRECT connection,
     *  basically telling the protocol handler not to use any proxying.
     */
    @stub
    val NO_PROXY: Proxy = ???
}
