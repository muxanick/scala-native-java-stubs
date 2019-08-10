package java.awt.font

import java.awt.{Font, Graphics2D, Rectangle, Shape}
import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.lang.{Cloneable, Object, String}
import java.text.{AttributedCharacterIterator, AttributedCharacterIterator.Attribute}
import java.util.Map
import scala.scalanative.annotation.stub

/** TextLayout is an immutable graphical representation of styled
 *  character data.
 *  
 *  It provides the following capabilities:
 *  
 *  implicit bidirectional analysis and reordering,
 *  cursor positioning and movement, including split cursors for
 *  mixed directional text,
 *  highlighting, including both logical and visual highlighting
 *  for mixed directional text,
 *  multiple baselines (roman, hanging, and centered),
 *  hit testing,
 *  justification,
 *  default font substitution,
 *  metric information such as ascent, descent, and advance, and
 *  rendering
 *  
 *  
 *  A TextLayout object can be rendered using
 *  its draw method.
 *  
 *  TextLayout can be constructed either directly or through
 *  the use of a LineBreakMeasurer.  When constructed directly, the
 *  source text represents a single paragraph.  LineBreakMeasurer
 *  allows styled text to be broken into lines that fit within a particular
 *  width.  See the LineBreakMeasurer documentation for more
 *  information.
 *  
 *  TextLayout construction logically proceeds as follows:
 *  
 *  paragraph attributes are extracted and examined,
 *  text is analyzed for bidirectional reordering, and reordering
 *  information is computed if needed,
 *  text is segmented into style runs
 *  fonts are chosen for style runs, first by using a font if the
 *  attribute TextAttribute.FONT is present, otherwise by computing
 *  a default font using the attributes that have been defined
 *  if text is on multiple baselines, the runs or subruns are further
 *  broken into subruns sharing a common baseline,
 *  glyphvectors are generated for each run using the chosen font,
 *  final bidirectional reordering is performed on the glyphvectors
 *  
 *  
 *  All graphical information returned from a TextLayout
 *  object's methods is relative to the origin of the
 *  TextLayout, which is the intersection of the
 *  TextLayout object's baseline with its left edge.  Also,
 *  coordinates passed into a TextLayout object's methods
 *  are assumed to be relative to the TextLayout object's
 *  origin.  Clients usually need to translate between a
 *  TextLayout object's coordinate system and the coordinate
 *  system in another object (such as a
 *  Graphics object).
 *  
 *  TextLayout objects are constructed from styled text,
 *  but they do not retain a reference to their source text.  Thus,
 *  changes in the text previously used to generate a TextLayout
 *  do not affect the TextLayout.
 *  
 *  Three methods on a TextLayout object
 *  (getNextRightHit, getNextLeftHit, and
 *  hitTestChar) return instances of TextHitInfo.
 *  The offsets contained in these TextHitInfo objects
 *  are relative to the start of the TextLayout, not
 *  to the text used to create the TextLayout.  Similarly,
 *  TextLayout methods that accept TextHitInfo
 *  instances as parameters expect the TextHitInfo object's
 *  offsets to be relative to the TextLayout, not to any
 *  underlying text storage model.
 *  
 *  Examples:
 *  Constructing and drawing a TextLayout and its bounding
 *  rectangle:
 *  
 *    Graphics2D g = ...;
 *    Point2D loc = ...;
 *    Font font = Font.getFont("Helvetica-bold-italic");
 *    FontRenderContext frc = g.getFontRenderContext();
 *    TextLayout layout = new TextLayout("This is a string", font, frc);
 *    layout.draw(g, (float)loc.getX(), (float)loc.getY());
 * 
 *    Rectangle2D bounds = layout.getBounds();
 *    bounds.setRect(bounds.getX()+loc.getX(),
 *                   bounds.getY()+loc.getY(),
 *                   bounds.getWidth(),
 *                   bounds.getHeight());
 *    g.draw(bounds);
 *  
 *  
 *  
 *  Hit-testing a TextLayout (determining which character is at
 *  a particular graphical location):
 *  
 *    Point2D click = ...;
 *    TextHitInfo hit = layout.hitTestChar(
 *                          (float) (click.getX() - loc.getX()),
 *                          (float) (click.getY() - loc.getY()));
 *  
 *  
 *  
 *  Responding to a right-arrow key press:
 *  
 *    int insertionIndex = ...;
 *    TextHitInfo next = layout.getNextRightHit(insertionIndex);
 *    if (next != null) {
 *        // translate graphics to origin of layout on screen
 *        g.translate(loc.getX(), loc.getY());
 *        Shape[] carets = layout.getCaretShapes(next.getInsertionIndex());
 *        g.draw(carets[0]);
 *        if (carets[1] != null) {
 *            g.draw(carets[1]);
 *        }
 *    }
 *  
 *  
 *  Drawing a selection range corresponding to a substring in the source text.
 *  The selected area may not be visually contiguous:
 *  
 *    // selStart, selLimit should be relative to the layout,
 *    // not to the source text
 * 
 *    int selStart = ..., selLimit = ...;
 *    Color selectionColor = ...;
 *    Shape selection = layout.getLogicalHighlightShape(selStart, selLimit);
 *    // selection may consist of disjoint areas
 *    // graphics is assumed to be tranlated to origin of layout
 *    g.setColor(selectionColor);
 *    g.fill(selection);
 *  
 *  
 *  Drawing a visually contiguous selection range.  The selection range may
 *  correspond to more than one substring in the source text.  The ranges of
 *  the corresponding source text substrings can be obtained with
 *  getLogicalRangesForVisualSelection():
 *  
 *    TextHitInfo selStart = ..., selLimit = ...;
 *    Shape selection = layout.getVisualHighlightShape(selStart, selLimit);
 *    g.setColor(selectionColor);
 *    g.fill(selection);
 *    int[] ranges = getLogicalRangesForVisualSelection(selStart, selLimit);
 *    // ranges[0], ranges[1] is the first selection range,
 *    // ranges[2], ranges[3] is the second selection range, etc.
 *  
 *  
 *  Note: Font rotations can cause text baselines to be rotated, and
 *  multiple runs with different rotations can cause the baseline to
 *  bend or zig-zag.  In order to account for this (rare) possibility,
 *  some APIs are specified to return metrics and take parameters 'in
 *  baseline-relative coordinates' (e.g. ascent, advance), and others
 *  are in 'in standard coordinates' (e.g. getBounds).  Values in
 *  baseline-relative coordinates map the 'x' coordinate to the
 *  distance along the baseline, (positive x is forward along the
 *  baseline), and the 'y' coordinate to a distance along the
 *  perpendicular to the baseline at 'x' (positive y is 90 degrees
 *  clockwise from the baseline vector).  Values in standard
 *  coordinates are measured along the x and y axes, with 0,0 at the
 *  origin of the TextLayout.  Documentation for each relevant API
 *  indicates what values are in what coordinate system.  In general,
 *  measurement-related APIs are in baseline-relative coordinates,
 *  while display-related APIs are in standard coordinates.
 */
final class TextLayout extends Object with Cloneable {

    /** Constructs a TextLayout from an iterator over styled text. */
    @stub
    def this(text: AttributedCharacterIterator, frc: FontRenderContext) = ???

    /** Constructs a TextLayout from a String
     *  and a Font.
     */
    @stub
    def this(string: String, font: Font, frc: FontRenderContext) = ???

    /** Constructs a TextLayout from a String
     *  and an attribute set.
     */
    @stub
    def this(string: String, attributes: Map[_ <: AttributedCharacterIterator.Attribute, _], frc: FontRenderContext) = ???

    /** Creates a copy of this TextLayout. */
    @stub
    protected def clone(): Any = ???

    /** Renders this TextLayout at the specified location in
     *  the specified Graphics2D context.
     */
    @stub
    def draw(g2: Graphics2D, x: Float, y: Float): Unit = ???

    /** Returns true if the specified Object is a
     *  TextLayout object and if the specified Object
     *  equals this TextLayout.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns true if the two layouts are equal. */
    @stub
    def equals(rhs: TextLayout): Boolean = ???

    /** Returns the advance of this TextLayout. */
    @stub
    def getAdvance(): Float = ???

    /** Returns the ascent of this TextLayout. */
    @stub
    def getAscent(): Float = ???

    /** Returns the baseline for this TextLayout. */
    @stub
    def getBaseline(): Byte = ???

    /** Returns the offsets array for the baselines used for this
     *  TextLayout.
     */
    @stub
    def getBaselineOffsets(): Array[Float] = ???

    /** Returns the black box bounds of the characters in the specified range. */
    @stub
    def getBlackBoxBounds(firstEndpoint: Int, secondEndpoint: Int): Shape = ???

    /** Returns the bounds of this TextLayout. */
    @stub
    def getBounds(): Rectangle2D = ???

    /** Returns information about the caret corresponding to hit. */
    @stub
    def getCaretInfo(hit: TextHitInfo): Array[Float] = ???

    /** Returns information about the caret corresponding to hit. */
    @stub
    def getCaretInfo(hit: TextHitInfo, bounds: Rectangle2D): Array[Float] = ???

    /** Returns a Shape representing the caret at the specified
     *  hit inside the natural bounds of this TextLayout.
     */
    @stub
    def getCaretShape(hit: TextHitInfo): Shape = ???

    /** Returns a Shape representing the caret at the specified
     *  hit inside the specified bounds.
     */
    @stub
    def getCaretShape(hit: TextHitInfo, bounds: Rectangle2D): Shape = ???

    /** Returns two paths corresponding to the strong and weak caret. */
    @stub
    def getCaretShapes(offset: Int): Array[Shape] = ???

    /** Returns two paths corresponding to the strong and weak caret. */
    @stub
    def getCaretShapes(offset: Int, bounds: Rectangle2D): Array[Shape] = ???

    /** Returns two paths corresponding to the strong and weak caret. */
    @stub
    def getCaretShapes(offset: Int, bounds: Rectangle2D, policy: TextLayout.CaretPolicy): Array[Shape] = ???

    /** Returns the number of characters represented by this
     *  TextLayout.
     */
    @stub
    def getCharacterCount(): Int = ???

    /** Returns the level of the character at index. */
    @stub
    def getCharacterLevel(index: Int): Byte = ???

    /** Returns the descent of this TextLayout. */
    @stub
    def getDescent(): Float = ???

    /** Creates a copy of this TextLayout justified to the
     *  specified width.
     */
    @stub
    def getJustifiedLayout(justificationWidth: Float): TextLayout = ???

    /** Return the LayoutPath, or null if the layout path is the
     *  default path (x maps to advance, y maps to offset).
     */
    @stub
    def getLayoutPath(): LayoutPath = ???

    /** Returns the leading of the TextLayout. */
    @stub
    def getLeading(): Float = ???

    /** Returns a Shape enclosing the logical selection in the
     *  specified range, extended to the natural bounds of this
     *  TextLayout.
     */
    @stub
    def getLogicalHighlightShape(firstEndpoint: Int, secondEndpoint: Int): Shape = ???

    /** Returns a Shape enclosing the logical selection in the
     *  specified range, extended to the specified bounds.
     */
    @stub
    def getLogicalHighlightShape(firstEndpoint: Int, secondEndpoint: Int, bounds: Rectangle2D): Shape = ???

    /** Returns the logical ranges of text corresponding to a visual selection. */
    @stub
    def getLogicalRangesForVisualSelection(firstEndpoint: TextHitInfo, secondEndpoint: TextHitInfo): Array[Int] = ???

    /** Returns the hit for the next caret to the left (top); if no
     *  such hit, returns null.
     */
    @stub
    def getNextLeftHit(offset: Int): TextHitInfo = ???

    /** Returns the hit for the next caret to the left (top); if no
     *  such hit, returns null.
     */
    @stub
    def getNextLeftHit(offset: Int, policy: TextLayout.CaretPolicy): TextHitInfo = ???

    /** Returns the hit for the next caret to the left (top); if no such
     *  hit, returns null.
     */
    @stub
    def getNextLeftHit(hit: TextHitInfo): TextHitInfo = ???

    /** Returns the hit for the next caret to the right (bottom); if no
     *  such hit, returns null.
     */
    @stub
    def getNextRightHit(offset: Int): TextHitInfo = ???

    /** Returns the hit for the next caret to the right (bottom); if no
     *  such hit, returns null.
     */
    @stub
    def getNextRightHit(offset: Int, policy: TextLayout.CaretPolicy): TextHitInfo = ???

    /** Returns the hit for the next caret to the right (bottom); if there
     *  is no such hit, returns null.
     */
    @stub
    def getNextRightHit(hit: TextHitInfo): TextHitInfo = ???

    /** Returns a Shape representing the outline of this
     *  TextLayout.
     */
    @stub
    def getOutline(tx: AffineTransform): Shape = ???

    /** Returns the pixel bounds of this TextLayout when
     *  rendered in a graphics with the given
     *  FontRenderContext at the given location.
     */
    @stub
    def getPixelBounds(frc: FontRenderContext, x: Float, y: Float): Rectangle = ???

    /** Returns the advance of this TextLayout, minus trailing
     *  whitespace.
     */
    @stub
    def getVisibleAdvance(): Float = ???

    /** Returns a Shape enclosing the visual selection in the
     *  specified range, extended to the bounds.
     */
    @stub
    def getVisualHighlightShape(firstEndpoint: TextHitInfo, secondEndpoint: TextHitInfo): Shape = ???

    /** Returns a path enclosing the visual selection in the specified range,
     *  extended to bounds.
     */
    @stub
    def getVisualHighlightShape(firstEndpoint: TextHitInfo, secondEndpoint: TextHitInfo, bounds: Rectangle2D): Shape = ???

    /** Returns the hit on the opposite side of the specified hit's caret. */
    @stub
    def getVisualOtherHit(hit: TextHitInfo): TextHitInfo = ???

    /** Justify this layout. */
    @stub
    protected def handleJustify(justificationWidth: Float): Unit = ???

    /** Returns the hash code of this TextLayout. */
    @stub
    def hashCode(): Int = ???

    /** Returns a TextHitInfo corresponding to the
     *  specified point.
     */
    @stub
    def hitTestChar(x: Float, y: Float): TextHitInfo = ???

    /** Returns a TextHitInfo corresponding to the
     *  specified point.
     */
    @stub
    def hitTestChar(x: Float, y: Float, bounds: Rectangle2D): TextHitInfo = ???

    /** Convert a hit to a point in standard coordinates. */
    @stub
    def hitToPoint(hit: TextHitInfo, point: Point2D): Unit = ???

    /** Returns true if this TextLayout has
     *  a left-to-right base direction or false if it has
     *  a right-to-left base direction.
     */
    @stub
    def isLeftToRight(): Boolean = ???

    /** Returns true if this TextLayout is vertical. */
    @stub
    def isVertical(): Boolean = ???

    /** Returns debugging information for this TextLayout. */
    @stub
    def toString(): String = ???
}

object TextLayout {
    /** Defines a policy for determining the strong caret location. */
    type CaretPolicy = TextLayout_CaretPolicy

    /** This CaretPolicy is used when a policy is not specified
     *  by the client.
     */
    @stub
    val DEFAULT_CARET_POLICY: TextLayout.CaretPolicy = ???
}
