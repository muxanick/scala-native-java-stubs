package javax.swing.plaf.basic

import java.awt.event.{FocusAdapter, FocusEvent}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Implementation of the FocusListener that the JSplitPane UI uses.
 *  
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicSplitPaneUI.
 */
class BasicSplitPaneUI.FocusHandler extends FocusAdapter {

    /**  */
    @stub
    def FocusHandler() = ???

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(ev: FocusEvent): Unit = ???

    /** Invoked when a component loses the keyboard focus. */
    @stub
    def focusLost(ev: FocusEvent): Unit = ???
}
