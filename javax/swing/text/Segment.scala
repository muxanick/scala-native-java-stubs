package javax.swing.text

import java.lang.{CharSequence, Cloneable, Object, String}
import java.text.CharacterIterator
import scala.scalanative.annotation.stub

/** A segment of a character array representing a fragment
 *  of text.  It should be treated as immutable even though
 *  the array is directly accessible.  This gives fast access
 *  to fragments of text without the overhead of copying
 *  around characters.  This is effectively an unprotected
 *  String.
 *  
 *  The Segment implements the java.text.CharacterIterator
 *  interface to support use with the i18n support without
 *  copying text into a string.
 */
class Segment extends Object with Cloneable with CharacterIterator with CharSequence {

    /** Creates a new segment. */
    @stub
    def this() = ???

    /** Creates a new segment referring to an existing array. */
    @stub
    def this(array: Array[Char], offset: Int, count: Int) = ???

    /** This is the array containing the text of
     *  interest.
     */
    @stub
    val array: Array[Char] = ???

    /** This is the number of array elements that
     *  make up the text of interest.
     */
    @stub
    val count: Int = ???

    /** This is the offset into the array that
     *  the desired text begins.
     */
    @stub
    val offset: Int = ???

    /** Returns the char value at the specified index. */
    @stub
    def charAt(index: Int): Char = ???

    /** Creates a shallow copy. */
    @stub
    def clone(): Object = ???

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

    /** Flag to indicate that partial returns are valid. */
    @stub
    def isPartialReturn(): Boolean = ???

    /** Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty)
     *  and returns the character at that position.
     */
    @stub
    def last(): Char = ???

    /** Returns the length of this character sequence. */
    @stub
    def length(): Int = ???

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

    /** Flag to indicate that partial returns are valid. */
    @stub
    def setPartialReturn(p: Boolean): Unit = ???

    /** Returns a CharSequence that is a subsequence of this sequence. */
    @stub
    def subSequence(start: Int, end: Int): CharSequence = ???

    /** Converts a segment into a String. */
    @stub
    def toString(): String = ???
}
