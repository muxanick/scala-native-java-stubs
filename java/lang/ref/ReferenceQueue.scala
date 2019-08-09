package java.lang.ref

import java.lang.Object

/** Reference queues, to which registered reference objects are appended by the
 *  garbage collector after the appropriate reachability changes are detected.
 */
class ReferenceQueue[T] extends Object {

    /** Polls this queue to see if a reference object is available. */
    @stub
    def poll(): Reference[_ <: T] = ???

    /** Removes the next reference object in this queue, blocking until one
     *  becomes available.
     */
    @stub
    def remove(): Reference[_ <: T] = ???
}
