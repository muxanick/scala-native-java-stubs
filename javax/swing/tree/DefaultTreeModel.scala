package javax.swing.tree

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{EventListenerList, TreeModelListener}

// A simple tree data model that uses TreeNodes.
// For further information and examples that use DefaultTreeModel,
// see How to Use Trees
// in The Java Tutorial.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultTreeModel extends Object with Serializable, with TreeModel {

    @stub
    // Creates a tree in which any node can have children.
    def this(root: TreeNode) = ???

    @stub
    // Determines how the isLeaf method figures
    // out if a node is a leaf node.
    protected def asksAllowsChildren: Boolean = ???

    @stub
    // Listeners.
    protected def listenerList: EventListenerList = ???

    @stub
    // Adds a listener for the TreeModelEvent posted after the tree changes.
    def addTreeModelListener(l: TreeModelListener): Unit = ???

    @stub
    // Tells how leaf nodes are determined.
    def asksAllowsChildren(): Boolean = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireTreeNodesChanged(source: Object, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireTreeNodesInserted(source: Object, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireTreeNodesRemoved(source: Object, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireTreeStructureChanged(source: Object, path: Array[Object], childIndices: Array[Int], children: Array[Object]): Unit = ???

    @stub
    // Returns the child of parent at index index in the parent's
    // child array.
    def getChild(parent: Object, index: Int): Object = ???

    @stub
    // Returns the number of children of parent.
    def getChildCount(parent: Object): Int = ???

    @stub
    // Returns the index of child in parent.
    def getIndexOfChild(parent: Object, child: Object): Int = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Builds the parents of node up to and including the root node,
    // where the original node is the last element in the returned array.
    def getPathToRoot(aNode: TreeNode): Array[TreeNode] = ???

    @stub
    // Builds the parents of node up to and including the root node,
    // where the original node is the last element in the returned array.
    protected def getPathToRoot(aNode: TreeNode, depth: Int): Array[TreeNode] = ???

    @stub
    // Returns the root of the tree.
    def getRoot(): Object = ???

    @stub
    // Returns an array of all the tree model listeners
    // registered on this model.
    def getTreeModelListeners(): Array[TreeModelListener] = ???

    @stub
    // Invoked this to insert newChild at location index in parents children.
    def insertNodeInto(newChild: MutableTreeNode, parent: MutableTreeNode, index: Int): Unit = ???

    @stub
    // Returns whether the specified node is a leaf node.
    def isLeaf(node: Object): Boolean = ???

    @stub
    // Invoke this method after you've changed how node is to be
    // represented in the tree.
    def nodeChanged(node: TreeNode): Unit = ???

    @stub
    // Invoke this method after you've changed how the children identified by
    // childIndicies are to be represented in the tree.
    def nodesChanged(node: TreeNode, childIndices: Array[Int]): Unit = ???

    @stub
    // Invoke this method if you've totally changed the children of
    // node and its children's children...
    def nodeStructureChanged(node: TreeNode): Unit = ???

    @stub
    // Invoke this method after you've inserted some TreeNodes into
    // node.
    def nodesWereInserted(node: TreeNode, childIndices: Array[Int]): Unit = ???

    @stub
    // Invoke this method after you've removed some TreeNodes from
    // node.
    def nodesWereRemoved(node: TreeNode, childIndices: Array[Int], removedChildren: Array[Object]): Unit = ???

    @stub
    // Invoke this method if you've modified the TreeNodes upon which
    // this model depends.
    def reload(): Unit = ???

    @stub
    // Invoke this method if you've modified the TreeNodes upon which
    // this model depends.
    def reload(node: TreeNode): Unit = ???

    @stub
    // Message this to remove node from its parent.
    def removeNodeFromParent(node: MutableTreeNode): Unit = ???

    @stub
    // Removes a listener previously added with addTreeModelListener().
    def removeTreeModelListener(l: TreeModelListener): Unit = ???

    @stub
    // Sets whether or not to test leafness by asking getAllowsChildren()
    // or isLeaf() to the TreeNodes.
    def setAsksAllowsChildren(newValue: Boolean): Unit = ???

    @stub
    // Sets the root to root.
    def setRoot(root: TreeNode): Unit = ???
}
