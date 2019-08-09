package javax.swing.event

import java.lang.Object
import java.util.EventObject

// An event used to identify a single path in a tree.  The source
// returned by getSource will be an instance of JTree.
// 
// For further documentation and examples see
// the following sections in The Java Tutorial:
// How to Write a Tree Expansion Listener and
// How to Write a Tree-Will-Expand Listener.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class TreeExpansionEvent extends EventObject {
}
