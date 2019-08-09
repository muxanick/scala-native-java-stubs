package javax.swing

import javax.swing.event.ChangeListener

// A model that supports at most one indexed selection.
trait SingleSelectionModel {

    @stub
    // Adds listener as a listener to changes in the model.
    def addChangeListener(listener: ChangeListener): Unit = ???

    @stub
    // Clears the selection (to -1).
    def clearSelection(): Unit = ???

    @stub
    // Returns the model's selection.
    def getSelectedIndex(): Int = ???

    @stub
    // Returns true if the selection model currently has a selected value.
    def isSelected(): Boolean = ???

    @stub
    // Removes listener as a listener to changes in the model.
    def removeChangeListener(listener: ChangeListener): Unit = ???
}
