package java.text

import java.lang.{Object, String}

// StringCharacterIterator implements the
// CharacterIterator protocol for a String.
// The StringCharacterIterator class iterates over the
// entire String.
final class StringCharacterIterator extends Object with CharacterIterator {

    @stub
    // Constructs an iterator with an initial index of 0.
    def this(text: String) = ???

    @stub
    // Constructs an iterator with the specified initial index.
    def this(text: String, pos: Int) = ???

    @stub
    // Creates a copy of this iterator.
    def clone(): Object = ???

    @stub
    // Implements CharacterIterator.current() for String.
    def current(): Char = ???

    @stub
    // Compares the equality of two StringCharacterIterator objects.
    def equals(obj: Object): Boolean = ???

    @stub
    // Implements CharacterIterator.first() for String.
    def first(): Char = ???

    @stub
    // Implements CharacterIterator.getBeginIndex() for String.
    def getBeginIndex(): Int = ???

    @stub
    // Implements CharacterIterator.getEndIndex() for String.
    def getEndIndex(): Int = ???

    @stub
    // Implements CharacterIterator.getIndex() for String.
    def getIndex(): Int = ???

    @stub
    // Computes a hashcode for this iterator.
    def hashCode(): Int = ???

    @stub
    // Implements CharacterIterator.last() for String.
    def last(): Char = ???

    @stub
    // Implements CharacterIterator.next() for String.
    def next(): Char = ???

    @stub
    // Implements CharacterIterator.previous() for String.
    def previous(): Char = ???

    @stub
    // Implements CharacterIterator.setIndex() for String.
    def setIndex(p: Int): Char = ???
}
