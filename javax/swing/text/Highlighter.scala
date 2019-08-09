package javax.swing.text

import java.awt.Graphics
import java.lang.Object

/** An interface for an object that allows one to mark up the background
 *  with colored areas.
 */
trait Highlighter {

    /** Adds a highlight to the view. */
    @stub
    def addHighlight(p0: Int, p1: Int, p: Highlighter.HighlightPainter): Object = ???

    /** Changes the given highlight to span a different portion of
     *  the document.
     */
    @stub
    def changeHighlight(tag: Object, p0: Int, p1: Int): Unit = ???

    /** Called when the UI is being removed from the
     *  interface of a JTextComponent.
     */
    @stub
    def deinstall(c: JTextComponent): Unit = ???

    /** Fetches the current list of highlights. */
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

    /** Removes all highlights this highlighter is responsible for. */
    @stub
    def removeAllHighlights(): Unit = ???
}

object Highlighter {
    /**  */
    @stub
    val Highlighter.Highlight: trait = ???
}
