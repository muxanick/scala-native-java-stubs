package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This listener watches for bound properties that have changed in the
 *  combo box.
 *  
 *  Subclasses which wish to listen to combo box property changes should
 *  call the superclass methods to ensure that the combo popup correctly
 *  handles property changes.
 */
protected class BasicComboPopup.PropertyChangeHandler extends Object with PropertyChangeListener {

    /**  */
    @stub
    protected def PropertyChangeHandler() = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???
}
