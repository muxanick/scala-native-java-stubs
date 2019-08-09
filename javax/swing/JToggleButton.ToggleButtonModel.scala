package javax.swing

import java.lang.Object

/** The ToggleButton model
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
object JToggleButton.ToggleButtonModel extends DefaultButtonModel {

    /** Checks if the button is selected. */
    @stub
    def isSelected(): Boolean = ???

    /** Sets the pressed state of the toggle button. */
    @stub
    def setPressed(b: Boolean): Unit = ???
}
