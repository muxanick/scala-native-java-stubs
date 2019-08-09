package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving hierarchy changed events.
 *  The class that is interested in processing a hierarchy changed event
 *  should implement this interface.
 *  The listener object created from that class is then registered with a
 *  Component using the Component's addHierarchyListener
 *  method. When the hierarchy to which the Component belongs changes, the
 *  hierarchyChanged method in the listener object is invoked,
 *  and the HierarchyEvent is passed to it.
 *  
 *  Hierarchy events are provided for notification purposes ONLY;
 *  The AWT will automatically handle changes to the hierarchy internally so
 *  that GUI layout, displayability, and visibility work properly regardless
 *  of whether a program registers a HierarchyListener or not.
 */
trait HierarchyListener extends EventListener {

    /** Called when the hierarchy has been changed. */
    @stub
    def hierarchyChanged(e: HierarchyEvent): Unit = ???
}
