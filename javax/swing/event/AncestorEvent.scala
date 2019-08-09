package javax.swing.event

import java.awt.{AWTEvent, Container}
import java.lang.Object
import java.util.EventObject
import javax.swing.JComponent
import scala.scalanative.annotation.stub

/** An event reported to a child component that originated from an
 *  ancestor in the component hierarchy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class AncestorEvent extends AWTEvent {

    /** Constructs an AncestorEvent object to identify a change
     *  in an ancestor-component's display-status.
     */
    @stub
    def this(source: JComponent, id: Int, ancestor: Container, ancestorParent: Container) = ???

    /** Returns the ancestor that the event actually occurred on. */
    @stub
    def getAncestor(): Container = ???

    /** Returns the parent of the ancestor the event actually occurred on. */
    @stub
    def getAncestorParent(): Container = ???

    /** Returns the component that the listener was added to. */
    @stub
    def getComponent(): JComponent = ???
}

object AncestorEvent {
    /** An ancestor-component was added to the hierarchy of
     *  visible objects (made visible), and is currently being displayed.
     */
    @stub
    val ANCESTOR_ADDED: Int = ???

    /** An ancestor-component changed its position on the screen. */
    @stub
    val ANCESTOR_MOVED: Int = ???

    /** An ancestor-component was removed from the hierarchy
     *  of visible objects (hidden) and is no longer being displayed.
     */
    @stub
    val ANCESTOR_REMOVED: Int = ???
}
