package javax.swing.border

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Font, Graphics, Insets}
import java.lang.{Object, String}

// A class which implements an arbitrary border
// with the addition of a String title in a
// specified position and justification.
// 
// If the border, font, or color property values are not
// specified in the constructor or by invoking the appropriate
// set methods, the property values will be defined by the current
// look and feel, using the following property names in the
// Defaults Table:
// 
// "TitledBorder.border"
// "TitledBorder.font"
// "TitledBorder.titleColor"
// 
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class TitledBorder extends AbstractBorder {

    @stub
    // Creates a TitledBorder instance with the specified border
    // and an empty title.
    def this(border: Border) = ???

    @stub
    // Creates a TitledBorder instance with the specified border
    // and title.
    def this(border: Border, title: String) = ???

    @stub
    // Creates a TitledBorder instance with the specified border,
    // title, title-justification, and title-position.
    def this(border: Border, title: String, titleJustification: Int, titlePosition: Int) = ???

    @stub
    // Creates a TitledBorder instance with the specified border,
    // title, title-justification, title-position, and title-font.
    def this(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font) = ???

    @stub
    // Creates a TitledBorder instance with the specified border,
    // title, title-justification, title-position, title-font, and
    // title-color.
    def this(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font, titleColor: Color) = ???

    @stub
    // 
    protected def border: Border = ???

    @stub
    // 
    protected def title: String = ???

    @stub
    // 
    protected def titleColor: Color = ???

    @stub
    // 
    protected def titleFont: Font = ???

    @stub
    // 
    protected def titleJustification: Int = ???

    @stub
    // 
    protected def titlePosition: Int = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: Component, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the border
    // changes as the size changes.
    def getBaselineResizeBehavior(c: Component): Component.BaselineResizeBehavior = ???

    @stub
    // Returns the border of the titled border.
    def getBorder(): Border = ???

    @stub
    // Reinitialize the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // 
    protected def getFont(c: Component): Font = ???

    @stub
    // Returns the minimum dimensions this border requires
    // in order to fully display the border and title.
    def getMinimumSize(c: Component): Dimension = ???

    @stub
    // Returns the title of the titled border.
    def getTitle(): String = ???

    @stub
    // Returns the title-color of the titled border.
    def getTitleColor(): Color = ???

    @stub
    // Returns the title-font of the titled border.
    def getTitleFont(): Font = ???

    @stub
    // Returns the title-justification of the titled border.
    def getTitleJustification(): Int = ???

    @stub
    // Returns the title-position of the titled border.
    def getTitlePosition(): Int = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???

    @stub
    // Paints the border for the specified component with the
    // specified position and size.
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Sets the border of the titled border.
    def setBorder(border: Border): Unit = ???

    @stub
    // Sets the title of the titled border.
    def setTitle(title: String): Unit = ???

    @stub
    // Sets the title-color of the titled border.
    def setTitleColor(titleColor: Color): Unit = ???

    @stub
    // Sets the title-font of the titled border.
    def setTitleFont(titleFont: Font): Unit = ???

    @stub
    // Sets the title-justification of the titled border.
    def setTitleJustification(titleJustification: Int): Unit = ???
}

object TitledBorder {
    @stub
    // Position the title above the border's bottom line.
    def ABOVE_BOTTOM: Int = ???

    @stub
    // Position the title above the border's top line.
    def ABOVE_TOP: Int = ???

    @stub
    // Position the title below the border's bottom line.
    def BELOW_BOTTOM: Int = ???

    @stub
    // Position the title below the border's top line.
    def BELOW_TOP: Int = ???

    @stub
    // Position the title in the middle of the border's bottom line.
    def BOTTOM: Int = ???

    @stub
    // Position title text in the center of the border line.
    def CENTER: Int = ???

    @stub
    // Use the default justification for the title text.
    def DEFAULT_JUSTIFICATION: Int = ???

    @stub
    // Use the default vertical orientation for the title text.
    def DEFAULT_POSITION: Int = ???

    @stub
    // 
    protected def EDGE_SPACING: Int = ???

    @stub
    // Position title text at the left side of the border line
    //  for left to right orientation, at the right side of the
    //  border line for right to left orientation.
    def LEADING: Int = ???

    @stub
    // Position title text at the left side of the border line.
    def LEFT: Int = ???

    @stub
    // Position title text at the right side of the border line.
    def RIGHT: Int = ???

    @stub
    // 
    protected def TEXT_INSET_H: Int = ???

    @stub
    // 
    protected def TEXT_SPACING: Int = ???

    @stub
    // Position the title in the middle of the border's top line.
    def TOP: Int = ???
}
