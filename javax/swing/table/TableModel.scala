package javax.swing.table

import java.lang.{Class, Object, String}
import javax.swing.event.TableModelListener

// The TableModel interface specifies the methods the
//  JTable will use to interrogate a tabular data model. 
//
//  The JTable can be set up to display any data
//  model which implements the
//  TableModel interface with a couple of lines of code:
//  
//      TableModel myData = new MyTableModel();
//      JTable table = new JTable(myData);
//  
//
// For further documentation, see Creating a Table Model
// in The Java Tutorial.
trait TableModel {

    @stub
    // Adds a listener to the list that is notified each time a change
    // to the data model occurs.
    def addTableModelListener(l: TableModelListener): Unit = ???

    @stub
    // Returns the most specific superclass for all the cell values
    // in the column.
    def getColumnClass(columnIndex: Int): Class[_] = ???

    @stub
    // Returns the number of columns in the model.
    def getColumnCount(): Int = ???

    @stub
    // Returns the name of the column at columnIndex.
    def getColumnName(columnIndex: Int): String = ???

    @stub
    // Returns the number of rows in the model.
    def getRowCount(): Int = ???

    @stub
    // Returns the value for the cell at columnIndex and
    // rowIndex.
    def getValueAt(rowIndex: Int, columnIndex: Int): Object = ???

    @stub
    // Returns true if the cell at rowIndex and
    // columnIndex
    // is editable.
    def isCellEditable(rowIndex: Int, columnIndex: Int): Boolean = ???

    @stub
    // Removes a listener from the list that is notified each time a
    // change to the data model occurs.
    def removeTableModelListener(l: TableModelListener): Unit = ???
}
