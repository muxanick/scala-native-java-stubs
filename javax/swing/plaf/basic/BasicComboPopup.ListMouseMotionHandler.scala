package javax.swing.plaf.basic

import java.awt.event.{MouseEvent, MouseMotionAdapter}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This listener changes the selected item as you move the mouse over the list.
 *  The selection change is not committed to the model, this is for user feedback only.
 */
protected class BasicComboPopup_ListMouseMotionHandler extends MouseMotionAdapter {

    /**  */
    @stub
    protected def ListMouseMotionHandler() = ???

    /** Invoked when the mouse button has been moved on a component
     *  (with no buttons no down).
     */
    @stub
    def mouseMoved(anEvent: MouseEvent): Unit = ???
}
