package javax.swing.border

import java.awt.{Color, Component, Insets}
import java.lang.Object

// A class which implements a line border of arbitrary thickness
// and of a single color.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class LineBorder extends AbstractBorder {

    @stub
    // Creates a line border with the specified color and a
    // thickness = 1.
    def this(color: Color) = ???

    @stub
    // Creates a line border with the specified color and thickness.
    def this(color: Color, thickness: Int) = ???

    @stub
    // 
    protected def lineColor: Color = ???

    @stub
    // 
    protected def roundedCorners: Boolean = ???

    @stub
    // Reinitialize the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // Returns the color of the border.
    def getLineColor(): Color = ???

    @stub
    // Returns whether this border will be drawn with rounded corners.
    def getRoundedCorners(): Boolean = ???

    @stub
    // Returns the thickness of the border.
    def getThickness(): Int = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???
}

object LineBorder {
    @stub
    // Convenience method for getting the Color.black LineBorder of thickness 1.
    def createBlackLineBorder(): Border = ???

    @stub
    // Convenience method for getting the Color.gray LineBorder of thickness 1.
    def createGrayLineBorder(): Border = ???
}
