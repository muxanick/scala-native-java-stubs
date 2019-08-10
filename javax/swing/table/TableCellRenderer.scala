package javax.swing.table

import java.awt.Component
import java.lang.Object
import javax.swing.JTable
import scala.scalanative.annotation.stub

/** This interface defines the method required by any object that
 *  would like to be a renderer for cells in a JTable.
 */
trait TableCellRenderer {

    /** Returns the component used for drawing the cell. */
    @stub
    def getTableCellRendererComponent(table: JTable, value: Any, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component = ???
}
