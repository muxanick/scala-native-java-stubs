package javax.jws.soap

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/**  */
class SOAPBinding.ParameterStyle private (name: String, ordinal: Int) extends Enum[SOAPBinding.ParameterStyle](name, ordinal) {
}

object SOAPBinding.ParameterStyle {
    /**  */
    final val BARE = new SOAPBinding.ParameterStyle(BARE, 0)

    /**  */
    final val WRAPPED = new SOAPBinding.ParameterStyle(WRAPPED, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SOAPBinding.ParameterStyle = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[SOAPBinding.ParameterStyle] = ???
}
