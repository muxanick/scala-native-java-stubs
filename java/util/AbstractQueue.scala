package java.util

import java.lang.Object

// This class provides skeletal implementations of some Queue
// operations. The implementations in this class are appropriate when
// the base implementation does not allow null
// elements.  Methods add, remove, and
// element are based on offer, poll, and peek, respectively, but throw
// exceptions instead of indicating failure via false or
// null returns.
//
// A Queue implementation that extends this class must
// minimally define a method Queue.offer(E) which does not permit
// insertion of null elements, along with methods Queue.peek(), Queue.poll(), Collection.size(), and
// Collection.iterator().  Typically, additional methods will be
// overridden as well.  If these requirements cannot be met, consider
// instead subclassing AbstractCollection.
//
// This class is a member of the
// 
// Java Collections Framework.
abstract class AbstractQueue[E] extends AbstractCollection[E] with Queue[E] {

    // Inserts the specified element into this queue if it is possible to do so
    // immediately without violating capacity restrictions, returning
    // true upon success and throwing an IllegalStateException
    // if no space is currently available.
    def add(e: E): Boolean

    // Adds all of the elements in the specified collection to this
    // queue.
    def addAll(c: Collection[_ <: E]): Boolean

    // Removes all of the elements from this queue.
    def clear(): Unit

    // Retrieves, but does not remove, the head of this queue.
    def element(): E
}
