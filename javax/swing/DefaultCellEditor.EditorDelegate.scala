package javax.swing

import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.io.Serializable
import java.lang.Object
import java.util.EventObject

// The protected EditorDelegate class.
protected class DefaultCellEditor.EditorDelegate extends Object with ActionListener, with ItemListener, with Serializable {

    @stub
    // When an action is performed, editing is ended.
    def actionPerformed(e: ActionEvent): Unit = ???

    @stub
    // Cancels editing.
    def cancelCellEditing(): Unit = ???

    @stub
    // Returns the value of this cell.
    def getCellEditorValue(): Object = ???

    @stub
    // Returns true if anEvent is not a
    // MouseEvent.
    def isCellEditable(anEvent: EventObject): Boolean = ???

    @stub
    // When an item's state changes, editing is ended.
    def itemStateChanged(e: ItemEvent): Unit = ???

    @stub
    // Sets the value of this cell.
    def setValue(value: Object): Unit = ???

    @stub
    // Returns true to indicate that the editing cell may
    // be selected.
    def shouldSelectCell(anEvent: EventObject): Boolean = ???

    @stub
    // Returns true to indicate that editing has begun.
    def startCellEditing(anEvent: EventObject): Boolean = ???
}
