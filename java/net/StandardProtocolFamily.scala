package java.net

import java.lang.{Enum, Object, String}

// Defines the standard families of communication protocols.
class StandardProtocolFamily private (name: String, ordinal: Int) extends Enum[StandardProtocolFamily](name, ordinal) with ProtocolFamily {
}

object StandardProtocolFamily {
    // Internet Protocol Version 4 (IPv4)
    final val INET = new StandardProtocolFamily(INET, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): StandardProtocolFamily = ???
}
