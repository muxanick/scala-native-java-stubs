package javax.swing.event

import java.awt.{AWTEvent, Component}
import java.awt.event.{ComponentEvent, InputEvent, MouseEvent}
import java.lang.Object
import java.util.EventObject
import javax.swing.{MenuElement, MenuSelectionManager}

/** MenuDragMouseEvent is used to notify interested parties that
 *  the menu element has received a MouseEvent forwarded to it
 *  under drag conditions.
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
class MenuDragMouseEvent extends MouseEvent {

    /** Constructs a MenuDragMouseEvent object. */
    @stub
    def this(source: Component, id: Int, when: Long, modifiers: Int, x: Int, y: Int, clickCount: Int, popupTrigger: Boolean, p: Array[MenuElement], m: MenuSelectionManager) = ???

    /** Returns the current menu selection manager. */
    @stub
    def getMenuSelectionManager(): MenuSelectionManager = ???
}
