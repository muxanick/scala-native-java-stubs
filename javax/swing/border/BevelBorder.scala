package javax.swing.border

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object

// A class which implements a simple two-line bevel border.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BevelBorder extends AbstractBorder {

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
    // 
    protected def bevelType: Int = ???

    @stub
    // 
    protected def highlightInner: Color = ???

    @stub
    // 
    protected def highlightOuter: Color = ???

    @stub
    // 
    protected def shadowInner: Color = ???

    @stub
    // Returns the type of the bevel border.
    def getBevelType(): Int = ???

    @stub
    // Reinitialize the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // Returns the inner highlight color of the bevel border.
    def getHighlightInnerColor(): Color = ???

    @stub
    // Returns the inner highlight color of the bevel border
    // when rendered on the specified component.
    def getHighlightInnerColor(c: Component): Color = ???

    @stub
    // Returns the outer highlight color of the bevel border.
    def getHighlightOuterColor(): Color = ???

    @stub
    // Returns the outer highlight color of the bevel border
    // when rendered on the specified component.
    def getHighlightOuterColor(c: Component): Color = ???

    @stub
    // Returns the inner shadow color of the bevel border.
    def getShadowInnerColor(): Color = ???

    @stub
    // Returns the inner shadow color of the bevel border
    // when rendered on the specified component.
    def getShadowInnerColor(c: Component): Color = ???

    @stub
    // Returns the outer shadow color of the bevel border.
    def getShadowOuterColor(): Color = ???

    @stub
    // Returns the outer shadow color of the bevel border
    // when rendered on the specified component.
    def getShadowOuterColor(c: Component): Color = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???

    @stub
    // Paints the border for the specified component with the specified
    // position and size.
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // 
    protected def paintLoweredBevel(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}

object BevelBorder {
    @stub
    // Lowered bevel type.
    def LOWERED: Int = ???

    @stub
    // Raised bevel type.
    def RAISED: Int = ???
}
