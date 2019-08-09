package javax.swing

import java.awt.event.{ContainerEvent, ContainerListener}
import java.lang.Object

// Fire PropertyChange listener, if one is registered,
// when children added/removed.
protected class JComponent.AccessibleJComponent.AccessibleContainerHandler extends Object with ContainerListener {

    @stub
    // Invoked when a component has been added to the container.
    def componentAdded(e: ContainerEvent): Unit = ???
}
