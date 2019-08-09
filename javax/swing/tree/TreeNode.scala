package javax.swing.tree

import java.util.Enumeration

// Defines the requirements for an object that can be used as a
// tree node in a JTree.
// 
// Implementations of TreeNode that override equals
// will typically need to override hashCode as well.  Refer
// to TreeModel for more information.
//
// For further information and examples of using tree nodes,
// see How to Use Tree Nodes
// in The Java Tutorial.
trait TreeNode {

    @stub
    // Returns the children of the receiver as an Enumeration.
    def children(): Enumeration = ???

    @stub
    // Returns true if the receiver allows children.
    def getAllowsChildren(): Boolean = ???

    @stub
    // Returns the child TreeNode at index
    // childIndex.
    def getChildAt(childIndex: Int): TreeNode = ???

    @stub
    // Returns the number of children TreeNodes the receiver
    // contains.
    def getChildCount(): Int = ???

    @stub
    // Returns the index of node in the receivers children.
    def getIndex(node: TreeNode): Int = ???

    @stub
    // Returns the parent TreeNode of the receiver.
    def getParent(): TreeNode = ???
}
