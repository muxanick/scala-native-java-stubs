package java.net

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Represents the proxy type. */
class Proxy.Type private (name: String, ordinal: Int) extends Enum[Proxy.Type](name, ordinal) {
}

object Proxy.Type {
    /** Represents a direct connection, or the absence of a proxy. */
    final val DIRECT = new Proxy.Type(DIRECT, 0)

    /** Represents proxy for high level protocols such as HTTP or FTP. */
    final val HTTP = new Proxy.Type(HTTP, 1)

    /** Represents a SOCKS (V4 or V5) proxy. */
    final val SOCKS = new Proxy.Type(SOCKS, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Proxy.Type = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Proxy.Type] = ???
}
