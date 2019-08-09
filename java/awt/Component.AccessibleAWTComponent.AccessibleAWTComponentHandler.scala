package java.awt

import java.awt.event.{ComponentEvent, ComponentListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Fire PropertyChange listener, if one is registered,
 *  when shown/hidden..
 */
protected class Component.AccessibleAWTComponent.AccessibleAWTComponentHandler extends Object with ComponentListener {

    /**  */
    @stub
    protected def AccessibleAWTComponentHandler() = ???

    /** Invoked when the component has been made invisible. */
    @stub
    def componentHidden(e: ComponentEvent): Unit = ???

    /** Invoked when the component's position changes. */
    @stub
    def componentMoved(e: ComponentEvent): Unit = ???

    /** Invoked when the component's size changes. */
    @stub
    def componentResized(e: ComponentEvent): Unit = ???

    /** Invoked when the component has been made visible. */
    @stub
    def componentShown(e: ComponentEvent): Unit = ???
}
