package javax.swing.plaf.basic

import java.awt.{Color, Component, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import javax.swing.plaf.UIResource

// 
object BasicBorders.ButtonBorder extends AbstractBorder with UIResource {

    @stub
    // 
    protected def darkShadow: Color = ???

    @stub
    // 
    protected def highlight: Color = ???

    @stub
    // 
    protected def lightHighlight: Color = ???

    @stub
    // Reinitializes the insets parameter with this Border's current Insets.
    def getBorderInsets(c: Component, insets: Insets): Insets = ???
}
