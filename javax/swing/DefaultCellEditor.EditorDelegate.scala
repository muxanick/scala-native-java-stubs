package javax.swing

import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.io.Serializable
import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The protected EditorDelegate class. */
protected class DefaultCellEditor_EditorDelegate extends Object with ActionListener with ItemListener with Serializable {

    /**  */
    @stub
    protected def EditorDelegate() = ???

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
