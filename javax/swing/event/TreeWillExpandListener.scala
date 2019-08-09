package javax.swing.event

import java.util.EventListener

/** The listener that's notified when a tree expands or collapses
 *  a node.
 *  For further information and examples see
 *  How to Write a Tree-Will-Expand Listener,
 *  a section in The Java Tutorial.
 */
trait TreeWillExpandListener extends EventListener {

    /** Invoked whenever a node in the tree is about to be collapsed. */
    @stub
    def treeWillCollapse(event: TreeExpansionEvent): Unit = ???
}
