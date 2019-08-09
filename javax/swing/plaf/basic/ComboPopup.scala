package javax.swing.plaf.basic

import java.awt.event.{KeyListener, MouseListener, MouseMotionListener}
import javax.swing.JList

/** The interface which defines the methods required for the implementation of the popup
 *  portion of a combo box.
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
trait ComboPopup {

    /** Returns a key listener that will be added to the combo box or null. */
    @stub
    def getKeyListener(): KeyListener = ???

    /** Returns the list that is being used to draw the items in the combo box. */
    @stub
    def getList(): JList = ???

    /** Returns a mouse listener that will be added to the combo box or null. */
    @stub
    def getMouseListener(): MouseListener = ???

    /** Returns a mouse motion listener that will be added to the combo box or null. */
    @stub
    def getMouseMotionListener(): MouseMotionListener = ???

    /** Hides the popup */
    @stub
    def hide(): Unit = ???

    /** Returns true if the popup is visible (currently being displayed). */
    @stub
    def isVisible(): Boolean = ???

    /** Shows the popup */
    @stub
    def show(): Unit = ???
}
