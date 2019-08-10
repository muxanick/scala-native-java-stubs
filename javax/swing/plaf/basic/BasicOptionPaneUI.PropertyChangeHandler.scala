package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicOptionPaneUI.
 */
class BasicOptionPaneUI_PropertyChangeHandler extends Object with PropertyChangeListener {

    /**  */
    @stub
    def PropertyChangeHandler() = ???

    /** If the source of the PropertyChangeEvent e equals the
     *  optionPane and is one of the ICON_PROPERTY, MESSAGE_PROPERTY,
     *  OPTIONS_PROPERTY or INITIAL_VALUE_PROPERTY,
     *  validateComponent is invoked.
     */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???
}
