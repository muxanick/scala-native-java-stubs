package java.util.concurrent.atomic

import java.lang.Object

/** An AtomicStampedReference maintains an object reference
 *  along with an integer "stamp", that can be updated atomically.
 * 
 *  Implementation note: This implementation maintains stamped
 *  references by creating internal objects representing "boxed"
 *  [reference, integer] pairs.
 */
class AtomicStampedReference[V] extends Object {

    /** Atomically sets the value of the stamp to the given update value
     *  if the current reference is == to the expected
     *  reference.
     */
    @stub
    def attemptStamp(expectedReference: V, newStamp: Int): Boolean = ???

    /** Atomically sets the value of both the reference and stamp
     *  to the given update values if the
     *  current reference is == to the expected reference
     *  and the current stamp is equal to the expected stamp.
     */
    @stub
    def compareAndSet(expectedReference: V, newReference: V, expectedStamp: Int, newStamp: Int): Boolean = ???

    /** Returns the current values of both the reference and the stamp. */
    @stub
    def get(stampHolder: Array[Int]): V = ???

    /** Returns the current value of the reference. */
    @stub
    def getReference(): V = ???

    /** Returns the current value of the stamp. */
    @stub
    def getStamp(): Int = ???

    /** Unconditionally sets the value of both the reference and stamp. */
    @stub
    def set(newReference: V, newStamp: Int): Unit = ???
}
