package javax.swing.tree

// Defines the requirements for a tree node object that can change --
// by adding or removing child nodes, or by changing the contents
// of a user object stored in the node.
trait MutableTreeNode extends TreeNode {

    @stub
    // Adds child to the receiver at index.
    def insert(child: MutableTreeNode, index: Int): Unit = ???

    @stub
    // Removes the child at index from the receiver.
    def remove(index: Int): Unit = ???

    @stub
    // Removes node from the receiver.
    def remove(node: MutableTreeNode): Unit = ???

    @stub
    // Removes the receiver from its parent.
    def removeFromParent(): Unit = ???

    @stub
    // Sets the parent of the receiver to newParent.
    def setParent(newParent: MutableTreeNode): Unit = ???
}
