package javax.swing.colorchooser

import java.awt.Color
import java.io.Serializable
import java.lang.Object
import javax.swing.event.{ChangeEvent, ChangeListener}

// A generic implementation of ColorSelectionModel.
class DefaultColorSelectionModel extends Object with ColorSelectionModel, with Serializable {

    @stub
    // Creates a DefaultColorSelectionModel with the
    // current color set to Color.white.
    def this() = ???

    @stub
    // Only one ChangeEvent is needed per model instance
    // since the event's only (read-only) state is the source property.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // Adds a ChangeListener to the model.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Runs each ChangeListener's
    // stateChanged method.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Returns an array of all the ChangeListeners added
    // to this DefaultColorSelectionModel with
    // addChangeListener.
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the selected Color which should be
    // non-null.
    def getSelectedColor(): Color = ???

    @stub
    // Removes a ChangeListener from the model.
    def removeChangeListener(l: ChangeListener): Unit = ???
}
