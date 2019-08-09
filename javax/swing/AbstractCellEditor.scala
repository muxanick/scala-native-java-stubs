package javax.swing

import java.io.Serializable
import java.lang.Object
import java.util.EventObject
import javax.swing.event.{CellEditorListener, ChangeEvent}

/** A base class for CellEditors, providing default
 *  implementations for the methods in the CellEditor
 *  interface except getCellEditorValue().
 *  Like the other abstract implementations in Swing, also manages a list
 *  of listeners.
 * 
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
abstract class AbstractCellEditor extends Object with CellEditor with Serializable {

    /**  */
    protected val changeEvent: ChangeEvent

    /** Adds a CellEditorListener to the listener list. */
    def addCellEditorListener(l: CellEditorListener): Unit

    /** Calls fireEditingCanceled. */
    def cancelCellEditing(): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireEditingCanceled(): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireEditingStopped(): Unit

    /** Returns an array of all the CellEditorListeners added
     *  to this AbstractCellEditor with addCellEditorListener().
     */
    def getCellEditorListeners(): Array[CellEditorListener]

    /** Returns true. */
    def isCellEditable(e: EventObject): Boolean

    /** Removes a CellEditorListener from the listener list. */
    def removeCellEditorListener(l: CellEditorListener): Unit

    /** Returns true. */
    def shouldSelectCell(anEvent: EventObject): Boolean
}
