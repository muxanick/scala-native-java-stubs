package java.awt.event

import java.util.EventListener

/** The listener interface for receiving container events.
 *  The class that is interested in processing a container event
 *  either implements this interface (and all the methods it
 *  contains) or extends the abstract ContainerAdapter class
 *  (overriding only the methods of interest).
 *  The listener object created from that class is then registered with a
 *  component using the component's addContainerListener
 *  method. When the container's contents change because a component
 *  has been added or removed, the relevant method in the listener object
 *  is invoked, and the ContainerEvent is passed to it.
 *  
 *  Container events are provided for notification purposes ONLY;
 *  The AWT will automatically handle add and remove operations
 *  internally so the program works properly regardless of
 *  whether the program registers a ContainerListener or not.
 */
trait ContainerListener extends EventListener {

    /** Invoked when a component has been added to the container. */
    @stub
    def componentAdded(e: ContainerEvent): Unit = ???
}
