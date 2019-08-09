package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}

/** A NavigableSet implementation based on a TreeMap.
 *  The elements are ordered using their natural
 *  ordering, or by a Comparator provided at set creation
 *  time, depending on which constructor is used.
 * 
 *  This implementation provides guaranteed log(n) time cost for the basic
 *  operations (add, remove and contains).
 * 
 *  Note that the ordering maintained by a set (whether or not an explicit
 *  comparator is provided) must be consistent with equals if it is to
 *  correctly implement the Set interface.  (See Comparable
 *  or Comparator for a precise definition of consistent with
 *  equals.)  This is so because the Set interface is defined in
 *  terms of the equals operation, but a TreeSet instance
 *  performs all element comparisons using its compareTo (or
 *  compare) method, so two elements that are deemed equal by this method
 *  are, from the standpoint of the set, equal.  The behavior of a set
 *  is well-defined even if its ordering is inconsistent with equals; it
 *  just fails to obey the general contract of the Set interface.
 * 
 *  Note that this implementation is not synchronized.
 *  If multiple threads access a tree set concurrently, and at least one
 *  of the threads modifies the set, it must be synchronized
 *  externally.  This is typically accomplished by synchronizing on some
 *  object that naturally encapsulates the set.
 *  If no such object exists, the set should be "wrapped" using the
 *  Collections.synchronizedSortedSet
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access to the set: 
 *    SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
 * 
 *  The iterators returned by this class's iterator method are
 *  fail-fast: if the set is modified at any time after the iterator is
 *  created, in any way except through the iterator's own remove
 *  method, the iterator will throw a ConcurrentModificationException.
 *  Thus, in the face of concurrent modification, the iterator fails quickly
 *  and cleanly, rather than risking arbitrary, non-deterministic behavior at
 *  an undetermined time in the future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness:   the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class TreeSet[E] extends AbstractSet[E] with NavigableSet[E] with Cloneable with Serializable {

    /** Constructs a new, empty tree set, sorted according to the
     *  natural ordering of its elements.
     */
    @stub
    def this() = ???

    /** Constructs a new tree set containing the elements in the specified
     *  collection, sorted according to the natural ordering of its
     *  elements.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Constructs a new, empty tree set, sorted according to the specified
     *  comparator.
     */
    @stub
    def this(comparator: Comparator[_ >: E]) = ???

    /** Adds the specified element to this set if it is not already present. */
    @stub
    def add(e: E): Boolean = ???

    /** Adds all of the elements in the specified collection to this set. */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Returns the least element in this set greater than or equal to
     *  the given element, or null if there is no such element.
     */
    @stub
    def ceiling(e: E): E = ???

    /** Removes all of the elements from this set. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this TreeSet instance. */
    @stub
    def clone(): Object = ???

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
    def headSet(toElement: E): SortedSet[E] = ???

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

    /** Returns the number of elements in this set (its cardinality). */
    @stub
    def size(): Int = ???

    /** Creates a late-binding
     *  and fail-fast Spliterator over the elements in this
     *  set.
     */
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
    def subSet(fromElement: E, toElement: E): SortedSet[E] = ???

    /** Returns a view of the portion of this set whose elements are
     *  greater than or equal to fromElement.
     */
    @stub
    def tailSet(fromElement: E): SortedSet[E] = ???
}
