package javax.jws.soap

import java.lang.{Enum, Object, String}

/**  */
class SOAPBinding.ParameterStyle private (name: String, ordinal: Int) extends Enum[SOAPBinding.ParameterStyle](name, ordinal) {
}

object SOAPBinding.ParameterStyle {
    /**  */
    final val BARE = new SOAPBinding.ParameterStyle(BARE, 0)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SOAPBinding.ParameterStyle = ???
}
