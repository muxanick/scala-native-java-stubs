package javax.swing

import java.lang.Object
import javax.swing.event.{TreeModelEvent, TreeModelListener}
import scala.scalanative.annotation.stub

/** Listens to the model and updates the expandedState
 *  accordingly when nodes are removed, or changed.
 */
protected class JTree_TreeModelHandler extends Object with TreeModelListener {

    /**  */
    @stub
    protected def TreeModelHandler() = ???

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

    /** Invoked after the tree has drastically changed structure from a
     *  given node down.
     */
    @stub
    def treeStructureChanged(e: TreeModelEvent): Unit = ???
}
