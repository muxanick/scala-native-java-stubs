package javax.swing.text

import java.awt.{Color, Graphics, Shape}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Implements the Highlighter interfaces.  Implements a simple highlight
 *  painter that renders in a solid color.
 */
class DefaultHighlighter extends LayeredHighlighter {

    /** Creates a new DefaultHighlighther object. */
    @stub
    def this() = ???

    /** Adds a highlight to the view. */
    @stub
    def addHighlight(p0: Int, p1: Int, p: Highlighter.HighlightPainter): Any = ???

    /** Changes a highlight. */
    @stub
    def changeHighlight(tag: Any, p0: Int, p1: Int): Unit = ???

    /** Called when the UI is being removed from the interface of
     *  a JTextComponent.
     */
    @stub
    def deinstall(c: JTextComponent): Unit = ???

    /**  */
    @stub
    def getDrawsLayeredHighlights(): Boolean = ???

    /** Makes a copy of the highlights. */
    @stub
    def getHighlights(): Array[Highlighter.Highlight] = ???

    /** Called when the UI is being installed into the
     *  interface of a JTextComponent.
     */
    @stub
    def install(c: JTextComponent): Unit = ???

    /** Renders the highlights. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** When leaf Views (such as LabelView) are rendering they should
     *  call into this method.
     */
    @stub
    def paintLayeredHighlights(g: Graphics, p0: Int, p1: Int, viewBounds: Shape, editor: JTextComponent, view: View): Unit = ???

    /** Removes all highlights. */
    @stub
    def removeAllHighlights(): Unit = ???

    /** Removes a highlight from the view. */
    @stub
    def removeHighlight(tag: Any): Unit = ???

    /** If true, highlights are drawn as the Views draw the text. */
    @stub
    def setDrawsLayeredHighlights(newValue: Boolean): Unit = ???
}

object DefaultHighlighter {
    /** Simple highlight painter that fills a highlighted area with
     *  a solid color.
     */
    object DefaultHighlightPainter extends LayeredHighlighter.LayerPainter {

        /** Constructs a new highlight painter. */
        @stub
        def apply(c: Color) = ???

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


    /** Default implementation of LayeredHighlighter.LayerPainter that can
     *  be used for painting highlights.
     */
    @stub
    val DefaultPainter: LayeredHighlighter.LayerPainter = ???
}
