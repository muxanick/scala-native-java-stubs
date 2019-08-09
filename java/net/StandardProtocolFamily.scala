package java.net

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines the standard families of communication protocols. */
class StandardProtocolFamily private (name: String, ordinal: Int) extends Enum[StandardProtocolFamily](name, ordinal) with ProtocolFamily {
}

object StandardProtocolFamily {
    /** Internet Protocol Version 4 (IPv4) */
    final val INET = new StandardProtocolFamily(INET, 0)

    /** Internet Protocol Version 6 (IPv6) */
    final val INET6 = new StandardProtocolFamily(INET6, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): StandardProtocolFamily = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[StandardProtocolFamily] = ???
}
