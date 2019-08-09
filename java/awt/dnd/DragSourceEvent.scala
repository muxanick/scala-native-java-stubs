package java.awt.dnd

import java.awt.Point
import java.lang.Object
import java.util.EventObject

// This class is the base class for
// DragSourceDragEvent and
// DragSourceDropEvent.
// 
// DragSourceEvents are generated whenever the drag enters, moves
// over, or exits a drop site, when the drop action changes, and when the drag
// ends. The location for the generated DragSourceEvent specifies
// the mouse cursor location in screen coordinates at the moment this event
// occurred.
// 
// In a multi-screen environment without a virtual device, the cursor location is
// specified in the coordinate system of the initiator
// GraphicsConfiguration. The initiator
// GraphicsConfiguration is the GraphicsConfiguration
// of the Component on which the drag gesture for the current drag
// operation was recognized. If the cursor location is outside the bounds of
// the initiator GraphicsConfiguration, the reported coordinates are
// clipped to fit within the bounds of that GraphicsConfiguration.
// 
// In a multi-screen environment with a virtual device, the location is specified
// in the corresponding virtual coordinate system. If the cursor location is
// outside the bounds of the virtual device the reported coordinates are
// clipped to fit within the bounds of the virtual device.
class DragSourceEvent extends EventObject {

    @stub
    // Construct a DragSourceEvent
    // given a specified DragSourceContext.
    def this(dsc: DragSourceContext) = ???

    @stub
    // This method returns the DragSourceContext that
    // originated the event.
    def getDragSourceContext(): DragSourceContext = ???

    @stub
    // This method returns a Point indicating the cursor
    // location in screen coordinates at the moment this event occurred, or
    // null if the cursor location is not specified for this
    // event.
    def getLocation(): Point = ???

    @stub
    // This method returns the horizontal coordinate of the cursor location in
    // screen coordinates at the moment this event occurred, or zero if the
    // cursor location is not specified for this event.
    def getX(): Int = ???
}
