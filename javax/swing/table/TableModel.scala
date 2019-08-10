package javax.swing.table

import java.lang.{Class, Object, String}
import javax.swing.event.TableModelListener
import scala.scalanative.annotation.stub

/** The TableModel interface specifies the methods the
 *   JTable will use to interrogate a tabular data model. 
 * 
 *   The JTable can be set up to display any data
 *   model which implements the
 *   TableModel interface with a couple of lines of code:
 *   
 *       TableModel myData = new MyTableModel();
 *       JTable table = new JTable(myData);
 *   
 * 
 *  For further documentation, see Creating a Table Model
 *  in The Java Tutorial.
 */
trait TableModel {

    /** Adds a listener to the list that is notified each time a change
     *  to the data model occurs.
     */
    @stub
    def addTableModelListener(l: TableModelListener): Unit = ???

    /** Returns the most specific superclass for all the cell values
     *  in the column.
     */
    @stub
    def getColumnClass(columnIndex: Int): Class[_] = ???

    /** Returns the number of columns in the model. */
    @stub
    def getColumnCount(): Int = ???

    /** Returns the name of the column at columnIndex. */
    @stub
    def getColumnName(columnIndex: Int): String = ???

    /** Returns the number of rows in the model. */
    @stub
    def getRowCount(): Int = ???

    /** Returns the value for the cell at columnIndex and
     *  rowIndex.
     */
    @stub
    def getValueAt(rowIndex: Int, columnIndex: Int): Any = ???

    /** Returns true if the cell at rowIndex and
     *  columnIndex
     *  is editable.
     */
    @stub
    def isCellEditable(rowIndex: Int, columnIndex: Int): Boolean = ???

    /** Removes a listener from the list that is notified each time a
     *  change to the data model occurs.
     */
    @stub
    def removeTableModelListener(l: TableModelListener): Unit = ???

    /** Sets the value in the cell at columnIndex and
     *  rowIndex to aValue.
     */
    @stub
    def setValueAt(aValue: Any, rowIndex: Int, columnIndex: Int): Unit = ???
}
