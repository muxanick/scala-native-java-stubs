package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.DocumentEvent

// View of a simple line-wrapping paragraph that supports
// multiple fonts, colors, components, icons, etc.  It is
// basically a vertical box with a margin around it.  The
// contents of the box are a bunch of rows which are special
// horizontal boxes.  This view creates a collection of
// views that represent the child elements of the paragraph
// element.  Each of these views are placed into a row
// directly if they will fit, otherwise the breakView
// method is called to try and carve the view into pieces
// that fit.
class ParagraphView extends FlowView with TabExpander {

    @stub
    // Breaks this view on the given axis at the given length.
    def breakView(axis: Int, len: float, a: Shape): View = ???

    @stub
    // Calculate the needs for the paragraph along the minor axis.
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Create a View that should be used to hold a
    // a row's worth of children in a flow.
    protected def createRow(): View = ???

    @stub
    // Finds the next character in the document with a character in
    // string, starting at offset start.
    protected def findOffsetToCharactersInString(string: Array[Char], start: Int): Int = ???

    @stub
    // Determines in which direction the next view lays.
    protected def flipEastAndWestAtEnds(position: Int, bias: Position.Bias): Boolean = ???

    @stub
    // Determines the desired alignment for this view along an
    // axis.
    def getAlignment(axis: Int): float = ???

    @stub
    // Gets the break weight for a given location.
    def getBreakWeight(axis: Int, len: float): Int = ???

    @stub
    // Returns the closest model position to x.
    protected def getClosestPositionTo(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias], rowIndex: Int, x: Int): Int = ???

    @stub
    // Fetches the constraining span to flow against for
    // the given child index.
    def getFlowSpan(index: Int): Int = ???

    @stub
    // Fetches the location along the flow axis that the
    // flow span will start at.
    def getFlowStart(index: Int): Int = ???

    @stub
    // Returns the view at a given index.
    protected def getLayoutView(index: Int): View = ???

    @stub
    // Returns the number of views that this view is
    // responsible for.
    protected def getLayoutViewCount(): Int = ???

    @stub
    // Returns the next visual position for the cursor, in
    // either the east or west direction.
    protected def getNextNorthSouthVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    @stub
    // Returns the size used by the views between
    // startOffset and endOffset.
    protected def getPartialSize(startOffset: Int, endOffset: Int): float = ???

    @stub
    // Returns where the tabs are calculated from.
    protected def getTabBase(): float = ???

    @stub
    // Gets the Tabset to be used in calculating tabs.
    protected def getTabSet(): TabSet = ???

    @stub
    // Returns the next tab stop position given a reference position.
    def nextTabStop(x: float, tabOffset: Int): float = ???

    @stub
    // Renders using the given rendering surface and area on that
    // surface.
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Sets the indent on the first line.
    protected def setFirstLineIndent(fi: float): Unit = ???

    @stub
    // Sets the type of justification.
    protected def setJustification(j: Int): Unit = ???

    @stub
    // Sets the line spacing.
    protected def setLineSpacing(ls: float): Unit = ???
}
