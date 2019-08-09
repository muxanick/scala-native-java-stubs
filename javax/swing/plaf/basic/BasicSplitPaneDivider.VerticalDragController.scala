package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.Object
import scala.scalanative.annotation.stub

/** Handles the events during a dragging session for a
 *  VERTICAL_SPLIT oriented split pane. This continually
 *  messages dragDividerTo and then when done messages
 *  finishDraggingTo. When an instance is created it should be
 *  messaged with isValid to insure that dragging can happen
 *  (dragging won't be allowed if the two views can not be resized).
 */
protected class BasicSplitPaneDivider.VerticalDragController extends BasicSplitPaneDivider.DragController {

    /**  */
    @stub
    protected def VerticalDragController(e: MouseEvent) = ???

    /** Returns the y argument, since this is used for vertical
     *  splits.
     */
    @stub
    protected def getNeededLocation(x: Int, y: Int): Int = ???

    /** Returns the new position to put the divider at based on
     *  the passed in MouseEvent.
     */
    @stub
    protected def positionForMouseEvent(e: MouseEvent): Int = ???
}
