package javax.swing.plaf.metal

import java.awt.{Component, Graphics}
import java.io.Serializable
import java.lang.Object
import javax.swing.Icon
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** CheckboxIcon implementation for OrganicCheckBoxUI
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
class MetalCheckBoxIcon extends Object with Icon with UIResource with Serializable {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected def drawCheck(c: Component, g: Graphics, x: Int, y: Int): Unit = ???

    /**  */
    @stub
    protected def getControlSize(): Int = ???

    /** Returns the icon's height. */
    @stub
    def getIconHeight(): Int = ???

    /** Returns the icon's width. */
    @stub
    def getIconWidth(): Int = ???

    /** Draw the icon at the specified location. */
    @stub
    def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???
}
