package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.DocumentEvent

/** View of a simple line-wrapping paragraph that supports
 *  multiple fonts, colors, components, icons, etc.  It is
 *  basically a vertical box with a margin around it.  The
 *  contents of the box are a bunch of rows which are special
 *  horizontal boxes.  This view creates a collection of
 *  views that represent the child elements of the paragraph
 *  element.  Each of these views are placed into a row
 *  directly if they will fit, otherwise the breakView
 *  method is called to try and carve the view into pieces
 *  that fit.
 */
class ParagraphView extends FlowView with TabExpander {

    /** Breaks this view on the given axis at the given length. */
    @stub
    def breakView(axis: Int, len: Float, a: Shape): View = ???

    /** Calculate the needs for the paragraph along the minor axis. */
    @stub
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    @stub
    def changedUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Create a View that should be used to hold a
     *  a row's worth of children in a flow.
     */
    @stub
    protected def createRow(): View = ???

    /** Finds the next character in the document with a character in
     *  string, starting at offset start.
     */
    @stub
    protected def findOffsetToCharactersInString(string: Array[Char], start: Int): Int = ???

    /** Determines in which direction the next view lays. */
    @stub
    protected def flipEastAndWestAtEnds(position: Int, bias: Position.Bias): Boolean = ???

    /** Determines the desired alignment for this view along an
     *  axis.
     */
    @stub
    def getAlignment(axis: Int): Float = ???

    /** Gets the break weight for a given location. */
    @stub
    def getBreakWeight(axis: Int, len: Float): Int = ???

    /** Returns the closest model position to x. */
    @stub
    protected def getClosestPositionTo(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias], rowIndex: Int, x: Int): Int = ???

    /** Fetches the constraining span to flow against for
     *  the given child index.
     */
    @stub
    def getFlowSpan(index: Int): Int = ???

    /** Fetches the location along the flow axis that the
     *  flow span will start at.
     */
    @stub
    def getFlowStart(index: Int): Int = ???

    /** Returns the view at a given index. */
    @stub
    protected def getLayoutView(index: Int): View = ???

    /** Returns the number of views that this view is
     *  responsible for.
     */
    @stub
    protected def getLayoutViewCount(): Int = ???

    /** Returns the next visual position for the cursor, in
     *  either the east or west direction.
     */
    @stub
    protected def getNextNorthSouthVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    /** Returns the size used by the views between
     *  startOffset and endOffset.
     */
    @stub
    protected def getPartialSize(startOffset: Int, endOffset: Int): Float = ???

    /** Returns where the tabs are calculated from. */
    @stub
    protected def getTabBase(): Float = ???

    /** Gets the Tabset to be used in calculating tabs. */
    @stub
    protected def getTabSet(): TabSet = ???

    /** Returns the next tab stop position given a reference position. */
    @stub
    def nextTabStop(x: Float, tabOffset: Int): Float = ???

    /** Renders using the given rendering surface and area on that
     *  surface.
     */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Sets the indent on the first line. */
    @stub
    protected def setFirstLineIndent(fi: Float): Unit = ???

    /** Sets the type of justification. */
    @stub
    protected def setJustification(j: Int): Unit = ???

    /** Sets the line spacing. */
    @stub
    protected def setLineSpacing(ls: Float): Unit = ???
}
