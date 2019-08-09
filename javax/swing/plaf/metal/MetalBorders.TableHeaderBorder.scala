package javax.swing.plaf.metal

import java.awt.{Component, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder

// Border for a Table Header
object MetalBorders.TableHeaderBorder extends AbstractBorder {

    @stub
    // Reinitializes the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???
}
