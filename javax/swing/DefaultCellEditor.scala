package javax.swing

import java.awt.Component
import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.io.Serializable
import java.lang.Object
import java.util.EventObject
import javax.swing.table.TableCellEditor
import javax.swing.tree.TreeCellEditor
import scala.scalanative.annotation.stub

/** The default editor for table and tree cells.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class DefaultCellEditor extends AbstractCellEditor with TableCellEditor with TreeCellEditor {

    /** Constructs a DefaultCellEditor object that uses a check box. */
    @stub
    def this(checkBox: JCheckBox) = ???

    /** Constructs a DefaultCellEditor object that uses a
     *  combo box.
     */
    @stub
    def this(comboBox: JComboBox) = ???

    /** Constructs a DefaultCellEditor that uses a text field. */
    @stub
    def this(textField: JTextField) = ???

    /** The protected EditorDelegate class. */
    protected class EditorDelegate extends Object with ActionListener with ItemListener with Serializable {

        /**  */
        @stub
        protected def this() = ???

        /** The value of this cell. */
        @stub
        protected val value: Any = ???

        /** When an action is performed, editing is ended. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Cancels editing. */
        @stub
        def cancelCellEditing(): Unit = ???

        /** Returns the value of this cell. */
        @stub
        def getCellEditorValue(): Any = ???

        /** Returns true if anEvent is not a
         *  MouseEvent.
         */
        @stub
        def isCellEditable(anEvent: EventObject): Boolean = ???

        /** When an item's state changes, editing is ended. */
        @stub
        def itemStateChanged(e: ItemEvent): Unit = ???

        /** Sets the value of this cell. */
        @stub
        def setValue(value: Any): Unit = ???

        /** Returns true to indicate that the editing cell may
         *  be selected.
         */
        @stub
        def shouldSelectCell(anEvent: EventObject): Boolean = ???

        /** Returns true to indicate that editing has begun. */
        @stub
        def startCellEditing(anEvent: EventObject): Boolean = ???

        /** Stops editing and
         *  returns true to indicate that editing has stopped.
         */
        @stub
        def stopCellEditing(): Boolean = ???
    }


    /** An integer specifying the number of clicks needed to start editing. */
    @stub
    protected val clickCountToStart: Int = ???

    /** The delegate class which handles all methods sent from the
     *  CellEditor.
     */
    @stub
    protected val delegate: DefaultCellEditor.EditorDelegate = ???

    /** The Swing component being edited. */
    @stub
    protected val editorComponent: JComponent = ???

    /** Forwards the message from the CellEditor to
     *  the delegate.
     */
    @stub
    def cancelCellEditing(): Unit = ???

    /** Forwards the message from the CellEditor to
     *  the delegate.
     */
    @stub
    def getCellEditorValue(): Any = ???

    /** Returns the number of clicks needed to start editing. */
    @stub
    def getClickCountToStart(): Int = ???

    /** Returns a reference to the editor component. */
    @stub
    def getComponent(): Component = ???

    /** Implements the TableCellEditor interface. */
    @stub
    def getTableCellEditorComponent(table: JTable, value: Any, isSelected: Boolean, row: Int, column: Int): Component = ???

    /** Implements the TreeCellEditor interface. */
    @stub
    def getTreeCellEditorComponent(tree: JTree, value: Any, isSelected: Boolean, expanded: Boolean, leaf: Boolean, row: Int): Component = ???

    /** Forwards the message from the CellEditor to
     *  the delegate.
     */
    @stub
    def isCellEditable(anEvent: EventObject): Boolean = ???

    /** Specifies the number of clicks needed to start editing. */
    @stub
    def setClickCountToStart(count: Int): Unit = ???

    /** Forwards the message from the CellEditor to
     *  the delegate.
     */
    @stub
    def shouldSelectCell(anEvent: EventObject): Boolean = ???

    /** Forwards the message from the CellEditor to
     *  the delegate.
     */
    @stub
    def stopCellEditing(): Boolean = ???
}
