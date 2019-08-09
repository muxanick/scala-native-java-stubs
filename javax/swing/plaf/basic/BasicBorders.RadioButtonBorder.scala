package javax.swing.plaf.basic

import java.awt.{Component, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder

// 
object BasicBorders.RadioButtonBorder extends BasicBorders.ButtonBorder {

    @stub
    // Reinitializes the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???
}
