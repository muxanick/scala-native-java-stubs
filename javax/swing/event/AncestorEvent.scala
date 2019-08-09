package javax.swing.event

import java.awt.{AWTEvent, Container}
import java.lang.Object
import java.util.EventObject

// An event reported to a child component that originated from an
// ancestor in the component hierarchy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class AncestorEvent extends AWTEvent {

    @stub
    // Returns the ancestor that the event actually occurred on.
    def getAncestor(): Container = ???

    @stub
    // Returns the parent of the ancestor the event actually occurred on.
    def getAncestorParent(): Container = ???
}

object AncestorEvent {
    @stub
    // An ancestor-component was added to the hierarchy of
    // visible objects (made visible), and is currently being displayed.
    def ANCESTOR_ADDED: Int = ???

    @stub
    // An ancestor-component changed its position on the screen.
    def ANCESTOR_MOVED: Int = ???
}
