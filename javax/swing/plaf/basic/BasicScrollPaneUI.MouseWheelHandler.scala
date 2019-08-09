package javax.swing.plaf.basic

import java.awt.event.{MouseWheelEvent, MouseWheelListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** MouseWheelHandler is an inner class which implements the
 *  MouseWheelListener interface.  MouseWheelHandler responds to
 *  MouseWheelEvents by scrolling the JScrollPane appropriately.
 *  If the scroll pane's
 *  isWheelScrollingEnabled
 *  method returns false, no scrolling occurs.
 */
protected class BasicScrollPaneUI.MouseWheelHandler extends Object with MouseWheelListener {

    /**  */
    @stub
    protected def MouseWheelHandler() = ???

    /** Called when the mouse wheel is rotated while over a
     *  JScrollPane.
     */
    @stub
    def mouseWheelMoved(e: MouseWheelEvent): Unit = ???
}
