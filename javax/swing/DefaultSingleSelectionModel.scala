package javax.swing

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener}

/** A generic implementation of SingleSelectionModel.
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
class DefaultSingleSelectionModel extends Object with SingleSelectionModel with Serializable {

    /**  */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** Adds a ChangeListener to the button. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Clears the selection (to -1). */
    @stub
    def clearSelection(): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Returns an array of all the change listeners
     *  registered on this DefaultSingleSelectionModel.
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns an array of all the objects currently registered as
     *  FooListeners
     *  upon this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the model's selection. */
    @stub
    def getSelectedIndex(): Int = ???

    /** Returns true if the selection model currently has a selected value. */
    @stub
    def isSelected(): Boolean = ???

    /** Removes a ChangeListener from the button. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???
}
