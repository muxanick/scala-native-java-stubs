package javax.swing.border

import java.awt.{Color, Component, Insets}
import java.lang.Object

// A class which implements a simple etched border which can
// either be etched-in or etched-out.  If no highlight/shadow
// colors are initialized when the border is created, then
// these colors will be dynamically derived from the background
// color of the component argument passed into the paintBorder()
// method.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class EtchedBorder extends AbstractBorder {

    @stub
    // Creates a lowered etched border whose colors will be derived
    // from the background color of the component passed into
    // the paintBorder method.
    def this() = ???

    @stub
    // Creates a lowered etched border with the specified highlight and
    // shadow colors.
    def this(highlight: Color, shadow: Color) = ???

    @stub
    // Creates an etched border with the specified etch-type
    // whose colors will be derived
    // from the background color of the component passed into
    // the paintBorder method.
    def this(etchType: Int) = ???

    @stub
    // 
    protected def etchType: Int = ???

    @stub
    // 
    protected def highlight: Color = ???

    @stub
    // Reinitialize the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    @stub
    // Returns which etch-type is set on the etched border.
    def getEtchType(): Int = ???

    @stub
    // Returns the highlight color of the etched border.
    def getHighlightColor(): Color = ???

    @stub
    // Returns the highlight color of the etched border
    // when rendered on the specified component.
    def getHighlightColor(c: Component): Color = ???

    @stub
    // Returns the shadow color of the etched border.
    def getShadowColor(): Color = ???

    @stub
    // Returns the shadow color of the etched border
    // when rendered on the specified component.
    def getShadowColor(c: Component): Color = ???

    @stub
    // Returns whether or not the border is opaque.
    def isBorderOpaque(): Boolean = ???
}

object EtchedBorder {
    @stub
    // Lowered etched type.
    def LOWERED: Int = ???

    @stub
    // Raised etched type.
    def RAISED: Int = ???
}
