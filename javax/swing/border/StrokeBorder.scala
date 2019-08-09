package javax.swing.border

import java.awt.{BasicStroke, Component, Insets, Paint}
import java.lang.Object

// A class which implements a border of an arbitrary stroke.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI
// between applications running the same version of Swing.
// As of 1.4, support for long term storage of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class StrokeBorder extends AbstractBorder {

    @stub
    // Creates a border of the specified stroke.
    def this(stroke: BasicStroke) = ???

    @stub
    // Reinitializes the insets parameter
    // with this border's current insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // Returns the Paint object used to generate a color
    // during the border rendering.
    def getPaint(): Paint = ???

    @stub
    // Returns the BasicStroke object used to stroke a shape
    // during the border rendering.
    def getStroke(): BasicStroke = ???
}
