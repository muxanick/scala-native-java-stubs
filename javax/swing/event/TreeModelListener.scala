package javax.swing.event

import java.util.EventListener

// Defines the interface for an object that listens
// to changes in a TreeModel.
// For further information and examples see
// How to Write a Tree Model Listener,
// a section in The Java Tutorial.
trait TreeModelListener extends EventListener {

    @stub
    // Invoked after a node (or a set of siblings) has changed in some
    // way.
    def treeNodesChanged(e: TreeModelEvent): Unit = ???

    @stub
    // Invoked after nodes have been inserted into the tree.
    def treeNodesInserted(e: TreeModelEvent): Unit = ???

    @stub
    // Invoked after nodes have been removed from the tree.
    def treeNodesRemoved(e: TreeModelEvent): Unit = ???
}
