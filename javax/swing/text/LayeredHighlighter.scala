package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import scala.scalanative.annotation.stub

/** 
 * See Also:
 * Highlighter
 * 
 */
abstract class LayeredHighlighter extends Object with Highlighter {

    /**  */
    @stub
    def this() = ???

    /** When leaf Views (such as LabelView) are rendering they should
     *  call into this method.
     */
    def paintLayeredHighlights(g: Graphics, p0: Int, p1: Int, viewBounds: Shape, editor: JTextComponent, view: View): Unit
}

object LayeredHighlighter {
    /** Layered highlight renderer. */
    type LayerPainter = LayeredHighlighter_LayerPainter
}
