package javax.swing.tree

import java.awt.Component
import java.lang.Object
import javax.swing.JTree
import scala.scalanative.annotation.stub

/** Defines the requirements for an object that displays a tree node.
 *  See How to Use Trees
 *  in The Java Tutorial
 *  for an example of implementing a tree cell renderer
 *  that displays custom icons.
 */
trait TreeCellRenderer {

    /** Sets the value of the current tree cell to value. */
    @stub
    def getTreeCellRendererComponent(tree: JTree, value: Any, selected: Boolean, expanded: Boolean, leaf: Boolean, row: Int, hasFocus: Boolean): Component = ???
}
