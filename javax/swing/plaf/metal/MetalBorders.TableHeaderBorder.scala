package javax.swing.plaf.metal

import java.awt.{Component, Graphics, Insets}
import java.lang.Object
import javax.swing.border.AbstractBorder
import scala.scalanative.annotation.stub

/** Border for a Table Header */
object MetalBorders.TableHeaderBorder extends AbstractBorder {

    /**  */
    @stub
    def TableHeaderBorder() = ???

    /**  */
    @stub
    protected val editorBorderInsets: Insets = ???

    /** Reinitializes the insets parameter with this Border's current Insets. */
    @stub
    def getBorderInsets(c: Component, insets: Insets): Insets = ???

    /** This default implementation does no painting. */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
}
