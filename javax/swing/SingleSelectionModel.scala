package javax.swing

import javax.swing.event.ChangeListener
import scala.scalanative.annotation.stub

/** A model that supports at most one indexed selection. */
trait SingleSelectionModel {

    /** Adds listener as a listener to changes in the model. */
    @stub
    def addChangeListener(listener: ChangeListener): Unit = ???

    /** Clears the selection (to -1). */
    @stub
    def clearSelection(): Unit = ???

    /** Returns the model's selection. */
    @stub
    def getSelectedIndex(): Int = ???

    /** Returns true if the selection model currently has a selected value. */
    @stub
    def isSelected(): Boolean = ???

    /** Removes listener as a listener to changes in the model. */
    @stub
    def removeChangeListener(listener: ChangeListener): Unit = ???

    /** Sets the model's selected index to index. */
    @stub
    def setSelectedIndex(index: Int): Unit = ???
}
