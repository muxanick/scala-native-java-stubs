package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object

// Implements the Highlighter interfaces.  Implements a simple highlight
// painter that renders in a solid color.
class DefaultHighlighter extends LayeredHighlighter {

    @stub
    // Adds a highlight to the view.
    def addHighlight(p0: Int, p1: Int, p: Highlighter.HighlightPainter): Object = ???

    @stub
    // Changes a highlight.
    def changeHighlight(tag: Object, p0: Int, p1: Int): Unit = ???

    @stub
    // Called when the UI is being removed from the interface of
    // a JTextComponent.
    def deinstall(c: JTextComponent): Unit = ???

    @stub
    // 
    def getDrawsLayeredHighlights(): Boolean = ???

    @stub
    // Makes a copy of the highlights.
    def getHighlights(): Array[Highlighter.Highlight] = ???

    @stub
    // Called when the UI is being installed into the
    // interface of a JTextComponent.
    def install(c: JTextComponent): Unit = ???

    @stub
    // Renders the highlights.
    def paint(g: Graphics): Unit = ???

    @stub
    // When leaf Views (such as LabelView) are rendering they should
    // call into this method.
    def paintLayeredHighlights(g: Graphics, p0: Int, p1: Int, viewBounds: Shape, editor: JTextComponent, view: View): Unit = ???

    @stub
    // Removes all highlights.
    def removeAllHighlights(): Unit = ???

    @stub
    // Removes a highlight from the view.
    def removeHighlight(tag: Object): Unit = ???
}
