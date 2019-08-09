package javax.swing

import java.awt.event.WindowAdapter
import java.io.Serializable
import java.lang.Object

// A listener class that watches for a popup window closing.
// When the popup is closing, the listener deselects the menu.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JMenu.WinListener extends WindowAdapter with Serializable {
}
