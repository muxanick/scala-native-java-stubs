package java.awt

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The message type determines which icon will be displayed in the
 *  caption of the message, and a possible system sound a message
 *  may generate upon showing.
 */
class TrayIcon.MessageType private (name: String, ordinal: Int) extends Enum[TrayIcon.MessageType](name, ordinal) {
}

object TrayIcon.MessageType {
    /** An error message */
    final val ERROR = new TrayIcon.MessageType(ERROR, 0)

    /** An information message */
    final val INFO = new TrayIcon.MessageType(INFO, 1)

    /** Simple message */
    final val NONE = new TrayIcon.MessageType(NONE, 2)

    /** A warning message */
    final val WARNING = new TrayIcon.MessageType(WARNING, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): TrayIcon.MessageType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[TrayIcon.MessageType] = ???
}
