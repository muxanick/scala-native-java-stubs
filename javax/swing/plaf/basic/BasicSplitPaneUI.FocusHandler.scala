package javax.swing.plaf.basic

import java.awt.event.{FocusAdapter, FocusEvent}
import java.lang.Object

/** Implementation of the FocusListener that the JSplitPane UI uses.
 *  
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicSplitPaneUI.
 */
class BasicSplitPaneUI.FocusHandler extends FocusAdapter {

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(ev: FocusEvent): Unit = ???
}
