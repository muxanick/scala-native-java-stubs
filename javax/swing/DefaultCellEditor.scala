package javax.swing

import java.awt.Component
import java.lang.Object
import java.util.EventObject
import javax.swing.table.TableCellEditor
import javax.swing.tree.TreeCellEditor

// The default editor for table and tree cells.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultCellEditor extends AbstractCellEditor with TableCellEditor, with TreeCellEditor {

    @stub
    // Constructs a DefaultCellEditor object that uses a check box.
    def this(checkBox: JCheckBox) = ???

    @stub
    // Constructs a DefaultCellEditor object that uses a
    // combo box.
    def this(comboBox: JComboBox) = ???

    @stub
    // An integer specifying the number of clicks needed to start editing.
    protected def clickCountToStart: Int = ???

    @stub
    // The delegate class which handles all methods sent from the
    // CellEditor.
    protected def delegate: DefaultCellEditor.EditorDelegate = ???

    @stub
    // Forwards the message from the CellEditor to
    // the delegate.
    def cancelCellEditing(): Unit = ???

    @stub
    // Forwards the message from the CellEditor to
    // the delegate.
    def getCellEditorValue(): Object = ???

    @stub
    // Returns the number of clicks needed to start editing.
    def getClickCountToStart(): Int = ???

    @stub
    // Returns a reference to the editor component.
    def getComponent(): Component = ???

    @stub
    // Implements the TableCellEditor interface.
    def getTableCellEditorComponent(table: JTable, value: Object, isSelected: Boolean, row: Int, column: Int): Component = ???

    @stub
    // Implements the TreeCellEditor interface.
    def getTreeCellEditorComponent(tree: JTree, value: Object, isSelected: Boolean, expanded: Boolean, leaf: Boolean, row: Int): Component = ???

    @stub
    // Forwards the message from the CellEditor to
    // the delegate.
    def isCellEditable(anEvent: EventObject): Boolean = ???

    @stub
    // Specifies the number of clicks needed to start editing.
    def setClickCountToStart(count: Int): Unit = ???

    @stub
    // Forwards the message from the CellEditor to
    // the delegate.
    def shouldSelectCell(anEvent: EventObject): Boolean = ???
}
