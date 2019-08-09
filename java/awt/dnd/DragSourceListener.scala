package java.awt.dnd

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The DragSourceListener defines the
 *  event interface for originators of
 *  Drag and Drop operations to track the state of the user's gesture, and to
 *  provide appropriate "drag over"
 *  feedback to the user throughout the
 *  Drag and Drop operation.
 *  
 *  The drop site is associated with the previous dragEnter()
 *  invocation if the latest invocation of dragEnter() on this
 *  listener:
 *  
 *  corresponds to that drop site and
 *   is not followed by a dragExit() invocation on this listener.
 *  
 */
trait DragSourceListener extends EventListener {

    /** This method is invoked to signify that the Drag and Drop
     *  operation is complete.
     */
    @stub
    def dragDropEnd(dsde: DragSourceDropEvent): Unit = ???

    /** Called as the cursor's hotspot enters a platform-dependent drop site. */
    @stub
    def dragEnter(dsde: DragSourceDragEvent): Unit = ???

    /** Called as the cursor's hotspot exits a platform-dependent drop site. */
    @stub
    def dragExit(dse: DragSourceEvent): Unit = ???

    /** Called as the cursor's hotspot moves over a platform-dependent drop site. */
    @stub
    def dragOver(dsde: DragSourceDragEvent): Unit = ???

    /** Called when the user has modified the drop gesture. */
    @stub
    def dropActionChanged(dsde: DragSourceDragEvent): Unit = ???
}
