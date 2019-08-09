package javax.jws.soap

import java.lang.{Enum, Object, String}

/**  */
class SOAPBinding.Style private (name: String, ordinal: Int) extends Enum[SOAPBinding.Style](name, ordinal) {
}

object SOAPBinding.Style {
    /**  */
    final val DOCUMENT = new SOAPBinding.Style(DOCUMENT, 0)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SOAPBinding.Style = ???
}
