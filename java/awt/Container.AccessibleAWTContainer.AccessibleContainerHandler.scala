package java.awt

import java.awt.event.{ContainerEvent, ContainerListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Fire PropertyChange listener, if one is registered,
 *  when children are added or removed.
 */
protected class Container.AccessibleAWTContainer.AccessibleContainerHandler extends Object with ContainerListener {

    /**  */
    @stub
    protected def AccessibleContainerHandler() = ???

    /** Invoked when a component has been added to the container. */
    @stub
    def componentAdded(e: ContainerEvent): Unit = ???

    /** Invoked when a component has been removed from the container. */
    @stub
    def componentRemoved(e: ContainerEvent): Unit = ???
}
