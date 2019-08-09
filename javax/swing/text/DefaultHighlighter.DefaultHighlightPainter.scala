package javax.swing.text

import java.awt.{Color, Graphics, Shape}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Simple highlight painter that fills a highlighted area with
 *  a solid color.
 */
object DefaultHighlighter.DefaultHighlightPainter extends LayeredHighlighter.LayerPainter {

    /** Constructs a new highlight painter. */
    @stub
    def DefaultHighlightPainter(c: Color) = ???

    /** Returns the color of the highlight. */
    @stub
    def getColor(): Color = ???

    /** Paints a highlight. */
    @stub
    def paint(g: Graphics, offs0: Int, offs1: Int, bounds: Shape, c: JTextComponent): Unit = ???

    /** Paints a portion of a highlight. */
    @stub
    def paintLayer(g: Graphics, offs0: Int, offs1: Int, bounds: Shape, c: JTextComponent, view: View): Shape = ???
}
