package java.security

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Key type. */
class KeyRep_Type private (name: String, ordinal: Int) extends Enum[KeyRep.Type](name, ordinal) {
}

object KeyRep_Type {
    /** Type for private keys. */
    final val PRIVATE = new KeyRep.Type(PRIVATE, 0)

    /** Type for public keys. */
    final val PUBLIC = new KeyRep.Type(PUBLIC, 1)

    /** Type for secret keys. */
    final val SECRET = new KeyRep.Type(SECRET, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): KeyRep.Type = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[KeyRep.Type] = ???
}
