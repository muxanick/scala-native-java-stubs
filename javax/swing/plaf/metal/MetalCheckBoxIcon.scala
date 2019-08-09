package javax.swing.plaf.metal

import java.awt.{Component, Graphics}
import java.io.Serializable
import java.lang.Object
import javax.swing.Icon
import javax.swing.plaf.UIResource

// CheckboxIcon implementation for OrganicCheckBoxUI
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalCheckBoxIcon extends Object with Icon, with UIResource, with Serializable {

    @stub
    // 
    protected def drawCheck(c: Component, g: Graphics, x: Int, y: Int): Unit = ???

    @stub
    // 
    protected def getControlSize(): Int = ???

    @stub
    // Returns the icon's height.
    def getIconHeight(): Int = ???

    @stub
    // Returns the icon's width.
    def getIconWidth(): Int = ???
}
