package java.util.concurrent.atomic

import java.lang.Object

// An AtomicStampedReference maintains an object reference
// along with an integer "stamp", that can be updated atomically.
//
// Implementation note: This implementation maintains stamped
// references by creating internal objects representing "boxed"
// [reference, integer] pairs.
class AtomicStampedReference[V] extends Object {

    @stub
    // Atomically sets the value of the stamp to the given update value
    // if the current reference is == to the expected
    // reference.
    def attemptStamp(expectedReference: V, newStamp: Int): Boolean = ???

    @stub
    // Atomically sets the value of both the reference and stamp
    // to the given update values if the
    // current reference is == to the expected reference
    // and the current stamp is equal to the expected stamp.
    def compareAndSet(expectedReference: V, newReference: V, expectedStamp: Int, newStamp: Int): Boolean = ???

    @stub
    // Returns the current values of both the reference and the stamp.
    def get(stampHolder: Array[Int]): V = ???

    @stub
    // Returns the current value of the reference.
    def getReference(): V = ???

    @stub
    // Returns the current value of the stamp.
    def getStamp(): Int = ???

    @stub
    // Unconditionally sets the value of both the reference and stamp.
    def set(newReference: V, newStamp: Int): Unit = ???
}
