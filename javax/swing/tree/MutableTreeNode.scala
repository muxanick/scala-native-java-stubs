package javax.swing.tree

import java.lang.Object
import scala.scalanative.annotation.stub

/** Defines the requirements for a tree node object that can change --
 *  by adding or removing child nodes, or by changing the contents
 *  of a user object stored in the node.
 */
trait MutableTreeNode extends TreeNode {

    /** Adds child to the receiver at index. */
    @stub
    def insert(child: MutableTreeNode, index: Int): Unit = ???

    /** Removes the child at index from the receiver. */
    @stub
    def remove(index: Int): Unit = ???

    /** Removes node from the receiver. */
    @stub
    def remove(node: MutableTreeNode): Unit = ???

    /** Removes the receiver from its parent. */
    @stub
    def removeFromParent(): Unit = ???

    /** Sets the parent of the receiver to newParent. */
    @stub
    def setParent(newParent: MutableTreeNode): Unit = ???

    /** Resets the user object of the receiver to object. */
    @stub
    def setUserObject(object: Object): Unit = ???
}
