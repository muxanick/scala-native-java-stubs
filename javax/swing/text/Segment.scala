package javax.swing.text

import java.lang.{CharSequence, Cloneable, Object}
import java.text.CharacterIterator

// A segment of a character array representing a fragment
// of text.  It should be treated as immutable even though
// the array is directly accessible.  This gives fast access
// to fragments of text without the overhead of copying
// around characters.  This is effectively an unprotected
// String.
// 
// The Segment implements the java.text.CharacterIterator
// interface to support use with the i18n support without
// copying text into a string.
class Segment extends Object with Cloneable, with CharacterIterator, with CharSequence {

    @stub
    // Creates a new segment.
    def this() = ???

    @stub
    // This is the array containing the text of
    // interest.
    def array: Array[Char] = ???

    @stub
    // This is the number of array elements that
    // make up the text of interest.
    def count: Int = ???

    @stub
    // Returns the char value at the specified index.
    def charAt(index: Int): Char = ???

    @stub
    // Creates a shallow copy.
    def clone(): Object = ???

    @stub
    // Gets the character at the current position (as returned by getIndex()).
    def current(): Char = ???

    @stub
    // Sets the position to getBeginIndex() and returns the character at that
    // position.
    def first(): Char = ???

    @stub
    // Returns the start index of the text.
    def getBeginIndex(): Int = ???

    @stub
    // Returns the end index of the text.
    def getEndIndex(): Int = ???

    @stub
    // Returns the current index.
    def getIndex(): Int = ???

    @stub
    // Flag to indicate that partial returns are valid.
    def isPartialReturn(): Boolean = ???

    @stub
    // Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty)
    // and returns the character at that position.
    def last(): Char = ???

    @stub
    // Returns the length of this character sequence.
    def length(): Int = ???

    @stub
    // Increments the iterator's index by one and returns the character
    // at the new index.
    def next(): Char = ???

    @stub
    // Decrements the iterator's index by one and returns the character
    // at the new index.
    def previous(): Char = ???

    @stub
    // Sets the position to the specified position in the text and returns that
    // character.
    def setIndex(position: Int): Char = ???

    @stub
    // Flag to indicate that partial returns are valid.
    def setPartialReturn(p: Boolean): Unit = ???

    @stub
    // Returns a CharSequence that is a subsequence of this sequence.
    def subSequence(start: Int, end: Int): CharSequence = ???
}
