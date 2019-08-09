package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener that's notified when a tree expands or collapses
 *  a node.
 *  For further documentation and examples see
 *  How to Write a Tree Expansion Listener,
 *  a section in The Java Tutorial.
 */
trait TreeExpansionListener extends EventListener {

    /** Called whenever an item in the tree has been collapsed. */
    @stub
    def treeCollapsed(event: TreeExpansionEvent): Unit = ???

    /** Called whenever an item in the tree has been expanded. */
    @stub
    def treeExpanded(event: TreeExpansionEvent): Unit = ???
}
