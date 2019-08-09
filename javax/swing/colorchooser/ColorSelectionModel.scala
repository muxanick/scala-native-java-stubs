package javax.swing.colorchooser

import java.awt.Color
import javax.swing.event.ChangeListener

// A model that supports selecting a Color.
trait ColorSelectionModel {

    @stub
    // Adds listener as a listener to changes in the model.
    def addChangeListener(listener: ChangeListener): Unit = ???

    @stub
    // Returns the selected Color which should be
    // non-null.
    def getSelectedColor(): Color = ???

    @stub
    // Removes listener as a listener to changes in the model.
    def removeChangeListener(listener: ChangeListener): Unit = ???
}
