package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractSet, Collection, Iterator, Spliterator}
import java.util.function.{Consumer, Predicate}

// A Set that uses an internal CopyOnWriteArrayList
// for all of its operations.  Thus, it shares the same basic properties:
// 
//  It is best suited for applications in which set sizes generally
//       stay small, read-only operations
//       vastly outnumber mutative operations, and you need
//       to prevent interference among threads during traversal.
//  It is thread-safe.
//  Mutative operations (add, set, remove, etc.)
//      are expensive since they usually entail copying the entire underlying
//      array.
//  Iterators do not support the mutative remove operation.
//  Traversal via iterators is fast and cannot encounter
//      interference from other threads. Iterators rely on
//      unchanging snapshots of the array at the time the iterators were
//      constructed.
// 
//
// Sample Usage. The following code sketch uses a
// copy-on-write set to maintain a set of Handler objects that
// perform some action upon state updates.
//
//   
// class Handler { void handle(); ... }
//
// class X {
//   private final CopyOnWriteArraySet<Handler> handlers
//     = new CopyOnWriteArraySet<Handler>();
//   public void addHandler(Handler h) { handlers.add(h); }
//
//   private long internalState;
//   private synchronized void changeState() { internalState = ...; }
//
//   public void update() {
//     changeState();
//     for (Handler handler : handlers)
//       handler.handle();
//   }
// }
//
// This class is a member of the
// 
// Java Collections Framework.
class CopyOnWriteArraySet[E] extends AbstractSet[E] with Serializable {

    @stub
    // Creates an empty set.
    def this() = ???

    @stub
    // Adds the specified element to this set if it is not already present.
    def add(e: E): Boolean = ???

    @stub
    // Adds all of the elements in the specified collection to this set if
    // they're not already present.
    def addAll(c: Collection[_ <: E]): Boolean = ???

    @stub
    // Removes all of the elements from this set.
    def clear(): Unit = ???

    @stub
    // Returns true if this set contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns true if this set contains all of the elements of the
    // specified collection.
    def containsAll(c: Collection[_]): Boolean = ???

    @stub
    // Compares the specified object with this set for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Performs the given action for each element of the Iterable
    // until all elements have been processed or the action throws an
    // exception.
    def forEach(action: Consumer[_ >: E]): Unit = ???

    @stub
    // Returns true if this set contains no elements.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements contained in this set
    // in the order in which these elements were added.
    def iterator(): Iterator[E] = ???

    @stub
    // Removes the specified element from this set if it is present.
    def remove(o: Object): Boolean = ???

    @stub
    // Removes from this set all of its elements that are contained in the
    // specified collection.
    def removeAll(c: Collection[_]): Boolean = ???

    @stub
    // Removes all of the elements of this collection that satisfy the given
    // predicate.
    def removeIf(filter: Predicate[_ >: E]): Boolean = ???

    @stub
    // Retains only the elements in this set that are contained in the
    // specified collection.
    def retainAll(c: Collection[_]): Boolean = ???

    @stub
    // Returns the number of elements in this set.
    def size(): Int = ???

    @stub
    // Returns a Spliterator over the elements in this set in the order
    // in which these elements were added.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns an array containing all of the elements in this set.
    def toArray(): Array[Object] = ???
}
