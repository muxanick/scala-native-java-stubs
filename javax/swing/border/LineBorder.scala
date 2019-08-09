package javax.swing.border

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class which implements a line border of arbitrary thickness
 *  and of a single color.
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
class LineBorder extends AbstractBorder {

    /** Creates a line border with the specified color and a
     *  thickness = 1.
     */
    @stub
    def this(color: Color) = ???

    /** Creates a line border with the specified color and thickness. */
    @stub
    def this(color: Color, thickness: Int) = ???

    /** Creates a line border with the specified color, thickness,
     *  and corner shape.
     */
    @stub
    def this(color: Color, thickness: Int, roundedCorners: Boolean) = ???

    /**  */
    @stub
    protected val lineColor: Color = ???

    /**  */
    @stub
    protected val roundedCorners: Boolean = ???

    /**  */
    @stub
    protected val thickness: Int = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns the color of the border. */
    @stub
    def getLineColor(): Color = ???

    /** Returns whether this border will be drawn with rounded corners. */
    @stub
    def getRoundedCorners(): Boolean = ???

    /** Returns the thickness of the border. */
    @stub
    def getThickness(): Int = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???

    /** Paints the border for the specified component with the
     *  specified position and size.
     */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}

object LineBorder {
    /** Convenience method for getting the Color.black LineBorder of thickness 1. */
    @stub
    def createBlackLineBorder(): Border = ???

    /** Convenience method for getting the Color.gray LineBorder of thickness 1. */
    @stub
    def createGrayLineBorder(): Border = ???
}
