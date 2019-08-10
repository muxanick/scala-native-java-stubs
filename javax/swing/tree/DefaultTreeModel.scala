package javax.swing.tree

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{EventListenerList, TreeModelListener}
import scala.scalanative.annotation.stub

/** A simple tree data model that uses TreeNodes.
 *  For further information and examples that use DefaultTreeModel,
 *  see How to Use Trees
 *  in The Java Tutorial.
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
class DefaultTreeModel extends Object with Serializable with TreeModel {

    /** Creates a tree in which any node can have children. */
    @stub
    def this(root: TreeNode) = ???

    /** Creates a tree specifying whether any node can have children,
     *  or whether only certain nodes can have children.
     */
    @stub
    def this(root: TreeNode, asksAllowsChildren: Boolean) = ???

    /** Determines how the isLeaf method figures
     *  out if a node is a leaf node.
     */
    @stub
    protected val asksAllowsChildren: Boolean = ???

    /** Listeners. */
    @stub
    protected val listenerList: EventListenerList = ???

    /** Root of the tree. */
    @stub
    protected val root: TreeNode = ???

    /** Adds a listener for the TreeModelEvent posted after the tree changes. */
    @stub
    def addTreeModelListener(l: TreeModelListener): Unit = ???

    /** Tells how leaf nodes are determined. */
    @stub
    def asksAllowsChildren(): Boolean = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireTreeNodesChanged(source: Any, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireTreeNodesInserted(source: Any, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireTreeNodesRemoved(source: Any, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireTreeStructureChanged(source: Any, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    /** Returns the child of parent at index index in the parent's
     *  child array.
     */
    @stub
    def getChild(parent: Any, index: Int): Any = ???

    /** Returns the number of children of parent. */
    @stub
    def getChildCount(parent: Any): Int = ???

    /** Returns the index of child in parent. */
    @stub
    def getIndexOfChild(parent: Any, child: Any): Int = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Builds the parents of node up to and including the root node,
     *  where the original node is the last element in the returned array.
     */
    @stub
    def getPathToRoot(aNode: TreeNode): Array[TreeNode] = ???

    /** Builds the parents of node up to and including the root node,
     *  where the original node is the last element in the returned array.
     */
    @stub
    protected def getPathToRoot(aNode: TreeNode, depth: Int): Array[TreeNode] = ???

    /** Returns the root of the tree. */
    @stub
    def getRoot(): Any = ???

    /** Returns an array of all the tree model listeners
     *  registered on this model.
     */
    @stub
    def getTreeModelListeners(): Array[TreeModelListener] = ???

    /** Invoked this to insert newChild at location index in parents children. */
    @stub
    def insertNodeInto(newChild: MutableTreeNode, parent: MutableTreeNode, index: Int): Unit = ???

    /** Returns whether the specified node is a leaf node. */
    @stub
    def isLeaf(node: Any): Boolean = ???

    /** Invoke this method after you've changed how node is to be
     *  represented in the tree.
     */
    @stub
    def nodeChanged(node: TreeNode): Unit = ???

    /** Invoke this method after you've changed how the children identified by
     *  childIndicies are to be represented in the tree.
     */
    @stub
    def nodesChanged(node: TreeNode, childIndices: Array[Int]): Unit = ???

    /** Invoke this method if you've totally changed the children of
     *  node and its children's children...
     */
    @stub
    def nodeStructureChanged(node: TreeNode): Unit = ???

    /** Invoke this method after you've inserted some TreeNodes into
     *  node.
     */
    @stub
    def nodesWereInserted(node: TreeNode, childIndices: Array[Int]): Unit = ???

    /** Invoke this method after you've removed some TreeNodes from
     *  node.
     */
    @stub
    def nodesWereRemoved(node: TreeNode, childIndices: Array[Int], removedChildren: Array[Object]): Unit = ???

    /** Invoke this method if you've modified the TreeNodes upon which
     *  this model depends.
     */
    @stub
    def reload(): Unit = ???

    /** Invoke this method if you've modified the TreeNodes upon which
     *  this model depends.
     */
    @stub
    def reload(node: TreeNode): Unit = ???

    /** Message this to remove node from its parent. */
    @stub
    def removeNodeFromParent(node: MutableTreeNode): Unit = ???

    /** Removes a listener previously added with addTreeModelListener(). */
    @stub
    def removeTreeModelListener(l: TreeModelListener): Unit = ???

    /** Sets whether or not to test leafness by asking getAllowsChildren()
     *  or isLeaf() to the TreeNodes.
     */
    @stub
    def setAsksAllowsChildren(newValue: Boolean): Unit = ???

    /** Sets the root to root. */
    @stub
    def setRoot(root: TreeNode): Unit = ???

    /** This sets the user object of the TreeNode identified by path
     *  and posts a node changed.
     */
    @stub
    def valueForPathChanged(path: TreePath, newValue: Any): Unit = ???
}
