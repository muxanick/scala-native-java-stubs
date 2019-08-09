package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** Defines the interface for an object that listens
 *  to changes in a TreeModel.
 *  For further information and examples see
 *  How to Write a Tree Model Listener,
 *  a section in The Java Tutorial.
 */
trait TreeModelListener extends EventListener {

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
