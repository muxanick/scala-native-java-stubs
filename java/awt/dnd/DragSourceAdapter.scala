package java.awt.dnd

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract adapter class for receiving drag source events. The methods in
 *  this class are empty. This class exists only as a convenience for creating
 *  listener objects.
 *  
 *  Extend this class to create a DragSourceEvent listener
 *  and override the methods for the events of interest. (If you implement the
 *  DragSourceListener interface, you have to define all of
 *  the methods in it. This abstract class defines null methods for them
 *  all, so you only have to define methods for events you care about.)
 *  
 *  Create a listener object using the extended class and then register it with
 *  a DragSource. When the drag enters, moves over, or exits
 *  a drop site, when the drop action changes, and when the drag ends, the
 *  relevant method in the listener object is invoked, and the
 *  DragSourceEvent is passed to it.
 *  
 *  The drop site is associated with the previous dragEnter()
 *  invocation if the latest invocation of dragEnter() on this
 *  adapter corresponds to that drop site and is not followed by a
 *  dragExit() invocation on this adapter.
 */
abstract class DragSourceAdapter extends Object with DragSourceListener with DragSourceMotionListener {

    /**  */
    @stub
    def this() = ???

    /** This method is invoked to signify that the Drag and Drop
     *  operation is complete.
     */
    def dragDropEnd(dsde: DragSourceDropEvent): Unit

    /** Called as the cursor's hotspot enters a platform-dependent drop site. */
    def dragEnter(dsde: DragSourceDragEvent): Unit

    /** Called as the cursor's hotspot exits a platform-dependent drop site. */
    def dragExit(dse: DragSourceEvent): Unit

    /** Called whenever the mouse is moved during a drag operation. */
    def dragMouseMoved(dsde: DragSourceDragEvent): Unit

    /** Called as the cursor's hotspot moves over a platform-dependent drop site. */
    def dragOver(dsde: DragSourceDragEvent): Unit

    /** Called when the user has modified the drop gesture. */
    def dropActionChanged(dsde: DragSourceDragEvent): Unit
}
