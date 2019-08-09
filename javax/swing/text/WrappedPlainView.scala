package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.event.DocumentEvent

/** View of plain text (text with only one font and color)
 *  that does line-wrapping.  This view expects that its
 *  associated element has child elements that represent
 *  the lines it should be wrapping.  It is implemented
 *  as a vertical box that contains logical line views.
 *  The logical line views are nested classes that render
 *  the logical line as multiple physical line if the logical
 *  line is too wide to fit within the allocation.  The
 *  line views draw upon the outer class for its state
 *  to reduce their memory requirements.
 *  
 *  The line views do all of their rendering through the
 *  drawLine method which in turn does all of
 *  its rendering through the drawSelectedText
 *  and drawUnselectedText methods.  This
 *  enables subclasses to easily specialize the rendering
 *  without concern for the layout aspects.
 */
class WrappedPlainView extends BoxView with TabExpander {

    /** Creates a new WrappedPlainView. */
    @stub
    def this(elem: Element) = ???

    /** This is called by the nested wrapped line
     *  views to determine the break location.
     */
    @stub
    protected def calculateBreakPosition(p0: Int, p1: Int): Int = ???

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    @stub
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Renders a line of text, suppressing whitespace at the end
     *  and expanding any tabs.
     */
    @stub
    protected def drawLine(p0: Int, p1: Int, g: Graphics, x: Int, y: Int): Unit = ???

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

    /** Determines the maximum span for this view along an
     *  axis.
     */
    @stub
    def getMaximumSpan(axis: Int): Float = ???

    /** Determines the minimum span for this view along an
     *  axis.
     */
    @stub
    def getMinimumSpan(axis: Int): Float = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Returns the tab size set for the document, defaulting to 8. */
    @stub
    protected def getTabSize(): Int = ???

    /** Gives notification that something was inserted into the
     *  document in a location that this view is responsible for.
     */
    @stub
    def insertUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Loads all of the children to initialize the view. */
    @stub
    protected def loadChildren(f: ViewFactory): Unit = ???

    /** Returns the next tab stop position after a given reference position. */
    @stub
    def nextTabStop(x: Float, tabOffset: Int): Float = ???

    /** Renders using the given rendering surface and area
     *  on that surface.
     */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Gives notification that something was removed from the
     *  document in a location that this view is responsible for.
     */
    @stub
    def removeUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???
}
