package java.util.concurrent.atomic

import java.lang.Object

// An AtomicMarkableReference maintains an object reference
// along with a mark bit, that can be updated atomically.
//
// Implementation note: This implementation maintains markable
// references by creating internal objects representing "boxed"
// [reference, boolean] pairs.
class AtomicMarkableReference[V] extends Object {

    @stub
    // Atomically sets the value of the mark to the given update value
    // if the current reference is == to the expected
    // reference.
    def attemptMark(expectedReference: V, newMark: Boolean): Boolean = ???

    @stub
    // Atomically sets the value of both the reference and mark
    // to the given update values if the
    // current reference is == to the expected reference
    // and the current mark is equal to the expected mark.
    def compareAndSet(expectedReference: V, newReference: V, expectedMark: Boolean, newMark: Boolean): Boolean = ???

    @stub
    // Returns the current values of both the reference and the mark.
    def get(markHolder: Array[Boolean]): V = ???

    @stub
    // Returns the current value of the reference.
    def getReference(): V = ???

    @stub
    // Returns the current value of the mark.
    def isMarked(): Boolean = ???

    @stub
    // Unconditionally sets the value of both the reference and mark.
    def set(newReference: V, newMark: Boolean): Unit = ???
}
