package javax.swing.tree

import java.awt.Component
import java.lang.Object
import javax.swing.{CellEditor, JTree}
import scala.scalanative.annotation.stub

/** Adds to CellEditor the extensions necessary to configure an editor
 *  in a tree.
 */
trait TreeCellEditor extends CellEditor {

    /** Sets an initial value for the editor. */
    @stub
    def getTreeCellEditorComponent(tree: JTree, value: Any, isSelected: Boolean, expanded: Boolean, leaf: Boolean, row: Int): Component = ???
}
