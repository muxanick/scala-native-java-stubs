package javax.swing.event

import java.awt.AWTEvent
import java.awt.event.{ComponentEvent, InputEvent, KeyEvent}
import java.lang.Object
import java.util.EventObject
import javax.swing.MenuSelectionManager

/** MenuKeyEvent is used to notify interested parties that
 *  the menu element has received a KeyEvent forwarded to it
 *  in a menu tree.
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
class MenuKeyEvent extends KeyEvent {

    /** Returns the current menu selection manager. */
    @stub
    def getMenuSelectionManager(): MenuSelectionManager = ???
}
