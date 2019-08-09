package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Layered highlight renderer. */
object abstract LayeredHighlighter.LayerPainter extends Object with Highlighter.HighlightPainter {

    /**  */
    @stub
    def LayerPainter() = ???

    /**  */
    @stub
    def paintLayer(g: Graphics, p0: Int, p1: Int, viewBounds: Shape, editor: JTextComponent, view: View): Shape
}
