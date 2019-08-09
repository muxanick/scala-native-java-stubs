package javax.swing.text

import java.awt.{Color, Graphics, Shape}
import java.lang.Object

// Simple highlight painter that fills a highlighted area with
// a solid color.
object DefaultHighlighter.DefaultHighlightPainter extends LayeredHighlighter.LayerPainter {

    @stub
    // Returns the color of the highlight.
    def getColor(): Color = ???

    @stub
    // Paints a highlight.
    def paint(g: Graphics, offs0: Int, offs1: Int, bounds: Shape, c: JTextComponent): Unit = ???
}
