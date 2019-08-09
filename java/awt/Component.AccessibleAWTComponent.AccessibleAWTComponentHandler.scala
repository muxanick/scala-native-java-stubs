package java.awt

import java.awt.event.{ComponentEvent, ComponentListener}
import java.lang.Object

/** Fire PropertyChange listener, if one is registered,
 *  when shown/hidden..
 */
protected class Component.AccessibleAWTComponent.AccessibleAWTComponentHandler extends Object with ComponentListener {

    /** Invoked when the component has been made invisible. */
    @stub
    def componentHidden(e: ComponentEvent): Unit = ???

    /** Invoked when the component's position changes. */
    @stub
    def componentMoved(e: ComponentEvent): Unit = ???

    /** Invoked when the component's size changes. */
    @stub
    def componentResized(e: ComponentEvent): Unit = ???
}
