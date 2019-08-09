package java.awt.dnd

import java.awt.Component
import java.awt.event.{MouseEvent, MouseListener, MouseMotionListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This abstract subclass of DragGestureRecognizer
 *  defines a DragGestureRecognizer
 *  for mouse-based gestures.
 * 
 *  Each platform implements its own concrete subclass of this class,
 *  available via the Toolkit.createDragGestureRecognizer() method,
 *  to encapsulate
 *  the recognition of the platform dependent mouse gesture(s) that initiate
 *  a Drag and Drop operation.
 *  
 *  Mouse drag gesture recognizers should honor the
 *  drag gesture motion threshold, available through
 *  DragSource.getDragThreshold().
 *  A drag gesture should be recognized only when the distance
 *  in either the horizontal or vertical direction between
 *  the location of the latest mouse dragged event and the
 *  location of the corresponding mouse button pressed event
 *  is greater than the drag gesture motion threshold.
 *  
 *  Drag gesture recognizers created with
 *  DragSource.createDefaultDragGestureRecognizer(java.awt.Component, int, java.awt.dnd.DragGestureListener)
 *  follow this convention.
 */
abstract class MouseDragGestureRecognizer extends DragGestureRecognizer with MouseListener with MouseMotionListener {

    /** Construct a new MouseDragGestureRecognizer
     *  given the DragSource for the Component.
     */
    @stub
    protected def this(ds: DragSource) = ???

    /** Construct a new MouseDragGestureRecognizer
     *  given the DragSource for the
     *  Component c, and the
     *  Component to observe.
     */
    @stub
    protected def this(ds: DragSource, c: Component) = ???

    /** Construct a new MouseDragGestureRecognizer
     *  given the DragSource for
     *  the Component c,
     *  the Component to observe, and the action(s)
     *  permitted for this drag operation.
     */
    @stub
    protected def this(ds: DragSource, c: Component, act: Int) = ???

    /** Construct a new MouseDragGestureRecognizer
     *  given the DragSource for the
     *  Component c, the Component
     *  to observe, the action(s)
     *  permitted for this drag operation, and
     *  the DragGestureListener to
     *  notify when a drag gesture is detected.
     */
    @stub
    protected def this(ds: DragSource, c: Component, act: Int, dgl: DragGestureListener) = ???

    /** Invoked when the mouse has been clicked on a component. */
    def mouseClicked(e: MouseEvent): Unit

    /** Invoked when a mouse button is pressed on a component. */
    def mouseDragged(e: MouseEvent): Unit

    /** Invoked when the mouse enters a component. */
    def mouseEntered(e: MouseEvent): Unit

    /** Invoked when the mouse exits a component. */
    def mouseExited(e: MouseEvent): Unit

    /** Invoked when the mouse button has been moved on a component
     *  (with no buttons no down).
     */
    def mouseMoved(e: MouseEvent): Unit

    /** Invoked when a mouse button has been
     *  pressed on a Component.
     */
    def mousePressed(e: MouseEvent): Unit

    /** Invoked when a mouse button has been released on a component. */
    def mouseReleased(e: MouseEvent): Unit

    /** register this DragGestureRecognizer's Listeners with the Component */
    protected def registerListeners(): Unit

    /** unregister this DragGestureRecognizer's Listeners with the Component
     * 
     *  subclasses must override this method
     */
    protected def unregisterListeners(): Unit
}
