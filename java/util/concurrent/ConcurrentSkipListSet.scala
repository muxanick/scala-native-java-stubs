package java.util.concurrent

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.{AbstractCollection, AbstractSet, Collection, Comparator, Iterator, NavigableSet, Spliterator}

// A scalable concurrent NavigableSet implementation based on
// a ConcurrentSkipListMap.  The elements of the set are kept
// sorted according to their natural ordering,
// or by a Comparator provided at set creation time, depending
// on which constructor is used.
//
// This implementation provides expected average log(n) time
// cost for the contains, add, and remove
// operations and their variants.  Insertion, removal, and access
// operations safely execute concurrently by multiple threads.
//
// Iterators and spliterators are
// weakly consistent.
//
// Ascending ordered views and their iterators are faster than
// descending ones.
//
// Beware that, unlike in most collections, the size
// method is not a constant-time operation. Because of the
// asynchronous nature of these sets, determining the current number
// of elements requires a traversal of the elements, and so may report
// inaccurate results if this collection is modified during traversal.
// Additionally, the bulk operations addAll,
// removeAll, retainAll, containsAll,
// equals, and toArray are not guaranteed
// to be performed atomically. For example, an iterator operating
// concurrently with an addAll operation might view only some
// of the added elements.
//
// This class and its iterators implement all of the
// optional methods of the Set and Iterator
// interfaces. Like most other concurrent collection implementations,
// this class does not permit the use of null elements,
// because null arguments and return values cannot be reliably
// distinguished from the absence of elements.
//
// This class is a member of the
// 
// Java Collections Framework.
class ConcurrentSkipListSet[E] extends AbstractSet[E] with NavigableSet[E], with Cloneable, with Serializable {

    @stub
    // Constructs a new, empty set that orders its elements according to
    // their natural ordering.
    def this() = ???

    @stub
    // Constructs a new set containing the elements in the specified
    // collection, that orders its elements according to their
    // natural ordering.
    def this(c: Collection[_ <: E]) = ???

    @stub
    // Constructs a new, empty set that orders its elements according to
    // the specified comparator.
    def this(comparator: Comparator[_ >: E]) = ???

    @stub
    // Adds the specified element to this set if it is not already present.
    def add(e: E): Boolean = ???

    @stub
    // Returns the least element in this set greater than or equal to
    // the given element, or null if there is no such element.
    def ceiling(e: E): E = ???

    @stub
    // Removes all of the elements from this set.
    def clear(): Unit = ???

    @stub
    // Returns a shallow copy of this ConcurrentSkipListSet
    // instance.
    def clone(): ConcurrentSkipListSet[E] = ???

    @stub
    // Returns the comparator used to order the elements in this set,
    // or null if this set uses the natural ordering of its elements.
    def comparator(): Comparator[_ >: E] = ???

    @stub
    // Returns true if this set contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns an iterator over the elements in this set in descending order.
    def descendingIterator(): Iterator[E] = ???

    @stub
    // Returns a reverse order view of the elements contained in this set.
    def descendingSet(): NavigableSet[E] = ???

    @stub
    // Compares the specified object with this set for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the first (lowest) element currently in this set.
    def first(): E = ???

    @stub
    // Returns the greatest element in this set less than or equal to
    // the given element, or null if there is no such element.
    def floor(e: E): E = ???

    @stub
    // Returns a view of the portion of this set whose elements are
    // strictly less than toElement.
    def headSet(toElement: E): NavigableSet[E] = ???

    @stub
    // Returns a view of the portion of this set whose elements are less than
    // (or equal to, if inclusive is true) toElement.
    def headSet(toElement: E, inclusive: Boolean): NavigableSet[E] = ???

    @stub
    // Returns the least element in this set strictly greater than the
    // given element, or null if there is no such element.
    def higher(e: E): E = ???

    @stub
    // Returns true if this set contains no elements.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements in this set in ascending order.
    def iterator(): Iterator[E] = ???

    @stub
    // Returns the last (highest) element currently in this set.
    def last(): E = ???

    @stub
    // Returns the greatest element in this set strictly less than the
    // given element, or null if there is no such element.
    def lower(e: E): E = ???

    @stub
    // Retrieves and removes the first (lowest) element,
    // or returns null if this set is empty.
    def pollFirst(): E = ???

    @stub
    // Retrieves and removes the last (highest) element,
    // or returns null if this set is empty.
    def pollLast(): E = ???

    @stub
    // Removes the specified element from this set if it is present.
    def remove(o: Object): Boolean = ???

    @stub
    // Removes from this set all of its elements that are contained in
    // the specified collection.
    def removeAll(c: Collection[_]): Boolean = ???

    @stub
    // Returns the number of elements in this set.
    def size(): Int = ???

    @stub
    // Returns a Spliterator over the elements in this set.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns a view of the portion of this set whose elements range from
    // fromElement to toElement.
    def subSet(fromElement: E, fromInclusive: Boolean, toElement: E, toInclusive: Boolean): NavigableSet[E] = ???

    @stub
    // Returns a view of the portion of this set whose elements range
    // from fromElement, inclusive, to toElement,
    // exclusive.
    def subSet(fromElement: E, toElement: E): NavigableSet[E] = ???

    @stub
    // Returns a view of the portion of this set whose elements are
    // greater than or equal to fromElement.
    def tailSet(fromElement: E): NavigableSet[E] = ???
}
