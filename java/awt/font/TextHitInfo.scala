package java.awt.font

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The TextHitInfo class represents a character position in a
 *  text model, and a bias, or "side," of the character.  Biases are
 *  either leading (the left edge, for a left-to-right character)
 *  or trailing (the right edge, for a left-to-right character).
 *  Instances of TextHitInfo are used to specify caret and
 *  insertion positions within text.
 *  
 *  For example, consider the text "abc".  TextHitInfo.trailing(1)
 *  corresponds to the right side of the 'b' in the text.
 *  
 *  TextHitInfo is used primarily by TextLayout and
 *  clients of TextLayout.  Clients of TextLayout
 *  query TextHitInfo instances for an insertion offset, where
 *  new text is inserted into the text model.  The insertion offset is equal
 *  to the character position in the TextHitInfo if the bias
 *  is leading, and one character after if the bias is trailing.  The
 *  insertion offset for TextHitInfo.trailing(1) is 2.
 *  
 *  Sometimes it is convenient to construct a TextHitInfo with
 *  the same insertion offset as an existing one, but on the opposite
 *  character.  The getOtherHit method constructs a new
 *  TextHitInfo with the same insertion offset as an existing
 *  one, with a hit on the character on the other side of the insertion offset.
 *  Calling getOtherHit on trailing(1) would return leading(2).
 *  In general, getOtherHit for trailing(n) returns
 *  leading(n+1) and getOtherHit for leading(n)
 *  returns trailing(n-1).
 *  
 *  Example:
 *  Converting a graphical point to an insertion point within a text
 *  model
 *  
 *  TextLayout layout = ...;
 *  Point2D.Float hitPoint = ...;
 *  TextHitInfo hitInfo = layout.hitTestChar(hitPoint.x, hitPoint.y);
 *  int insPoint = hitInfo.getInsertionIndex();
 *  // insPoint is relative to layout;  may need to adjust for use
 *  // in a text model
 *  
 */
final class TextHitInfo extends Object {

    /** Returns true if the specified Object is a
     *  TextHitInfo and equals this TextHitInfo.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns true if the specified TextHitInfo
     *  has the same charIndex and isLeadingEdge
     *  as this TextHitInfo.
     */
    @stub
    def equals(hitInfo: TextHitInfo): Boolean = ???

    /** Returns the index of the character hit. */
    @stub
    def getCharIndex(): Int = ???

    /** Returns the insertion index. */
    @stub
    def getInsertionIndex(): Int = ???

    /** Creates a TextHitInfo whose character index is offset
     *  by delta from the charIndex of this
     *  TextHitInfo.
     */
    @stub
    def getOffsetHit(delta: Int): TextHitInfo = ???

    /** Creates a TextHitInfo on the other side of the
     *  insertion point.
     */
    @stub
    def getOtherHit(): TextHitInfo = ???

    /** Returns the hash code. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the leading edge of the character was
     *  hit.
     */
    @stub
    def isLeadingEdge(): Boolean = ???

    /** Returns a String representing the hit for debugging
     *  use only.
     */
    @stub
    def toString(): String = ???
}

object TextHitInfo {
    /** Creates a TextHitInfo at the specified offset,
     *  associated with the character after the offset.
     */
    @stub
    def afterOffset(offset: Int): TextHitInfo = ???

    /** Creates a TextHitInfo at the specified offset,
     *  associated with the character before the offset.
     */
    @stub
    def beforeOffset(offset: Int): TextHitInfo = ???

    /** Creates a TextHitInfo on the leading edge of the
     *  character at the specified charIndex.
     */
    @stub
    def leading(charIndex: Int): TextHitInfo = ???

    /** Creates a hit on the trailing edge of the character at
     *  the specified charIndex.
     */
    @stub
    def trailing(charIndex: Int): TextHitInfo = ???
}
