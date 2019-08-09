package java.awt.dnd

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving drag gesture events.
 *  This interface is intended for a drag gesture recognition
 *  implementation. See a specification for DragGestureRecognizer
 *  for details on how to register the listener interface.
 *  Upon recognition of a drag gesture the DragGestureRecognizer calls this interface's
 *  dragGestureRecognized()
 *  method and passes a DragGestureEvent.
 */
trait DragGestureListener extends EventListener {

    /** This method is invoked by the DragGestureRecognizer
     *  when the DragGestureRecognizer detects a platform-dependent
     *  drag initiating gesture.
     */
    @stub
    def dragGestureRecognized(dge: DragGestureEvent): Unit = ???
}
