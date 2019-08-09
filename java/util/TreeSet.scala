package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}

// A NavigableSet implementation based on a TreeMap.
// The elements are ordered using their natural
// ordering, or by a Comparator provided at set creation
// time, depending on which constructor is used.
//
// This implementation provides guaranteed log(n) time cost for the basic
// operations (add, remove and contains).
//
// Note that the ordering maintained by a set (whether or not an explicit
// comparator is provided) must be consistent with equals if it is to
// correctly implement the Set interface.  (See Comparable
// or Comparator for a precise definition of consistent with
// equals.)  This is so because the Set interface is defined in
// terms of the equals operation, but a TreeSet instance
// performs all element comparisons using its compareTo (or
// compare) method, so two elements that are deemed equal by this method
// are, from the standpoint of the set, equal.  The behavior of a set
// is well-defined even if its ordering is inconsistent with equals; it
// just fails to obey the general contract of the Set interface.
//
// Note that this implementation is not synchronized.
// If multiple threads access a tree set concurrently, and at least one
// of the threads modifies the set, it must be synchronized
// externally.  This is typically accomplished by synchronizing on some
// object that naturally encapsulates the set.
// If no such object exists, the set should be "wrapped" using the
// Collections.synchronizedSortedSet
// method.  This is best done at creation time, to prevent accidental
// unsynchronized access to the set: 
//   SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
//
// The iterators returned by this class's iterator method are
// fail-fast: if the set is modified at any time after the iterator is
// created, in any way except through the iterator's own remove
// method, the iterator will throw a ConcurrentModificationException.
// Thus, in the face of concurrent modification, the iterator fails quickly
// and cleanly, rather than risking arbitrary, non-deterministic behavior at
// an undetermined time in the future.
//
// Note that the fail-fast behavior of an iterator cannot be guaranteed
// as it is, generally speaking, impossible to make any hard guarantees in the
// presence of unsynchronized concurrent modification.  Fail-fast iterators
// throw ConcurrentModificationException on a best-effort basis.
// Therefore, it would be wrong to write a program that depended on this
// exception for its correctness:   the fail-fast behavior of iterators
// should be used only to detect bugs.
//
// This class is a member of the
// 
// Java Collections Framework.
class TreeSet[E] extends AbstractSet[E] with NavigableSet[E], with Cloneable, with Serializable {

    @stub
    // Constructs a new, empty tree set, sorted according to the
    // natural ordering of its elements.
    def this() = ???

    @stub
    // Constructs a new tree set containing the elements in the specified
    // collection, sorted according to the natural ordering of its
    // elements.
    def this(c: Collection[_ <: E]) = ???

    @stub
    // Constructs a new, empty tree set, sorted according to the specified
    // comparator.
    def this(comparator: Comparator[_ >: E]) = ???

    @stub
    // Adds the specified element to this set if it is not already present.
    def add(e: E): Boolean = ???

    @stub
    // Adds all of the elements in the specified collection to this set.
    def addAll(c: Collection[_ <: E]): Boolean = ???

    @stub
    // Returns the least element in this set greater than or equal to
    // the given element, or null if there is no such element.
    def ceiling(e: E): E = ???

    @stub
    // Removes all of the elements from this set.
    def clear(): Unit = ???

    @stub
    // Returns a shallow copy of this TreeSet instance.
    def clone(): Object = ???

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
    // Returns the first (lowest) element currently in this set.
    def first(): E = ???

    @stub
    // Returns the greatest element in this set less than or equal to
    // the given element, or null if there is no such element.
    def floor(e: E): E = ???

    @stub
    // Returns a view of the portion of this set whose elements are
    // strictly less than toElement.
    def headSet(toElement: E): SortedSet[E] = ???

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
    // Returns the number of elements in this set (its cardinality).
    def size(): Int = ???

    @stub
    // Creates a late-binding
    // and fail-fast Spliterator over the elements in this
    // set.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns a view of the portion of this set whose elements range from
    // fromElement to toElement.
    def subSet(fromElement: E, fromInclusive: Boolean, toElement: E, toInclusive: Boolean): NavigableSet[E] = ???

    @stub
    // Returns a view of the portion of this set whose elements range
    // from fromElement, inclusive, to toElement,
    // exclusive.
    def subSet(fromElement: E, toElement: E): SortedSet[E] = ???

    @stub
    // Returns a view of the portion of this set whose elements are
    // greater than or equal to fromElement.
    def tailSet(fromElement: E): SortedSet[E] = ???
}
