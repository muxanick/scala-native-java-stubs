package java.sql

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration for status of the reason that a property could not be set
 *  via a call to Connection.setClientInfo
 */
class ClientInfoStatus private (name: String, ordinal: Int) extends Enum[ClientInfoStatus](name, ordinal) {
}

object ClientInfoStatus {
    /** The client info property could not be set for some unknown reason */
    final val REASON_UNKNOWN: ClientInfoStatus = new ClientInfoStatus("REASON_UNKNOWN", 0)

    /** The client info property name specified was not a recognized property
     *  name.
     */
    final val REASON_UNKNOWN_PROPERTY: ClientInfoStatus = new ClientInfoStatus("REASON_UNKNOWN_PROPERTY", 1)

    /** The value specified for the client info property was not valid. */
    final val REASON_VALUE_INVALID: ClientInfoStatus = new ClientInfoStatus("REASON_VALUE_INVALID", 2)

    /** The value specified for the client info property was too large. */
    final val REASON_VALUE_TRUNCATED: ClientInfoStatus = new ClientInfoStatus("REASON_VALUE_TRUNCATED", 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): ClientInfoStatus = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[ClientInfoStatus] = ???
}
