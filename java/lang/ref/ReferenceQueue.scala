package java.lang.ref

import java.lang.Object

// Reference queues, to which registered reference objects are appended by the
// garbage collector after the appropriate reachability changes are detected.
class ReferenceQueue[T] extends Object {

    @stub
    // Polls this queue to see if a reference object is available.
    def poll(): Reference[_ <: T] = ???

    @stub
    // Removes the next reference object in this queue, blocking until one
    // becomes available.
    def remove(): Reference[_ <: T] = ???
}
