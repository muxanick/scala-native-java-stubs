package javax.swing.text

import java.awt.{Component, Graphics, Rectangle, Shape}
import java.lang.Object
import javax.swing.event.DocumentEvent

/** Implements View interface for a simple multi-line text view
 *  that has text in one font and color.  The view represents each
 *  child element as a line of text.
 */
class PlainView extends View with TabExpander {

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    @stub
    def changedUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Repaint the given line range. */
    @stub
    protected def damageLineRange(line0: Int, line1: Int, a: Shape, host: Component): Unit = ???

    /** Renders a line of text, suppressing whitespace at the end
     *  and expanding any tabs.
     */
    @stub
    protected def drawLine(lineIndex: Int, g: Graphics, x: Int, y: Int): Unit = ???

    /** Renders the given range in the model as selected text. */
    @stub
    protected def drawSelectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

    /** Renders the given range in the model as normal unselected
     *  text.
     */
    @stub
    protected def drawUnselectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

    /** Gives access to a buffer that can be used to fetch
     *  text from the associated document.
     */
    @stub
    protected def getLineBuffer(): Segment = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Returns the tab size set for the document, defaulting to 8. */
    @stub
    protected def getTabSize(): Int = ???

    /** Gives notification that something was inserted into the document
     *  in a location that this view is responsible for.
     */
    @stub
    def insertUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Determine the rectangle that represents the given line. */
    @stub
    protected def lineToRect(a: Shape, line: Int): Rectangle = ???

    /** Provides a mapping from the document model coordinate space
     *  to the coordinate space of the view mapped to it.
     */
    @stub
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    /** Returns the next tab stop position after a given reference position. */
    @stub
    def nextTabStop(x: Float, tabOffset: Int): Float = ???

    /** Renders using the given rendering surface and area on that surface. */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Gives notification that something was removed from the document
     *  in a location that this view is responsible for.
     */
    @stub
    def removeUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Sets the size of the view. */
    @stub
    def setSize(width: Float, height: Float): Unit = ???

    /** Repaint the region of change covered by the given document
     *  event.
     */
    @stub
    protected def updateDamage(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Checks to see if the font metrics and longest line
     *  are up-to-date.
     */
    @stub
    protected def updateMetrics(): Unit = ???
}
