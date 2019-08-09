package javax.swing.tree

import java.util.Enumeration

/** Defines the requirements for an object that can be used as a
 *  tree node in a JTree.
 *  
 *  Implementations of TreeNode that override equals
 *  will typically need to override hashCode as well.  Refer
 *  to TreeModel for more information.
 * 
 *  For further information and examples of using tree nodes,
 *  see How to Use Tree Nodes
 *  in The Java Tutorial.
 */
trait TreeNode {

    /** Returns the children of the receiver as an Enumeration. */
    @stub
    def children(): Enumeration = ???

    /** Returns true if the receiver allows children. */
    @stub
    def getAllowsChildren(): Boolean = ???

    /** Returns the child TreeNode at index
     *  childIndex.
     */
    @stub
    def getChildAt(childIndex: Int): TreeNode = ???

    /** Returns the number of children TreeNodes the receiver
     *  contains.
     */
    @stub
    def getChildCount(): Int = ???

    /** Returns the index of node in the receivers children. */
    @stub
    def getIndex(node: TreeNode): Int = ???

    /** Returns the parent TreeNode of the receiver. */
    @stub
    def getParent(): TreeNode = ???
}
