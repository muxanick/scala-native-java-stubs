package java.text

import java.lang.{Object, String}

/** StringCharacterIterator implements the
 *  CharacterIterator protocol for a String.
 *  The StringCharacterIterator class iterates over the
 *  entire String.
 */
final class StringCharacterIterator extends Object with CharacterIterator {

    /** Constructs an iterator with an initial index of 0. */
    @stub
    def this(text: String) = ???

    /** Constructs an iterator with the specified initial index. */
    @stub
    def this(text: String, pos: Int) = ???

    /** Creates a copy of this iterator. */
    @stub
    def clone(): Object = ???

    /** Implements CharacterIterator.current() for String. */
    @stub
    def current(): Char = ???

    /** Compares the equality of two StringCharacterIterator objects. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Implements CharacterIterator.first() for String. */
    @stub
    def first(): Char = ???

    /** Implements CharacterIterator.getBeginIndex() for String. */
    @stub
    def getBeginIndex(): Int = ???

    /** Implements CharacterIterator.getEndIndex() for String. */
    @stub
    def getEndIndex(): Int = ???

    /** Implements CharacterIterator.getIndex() for String. */
    @stub
    def getIndex(): Int = ???

    /** Computes a hashcode for this iterator. */
    @stub
    def hashCode(): Int = ???

    /** Implements CharacterIterator.last() for String. */
    @stub
    def last(): Char = ???

    /** Implements CharacterIterator.next() for String. */
    @stub
    def next(): Char = ???

    /** Implements CharacterIterator.previous() for String. */
    @stub
    def previous(): Char = ???

    /** Implements CharacterIterator.setIndex() for String. */
    @stub
    def setIndex(p: Int): Char = ???
}
