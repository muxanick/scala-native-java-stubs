package java.text

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** This interface defines a protocol for bidirectional iteration over text.
 *  The iterator iterates over a bounded sequence of characters.  Characters
 *  are indexed with values beginning with the value returned by getBeginIndex() and
 *  continuing through the value returned by getEndIndex()-1.
 *  
 *  Iterators maintain a current character index, whose valid range is from
 *  getBeginIndex() to getEndIndex(); the value getEndIndex() is included to allow
 *  handling of zero-length text ranges and for historical reasons.
 *  The current index can be retrieved by calling getIndex() and set directly
 *  by calling setIndex(), first(), and last().
 *  
 *  The methods previous() and next() are used for iteration. They return DONE if
 *  they would move outside the range from getBeginIndex() to getEndIndex() -1,
 *  signaling that the iterator has reached the end of the sequence. DONE is
 *  also returned by other methods to indicate that the current index is
 *  outside this range.
 * 
 *  Examples:
 * 
 *  Traverse the text from start to finish
 *  
 *  public void traverseForward(CharacterIterator iter) {
 *      for(char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
 *          processChar(c);
 *      }
 *  }
 *  
 * 
 *  Traverse the text backwards, from end to start
 *  
 *  public void traverseBackward(CharacterIterator iter) {
 *      for(char c = iter.last(); c != CharacterIterator.DONE; c = iter.previous()) {
 *          processChar(c);
 *      }
 *  }
 *  
 * 
 *  Traverse both forward and backward from a given position in the text.
 *  Calls to notBoundary() in this example represents some
 *  additional stopping criteria.
 *  
 *  public void traverseOut(CharacterIterator iter, int pos) {
 *      for (char c = iter.setIndex(pos);
 *               c != CharacterIterator.DONE && notBoundary(c);
 *               c = iter.next()) {
 *      }
 *      int end = iter.getIndex();
 *      for (char c = iter.setIndex(pos);
 *              c != CharacterIterator.DONE && notBoundary(c);
 *              c = iter.previous()) {
 *      }
 *      int start = iter.getIndex();
 *      processSection(start, end);
 *  }
 *  
 */
trait CharacterIterator extends Cloneable {

    /** Create a copy of this iterator */
    @stub
    def clone(): Any = ???

    /** Gets the character at the current position (as returned by getIndex()). */
    @stub
    def current(): Char = ???

    /** Sets the position to getBeginIndex() and returns the character at that
     *  position.
     */
    @stub
    def first(): Char = ???

    /** Returns the start index of the text. */
    @stub
    def getBeginIndex(): Int = ???

    /** Returns the end index of the text. */
    @stub
    def getEndIndex(): Int = ???

    /** Returns the current index. */
    @stub
    def getIndex(): Int = ???

    /** Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty)
     *  and returns the character at that position.
     */
    @stub
    def last(): Char = ???

    /** Increments the iterator's index by one and returns the character
     *  at the new index.
     */
    @stub
    def next(): Char = ???

    /** Decrements the iterator's index by one and returns the character
     *  at the new index.
     */
    @stub
    def previous(): Char = ???

    /** Sets the position to the specified position in the text and returns that
     *  character.
     */
    @stub
    def setIndex(position: Int): Char = ???
}

object CharacterIterator {
    /** Constant that is returned when the iterator has reached either the end
     *  or the beginning of the text.
     */
    @stub
    val DONE: Char = ???
}
