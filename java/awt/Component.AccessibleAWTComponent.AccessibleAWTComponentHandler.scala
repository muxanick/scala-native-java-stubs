package java.awt

import java.awt.event.{ComponentEvent, ComponentListener}
import java.lang.Object

// Fire PropertyChange listener, if one is registered,
// when shown/hidden..
protected class Component.AccessibleAWTComponent.AccessibleAWTComponentHandler extends Object with ComponentListener {

    @stub
    // Invoked when the component has been made invisible.
    def componentHidden(e: ComponentEvent): Unit = ???

    @stub
    // Invoked when the component's position changes.
    def componentMoved(e: ComponentEvent): Unit = ???

    @stub
    // Invoked when the component's size changes.
    def componentResized(e: ComponentEvent): Unit = ???
}
