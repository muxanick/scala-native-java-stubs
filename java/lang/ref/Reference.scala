package java.lang.ref

import java.lang.Object

/** Abstract base class for reference objects.  This class defines the
 *  operations common to all reference objects.  Because reference objects are
 *  implemented in close cooperation with the garbage collector, this class may
 *  not be subclassed directly.
 */
abstract class Reference[T] extends Object {

    /** Clears this reference object. */
    def clear(): Unit

    /** Adds this reference object to the queue with which it is registered,
     *  if any.
     */
    def enqueue(): Boolean

    /** Returns this reference object's referent. */
    def get(): T
}
