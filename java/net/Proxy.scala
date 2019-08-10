package java.net

import java.lang.{Enum, Object, String}
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
    def equals(obj: Any): Boolean = ???

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
    class Type private (name: String, ordinal: Int) extends Enum[Type](name, ordinal) {
    }

    object Type {
        /** Represents a direct connection, or the absence of a proxy. */
        final val DIRECT: Type = new Type("DIRECT", 0)

        /** Represents proxy for high level protocols such as HTTP or FTP. */
        final val HTTP: Type = new Type("HTTP", 1)

        /** Represents a SOCKS (V4 or V5) proxy. */
        final val SOCKS: Type = new Type("SOCKS", 2)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Type = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Type] = ???
    }


    /** A proxy setting that represents a DIRECT connection,
     *  basically telling the protocol handler not to use any proxying.
     */
    @stub
    val NO_PROXY: Proxy = ???
}
