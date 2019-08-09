package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/**  */
object BasicBorders.MenuBarBorder extends AbstractBorder with UIResource {

    /**  */
    @stub
    def MenuBarBorder(shadow: Color, highlight: Color) = ???

    /** Reinitializes the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** This default implementation does no painting. */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}
