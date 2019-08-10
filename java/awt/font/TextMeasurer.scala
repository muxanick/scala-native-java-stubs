package java.awt.font

import java.lang.{Cloneable, Object}
import java.text.AttributedCharacterIterator
import scala.scalanative.annotation.stub

/** The TextMeasurer class provides the primitive operations
 *  needed for line break: measuring up to a given advance, determining the
 *  advance of a range of characters, and generating a
 *  TextLayout for a range of characters. It also provides
 *  methods for incremental editing of paragraphs.
 *  
 *  A TextMeasurer object is constructed with an
 *  AttributedCharacterIterator
 *  representing a single paragraph of text.  The value returned by the
 *  getBeginIndex
 *  method of AttributedCharacterIterator
 *  defines the absolute index of the first character.  The value
 *  returned by the
 *  getEndIndex
 *  method of AttributedCharacterIterator defines the index
 *  past the last character.  These values define the range of indexes to
 *  use in calls to the TextMeasurer.  For example, calls to
 *  get the advance of a range of text or the line break of a range of text
 *  must use indexes between the beginning and end index values.  Calls to
 *  insertChar
 *  and
 *  deleteChar
 *  reset the TextMeasurer to use the beginning index and end
 *  index of the AttributedCharacterIterator passed in those calls.
 *  
 *  Most clients will use the more convenient LineBreakMeasurer,
 *  which implements the standard line break policy (placing as many words
 *  as will fit on each line).
 */
final class TextMeasurer extends Object with Cloneable {

    /** Constructs a TextMeasurer from the source text. */
    @stub
    def this(text: AttributedCharacterIterator, frc: FontRenderContext) = ???

    /** Creates and returns a copy of this object. */
    @stub
    protected def clone(): Any = ???

    /** Updates the TextMeasurer after a single character has
     *  been deleted
     *  from the paragraph currently represented by this
     *  TextMeasurer.
     */
    @stub
    def deleteChar(newParagraph: AttributedCharacterIterator, deletePos: Int): Unit = ???

    /** Returns the graphical width of a line beginning at start
     *  and including characters up to limit.
     */
    @stub
    def getAdvanceBetween(start: Int, limit: Int): Float = ???

    /** Returns a TextLayout on the given character range. */
    @stub
    def getLayout(start: Int, limit: Int): TextLayout = ???

    /** Returns the index of the first character which will not fit on
     *  on a line beginning at start and possible
     *  measuring up to maxAdvance in graphical width.
     */
    @stub
    def getLineBreakIndex(start: Int, maxAdvance: Float): Int = ???

    /** Updates the TextMeasurer after a single character has
     *  been inserted
     *  into the paragraph currently represented by this
     *  TextMeasurer.
     */
    @stub
    def insertChar(newParagraph: AttributedCharacterIterator, insertPos: Int): Unit = ???
}
