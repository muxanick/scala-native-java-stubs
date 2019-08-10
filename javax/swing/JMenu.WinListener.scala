package javax.swing

import java.awt.event.{WindowAdapter, WindowEvent}
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A listener class that watches for a popup window closing.
 *  When the popup is closing, the listener deselects the menu.
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
protected class JMenu_WinListener extends WindowAdapter with Serializable {

    /** Create the window listener for the specified popup. */
    @stub
    def WinListener(p: JPopupMenu) = ???

    /** Deselect the menu when the popup is closed from outside. */
    @stub
    def windowClosing(e: WindowEvent): Unit = ???
}
