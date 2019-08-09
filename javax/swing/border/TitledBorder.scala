package javax.swing.border

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Font, Graphics, Insets}
import java.lang.{Object, String}

/** A class which implements an arbitrary border
 *  with the addition of a String title in a
 *  specified position and justification.
 *  
 *  If the border, font, or color property values are not
 *  specified in the constructor or by invoking the appropriate
 *  set methods, the property values will be defined by the current
 *  look and feel, using the following property names in the
 *  Defaults Table:
 *  
 *  "TitledBorder.border"
 *  "TitledBorder.font"
 *  "TitledBorder.titleColor"
 *  
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
class TitledBorder extends AbstractBorder {

    /** Creates a TitledBorder instance with the specified border
     *  and an empty title.
     */
    @stub
    def this(border: Border) = ???

    /** Creates a TitledBorder instance with the specified border
     *  and title.
     */
    @stub
    def this(border: Border, title: String) = ???

    /** Creates a TitledBorder instance with the specified border,
     *  title, title-justification, and title-position.
     */
    @stub
    def this(border: Border, title: String, titleJustification: Int, titlePosition: Int) = ???

    /** Creates a TitledBorder instance with the specified border,
     *  title, title-justification, title-position, and title-font.
     */
    @stub
    def this(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font) = ???

    /** Creates a TitledBorder instance with the specified border,
     *  title, title-justification, title-position, title-font, and
     *  title-color.
     */
    @stub
    def this(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font, titleColor: Color) = ???

    /**  */
    @stub
    protected val border: Border = ???

    /**  */
    @stub
    protected val title: String = ???

    /**  */
    @stub
    protected val titleColor: Color = ???

    /**  */
    @stub
    protected val titleFont: Font = ???

    /**  */
    @stub
    protected val titleJustification: Int = ???

    /**  */
    @stub
    protected val titlePosition: Int = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: Component, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the border
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: Component): Component.BaselineResizeBehavior = ???

    /** Returns the border of the titled border. */
    @stub
    def getBorder(): Border = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /**  */
    @stub
    protected def getFont(c: Component): Font = ???

    /** Returns the minimum dimensions this border requires
     *  in order to fully display the border and title.
     */
    @stub
    def getMinimumSize(c: Component): Dimension = ???

    /** Returns the title of the titled border. */
    @stub
    def getTitle(): String = ???

    /** Returns the title-color of the titled border. */
    @stub
    def getTitleColor(): Color = ???

    /** Returns the title-font of the titled border. */
    @stub
    def getTitleFont(): Font = ???

    /** Returns the title-justification of the titled border. */
    @stub
    def getTitleJustification(): Int = ???

    /** Returns the title-position of the titled border. */
    @stub
    def getTitlePosition(): Int = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???

    /** Paints the border for the specified component with the
     *  specified position and size.
     */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Sets the border of the titled border. */
    @stub
    def setBorder(border: Border): Unit = ???

    /** Sets the title of the titled border. */
    @stub
    def setTitle(title: String): Unit = ???

    /** Sets the title-color of the titled border. */
    @stub
    def setTitleColor(titleColor: Color): Unit = ???

    /** Sets the title-font of the titled border. */
    @stub
    def setTitleFont(titleFont: Font): Unit = ???

    /** Sets the title-justification of the titled border. */
    @stub
    def setTitleJustification(titleJustification: Int): Unit = ???
}

object TitledBorder {
    /** Position the title above the border's bottom line. */
    @stub
    val ABOVE_BOTTOM: Int = ???

    /** Position the title above the border's top line. */
    @stub
    val ABOVE_TOP: Int = ???

    /** Position the title below the border's bottom line. */
    @stub
    val BELOW_BOTTOM: Int = ???

    /** Position the title below the border's top line. */
    @stub
    val BELOW_TOP: Int = ???

    /** Position the title in the middle of the border's bottom line. */
    @stub
    val BOTTOM: Int = ???

    /** Position title text in the center of the border line. */
    @stub
    val CENTER: Int = ???

    /** Use the default justification for the title text. */
    @stub
    val DEFAULT_JUSTIFICATION: Int = ???

    /** Use the default vertical orientation for the title text. */
    @stub
    val DEFAULT_POSITION: Int = ???

    /**  */
    @stub
    protected val EDGE_SPACING: Int = ???

    /** Position title text at the left side of the border line
     *   for left to right orientation, at the right side of the
     *   border line for right to left orientation.
     */
    @stub
    val LEADING: Int = ???

    /** Position title text at the left side of the border line. */
    @stub
    val LEFT: Int = ???

    /** Position title text at the right side of the border line. */
    @stub
    val RIGHT: Int = ???

    /**  */
    @stub
    protected val TEXT_INSET_H: Int = ???

    /**  */
    @stub
    protected val TEXT_SPACING: Int = ???

    /** Position the title in the middle of the border's top line. */
    @stub
    val TOP: Int = ???
}
