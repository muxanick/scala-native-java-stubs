package java.util.concurrent.atomic

import java.lang.Object

/** An AtomicMarkableReference maintains an object reference
 *  along with a mark bit, that can be updated atomically.
 * 
 *  Implementation note: This implementation maintains markable
 *  references by creating internal objects representing "boxed"
 *  [reference, boolean] pairs.
 */
class AtomicMarkableReference[V] extends Object {

    /** Atomically sets the value of the mark to the given update value
     *  if the current reference is == to the expected
     *  reference.
     */
    @stub
    def attemptMark(expectedReference: V, newMark: Boolean): Boolean = ???

    /** Atomically sets the value of both the reference and mark
     *  to the given update values if the
     *  current reference is == to the expected reference
     *  and the current mark is equal to the expected mark.
     */
    @stub
    def compareAndSet(expectedReference: V, newReference: V, expectedMark: Boolean, newMark: Boolean): Boolean = ???

    /** Returns the current values of both the reference and the mark. */
    @stub
    def get(markHolder: Array[Boolean]): V = ???

    /** Returns the current value of the reference. */
    @stub
    def getReference(): V = ???

    /** Returns the current value of the mark. */
    @stub
    def isMarked(): Boolean = ???

    /** Unconditionally sets the value of both the reference and mark. */
    @stub
    def set(newReference: V, newMark: Boolean): Unit = ???
}
