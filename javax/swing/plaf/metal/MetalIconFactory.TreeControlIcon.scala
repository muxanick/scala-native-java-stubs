package javax.swing.plaf.metal

import java.awt.{Component, Graphics}
import java.io.Serializable
import java.lang.Object
import javax.swing.Icon

// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
object MetalIconFactory.TreeControlIcon extends Object with Icon, with Serializable {

    @stub
    // Returns the icon's height.
    def getIconHeight(): Int = ???

    @stub
    // Returns the icon's width.
    def getIconWidth(): Int = ???

    @stub
    // Draw the icon at the specified location.
    def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???
}
