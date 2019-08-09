package javax.swing.text

import java.awt.{Color, Font, Graphics, Shape}
import java.lang.{Cloneable, Object}
import javax.swing.event.DocumentEvent

/** A GlyphView is a styled chunk of text that represents a view
 *  mapped over an element in the text model. This view is generally
 *  responsible for displaying text glyphs using character level
 *  attributes in some way.
 *  An implementation of the GlyphPainter class is used to do the
 *  actual rendering and model/view translations.  This separates
 *  rendering from layout and management of the association with
 *  the model.
 *  
 *  The view supports breaking for the purpose of formatting.
 *  The fragments produced by breaking share the view that has
 *  primary responsibility for the element (i.e. they are nested
 *  classes and carry only a small amount of state of their own)
 *  so they can share its resources.
 *  
 *  Since this view
 *  represents text that may have tabs embedded in it, it implements the
 *  TabableView interface.  Tabs will only be
 *  expanded if this view is embedded in a container that does
 *  tab expansion.  ParagraphView is an example of a container
 *  that does tab expansion.
 *  
 */
class GlyphView extends View with TabableView with Cloneable {

    /** Breaks this view on the given axis at the given length. */
    @stub
    def breakView(axis: Int, p0: Int, pos: Float, len: Float): View = ???

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    @stub
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Check to see that a glyph painter exists. */
    @stub
    protected def checkPainter(): Unit = ???

    /** Creates a shallow copy. */
    @stub
    protected def clone(): Object = ???

    /** Creates a view that represents a portion of the element. */
    @stub
    def createFragment(p0: Int, p1: Int): View = ???

    /** Determines the desired alignment for this view along an
     *  axis.
     */
    @stub
    def getAlignment(axis: Int): Float = ???

    /** Fetch the background color to use to render the
     *  glyphs.
     */
    @stub
    def getBackground(): Color = ???

    /** Determines how attractive a break opportunity in
     *  this view is.
     */
    @stub
    def getBreakWeight(axis: Int, pos: Float, len: Float): Int = ???

    /** Fetches the portion of the model that this view is responsible for. */
    @stub
    def getEndOffset(): Int = ???

    /** Fetch the font that the glyphs should be based
     *  upon.
     */
    @stub
    def getFont(): Font = ???

    /** Fetch the foreground color to use to render the
     *  glyphs.
     */
    @stub
    def getForeground(): Color = ???

    /** Fetch the currently installed glyph painter. */
    @stub
    def getGlyphPainter(): GlyphView.GlyphPainter = ???

    /** Determines the minimum span for this view along an axis. */
    @stub
    def getMinimumSpan(axis: Int): Float = ???

    /** Provides a way to determine the next visually represented model
     *  location that one might place a caret.
     */
    @stub
    def getNextVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    /** Determines the span along the same axis as tab
     *  expansion for a portion of the view.
     */
    @stub
    def getPartialSpan(p0: Int, p1: Int): Float = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Fetches the portion of the model that this view is responsible for. */
    @stub
    def getStartOffset(): Int = ???

    /** Determines the desired span when using the given
     *  tab expansion implementation.
     */
    @stub
    def getTabbedSpan(x: Float, e: TabExpander): Float = ???

    /** Fetch the TabExpander to use if tabs are present in this view. */
    @stub
    def getTabExpander(): TabExpander = ???

    /** Fetch a reference to the text that occupies
     *  the given range.
     */
    @stub
    def getText(p0: Int, p1: Int): Segment = ???

    /** Gives notification that something was inserted into
     *  the document in a location that this view is responsible for.
     */
    @stub
    def insertUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Determine if the glyphs should have a strikethrough
     *  line.
     */
    @stub
    def isStrikeThrough(): Boolean = ???

    /** Determine if the glyphs should be rendered as superscript. */
    @stub
    def isSubscript(): Boolean = ???

    /** Determine if the glyphs should be rendered as subscript. */
    @stub
    def isSuperscript(): Boolean = ???

    /** Determine if the glyphs should be underlined. */
    @stub
    def isUnderline(): Boolean = ???

    /** Provides a mapping from the document model coordinate space
     *  to the coordinate space of the view mapped to it.
     */
    @stub
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    /** Renders a portion of a text style run. */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Gives notification that something was removed from the document
     *  in a location that this view is responsible for.
     */
    @stub
    def removeUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Sets the painter to use for rendering glyphs. */
    @stub
    def setGlyphPainter(p: GlyphView.GlyphPainter): Unit = ???
}
