package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object

/** Implements the Highlighter interfaces.  Implements a simple highlight
 *  painter that renders in a solid color.
 */
class DefaultHighlighter extends LayeredHighlighter {

    /** Adds a highlight to the view. */
    @stub
    def addHighlight(p0: Int, p1: Int, p: Highlighter.HighlightPainter): Object = ???

    /** Changes a highlight. */
    @stub
    def changeHighlight(tag: Object, p0: Int, p1: Int): Unit = ???

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
    def removeHighlight(tag: Object): Unit = ???
}
