package java.awt.event

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract adapter class for receiving ancestor moved and resized events.
 *  The methods in this class are empty. This class exists as a
 *  convenience for creating listener objects.
 *  
 *  Extend this class and override the method for the event of interest. (If
 *  you implement the HierarchyBoundsListener interface, you have
 *  to define both methods in it. This abstract class defines null methods for
 *  them both, so you only have to define the method for the event you care
 *  about.)
 *  
 *  Create a listener object using your class and then register it with a
 *  Component using the Component's addHierarchyBoundsListener
 *  method. When the hierarchy to which the Component belongs changes by
 *  resize or movement of an ancestor, the relevant method in the listener
 *  object is invoked, and the HierarchyEvent is passed to it.
 */
abstract class HierarchyBoundsAdapter extends Object with HierarchyBoundsListener {

    /**  */
    @stub
    def this() = ???

    /** Called when an ancestor of the source is moved. */
    def ancestorMoved(e: HierarchyEvent): Unit

    /** Called when an ancestor of the source is resized. */
    def ancestorResized(e: HierarchyEvent): Unit
}
