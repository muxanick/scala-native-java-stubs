package java.awt.dnd

import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The DragSourceDropEvent is delivered
 *  from the DragSourceContextPeer,
 *  via the DragSourceContext, to the dragDropEnd
 *  method of DragSourceListeners registered with that
 *  DragSourceContext and with its associated
 *  DragSource.
 *  It contains sufficient information for the
 *  originator of the operation
 *  to provide appropriate feedback to the end user
 *  when the operation completes.
 *  
 */
class DragSourceDropEvent extends DragSourceEvent {

    /** Construct a DragSourceDropEvent
     *  for a drag that does not result in a drop.
     */
    @stub
    def this(dsc: DragSourceContext) = ???

    /** Construct a DragSourceDropEvent for a drop,
     *  given the
     *  DragSourceContext, the drop action,
     *  and a boolean indicating if the drop was successful.
     */
    @stub
    def this(dsc: DragSourceContext, action: Int, success: Boolean) = ???

    /** Construct a DragSourceDropEvent for a drop, given the
     *  DragSourceContext, the drop action, a boolean
     *  indicating if the drop was successful, and coordinates.
     */
    @stub
    def this(dsc: DragSourceContext, action: Int, success: Boolean, x: Int, y: Int) = ???

    /** This method returns an int representing
     *  the action performed by the target on the subject of the drop.
     */
    @stub
    def getDropAction(): Int = ???

    /** This method returns a boolean indicating
     *  if the drop was successful.
     */
    @stub
    def getDropSuccess(): Boolean = ???
}
