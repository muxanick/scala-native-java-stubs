package javax.swing.plaf.metal

import java.awt.{Component, Graphics, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/**  */
object MetalBorders_MenuBarBorder extends AbstractBorder with UIResource {

    /**  */
    @stub
    def MenuBarBorder() = ???

    /**  */
    @stub
    protected val borderInsets: Insets = ???

    /** Reinitializes the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, newInsets: Insets): Insets = ???

    /** This default implementation does no painting. */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
}
