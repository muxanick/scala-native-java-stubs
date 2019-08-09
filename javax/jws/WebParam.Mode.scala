package javax.jws

import java.lang.{Enum, Object, String}

// 
class WebParam.Mode private (name: String, ordinal: Int) extends Enum[WebParam.Mode](name, ordinal) {
}

object WebParam.Mode {
    // 
    final val IN = new WebParam.Mode(IN, 0)

    // 
    final val INOUT = new WebParam.Mode(INOUT, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): WebParam.Mode = ???
}
