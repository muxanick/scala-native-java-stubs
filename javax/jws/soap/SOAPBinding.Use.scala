package javax.jws.soap

import java.lang.{Enum, Object, String}

/**  */
class SOAPBinding.Use private (name: String, ordinal: Int) extends Enum[SOAPBinding.Use](name, ordinal) {
}

object SOAPBinding.Use {
    /**  */
    final val ENCODED = new SOAPBinding.Use(ENCODED, 0)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SOAPBinding.Use = ???
}
