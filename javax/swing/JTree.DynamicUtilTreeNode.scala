package javax.swing

import java.lang.Object
import java.util.Enumeration
import javax.swing.tree.{DefaultMutableTreeNode, TreeNode}

// DynamicUtilTreeNode can wrap
// vectors/hashtables/arrays/strings and
// create the appropriate children tree nodes as necessary. It is
// dynamic in that it will only create the children as necessary.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
object JTree.DynamicUtilTreeNode extends DefaultMutableTreeNode {

    @stub
    // Value to create children with.
    protected def childValue: Object = ???

    @stub
    // Does the this JTree have children?
    // This property is currently not implemented.
    protected def hasChildren: Boolean = ???

    @stub
    // Subclassed to load the children, if necessary.
    def children(): Enumeration = ???

    @stub
    // Adds to parent all the children in children.
    def createChildren(parent: DefaultMutableTreeNode, children: Object): Unit = ???

    @stub
    // Subclassed to load the children, if necessary.
    def getChildAt(index: Int): TreeNode = ???

    @stub
    // Returns the number of child nodes.
    def getChildCount(): Int = ???

    @stub
    // Returns true if this node allows children.
    def isLeaf(): Boolean = ???
}
