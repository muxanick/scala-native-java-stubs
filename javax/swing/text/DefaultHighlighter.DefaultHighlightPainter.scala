package javax.swing.text

import java.awt.{Color, Graphics, Shape}
import java.lang.Object

/** Simple highlight painter that fills a highlighted area with
 *  a solid color.
 */
object DefaultHighlighter.DefaultHighlightPainter extends LayeredHighlighter.LayerPainter {

    /** Returns the color of the highlight. */
    @stub
    def getColor(): Color = ???

    /** Paints a highlight. */
    @stub
    def paint(g: Graphics, offs0: Int, offs1: Int, bounds: Shape, c: JTextComponent): Unit = ???
}
