package javax.swing.border

import java.awt.{Color, Component, Insets}
import java.lang.Object

// A class which implements a raised or lowered bevel with
// softened corners.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class SoftBevelBorder extends BevelBorder {

    @stub
    // Creates a bevel border with the specified type and whose
    // colors will be derived from the background color of the
    // component passed into the paintBorder method.
    def this(bevelType: Int) = ???

    @stub
    // Creates a bevel border with the specified type, highlight and
    // shadow colors.
    def this(bevelType: Int, highlight: Color, shadow: Color) = ???

    @stub
    // Reinitialize the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???
}
