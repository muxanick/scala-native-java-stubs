package java.util.concurrent

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.{AbstractCollection, AbstractSet, Collection, Comparator, Iterator, NavigableSet, SortedSet, Spliterator}
import scala.scalanative.annotation.stub

/** A scalable concurrent NavigableSet implementation based on
 *  a ConcurrentSkipListMap.  The elements of the set are kept
 *  sorted according to their natural ordering,
 *  or by a Comparator provided at set creation time, depending
 *  on which constructor is used.
 * 
 *  This implementation provides expected average log(n) time
 *  cost for the contains, add, and remove
 *  operations and their variants.  Insertion, removal, and access
 *  operations safely execute concurrently by multiple threads.
 * 
 *  Iterators and spliterators are
 *  weakly consistent.
 * 
 *  Ascending ordered views and their iterators are faster than
 *  descending ones.
 * 
 *  Beware that, unlike in most collections, the size
 *  method is not a constant-time operation. Because of the
 *  asynchronous nature of these sets, determining the current number
 *  of elements requires a traversal of the elements, and so may report
 *  inaccurate results if this collection is modified during traversal.
 *  Additionally, the bulk operations addAll,
 *  removeAll, retainAll, containsAll,
 *  equals, and toArray are not guaranteed
 *  to be performed atomically. For example, an iterator operating
 *  concurrently with an addAll operation might view only some
 *  of the added elements.
 * 
 *  This class and its iterators implement all of the
 *  optional methods of the Set and Iterator
 *  interfaces. Like most other concurrent collection implementations,
 *  this class does not permit the use of null elements,
 *  because null arguments and return values cannot be reliably
 *  distinguished from the absence of elements.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class ConcurrentSkipListSet[E] extends AbstractSet[E] with NavigableSet[E] with Cloneable with Serializable {

    /** Constructs a new, empty set that orders its elements according to
     *  their natural ordering.
     */
    @stub
    def this() = ???

    /** Constructs a new set containing the elements in the specified
     *  collection, that orders its elements according to their
     *  natural ordering.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Constructs a new, empty set that orders its elements according to
     *  the specified comparator.
     */
    @stub
    def this(comparator: Comparator[_ >: E]) = ???

    /** Constructs a new set containing the same elements and using the
     *  same ordering as the specified sorted set.
     */
    @stub
    def this(s: SortedSet[E]) = ???

    /** Adds the specified element to this set if it is not already present. */
    @stub
    def add(e: E): Boolean = ???

    /** Returns the least element in this set greater than or equal to
     *  the given element, or null if there is no such element.
     */
    @stub
    def ceiling(e: E): E = ???

    /** Removes all of the elements from this set. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this ConcurrentSkipListSet
     *  instance.
     */
    @stub
    def clone(): ConcurrentSkipListSet[E] = ???

    /** Returns the comparator used to order the elements in this set,
     *  or null if this set uses the natural ordering of its elements.
     */
    @stub
    def comparator(): Comparator[_ >: E] = ???

    /** Returns true if this set contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Returns an iterator over the elements in this set in descending order. */
    @stub
    def descendingIterator(): Iterator[E] = ???

    /** Returns a reverse order view of the elements contained in this set. */
    @stub
    def descendingSet(): NavigableSet[E] = ???

    /** Compares the specified object with this set for equality. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the first (lowest) element currently in this set. */
    @stub
    def first(): E = ???

    /** Returns the greatest element in this set less than or equal to
     *  the given element, or null if there is no such element.
     */
    @stub
    def floor(e: E): E = ???

    /** Returns a view of the portion of this set whose elements are
     *  strictly less than toElement.
     */
    @stub
    def headSet(toElement: E): NavigableSet[E] = ???

    /** Returns a view of the portion of this set whose elements are less than
     *  (or equal to, if inclusive is true) toElement.
     */
    @stub
    def headSet(toElement: E, inclusive: Boolean): NavigableSet[E] = ???

    /** Returns the least element in this set strictly greater than the
     *  given element, or null if there is no such element.
     */
    @stub
    def higher(e: E): E = ???

    /** Returns true if this set contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this set in ascending order. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Returns the last (highest) element currently in this set. */
    @stub
    def last(): E = ???

    /** Returns the greatest element in this set strictly less than the
     *  given element, or null if there is no such element.
     */
    @stub
    def lower(e: E): E = ???

    /** Retrieves and removes the first (lowest) element,
     *  or returns null if this set is empty.
     */
    @stub
    def pollFirst(): E = ???

    /** Retrieves and removes the last (highest) element,
     *  or returns null if this set is empty.
     */
    @stub
    def pollLast(): E = ???

    /** Removes the specified element from this set if it is present. */
    @stub
    def remove(o: Object): Boolean = ???

    /** Removes from this set all of its elements that are contained in
     *  the specified collection.
     */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Returns the number of elements in this set. */
    @stub
    def size(): Int = ???

    /** Returns a Spliterator over the elements in this set. */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns a view of the portion of this set whose elements range from
     *  fromElement to toElement.
     */
    @stub
    def subSet(fromElement: E, fromInclusive: Boolean, toElement: E, toInclusive: Boolean): NavigableSet[E] = ???

    /** Returns a view of the portion of this set whose elements range
     *  from fromElement, inclusive, to toElement,
     *  exclusive.
     */
    @stub
    def subSet(fromElement: E, toElement: E): NavigableSet[E] = ???

    /** Returns a view of the portion of this set whose elements are
     *  greater than or equal to fromElement.
     */
    @stub
    def tailSet(fromElement: E): NavigableSet[E] = ???

    /** Returns a view of the portion of this set whose elements are greater
     *  than (or equal to, if inclusive is true) fromElement.
     */
    @stub
    def tailSet(fromElement: E, inclusive: Boolean): NavigableSet[E] = ???
}
