package javax.swing.border

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class which implements a raised or lowered bevel with
 *  softened corners.
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
class SoftBevelBorder extends BevelBorder {

    /** Creates a bevel border with the specified type and whose
     *  colors will be derived from the background color of the
     *  component passed into the paintBorder method.
     */
    @stub
    def this(bevelType: Int) = ???

    /** Creates a bevel border with the specified type, highlight and
     *  shadow colors.
     */
    @stub
    def this(bevelType: Int, highlight: Color, shadow: Color) = ???

    /** Creates a bevel border with the specified type, highlight
     *  shadow colors.
     */
    @stub
    def this(bevelType: Int, highlightOuterColor: Color, highlightInnerColor: Color, shadowOuterColor: Color, shadowInnerColor: Color) = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???

    /** Paints the border for the specified component with the specified
     *  position and size.
     */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}
