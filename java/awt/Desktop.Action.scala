package java.awt

import java.lang.{Enum, Object, String}

/** Represents an action type.  Each platform supports a different
 *  set of actions.  You may use the Desktop.isSupported(java.awt.Desktop.Action)
 *  method to determine if the given action is supported by the
 *  current platform.
 */
class Desktop.Action private (name: String, ordinal: Int) extends Enum[Desktop.Action](name, ordinal) {
}

object Desktop.Action {
    /** Represents a "browse" action. */
    final val BROWSE = new Desktop.Action(BROWSE, 0)

    /** Represents an "edit" action. */
    final val EDIT = new Desktop.Action(EDIT, 1)

    /** Represents a "mail" action. */
    final val MAIL = new Desktop.Action(MAIL, 2)

    /** Represents an "open" action. */
    final val OPEN = new Desktop.Action(OPEN, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Desktop.Action = ???
}
