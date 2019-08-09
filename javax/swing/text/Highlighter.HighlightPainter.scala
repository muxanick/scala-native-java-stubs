package javax.swing.text

import java.awt.{Graphics, Shape}
import scala.scalanative.annotation.stub

/** Highlight renderer. */
object trait Highlighter.HighlightPainter {

    /** Renders the highlight. */
    @stub
    def paint(g: Graphics, p0: Int, p1: Int, bounds: Shape, c: JTextComponent): Unit = ???
}
