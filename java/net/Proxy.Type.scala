package java.net

import java.lang.{Enum, Object, String}

// Represents the proxy type.
class Proxy.Type private (name: String, ordinal: Int) extends Enum[Proxy.Type](name, ordinal) {
}

object Proxy.Type {
    // Represents a direct connection, or the absence of a proxy.
    final val DIRECT = new Proxy.Type(DIRECT, 0)

    // Represents proxy for high level protocols such as HTTP or FTP.
    final val HTTP = new Proxy.Type(HTTP, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Proxy.Type = ???
}
