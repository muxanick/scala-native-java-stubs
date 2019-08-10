package javax.jws.soap

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/**  */
class SOAPBinding_Use private (name: String, ordinal: Int) extends Enum[SOAPBinding.Use](name, ordinal) {
}

object SOAPBinding_Use {
    /**  */
    final val ENCODED = new SOAPBinding.Use(ENCODED, 0)

    /**  */
    final val LITERAL = new SOAPBinding.Use(LITERAL, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SOAPBinding.Use = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[SOAPBinding.Use] = ???
}
