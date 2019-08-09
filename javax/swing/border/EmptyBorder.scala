package javax.swing.border

import java.awt.{Component, Insets}
import java.io.Serializable
import java.lang.Object

// A class which provides an empty, transparent border which
// takes up space but does no drawing.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class EmptyBorder extends AbstractBorder with Serializable {

    @stub
    // Creates an empty border with the specified insets.
    def this(borderInsets: Insets) = ???

    @stub
    // 
    protected def bottom: Int = ???

    @stub
    // 
    protected def left: Int = ???

    @stub
    // 
    protected def right: Int = ???

    @stub
    // Returns the insets of the border.
    def getBorderInsets(): Insets = ???

    @stub
    // Reinitialize the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???
}
