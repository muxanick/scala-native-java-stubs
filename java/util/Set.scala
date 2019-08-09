package java.util

import java.lang.Object

/** A collection that contains no duplicate elements.  More formally, sets
 *  contain no pair of elements e1 and e2 such that
 *  e1.equals(e2), and at most one null element.  As implied by
 *  its name, this interface models the mathematical set abstraction.
 * 
 *  The Set interface places additional stipulations, beyond those
 *  inherited from the Collection interface, on the contracts of all
 *  constructors and on the contracts of the add, equals and
 *  hashCode methods.  Declarations for other inherited methods are
 *  also included here for convenience.  (The specifications accompanying these
 *  declarations have been tailored to the Set interface, but they do
 *  not contain any additional stipulations.)
 * 
 *  The additional stipulation on constructors is, not surprisingly,
 *  that all constructors must create a set that contains no duplicate elements
 *  (as defined above).
 * 
 *  Note: Great care must be exercised if mutable objects are used as set
 *  elements.  The behavior of a set is not specified if the value of an object
 *  is changed in a manner that affects equals comparisons while the
 *  object is an element in the set.  A special case of this prohibition is
 *  that it is not permissible for a set to contain itself as an element.
 * 
 *  Some set implementations have restrictions on the elements that
 *  they may contain.  For example, some implementations prohibit null elements,
 *  and some have restrictions on the types of their elements.  Attempting to
 *  add an ineligible element throws an unchecked exception, typically
 *  NullPointerException or ClassCastException.  Attempting
 *  to query the presence of an ineligible element may throw an exception,
 *  or it may simply return false; some implementations will exhibit the former
 *  behavior and some will exhibit the latter.  More generally, attempting an
 *  operation on an ineligible element whose completion would not result in
 *  the insertion of an ineligible element into the set may throw an
 *  exception or it may succeed, at the option of the implementation.
 *  Such exceptions are marked as "optional" in the specification for this
 *  interface.
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait Set[E] extends Collection[E] {

    /** Adds the specified element to this set if it is not already present
     *  (optional operation).
     */
    @stub
    def add(e: E): Boolean = ???

    /** Adds all of the elements in the specified collection to this set if
     *  they're not already present (optional operation).
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Removes all of the elements from this set (optional operation). */
    @stub
    def clear(): Unit = ???

    /** Returns true if this set contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Returns true if this set contains all of the elements of the
     *  specified collection.
     */
    @stub
    def containsAll(c: Collection[_]): Boolean = ???

    /** Compares the specified object with this set for equality. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the hash code value for this set. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this set contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this set. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Removes the specified element from this set if it is present
     *  (optional operation).
     */
    @stub
    def remove(o: Object): Boolean = ???

    /** Removes from this set all of its elements that are contained in the
     *  specified collection (optional operation).
     */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Retains only the elements in this set that are contained in the
     *  specified collection (optional operation).
     */
    @stub
    def retainAll(c: Collection[_]): Boolean = ???

    /** Returns the number of elements in this set (its cardinality). */
    @stub
    def size(): Int = ???

    /** Creates a Spliterator over the elements in this set. */
    @stub
    val Spliterator[E]: default = ???

    /** Returns an array containing all of the elements in this set. */
    @stub
    def toArray(): Array[Object] = ???
}
