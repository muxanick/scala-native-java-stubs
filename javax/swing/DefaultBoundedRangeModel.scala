package javax.swing

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener}

// A generic implementation of BoundedRangeModel.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultBoundedRangeModel extends Object with BoundedRangeModel, with Serializable {

    @stub
    // Initializes all of the properties with default values.
    def this() = ???

    @stub
    // Only one ChangeEvent is needed per model instance since the
    // event's only (read-only) state is the source property.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // Adds a ChangeListener.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Runs each ChangeListener's stateChanged method.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Returns an array of all the change listeners
    // registered on this DefaultBoundedRangeModel.
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the model's extent.
    def getExtent(): Int = ???

    @stub
    // Returns an array of all the objects currently registered as
    // FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the model's maximum.
    def getMaximum(): Int = ???

    @stub
    // Returns the model's minimum.
    def getMinimum(): Int = ???

    @stub
    // Returns the model's current value.
    def getValue(): Int = ???

    @stub
    // Returns true if the value is in the process of changing
    // as a result of actions being taken by the user.
    def getValueIsAdjusting(): Boolean = ???

    @stub
    // Removes a ChangeListener.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Sets the extent to n after ensuring that n
    // is greater than or equal to zero and falls within the model's
    // constraints:
    def setExtent(n: Int): Unit = ???

    @stub
    // Sets the maximum to n after ensuring that n
    // that the other three properties obey the model's constraints:
    def setMaximum(n: Int): Unit = ???

    @stub
    // Sets the minimum to n after ensuring that n
    // that the other three properties obey the model's constraints:
    def setMinimum(n: Int): Unit = ???

    @stub
    // Sets all of the BoundedRangeModel properties after forcing
    // the arguments to obey the usual constraints:
    def setRangeProperties(newValue: Int, newExtent: Int, newMin: Int, newMax: Int, adjusting: Boolean): Unit = ???

    @stub
    // Sets the current value of the model.
    def setValue(n: Int): Unit = ???

    @stub
    // Sets the valueIsAdjusting property.
    def setValueIsAdjusting(b: Boolean): Unit = ???
}
