package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import scala.scalanative.annotation.stub

/**  */
object BasicBorders_RadioButtonBorder extends BasicBorders.ButtonBorder {

    /**  */
    @stub
    def RadioButtonBorder(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

    /** Reinitializes the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** This default implementation does no painting. */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}
