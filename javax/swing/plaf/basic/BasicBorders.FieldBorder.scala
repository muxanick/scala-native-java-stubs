package javax.swing.plaf.basic

import java.awt.{Color, Component, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import javax.swing.plaf.UIResource

/**  */
object BasicBorders.FieldBorder extends AbstractBorder with UIResource {

    /**  */
    @stub
    protected val darkShadow: Color = ???

    /**  */
    @stub
    protected val highlight: Color = ???

    /**  */
    @stub
    protected val lightHighlight: Color = ???

    /** Reinitializes the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???
}
