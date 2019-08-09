package java.util

// An iterator for lists that allows the programmer
// to traverse the list in either direction, modify
// the list during iteration, and obtain the iterator's
// current position in the list. A ListIterator
// has no current element; its cursor position always
// lies between the element that would be returned by a call
// to previous() and the element that would be
// returned by a call to next().
// An iterator for a list of length n has n+1 possible
// cursor positions, as illustrated by the carets (^) below:
// 
//                      Element(0)   Element(1)   Element(2)   ... Element(n-1)
// cursor positions:  ^            ^            ^            ^                  ^
// 
// Note that the remove() and set(Object) methods are
// not defined in terms of the cursor position;  they are defined to
// operate on the last element returned by a call to next() or
// previous().
//
// This interface is a member of the
// 
// Java Collections Framework.
trait ListIterator[E] extends Iterator[E] {

    @stub
    // Inserts the specified element into the list (optional operation).
    def add(e: E): Unit = ???

    @stub
    // Returns true if this list iterator has more elements when
    // traversing the list in the forward direction.
    def hasNext(): Boolean = ???

    @stub
    // Returns true if this list iterator has more elements when
    // traversing the list in the reverse direction.
    def hasPrevious(): Boolean = ???

    @stub
    // Returns the next element in the list and advances the cursor position.
    def next(): E = ???

    @stub
    // Returns the index of the element that would be returned by a
    // subsequent call to next().
    def nextIndex(): Int = ???

    @stub
    // Returns the previous element in the list and moves the cursor
    // position backwards.
    def previous(): E = ???

    @stub
    // Returns the index of the element that would be returned by a
    // subsequent call to previous().
    def previousIndex(): Int = ???

    @stub
    // Removes from the list the last element that was returned by next() or previous() (optional operation).
    def remove(): Unit = ???
}
