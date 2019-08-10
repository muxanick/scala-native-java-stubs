package javax.swing.table

import java.awt.Component
import java.lang.Object
import javax.swing.{CellEditor, JTable}
import scala.scalanative.annotation.stub

/** This interface defines the method any object that would like to be
 *  an editor of values for components such as JListBox,
 *  JComboBox, JTree, or JTable
 *  needs to implement.
 */
trait TableCellEditor extends CellEditor {

    /** Sets an initial value for the editor. */
    @stub
    def getTableCellEditorComponent(table: JTable, value: Any, isSelected: Boolean, row: Int, column: Int): Component = ???
}
