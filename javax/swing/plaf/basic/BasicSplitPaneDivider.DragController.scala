package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.Object
import scala.scalanative.annotation.stub

/** Handles the events during a dragging session for a
 *  HORIZONTAL_SPLIT oriented split pane. This continually
 *  messages dragDividerTo and then when done messages
 *  finishDraggingTo. When an instance is created it should be
 *  messaged with isValid to insure that dragging can happen
 *  (dragging won't be allowed if the two views can not be resized).
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
protected class BasicSplitPaneDivider.DragController extends Object {

    /**  */
    @stub
    protected def DragController(e: MouseEvent) = ???

    /**  */
    @stub
    protected def completeDrag(x: Int, y: Int): Unit = ???

    /** Messages finishDraggingTo with the new location for the mouse
     *  event.
     */
    @stub
    protected def completeDrag(e: MouseEvent): Unit = ???

    /**  */
    @stub
    protected def continueDrag(newX: Int, newY: Int): Unit = ???

    /** Messages dragDividerTo with the new location for the mouse
     *  event.
     */
    @stub
    protected def continueDrag(e: MouseEvent): Unit = ???

    /** Returns the x argument, since this is used for horizontal
     *  splits.
     */
    @stub
    protected def getNeededLocation(x: Int, y: Int): Int = ???

    /** Returns true if the dragging session is valid. */
    @stub
    protected def isValid(): Boolean = ???

    /** Returns the new position to put the divider at based on
     *  the passed in MouseEvent.
     */
    @stub
    protected def positionForMouseEvent(e: MouseEvent): Int = ???
}
