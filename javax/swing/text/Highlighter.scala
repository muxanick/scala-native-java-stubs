package javax.swing.text

import java.awt.Graphics
import java.lang.Object

// An interface for an object that allows one to mark up the background
// with colored areas.
trait Highlighter {

    @stub
    // Adds a highlight to the view.
    def addHighlight(p0: Int, p1: Int, p: Highlighter.HighlightPainter): Object = ???

    @stub
    // Changes the given highlight to span a different portion of
    // the document.
    def changeHighlight(tag: Object, p0: Int, p1: Int): Unit = ???

    @stub
    // Called when the UI is being removed from the
    // interface of a JTextComponent.
    def deinstall(c: JTextComponent): Unit = ???

    @stub
    // Fetches the current list of highlights.
    def getHighlights(): Array[Highlighter.Highlight] = ???

    @stub
    // Called when the UI is being installed into the
    // interface of a JTextComponent.
    def install(c: JTextComponent): Unit = ???

    @stub
    // Renders the highlights.
    def paint(g: Graphics): Unit = ???

    @stub
    // Removes all highlights this highlighter is responsible for.
    def removeAllHighlights(): Unit = ???
}

object Highlighter {
    @stub
    // 
    def Highlighter.Highlight: trait = ???
}
