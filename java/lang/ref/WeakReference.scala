package java.lang.ref

import java.lang.Object
import scala.scalanative.annotation.stub

/** Weak reference objects, which do not prevent their referents from being
 *  made finalizable, finalized, and then reclaimed.  Weak references are most
 *  often used to implement canonicalizing mappings.
 * 
 *   Suppose that the garbage collector determines at a certain point in time
 *  that an object is weakly
 *  reachable.  At that time it will atomically clear all weak references to
 *  that object and all weak references to any other weakly-reachable objects
 *  from which that object is reachable through a chain of strong and soft
 *  references.  At the same time it will declare all of the formerly
 *  weakly-reachable objects to be finalizable.  At the same time or at some
 *  later time it will enqueue those newly-cleared weak references that are
 *  registered with reference queues.
 */
class WeakReference[T] extends Reference[T] {

    /** Creates a new weak reference that refers to the given object. */
    @stub
    def this(referent: T) = ???

    /** Creates a new weak reference that refers to the given object and is
     *  registered with the given queue.
     */
    @stub
    def this(referent: T, q: ReferenceQueue[_ >: T]) = ???
}
