package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{TreeModelEvent, TreeModelListener}

// Forwards all TreeModel events to the TreeState.
class BasicTreeUI.TreeModelHandler extends Object with TreeModelListener {

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
