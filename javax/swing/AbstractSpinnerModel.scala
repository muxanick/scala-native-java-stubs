package javax.swing

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.ChangeListener

/** This class provides the ChangeListener part of the
 *  SpinnerModel interface that should be suitable for most concrete SpinnerModel
 *  implementations.  Subclasses must provide an implementation of the
 *  setValue, getValue, getNextValue and
 *  getPreviousValue methods.
 */
abstract class AbstractSpinnerModel extends Object with SpinnerModel with Serializable {

    /** Adds a ChangeListener to the model's listener list. */
    def addChangeListener(l: ChangeListener): Unit

    /** Run each ChangeListeners stateChanged() method. */
    protected def fireStateChanged(): Unit

    /** Returns an array of all the ChangeListeners added
     *  to this AbstractSpinnerModel with addChangeListener().
     */
    def getChangeListeners(): Array[ChangeListener]

    /** Return an array of all the listeners of the given type that
     *  were added to this model.
     */
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T]
}
