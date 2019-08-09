package java.awt

import java.lang.{Enum, Object, String}

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

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): TrayIcon.MessageType = ???
}
