package java.awt.event

import java.awt.{AWTEvent, Component, Container}
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** A low-level event which indicates that a container's contents
 *  changed because a component was added or removed.
 *  
 *  Container events are provided for notification purposes ONLY;
 *  The AWT will automatically handle changes to the containers
 *  contents internally so that the program works properly regardless of
 *  whether the program is receiving these events or not.
 *  
 *  This low-level event is generated by a container object (such as a
 *  Panel) when a component is added to it or removed from it.
 *  The event is passed to every ContainerListener
 *  or ContainerAdapter object which registered to receive such
 *  events using the component's addContainerListener method.
 *  (ContainerAdapter objects implement the
 *  ContainerListener interface.) Each such listener object
 *  gets this ContainerEvent when the event occurs.
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular ContainerEvent instance is not
 *  in the range from CONTAINER_FIRST to CONTAINER_LAST.
 */
class ContainerEvent extends ComponentEvent {

    /** Constructs a ContainerEvent object. */
    @stub
    def this(source: Component, id: Int, child: Component) = ???

    /** Returns the component that was affected by the event. */
    @stub
    def getChild(): Component = ???

    /** Returns the originator of the event. */
    @stub
    def getContainer(): Container = ???

    /** Returns a parameter string identifying this event. */
    @stub
    def paramString(): String = ???
}

object ContainerEvent {
    /** This event indicates that a component was added to the container. */
    @stub
    val COMPONENT_ADDED: Int = ???

    /** This event indicates that a component was removed from the container. */
    @stub
    val COMPONENT_REMOVED: Int = ???

    /** The first number in the range of ids used for container events. */
    @stub
    val CONTAINER_FIRST: Int = ???

    /** The last number in the range of ids used for container events. */
    @stub
    val CONTAINER_LAST: Int = ???
}
