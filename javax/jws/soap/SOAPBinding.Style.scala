package javax.jws.soap

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/**  */
class SOAPBinding.Style private (name: String, ordinal: Int) extends Enum[SOAPBinding.Style](name, ordinal) {
}

object SOAPBinding.Style {
    /**  */
    final val DOCUMENT = new SOAPBinding.Style(DOCUMENT, 0)

    /**  */
    final val RPC = new SOAPBinding.Style(RPC, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SOAPBinding.Style = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[SOAPBinding.Style] = ???
}
