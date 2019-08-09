package javax.swing

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener}

// A generic implementation of SingleSelectionModel.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultSingleSelectionModel extends Object with SingleSelectionModel, with Serializable {

    @stub
    // 
    protected def changeEvent: ChangeEvent = ???

    @stub
    // Adds a ChangeListener to the button.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Clears the selection (to -1).
    def clearSelection(): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Returns an array of all the change listeners
    // registered on this DefaultSingleSelectionModel.
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns an array of all the objects currently registered as
    // FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the model's selection.
    def getSelectedIndex(): Int = ???

    @stub
    // Returns true if the selection model currently has a selected value.
    def isSelected(): Boolean = ???

    @stub
    // Removes a ChangeListener from the button.
    def removeChangeListener(l: ChangeListener): Unit = ???
}
