package javax.swing.border

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class which implements a simple two-line bevel border.
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
class BevelBorder extends AbstractBorder {

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

    /** Creates a bevel border with the specified type, highlight and
     *  shadow colors.
     */
    @stub
    def this(bevelType: Int, highlightOuterColor: Color, highlightInnerColor: Color, shadowOuterColor: Color, shadowInnerColor: Color) = ???

    /**  */
    @stub
    protected val bevelType: Int = ???

    /**  */
    @stub
    protected val highlightInner: Color = ???

    /**  */
    @stub
    protected val highlightOuter: Color = ???

    /**  */
    @stub
    protected val shadowInner: Color = ???

    /**  */
    @stub
    protected val shadowOuter: Color = ???

    /** Returns the type of the bevel border. */
    @stub
    def getBevelType(): Int = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns the inner highlight color of the bevel border. */
    @stub
    def getHighlightInnerColor(): Color = ???

    /** Returns the inner highlight color of the bevel border
     *  when rendered on the specified component.
     */
    @stub
    def getHighlightInnerColor(c: Component): Color = ???

    /** Returns the outer highlight color of the bevel border. */
    @stub
    def getHighlightOuterColor(): Color = ???

    /** Returns the outer highlight color of the bevel border
     *  when rendered on the specified component.
     */
    @stub
    def getHighlightOuterColor(c: Component): Color = ???

    /** Returns the inner shadow color of the bevel border. */
    @stub
    def getShadowInnerColor(): Color = ???

    /** Returns the inner shadow color of the bevel border
     *  when rendered on the specified component.
     */
    @stub
    def getShadowInnerColor(c: Component): Color = ???

    /** Returns the outer shadow color of the bevel border. */
    @stub
    def getShadowOuterColor(): Color = ???

    /** Returns the outer shadow color of the bevel border
     *  when rendered on the specified component.
     */
    @stub
    def getShadowOuterColor(c: Component): Color = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???

    /** Paints the border for the specified component with the specified
     *  position and size.
     */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???

    /**  */
    @stub
    protected def paintLoweredBevel(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???

    /**  */
    @stub
    protected def paintRaisedBevel(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}

object BevelBorder {
    /** Lowered bevel type. */
    @stub
    val LOWERED: Int = ???

    /** Raised bevel type. */
    @stub
    val RAISED: Int = ???
}
