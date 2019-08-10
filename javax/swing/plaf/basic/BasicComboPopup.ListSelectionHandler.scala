package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{ListSelectionEvent, ListSelectionListener}
import scala.scalanative.annotation.stub

/** As of Java 2 platform v 1.4, this class is now obsolete, doesn't do anything, and
 *  is only included for backwards API compatibility. Do not call or
 *  override.
 */
protected class BasicComboPopup_ListSelectionHandler extends Object with ListSelectionListener {

    /**  */
    @stub
    protected def ListSelectionHandler() = ???

    /** Called whenever the value of the selection changes. */
    @stub
    def valueChanged(e: ListSelectionEvent): Unit = ???
}
