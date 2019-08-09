package javax.swing.plaf.metal

import java.awt.{Component, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import javax.swing.plaf.UIResource

// Border for a Palette.
object MetalBorders.PaletteBorder extends AbstractBorder with UIResource {

    @stub
    // Reinitializes the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, newInsets: Insets): Insets = ???
}
