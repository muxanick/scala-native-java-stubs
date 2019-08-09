package java.lang.ref

import java.lang.Object
import scala.scalanative.annotation.stub

/** Phantom reference objects, which are enqueued after the collector
 *  determines that their referents may otherwise be reclaimed.  Phantom
 *  references are most often used for scheduling pre-mortem cleanup actions in
 *  a more flexible way than is possible with the Java finalization mechanism.
 * 
 *   If the garbage collector determines at a certain point in time that the
 *  referent of a phantom reference is phantom reachable, then at that
 *  time or at some later time it will enqueue the reference.
 * 
 *   In order to ensure that a reclaimable object remains so, the referent of
 *  a phantom reference may not be retrieved: The get method of a
 *  phantom reference always returns null.
 * 
 *   Unlike soft and weak references, phantom references are not
 *  automatically cleared by the garbage collector as they are enqueued.  An
 *  object that is reachable via phantom references will remain so until all
 *  such references are cleared or themselves become unreachable.
 */
class PhantomReference[T] extends Reference[T] {

    /** Creates a new phantom reference that refers to the given object and
     *  is registered with the given queue.
     */
    @stub
    def this(referent: T, q: ReferenceQueue[_ >: T]) = ???

    /** Returns this reference object's referent. */
    @stub
    def get(): T = ???
}
