package java.security

import java.lang.{Enum, Object, String}

// Key type.
class KeyRep.Type private (name: String, ordinal: Int) extends Enum[KeyRep.Type](name, ordinal) {
}

object KeyRep.Type {
    // Type for private keys.
    final val PRIVATE = new KeyRep.Type(PRIVATE, 0)

    // Type for public keys.
    final val PUBLIC = new KeyRep.Type(PUBLIC, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): KeyRep.Type = ???
}
