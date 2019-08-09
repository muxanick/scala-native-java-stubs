package javax.swing.colorchooser

import java.awt.Color
import javax.swing.event.ChangeListener
import scala.scalanative.annotation.stub

/** A model that supports selecting a Color. */
trait ColorSelectionModel {

    /** Adds listener as a listener to changes in the model. */
    @stub
    def addChangeListener(listener: ChangeListener): Unit = ???

    /** Returns the selected Color which should be
     *  non-null.
     */
    @stub
    def getSelectedColor(): Color = ???

    /** Removes listener as a listener to changes in the model. */
    @stub
    def removeChangeListener(listener: ChangeListener): Unit = ???

    /** Sets the selected color to color. */
    @stub
    def setSelectedColor(color: Color): Unit = ???
}
