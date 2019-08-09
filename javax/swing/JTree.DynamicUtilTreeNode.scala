package javax.swing

import java.lang.Object
import java.util.Enumeration
import javax.swing.tree.{DefaultMutableTreeNode, TreeNode}
import scala.scalanative.annotation.stub

/** DynamicUtilTreeNode can wrap
 *  vectors/hashtables/arrays/strings and
 *  create the appropriate children tree nodes as necessary. It is
 *  dynamic in that it will only create the children as necessary.
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
object JTree.DynamicUtilTreeNode extends DefaultMutableTreeNode {

    /** Creates a node with the specified object as its value and
     *  with the specified children.
     */
    @stub
    def DynamicUtilTreeNode(value: Object, children: Object) = ???

    /** Value to create children with. */
    @stub
    protected val childValue: Object = ???

    /** Does the this JTree have children?
     *  This property is currently not implemented.
     */
    @stub
    protected val hasChildren: Boolean = ???

    /** Have the children been loaded yet? */
    @stub
    protected val loadedChildren: Boolean = ???

    /** Subclassed to load the children, if necessary. */
    @stub
    def children(): Enumeration = ???

    /** Adds to parent all the children in children. */
    @stub
    def createChildren(parent: DefaultMutableTreeNode, children: Object): Unit = ???

    /** Subclassed to load the children, if necessary. */
    @stub
    def getChildAt(index: Int): TreeNode = ???

    /** Returns the number of child nodes. */
    @stub
    def getChildCount(): Int = ???

    /** Returns true if this node allows children. */
    @stub
    def isLeaf(): Boolean = ???

    /** Loads the children based on childValue. */
    @stub
    protected def loadChildren(): Unit = ???
}
