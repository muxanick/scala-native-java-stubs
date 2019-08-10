package java.util

import java.lang.{Iterable, Object}
import java.util.function.Predicate
import java.util.stream.Stream
import scala.scalanative.annotation.stub

/** The root interface in the collection hierarchy.  A collection
 *  represents a group of objects, known as its elements.  Some
 *  collections allow duplicate elements and others do not.  Some are ordered
 *  and others unordered.  The JDK does not provide any direct
 *  implementations of this interface: it provides implementations of more
 *  specific subinterfaces like Set and List.  This interface
 *  is typically used to pass collections around and manipulate them where
 *  maximum generality is desired.
 * 
 *  Bags or multisets (unordered collections that may contain
 *  duplicate elements) should implement this interface directly.
 * 
 *  All general-purpose Collection implementation classes (which
 *  typically implement Collection indirectly through one of its
 *  subinterfaces) should provide two "standard" constructors: a void (no
 *  arguments) constructor, which creates an empty collection, and a
 *  constructor with a single argument of type Collection, which
 *  creates a new collection with the same elements as its argument.  In
 *  effect, the latter constructor allows the user to copy any collection,
 *  producing an equivalent collection of the desired implementation type.
 *  There is no way to enforce this convention (as interfaces cannot contain
 *  constructors) but all of the general-purpose Collection
 *  implementations in the Java platform libraries comply.
 * 
 *  The "destructive" methods contained in this interface, that is, the
 *  methods that modify the collection on which they operate, are specified to
 *  throw UnsupportedOperationException if this collection does not
 *  support the operation.  If this is the case, these methods may, but are not
 *  required to, throw an UnsupportedOperationException if the
 *  invocation would have no effect on the collection.  For example, invoking
 *  the addAll(Collection) method on an unmodifiable collection may,
 *  but is not required to, throw the exception if the collection to be added
 *  is empty.
 * 
 *  
 *  Some collection implementations have restrictions on the elements that
 *  they may contain.  For example, some implementations prohibit null elements,
 *  and some have restrictions on the types of their elements.  Attempting to
 *  add an ineligible element throws an unchecked exception, typically
 *  NullPointerException or ClassCastException.  Attempting
 *  to query the presence of an ineligible element may throw an exception,
 *  or it may simply return false; some implementations will exhibit the former
 *  behavior and some will exhibit the latter.  More generally, attempting an
 *  operation on an ineligible element whose completion would not result in
 *  the insertion of an ineligible element into the collection may throw an
 *  exception or it may succeed, at the option of the implementation.
 *  Such exceptions are marked as "optional" in the specification for this
 *  interface.
 * 
 *  It is up to each collection to determine its own synchronization
 *  policy.  In the absence of a stronger guarantee by the
 *  implementation, undefined behavior may result from the invocation
 *  of any method on a collection that is being mutated by another
 *  thread; this includes direct invocations, passing the collection to
 *  a method that might perform invocations, and using an existing
 *  iterator to examine the collection.
 * 
 *  Many methods in Collections Framework interfaces are defined in
 *  terms of the equals method.  For example,
 *  the specification for the contains(Object o)
 *  method says: "returns true if and only if this collection
 *  contains at least one element e such that
 *  (o==null ? e==null : o.equals(e))."  This specification should
 *  not be construed to imply that invoking Collection.contains
 *  with a non-null argument o will cause o.equals(e) to be
 *  invoked for any element e.  Implementations are free to implement
 *  optimizations whereby the equals invocation is avoided, for
 *  example, by first comparing the hash codes of the two elements.  (The
 *  Object.hashCode() specification guarantees that two objects with
 *  unequal hash codes cannot be equal.)  More generally, implementations of
 *  the various Collections Framework interfaces are free to take advantage of
 *  the specified behavior of underlying Object methods wherever the
 *  implementor deems it appropriate.
 * 
 *  Some collection operations which perform recursive traversal of the
 *  collection may fail with an exception for self-referential instances where
 *  the collection directly or indirectly contains itself. This includes the
 *  clone(), equals(), hashCode() and toString()
 *  methods. Implementations may optionally handle the self-referential scenario,
 *  however most current implementations do not do so.
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait Collection[E] extends Iterable[E] {

    /** Ensures that this collection contains the specified element (optional
     *  operation).
     */
    @stub
    def add(e: E): Boolean = ???

    /** Adds all of the elements in the specified collection to this collection
     *  (optional operation).
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Removes all of the elements from this collection (optional operation). */
    @stub
    def clear(): Unit = ???

    /** Returns true if this collection contains the specified element. */
    @stub
    def contains(o: Any): Boolean = ???

    /** Returns true if this collection contains all of the elements
     *  in the specified collection.
     */
    @stub
    def containsAll(c: Collection[_]): Boolean = ???

    /** Compares the specified object with this collection for equality. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the hash code value for this collection. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this collection contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this collection. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Returns a possibly parallel Stream with this collection as its
     *  source.
     */
    @stub
    def parallelStream(): Stream[E] = ???

    /** Removes a single instance of the specified element from this
     *  collection, if it is present (optional operation).
     */
    @stub
    def remove(o: Any): Boolean = ???

    /** Removes all of this collection's elements that are also contained in the
     *  specified collection (optional operation).
     */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Removes all of the elements of this collection that satisfy the given
     *  predicate.
     */
    @stub
    def removeIf(filter: Predicate[_ >: E]): Boolean = ???

    /** Retains only the elements in this collection that are contained in the
     *  specified collection (optional operation).
     */
    @stub
    def retainAll(c: Collection[_]): Boolean = ???

    /** Returns the number of elements in this collection. */
    @stub
    def size(): Int = ???

    /** Creates a Spliterator over the elements in this collection. */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns a sequential Stream with this collection as its source. */
    @stub
    def stream(): Stream[E] = ???

    /** Returns an array containing all of the elements in this collection. */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this collection;
     *  the runtime type of the returned array is that of the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???
}
