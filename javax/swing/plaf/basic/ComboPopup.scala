package javax.swing.plaf.basic

import java.awt.event.{KeyListener, MouseListener, MouseMotionListener}
import javax.swing.JList

// The interface which defines the methods required for the implementation of the popup
// portion of a combo box.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
trait ComboPopup {

    @stub
    // Returns a key listener that will be added to the combo box or null.
    def getKeyListener(): KeyListener = ???

    @stub
    // Returns the list that is being used to draw the items in the combo box.
    def getList(): JList = ???

    @stub
    // Returns a mouse listener that will be added to the combo box or null.
    def getMouseListener(): MouseListener = ???

    @stub
    // Returns a mouse motion listener that will be added to the combo box or null.
    def getMouseMotionListener(): MouseMotionListener = ???

    @stub
    // Hides the popup
    def hide(): Unit = ???

    @stub
    // Returns true if the popup is visible (currently being displayed).
    def isVisible(): Boolean = ???

    @stub
    // Shows the popup
    def show(): Unit = ???
}
