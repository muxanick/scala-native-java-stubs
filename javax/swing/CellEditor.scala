package javax.swing

import java.lang.Object
import java.util.EventObject
import javax.swing.event.CellEditorListener
import scala.scalanative.annotation.stub

/** This interface defines the methods any general editor should be able
 *  to implement. 
 * 
 *  Having this interface enables complex components (the client of the
 *  editor) such as JTree and
 *  JTable to allow any generic editor to
 *  edit values in a table cell, or tree cell, etc.  Without this generic
 *  editor interface, JTable would have to know about specific editors,
 *  such as JTextField, JCheckBox, JComboBox,
 *  etc.  In addition, without this interface, clients of editors such as
 *  JTable would not be able
 *  to work with any editors developed in the future by the user
 *  or a 3rd party ISV. 
 * 
 *  To use this interface, a developer creating a new editor can have the
 *  new component implement the interface.  Or the developer can
 *  choose a wrapper based approach and provide a companion object which
 *  implements the CellEditor interface (See
 *  DefaultCellEditor for example).  The wrapper approach
 *  is particularly useful if the user want to use a 3rd party ISV
 *  editor with JTable, but the ISV didn't implement the
 *  CellEditor interface.  The user can simply create an object
 *  that contains an instance of the 3rd party editor object and "translate"
 *  the CellEditor API into the 3rd party editor's API.
 */
trait CellEditor {

    /** Adds a listener to the list that's notified when the editor
     *  stops, or cancels editing.
     */
    @stub
    def addCellEditorListener(l: CellEditorListener): Unit = ???

    /** Tells the editor to cancel editing and not accept any partially
     *  edited value.
     */
    @stub
    def cancelCellEditing(): Unit = ???

    /** Returns the value contained in the editor. */
    @stub
    def getCellEditorValue(): Any = ???

    /** Asks the editor if it can start editing using anEvent. */
    @stub
    def isCellEditable(anEvent: EventObject): Boolean = ???

    /** Removes a listener from the list that's notified */
    @stub
    def removeCellEditorListener(l: CellEditorListener): Unit = ???

    /** Returns true if the editing cell should be selected, false otherwise. */
    @stub
    def shouldSelectCell(anEvent: EventObject): Boolean = ???

    /** Tells the editor to stop editing and accept any partially edited
     *  value as the value of the editor.
     */
    @stub
    def stopCellEditing(): Boolean = ???
}
