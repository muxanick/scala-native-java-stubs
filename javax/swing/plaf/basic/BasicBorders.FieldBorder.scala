package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/**  */
object BasicBorders.FieldBorder extends AbstractBorder with UIResource {

    /**  */
    @stub
    def FieldBorder(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

    /**  */
    @stub
    protected val darkShadow: Color = ???

    /**  */
    @stub
    protected val highlight: Color = ???

    /**  */
    @stub
    protected val lightHighlight: Color = ???

    /**  */
    @stub
    protected val shadow: Color = ???

    /** Reinitializes the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** This default implementation does no painting. */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}
