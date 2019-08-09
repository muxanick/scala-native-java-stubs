package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.event.DocumentEvent

// View of plain text (text with only one font and color)
// that does line-wrapping.  This view expects that its
// associated element has child elements that represent
// the lines it should be wrapping.  It is implemented
// as a vertical box that contains logical line views.
// The logical line views are nested classes that render
// the logical line as multiple physical line if the logical
// line is too wide to fit within the allocation.  The
// line views draw upon the outer class for its state
// to reduce their memory requirements.
// 
// The line views do all of their rendering through the
// drawLine method which in turn does all of
// its rendering through the drawSelectedText
// and drawUnselectedText methods.  This
// enables subclasses to easily specialize the rendering
// without concern for the layout aspects.
class WrappedPlainView extends BoxView with TabExpander {

    @stub
    // Creates a new WrappedPlainView.
    def this(elem: Element) = ???

    @stub
    // This is called by the nested wrapped line
    // views to determine the break location.
    protected def calculateBreakPosition(p0: Int, p1: Int): Int = ???

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Renders a line of text, suppressing whitespace at the end
    // and expanding any tabs.
    protected def drawLine(p0: Int, p1: Int, g: Graphics, x: Int, y: Int): Unit = ???

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
    // Determines the maximum span for this view along an
    // axis.
    def getMaximumSpan(axis: Int): float = ???

    @stub
    // Determines the minimum span for this view along an
    // axis.
    def getMinimumSpan(axis: Int): float = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Returns the tab size set for the document, defaulting to 8.
    protected def getTabSize(): Int = ???

    @stub
    // Gives notification that something was inserted into the
    // document in a location that this view is responsible for.
    def insertUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Loads all of the children to initialize the view.
    protected def loadChildren(f: ViewFactory): Unit = ???

    @stub
    // Returns the next tab stop position after a given reference position.
    def nextTabStop(x: float, tabOffset: Int): float = ???

    @stub
    // Renders using the given rendering surface and area
    // on that surface.
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Gives notification that something was removed from the
    // document in a location that this view is responsible for.
    def removeUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???
}
