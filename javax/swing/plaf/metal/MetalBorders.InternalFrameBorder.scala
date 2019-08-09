package javax.swing.plaf.metal

import java.awt.{Component, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import javax.swing.plaf.UIResource

/**  */
object MetalBorders.InternalFrameBorder extends AbstractBorder with UIResource {

    /** Reinitializes the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, newInsets: Insets): Insets = ???
}
