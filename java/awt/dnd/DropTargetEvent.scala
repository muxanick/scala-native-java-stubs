package java.awt.dnd

import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The DropTargetEvent is the base
 *  class for both the DropTargetDragEvent
 *  and the DropTargetDropEvent.
 *  It encapsulates the current state of the Drag and
 *  Drop operations, in particular the current
 *  DropTargetContext.
 */
class DropTargetEvent extends EventObject {

    /** Construct a DropTargetEvent object with
     *  the specified DropTargetContext.
     */
    @stub
    def this(dtc: DropTargetContext) = ???

    /** The DropTargetContext associated with this
     *  DropTargetEvent.
     */
    @stub
    protected val context: DropTargetContext = ???

    /** This method returns the DropTargetContext
     *  associated with this DropTargetEvent.
     */
    @stub
    def getDropTargetContext(): DropTargetContext = ???
}
