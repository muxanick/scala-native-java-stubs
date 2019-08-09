package java.awt.dnd

import java.util.EventListener

// The listener interface for receiving drag gesture events.
// This interface is intended for a drag gesture recognition
// implementation. See a specification for DragGestureRecognizer
// for details on how to register the listener interface.
// Upon recognition of a drag gesture the DragGestureRecognizer calls this interface's
// dragGestureRecognized()
// method and passes a DragGestureEvent.
trait DragGestureListener extends EventListener {
}
