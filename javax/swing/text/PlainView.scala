package javax.swing.text

import java.awt.{Component, Graphics, Rectangle, Shape}
import java.lang.Object
import javax.swing.event.DocumentEvent

// Implements View interface for a simple multi-line text view
// that has text in one font and color.  The view represents each
// child element as a line of text.
class PlainView extends View with TabExpander {

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Repaint the given line range.
    protected def damageLineRange(line0: Int, line1: Int, a: Shape, host: Component): Unit = ???

    @stub
    // Renders a line of text, suppressing whitespace at the end
    // and expanding any tabs.
    protected def drawLine(lineIndex: Int, g: Graphics, x: Int, y: Int): Unit = ???

    @stub
    // Renders the given range in the model as selected text.
    protected def drawSelectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

    @stub
    // Renders the given range in the model as normal unselected
    // text.
    protected def drawUnselectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

    @stub
    // Gives access to a buffer that can be used to fetch
    // text from the associated document.
    protected def getLineBuffer(): Segment = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Returns the tab size set for the document, defaulting to 8.
    protected def getTabSize(): Int = ???

    @stub
    // Gives notification that something was inserted into the document
    // in a location that this view is responsible for.
    def insertUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Determine the rectangle that represents the given line.
    protected def lineToRect(a: Shape, line: Int): Rectangle = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // Returns the next tab stop position after a given reference position.
    def nextTabStop(x: float, tabOffset: Int): float = ???

    @stub
    // Renders using the given rendering surface and area on that surface.
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Gives notification that something was removed from the document
    // in a location that this view is responsible for.
    def removeUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Sets the size of the view.
    def setSize(width: float, height: float): Unit = ???

    @stub
    // Repaint the region of change covered by the given document
    // event.
    protected def updateDamage(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Checks to see if the font metrics and longest line
    // are up-to-date.
    protected def updateMetrics(): Unit = ???
}
