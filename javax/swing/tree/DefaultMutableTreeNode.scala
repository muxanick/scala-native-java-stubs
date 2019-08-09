package javax.swing.tree

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.{Enumeration, Vector}

// A DefaultMutableTreeNode is a general-purpose node in a tree data
// structure.
// For examples of using default mutable tree nodes, see
// How to Use Trees
// in The Java Tutorial.
//
// 
//
// A tree node may have at most one parent and 0 or more children.
// DefaultMutableTreeNode provides operations for examining and modifying a
// node's parent and children and also operations for examining the tree that
// the node is a part of.  A node's tree is the set of all nodes that can be
// reached by starting at the node and following all the possible links to
// parents and children.  A node with no parent is the root of its tree; a
// node with no children is a leaf.  A tree may consist of many subtrees,
// each node acting as the root for its own subtree.
// 
// This class provides enumerations for efficiently traversing a tree or
// subtree in various orders or for following the path between two nodes.
// A DefaultMutableTreeNode may also hold a reference to a user object, the
// use of which is left to the user.  Asking a DefaultMutableTreeNode for its
// string representation with toString() returns the string
// representation of its user object.
// 
// This is not a thread safe class.If you intend to use
// a DefaultMutableTreeNode (or a tree of TreeNodes) in more than one thread, you
// need to do your own synchronizing. A good convention to adopt is
// synchronizing on the root node of a tree.
// 
// While DefaultMutableTreeNode implements the MutableTreeNode interface and
// will allow you to add in any implementation of MutableTreeNode not all
// of the methods in DefaultMutableTreeNode will be applicable to all
// MutableTreeNodes implementations. Especially with some of the enumerations
// that are provided, using some of these methods assumes the
// DefaultMutableTreeNode contains only DefaultMutableNode instances. All
// of the TreeNode/MutableTreeNode methods will behave as defined no
// matter what implementations are added.
//
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultMutableTreeNode extends Object with Cloneable, with MutableTreeNode, with Serializable {

    @stub
    // Creates a tree node that has no parent and no children, but which
    // allows children.
    def this() = ???

    @stub
    // Creates a tree node with no parent, no children, but which allows
    // children, and initializes it with the specified user object.
    def this(userObject: Object) = ???

    @stub
    // true if the node is able to have children
    protected def allowsChildren: Boolean = ???

    @stub
    // array of children, may be null if this node has no children
    protected def children: Vector = ???

    @stub
    // this node's parent, or null if this node has no parent
    protected def parent: MutableTreeNode = ???

    @stub
    // Removes newChild from its parent and makes it a child of
    // this node by adding it to the end of this node's child array.
    def add(newChild: MutableTreeNode): Unit = ???

    @stub
    // Creates and returns an enumeration that traverses the subtree rooted at
    // this node in breadth-first order.
    def breadthFirstEnumeration(): Enumeration = ???

    @stub
    // Creates and returns a forward-order enumeration of this node's
    // children.
    def children(): Enumeration = ???

    @stub
    // Overridden to make clone public.
    def clone(): Object = ???

    @stub
    // Creates and returns an enumeration that traverses the subtree rooted at
    // this node in depth-first order.
    def depthFirstEnumeration(): Enumeration = ???

    @stub
    // Returns true if this node is allowed to have children.
    def getAllowsChildren(): Boolean = ???

    @stub
    // Returns the child in this node's child array that immediately
    // follows aChild, which must be a child of this node.
    def getChildAfter(aChild: TreeNode): TreeNode = ???

    @stub
    // Returns the child at the specified index in this node's child array.
    def getChildAt(index: Int): TreeNode = ???

    @stub
    // Returns the child in this node's child array that immediately
    // precedes aChild, which must be a child of this node.
    def getChildBefore(aChild: TreeNode): TreeNode = ???

    @stub
    // Returns the number of children of this node.
    def getChildCount(): Int = ???

    @stub
    // Returns the depth of the tree rooted at this node -- the longest
    // distance from this node to a leaf.
    def getDepth(): Int = ???

    @stub
    // Returns this node's first child.
    def getFirstChild(): TreeNode = ???

    @stub
    // Finds and returns the first leaf that is a descendant of this node --
    // either this node or its first child's first leaf.
    def getFirstLeaf(): DefaultMutableTreeNode = ???

    @stub
    // Returns the index of the specified child in this node's child array.
    def getIndex(aChild: TreeNode): Int = ???

    @stub
    // Returns this node's last child.
    def getLastChild(): TreeNode = ???

    @stub
    // Finds and returns the last leaf that is a descendant of this node --
    // either this node or its last child's last leaf.
    def getLastLeaf(): DefaultMutableTreeNode = ???

    @stub
    // Returns the total number of leaves that are descendants of this node.
    def getLeafCount(): Int = ???

    @stub
    // Returns the number of levels above this node -- the distance from
    // the root to this node.
    def getLevel(): Int = ???

    @stub
    // Returns the leaf after this node or null if this node is the
    // last leaf in the tree.
    def getNextLeaf(): DefaultMutableTreeNode = ???

    @stub
    // Returns the node that follows this node in a preorder traversal of this
    // node's tree.
    def getNextNode(): DefaultMutableTreeNode = ???

    @stub
    // Returns the next sibling of this node in the parent's children array.
    def getNextSibling(): DefaultMutableTreeNode = ???

    @stub
    // Returns this node's parent or null if this node has no parent.
    def getParent(): TreeNode = ???

    @stub
    // Returns the path from the root, to get to this node.
    def getPath(): Array[TreeNode] = ???

    @stub
    // Builds the parents of node up to and including the root node,
    // where the original node is the last element in the returned array.
    protected def getPathToRoot(aNode: TreeNode, depth: Int): Array[TreeNode] = ???

    @stub
    // Returns the leaf before this node or null if this node is the
    // first leaf in the tree.
    def getPreviousLeaf(): DefaultMutableTreeNode = ???

    @stub
    // Returns the node that precedes this node in a preorder traversal of
    // this node's tree.
    def getPreviousNode(): DefaultMutableTreeNode = ???

    @stub
    // Returns the previous sibling of this node in the parent's children
    // array.
    def getPreviousSibling(): DefaultMutableTreeNode = ???

    @stub
    // Returns the root of the tree that contains this node.
    def getRoot(): TreeNode = ???

    @stub
    // Returns the nearest common ancestor to this node and aNode.
    def getSharedAncestor(aNode: DefaultMutableTreeNode): TreeNode = ???

    @stub
    // Returns the number of siblings of this node.
    def getSiblingCount(): Int = ???

    @stub
    // Returns this node's user object.
    def getUserObject(): Object = ???

    @stub
    // Returns the user object path, from the root, to get to this node.
    def getUserObjectPath(): Array[Object] = ???

    @stub
    // Removes newChild from its present parent (if it has a
    // parent), sets the child's parent to this node, and then adds the child
    // to this node's child array at index childIndex.
    def insert(newChild: MutableTreeNode, childIndex: Int): Unit = ???

    @stub
    // Returns true if this node has no children.
    def isLeaf(): Boolean = ???

    @stub
    // Returns true if anotherNode is an ancestor of this node
    // -- if it is this node, this node's parent, or an ancestor of this
    // node's parent.
    def isNodeAncestor(anotherNode: TreeNode): Boolean = ???

    @stub
    // Returns true if aNode is a child of this node.
    def isNodeChild(aNode: TreeNode): Boolean = ???

    @stub
    // Returns true if anotherNode is a descendant of this node
    // -- if it is this node, one of this node's children, or a descendant of
    // one of this node's children.
    def isNodeDescendant(anotherNode: DefaultMutableTreeNode): Boolean = ???

    @stub
    // Returns true if and only if aNode is in the same tree
    // as this node.
    def isNodeRelated(aNode: DefaultMutableTreeNode): Boolean = ???

    @stub
    // Returns true if anotherNode is a sibling of (has the
    // same parent as) this node.
    def isNodeSibling(anotherNode: TreeNode): Boolean = ???

    @stub
    // Returns true if this node is the root of the tree.
    def isRoot(): Boolean = ???

    @stub
    // Creates and returns an enumeration that follows the path from
    // ancestor to this node.
    def pathFromAncestorEnumeration(ancestor: TreeNode): Enumeration = ???

    @stub
    // Creates and returns an enumeration that traverses the subtree rooted at
    // this node in postorder.
    def postorderEnumeration(): Enumeration = ???

    @stub
    // Creates and returns an enumeration that traverses the subtree rooted at
    // this node in preorder.
    def preorderEnumeration(): Enumeration = ???

    @stub
    // Removes the child at the specified index from this node's children
    // and sets that node's parent to null.
    def remove(childIndex: Int): Unit = ???

    @stub
    // Removes aChild from this node's child array, giving it a
    // null parent.
    def remove(aChild: MutableTreeNode): Unit = ???

    @stub
    // Removes all of this node's children, setting their parents to null.
    def removeAllChildren(): Unit = ???

    @stub
    // Removes the subtree rooted at this node from the tree, giving this
    // node a null parent.
    def removeFromParent(): Unit = ???

    @stub
    // Determines whether or not this node is allowed to have children.
    def setAllowsChildren(allows: Boolean): Unit = ???

    @stub
    // Sets this node's parent to newParent but does not
    // change the parent's child array.
    def setParent(newParent: MutableTreeNode): Unit = ???

    @stub
    // Sets the user object for this node to userObject.
    def setUserObject(userObject: Object): Unit = ???
}

object DefaultMutableTreeNode {
    @stub
    // An enumeration that is always empty.
    def EMPTY_ENUMERATION: Enumeration[TreeNode] = ???
}
