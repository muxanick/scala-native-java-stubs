package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{TreeModelEvent, TreeModelListener}

/** Forwards all TreeModel events to the TreeState. */
class BasicTreeUI.TreeModelHandler extends Object with TreeModelListener {

    /** Invoked after a node (or a set of siblings) has changed in some
     *  way.
     */
    @stub
    def treeNodesChanged(e: TreeModelEvent): Unit = ???

    /** Invoked after nodes have been inserted into the tree. */
    @stub
    def treeNodesInserted(e: TreeModelEvent): Unit = ???

    /** Invoked after nodes have been removed from the tree. */
    @stub
    def treeNodesRemoved(e: TreeModelEvent): Unit = ???
}
