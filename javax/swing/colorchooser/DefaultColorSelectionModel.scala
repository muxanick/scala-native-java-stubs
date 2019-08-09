package javax.swing.colorchooser

import java.awt.Color
import java.io.Serializable
import java.lang.Object
import javax.swing.event.{ChangeEvent, ChangeListener}

/** A generic implementation of ColorSelectionModel. */
class DefaultColorSelectionModel extends Object with ColorSelectionModel with Serializable {

    /** Creates a DefaultColorSelectionModel with the
     *  current color set to Color.white.
     */
    @stub
    def this() = ???

    /** Only one ChangeEvent is needed per model instance
     *  since the event's only (read-only) state is the source property.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** Adds a ChangeListener to the model. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Runs each ChangeListener's
     *  stateChanged method.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Returns an array of all the ChangeListeners added
     *  to this DefaultColorSelectionModel with
     *  addChangeListener.
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the selected Color which should be
     *  non-null.
     */
    @stub
    def getSelectedColor(): Color = ???

    /** Removes a ChangeListener from the model. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???
}
