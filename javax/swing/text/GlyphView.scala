package javax.swing.text

import java.awt.{Color, Font, Graphics, Shape}
import java.lang.{Cloneable, Object}
import javax.swing.event.DocumentEvent

// A GlyphView is a styled chunk of text that represents a view
// mapped over an element in the text model. This view is generally
// responsible for displaying text glyphs using character level
// attributes in some way.
// An implementation of the GlyphPainter class is used to do the
// actual rendering and model/view translations.  This separates
// rendering from layout and management of the association with
// the model.
// 
// The view supports breaking for the purpose of formatting.
// The fragments produced by breaking share the view that has
// primary responsibility for the element (i.e. they are nested
// classes and carry only a small amount of state of their own)
// so they can share its resources.
// 
// Since this view
// represents text that may have tabs embedded in it, it implements the
// TabableView interface.  Tabs will only be
// expanded if this view is embedded in a container that does
// tab expansion.  ParagraphView is an example of a container
// that does tab expansion.
// 
class GlyphView extends View with TabableView, with Cloneable {

    @stub
    // Breaks this view on the given axis at the given length.
    def breakView(axis: Int, p0: Int, pos: float, len: float): View = ???

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Check to see that a glyph painter exists.
    protected def checkPainter(): Unit = ???

    @stub
    // Creates a shallow copy.
    protected def clone(): Object = ???

    @stub
    // Creates a view that represents a portion of the element.
    def createFragment(p0: Int, p1: Int): View = ???

    @stub
    // Determines the desired alignment for this view along an
    // axis.
    def getAlignment(axis: Int): float = ???

    @stub
    // Fetch the background color to use to render the
    // glyphs.
    def getBackground(): Color = ???

    @stub
    // Determines how attractive a break opportunity in
    // this view is.
    def getBreakWeight(axis: Int, pos: float, len: float): Int = ???

    @stub
    // Fetches the portion of the model that this view is responsible for.
    def getEndOffset(): Int = ???

    @stub
    // Fetch the font that the glyphs should be based
    // upon.
    def getFont(): Font = ???

    @stub
    // Fetch the foreground color to use to render the
    // glyphs.
    def getForeground(): Color = ???

    @stub
    // Fetch the currently installed glyph painter.
    def getGlyphPainter(): GlyphView.GlyphPainter = ???

    @stub
    // Determines the minimum span for this view along an axis.
    def getMinimumSpan(axis: Int): float = ???

    @stub
    // Provides a way to determine the next visually represented model
    // location that one might place a caret.
    def getNextVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    @stub
    // Determines the span along the same axis as tab
    // expansion for a portion of the view.
    def getPartialSpan(p0: Int, p1: Int): float = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Fetches the portion of the model that this view is responsible for.
    def getStartOffset(): Int = ???

    @stub
    // Determines the desired span when using the given
    // tab expansion implementation.
    def getTabbedSpan(x: float, e: TabExpander): float = ???

    @stub
    // Fetch the TabExpander to use if tabs are present in this view.
    def getTabExpander(): TabExpander = ???

    @stub
    // Fetch a reference to the text that occupies
    // the given range.
    def getText(p0: Int, p1: Int): Segment = ???

    @stub
    // Gives notification that something was inserted into
    // the document in a location that this view is responsible for.
    def insertUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Determine if the glyphs should have a strikethrough
    // line.
    def isStrikeThrough(): Boolean = ???

    @stub
    // Determine if the glyphs should be rendered as superscript.
    def isSubscript(): Boolean = ???

    @stub
    // Determine if the glyphs should be rendered as subscript.
    def isSuperscript(): Boolean = ???

    @stub
    // Determine if the glyphs should be underlined.
    def isUnderline(): Boolean = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // Renders a portion of a text style run.
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Gives notification that something was removed from the document
    // in a location that this view is responsible for.
    def removeUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Sets the painter to use for rendering glyphs.
    def setGlyphPainter(p: GlyphView.GlyphPainter): Unit = ???
}
