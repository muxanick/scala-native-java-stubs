package javax.swing

import scala.scalanative.annotation.stub

/** Constants used to control the window-closing operation.
 *  The setDefaultCloseOperation and
 *  getDefaultCloseOperation methods
 *  provided by JFrame,
 *  JInternalFrame, and
 *  JDialog
 *  use these constants.
 *  For examples of setting the default window-closing operation, see
 *  Responding to Window-Closing Events,
 *  a section in The Java Tutorial.
 */
trait WindowConstants {
}

object WindowConstants {
    /** The dispose-window default window close operation. */
    @stub
    val DISPOSE_ON_CLOSE: Int = ???

    /** The do-nothing default window close operation. */
    @stub
    val DO_NOTHING_ON_CLOSE: Int = ???

    /** The exit application default window close operation. */
    @stub
    val EXIT_ON_CLOSE: Int = ???

    /** The hide-window default window close operation */
    @stub
    val HIDE_ON_CLOSE: Int = ???
}
