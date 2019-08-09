package javax.swing

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener}

/** A generic implementation of BoundedRangeModel.
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
class DefaultBoundedRangeModel extends Object with BoundedRangeModel with Serializable {

    /** Initializes all of the properties with default values. */
    @stub
    def this() = ???

    /** Only one ChangeEvent is needed per model instance since the
     *  event's only (read-only) state is the source property.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** Adds a ChangeListener. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Runs each ChangeListener's stateChanged method. */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Returns an array of all the change listeners
     *  registered on this DefaultBoundedRangeModel.
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the model's extent. */
    @stub
    def getExtent(): Int = ???

    /** Returns an array of all the objects currently registered as
     *  FooListeners
     *  upon this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the model's maximum. */
    @stub
    def getMaximum(): Int = ???

    /** Returns the model's minimum. */
    @stub
    def getMinimum(): Int = ???

    /** Returns the model's current value. */
    @stub
    def getValue(): Int = ???

    /** Returns true if the value is in the process of changing
     *  as a result of actions being taken by the user.
     */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Removes a ChangeListener. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Sets the extent to n after ensuring that n
     *  is greater than or equal to zero and falls within the model's
     *  constraints:
     */
    @stub
    def setExtent(n: Int): Unit = ???

    /** Sets the maximum to n after ensuring that n
     *  that the other three properties obey the model's constraints:
     */
    @stub
    def setMaximum(n: Int): Unit = ???

    /** Sets the minimum to n after ensuring that n
     *  that the other three properties obey the model's constraints:
     */
    @stub
    def setMinimum(n: Int): Unit = ???

    /** Sets all of the BoundedRangeModel properties after forcing
     *  the arguments to obey the usual constraints:
     */
    @stub
    def setRangeProperties(newValue: Int, newExtent: Int, newMin: Int, newMax: Int, adjusting: Boolean): Unit = ???

    /** Sets the current value of the model. */
    @stub
    def setValue(n: Int): Unit = ???

    /** Sets the valueIsAdjusting property. */
    @stub
    def setValueIsAdjusting(b: Boolean): Unit = ???
}
