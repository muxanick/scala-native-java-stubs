package javax.swing.border

import java.awt.{Color, Component, Insets}
import java.lang.Object

/** A class which implements a simple etched border which can
 *  either be etched-in or etched-out.  If no highlight/shadow
 *  colors are initialized when the border is created, then
 *  these colors will be dynamically derived from the background
 *  color of the component argument passed into the paintBorder()
 *  method.
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
class EtchedBorder extends AbstractBorder {

    /** Creates a lowered etched border whose colors will be derived
     *  from the background color of the component passed into
     *  the paintBorder method.
     */
    @stub
    def this() = ???

    /** Creates a lowered etched border with the specified highlight and
     *  shadow colors.
     */
    @stub
    def this(highlight: Color, shadow: Color) = ???

    /** Creates an etched border with the specified etch-type
     *  whose colors will be derived
     *  from the background color of the component passed into
     *  the paintBorder method.
     */
    @stub
    def this(etchType: Int) = ???

    /**  */
    @stub
    protected val etchType: Int = ???

    /**  */
    @stub
    protected val highlight: Color = ???

    /** Reinitialize the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** Returns which etch-type is set on the etched border. */
    @stub
    def getEtchType(): Int = ???

    /** Returns the highlight color of the etched border. */
    @stub
    def getHighlightColor(): Color = ???

    /** Returns the highlight color of the etched border
     *  when rendered on the specified component.
     */
    @stub
    def getHighlightColor(c: Component): Color = ???

    /** Returns the shadow color of the etched border. */
    @stub
    def getShadowColor(): Color = ???

    /** Returns the shadow color of the etched border
     *  when rendered on the specified component.
     */
    @stub
    def getShadowColor(c: Component): Color = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???
}

object EtchedBorder {
    /** Lowered etched type. */
    @stub
    val LOWERED: Int = ???

    /** Raised etched type. */
    @stub
    val RAISED: Int = ???
}
