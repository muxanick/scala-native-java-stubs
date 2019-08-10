package javax.jws

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/**  */
class WebParam_Mode private (name: String, ordinal: Int) extends Enum[WebParam.Mode](name, ordinal) {
}

object WebParam_Mode {
    /**  */
    final val IN = new WebParam.Mode(IN, 0)

    /**  */
    final val INOUT = new WebParam.Mode(INOUT, 1)

    /**  */
    final val OUT = new WebParam.Mode(OUT, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): WebParam.Mode = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[WebParam.Mode] = ???
}
