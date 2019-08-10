package javax.xml.ws

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The orientation of a dynamic client or service. MESSAGE provides
 *  access to entire protocol message, PAYLOAD to protocol message
 *  payload only.
 */
class Service_Mode private (name: String, ordinal: Int) extends Enum[Service.Mode](name, ordinal) {
}

object Service_Mode {
    /**  */
    final val MESSAGE = new Service.Mode(MESSAGE, 0)

    /**  */
    final val PAYLOAD = new Service.Mode(PAYLOAD, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Service.Mode = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Service.Mode] = ???
}
