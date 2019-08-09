package java.awt.font

import java.awt.{Font, Graphics2D, Rectangle, Shape}
import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.lang.{Cloneable, Object, String}
import java.text.AttributedCharacterIterator

// TextLayout is an immutable graphical representation of styled
// character data.
// 
// It provides the following capabilities:
// 
// implicit bidirectional analysis and reordering,
// cursor positioning and movement, including split cursors for
// mixed directional text,
// highlighting, including both logical and visual highlighting
// for mixed directional text,
// multiple baselines (roman, hanging, and centered),
// hit testing,
// justification,
// default font substitution,
// metric information such as ascent, descent, and advance, and
// rendering
// 
// 
// A TextLayout object can be rendered using
// its draw method.
// 
// TextLayout can be constructed either directly or through
// the use of a LineBreakMeasurer.  When constructed directly, the
// source text represents a single paragraph.  LineBreakMeasurer
// allows styled text to be broken into lines that fit within a particular
// width.  See the LineBreakMeasurer documentation for more
// information.
// 
// TextLayout construction logically proceeds as follows:
// 
// paragraph attributes are extracted and examined,
// text is analyzed for bidirectional reordering, and reordering
// information is computed if needed,
// text is segmented into style runs
// fonts are chosen for style runs, first by using a font if the
// attribute TextAttribute.FONT is present, otherwise by computing
// a default font using the attributes that have been defined
// if text is on multiple baselines, the runs or subruns are further
// broken into subruns sharing a common baseline,
// glyphvectors are generated for each run using the chosen font,
// final bidirectional reordering is performed on the glyphvectors
// 
// 
// All graphical information returned from a TextLayout
// object's methods is relative to the origin of the
// TextLayout, which is the intersection of the
// TextLayout object's baseline with its left edge.  Also,
// coordinates passed into a TextLayout object's methods
// are assumed to be relative to the TextLayout object's
// origin.  Clients usually need to translate between a
// TextLayout object's coordinate system and the coordinate
// system in another object (such as a
// Graphics object).
// 
// TextLayout objects are constructed from styled text,
// but they do not retain a reference to their source text.  Thus,
// changes in the text previously used to generate a TextLayout
// do not affect the TextLayout.
// 
// Three methods on a TextLayout object
// (getNextRightHit, getNextLeftHit, and
// hitTestChar) return instances of TextHitInfo.
// The offsets contained in these TextHitInfo objects
// are relative to the start of the TextLayout, not
// to the text used to create the TextLayout.  Similarly,
// TextLayout methods that accept TextHitInfo
// instances as parameters expect the TextHitInfo object's
// offsets to be relative to the TextLayout, not to any
// underlying text storage model.
// 
// Examples:
// Constructing and drawing a TextLayout and its bounding
// rectangle:
// 
//   Graphics2D g = ...;
//   Point2D loc = ...;
//   Font font = Font.getFont("Helvetica-bold-italic");
//   FontRenderContext frc = g.getFontRenderContext();
//   TextLayout layout = new TextLayout("This is a string", font, frc);
//   layout.draw(g, (float)loc.getX(), (float)loc.getY());
//
//   Rectangle2D bounds = layout.getBounds();
//   bounds.setRect(bounds.getX()+loc.getX(),
//                  bounds.getY()+loc.getY(),
//                  bounds.getWidth(),
//                  bounds.getHeight());
//   g.draw(bounds);
// 
// 
// 
// Hit-testing a TextLayout (determining which character is at
// a particular graphical location):
// 
//   Point2D click = ...;
//   TextHitInfo hit = layout.hitTestChar(
//                         (float) (click.getX() - loc.getX()),
//                         (float) (click.getY() - loc.getY()));
// 
// 
// 
// Responding to a right-arrow key press:
// 
//   int insertionIndex = ...;
//   TextHitInfo next = layout.getNextRightHit(insertionIndex);
//   if (next != null) {
//       // translate graphics to origin of layout on screen
//       g.translate(loc.getX(), loc.getY());
//       Shape[] carets = layout.getCaretShapes(next.getInsertionIndex());
//       g.draw(carets[0]);
//       if (carets[1] != null) {
//           g.draw(carets[1]);
//       }
//   }
// 
// 
// Drawing a selection range corresponding to a substring in the source text.
// The selected area may not be visually contiguous:
// 
//   // selStart, selLimit should be relative to the layout,
//   // not to the source text
//
//   int selStart = ..., selLimit = ...;
//   Color selectionColor = ...;
//   Shape selection = layout.getLogicalHighlightShape(selStart, selLimit);
//   // selection may consist of disjoint areas
//   // graphics is assumed to be tranlated to origin of layout
//   g.setColor(selectionColor);
//   g.fill(selection);
// 
// 
// Drawing a visually contiguous selection range.  The selection range may
// correspond to more than one substring in the source text.  The ranges of
// the corresponding source text substrings can be obtained with
// getLogicalRangesForVisualSelection():
// 
//   TextHitInfo selStart = ..., selLimit = ...;
//   Shape selection = layout.getVisualHighlightShape(selStart, selLimit);
//   g.setColor(selectionColor);
//   g.fill(selection);
//   int[] ranges = getLogicalRangesForVisualSelection(selStart, selLimit);
//   // ranges[0], ranges[1] is the first selection range,
//   // ranges[2], ranges[3] is the second selection range, etc.
// 
// 
// Note: Font rotations can cause text baselines to be rotated, and
// multiple runs with different rotations can cause the baseline to
// bend or zig-zag.  In order to account for this (rare) possibility,
// some APIs are specified to return metrics and take parameters 'in
// baseline-relative coordinates' (e.g. ascent, advance), and others
// are in 'in standard coordinates' (e.g. getBounds).  Values in
// baseline-relative coordinates map the 'x' coordinate to the
// distance along the baseline, (positive x is forward along the
// baseline), and the 'y' coordinate to a distance along the
// perpendicular to the baseline at 'x' (positive y is 90 degrees
// clockwise from the baseline vector).  Values in standard
// coordinates are measured along the x and y axes, with 0,0 at the
// origin of the TextLayout.  Documentation for each relevant API
// indicates what values are in what coordinate system.  In general,
// measurement-related APIs are in baseline-relative coordinates,
// while display-related APIs are in standard coordinates.
final class TextLayout extends Object with Cloneable {

    @stub
    // Constructs a TextLayout from an iterator over styled text.
    def this(text: AttributedCharacterIterator, frc: FontRenderContext) = ???

    @stub
    // Constructs a TextLayout from a String
    // and a Font.
    def this(string: String, font: Font, frc: FontRenderContext) = ???

    @stub
    // Creates a copy of this TextLayout.
    protected def clone(): Object = ???

    @stub
    // Renders this TextLayout at the specified location in
    // the specified Graphics2D context.
    def draw(g2: Graphics2D, x: float, y: float): Unit = ???

    @stub
    // Returns true if the specified Object is a
    // TextLayout object and if the specified Object
    // equals this TextLayout.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns true if the two layouts are equal.
    def equals(rhs: TextLayout): Boolean = ???

    @stub
    // Returns the advance of this TextLayout.
    def getAdvance(): float = ???

    @stub
    // Returns the ascent of this TextLayout.
    def getAscent(): float = ???

    @stub
    // Returns the baseline for this TextLayout.
    def getBaseline(): Byte = ???

    @stub
    // Returns the offsets array for the baselines used for this
    // TextLayout.
    def getBaselineOffsets(): Array[float] = ???

    @stub
    // Returns the black box bounds of the characters in the specified range.
    def getBlackBoxBounds(firstEndpoint: Int, secondEndpoint: Int): Shape = ???

    @stub
    // Returns the bounds of this TextLayout.
    def getBounds(): Rectangle2D = ???

    @stub
    // Returns information about the caret corresponding to hit.
    def getCaretInfo(hit: TextHitInfo): Array[float] = ???

    @stub
    // Returns information about the caret corresponding to hit.
    def getCaretInfo(hit: TextHitInfo, bounds: Rectangle2D): Array[float] = ???

    @stub
    // Returns a Shape representing the caret at the specified
    // hit inside the natural bounds of this TextLayout.
    def getCaretShape(hit: TextHitInfo): Shape = ???

    @stub
    // Returns a Shape representing the caret at the specified
    // hit inside the specified bounds.
    def getCaretShape(hit: TextHitInfo, bounds: Rectangle2D): Shape = ???

    @stub
    // Returns two paths corresponding to the strong and weak caret.
    def getCaretShapes(offset: Int): Array[Shape] = ???

    @stub
    // Returns two paths corresponding to the strong and weak caret.
    def getCaretShapes(offset: Int, bounds: Rectangle2D): Array[Shape] = ???

    @stub
    // Returns two paths corresponding to the strong and weak caret.
    def getCaretShapes(offset: Int, bounds: Rectangle2D, policy: TextLayout.CaretPolicy): Array[Shape] = ???

    @stub
    // Returns the number of characters represented by this
    // TextLayout.
    def getCharacterCount(): Int = ???

    @stub
    // Returns the level of the character at index.
    def getCharacterLevel(index: Int): Byte = ???

    @stub
    // Returns the descent of this TextLayout.
    def getDescent(): float = ???

    @stub
    // Creates a copy of this TextLayout justified to the
    // specified width.
    def getJustifiedLayout(justificationWidth: float): TextLayout = ???

    @stub
    // Return the LayoutPath, or null if the layout path is the
    // default path (x maps to advance, y maps to offset).
    def getLayoutPath(): LayoutPath = ???

    @stub
    // Returns the leading of the TextLayout.
    def getLeading(): float = ???

    @stub
    // Returns a Shape enclosing the logical selection in the
    // specified range, extended to the natural bounds of this
    // TextLayout.
    def getLogicalHighlightShape(firstEndpoint: Int, secondEndpoint: Int): Shape = ???

    @stub
    // Returns a Shape enclosing the logical selection in the
    // specified range, extended to the specified bounds.
    def getLogicalHighlightShape(firstEndpoint: Int, secondEndpoint: Int, bounds: Rectangle2D): Shape = ???

    @stub
    // Returns the logical ranges of text corresponding to a visual selection.
    def getLogicalRangesForVisualSelection(firstEndpoint: TextHitInfo, secondEndpoint: TextHitInfo): Array[Int] = ???

    @stub
    // Returns the hit for the next caret to the left (top); if no
    // such hit, returns null.
    def getNextLeftHit(offset: Int): TextHitInfo = ???

    @stub
    // Returns the hit for the next caret to the left (top); if no
    // such hit, returns null.
    def getNextLeftHit(offset: Int, policy: TextLayout.CaretPolicy): TextHitInfo = ???

    @stub
    // Returns the hit for the next caret to the left (top); if no such
    // hit, returns null.
    def getNextLeftHit(hit: TextHitInfo): TextHitInfo = ???

    @stub
    // Returns the hit for the next caret to the right (bottom); if no
    // such hit, returns null.
    def getNextRightHit(offset: Int): TextHitInfo = ???

    @stub
    // Returns the hit for the next caret to the right (bottom); if no
    // such hit, returns null.
    def getNextRightHit(offset: Int, policy: TextLayout.CaretPolicy): TextHitInfo = ???

    @stub
    // Returns the hit for the next caret to the right (bottom); if there
    // is no such hit, returns null.
    def getNextRightHit(hit: TextHitInfo): TextHitInfo = ???

    @stub
    // Returns a Shape representing the outline of this
    // TextLayout.
    def getOutline(tx: AffineTransform): Shape = ???

    @stub
    // Returns the pixel bounds of this TextLayout when
    // rendered in a graphics with the given
    // FontRenderContext at the given location.
    def getPixelBounds(frc: FontRenderContext, x: float, y: float): Rectangle = ???

    @stub
    // Returns the advance of this TextLayout, minus trailing
    // whitespace.
    def getVisibleAdvance(): float = ???

    @stub
    // Returns a Shape enclosing the visual selection in the
    // specified range, extended to the bounds.
    def getVisualHighlightShape(firstEndpoint: TextHitInfo, secondEndpoint: TextHitInfo): Shape = ???

    @stub
    // Returns a path enclosing the visual selection in the specified range,
    // extended to bounds.
    def getVisualHighlightShape(firstEndpoint: TextHitInfo, secondEndpoint: TextHitInfo, bounds: Rectangle2D): Shape = ???

    @stub
    // Returns the hit on the opposite side of the specified hit's caret.
    def getVisualOtherHit(hit: TextHitInfo): TextHitInfo = ???

    @stub
    // Justify this layout.
    protected def handleJustify(justificationWidth: float): Unit = ???

    @stub
    // Returns the hash code of this TextLayout.
    def hashCode(): Int = ???

    @stub
    // Returns a TextHitInfo corresponding to the
    // specified point.
    def hitTestChar(x: float, y: float): TextHitInfo = ???

    @stub
    // Returns a TextHitInfo corresponding to the
    // specified point.
    def hitTestChar(x: float, y: float, bounds: Rectangle2D): TextHitInfo = ???

    @stub
    // Convert a hit to a point in standard coordinates.
    def hitToPoint(hit: TextHitInfo, point: Point2D): Unit = ???

    @stub
    // Returns true if this TextLayout has
    // a left-to-right base direction or false if it has
    // a right-to-left base direction.
    def isLeftToRight(): Boolean = ???

    @stub
    // Returns true if this TextLayout is vertical.
    def isVertical(): Boolean = ???
}
