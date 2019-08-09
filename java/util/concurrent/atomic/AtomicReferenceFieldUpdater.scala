package java.util.concurrent.atomic

import java.lang.{Class, Object, String}
import java.util.function.{BinaryOperator, UnaryOperator}

/** A reflection-based utility that enables atomic updates to
 *  designated volatile reference fields of designated
 *  classes.  This class is designed for use in atomic data structures
 *  in which several reference fields of the same node are
 *  independently subject to atomic updates. For example, a tree node
 *  might be declared as
 * 
 *   
 *  class Node {
 *    private volatile Node left, right;
 * 
 *    private static final AtomicReferenceFieldUpdater<Node, Node> leftUpdater =
 *      AtomicReferenceFieldUpdater.newUpdater(Node.class, Node.class, "left");
 *    private static AtomicReferenceFieldUpdater<Node, Node> rightUpdater =
 *      AtomicReferenceFieldUpdater.newUpdater(Node.class, Node.class, "right");
 * 
 *    Node getLeft() { return left; }
 *    boolean compareAndSetLeft(Node expect, Node update) {
 *      return leftUpdater.compareAndSet(this, expect, update);
 *    }
 *    // ... and so on
 *  }
 * 
 *  Note that the guarantees of the compareAndSet
 *  method in this class are weaker than in other atomic classes.
 *  Because this class cannot ensure that all uses of the field
 *  are appropriate for purposes of atomic access, it can
 *  guarantee atomicity only with respect to other invocations of
 *  compareAndSet and set on the same updater.
 */
abstract class AtomicReferenceFieldUpdater[T, V] extends Object {

    /** Atomically updates the field of the given object managed by this
     *  updater with the results of applying the given function to the
     *  current and given values, returning the updated value.
     */
    def accumulateAndGet(obj: T, x: V, accumulatorFunction: BinaryOperator[V]): V

    /** Atomically sets the field of the given object managed by this updater
     *  to the given updated value if the current value == the
     *  expected value.
     */
    def compareAndSet(obj: T, expect: V, update: V): Boolean

    /** Gets the current value held in the field of the given object managed
     *  by this updater.
     */
    def get(obj: T): V

    /** Atomically updates the field of the given object managed by this
     *  updater with the results of applying the given function to the
     *  current and given values, returning the previous value.
     */
    def getAndAccumulate(obj: T, x: V, accumulatorFunction: BinaryOperator[V]): V

    /** Atomically sets the field of the given object managed by this updater
     *  to the given value and returns the old value.
     */
    def getAndSet(obj: T, newValue: V): V

    /** Atomically updates the field of the given object managed by this updater
     *  with the results of applying the given function, returning the previous
     *  value.
     */
    def getAndUpdate(obj: T, updateFunction: UnaryOperator[V]): V

    /** Eventually sets the field of the given object managed by this
     *  updater to the given updated value.
     */
    def lazySet(obj: T, newValue: V): Unit

    /** Sets the field of the given object managed by this updater to the
     *  given updated value.
     */
    def set(obj: T, newValue: V): Unit

    /** Atomically updates the field of the given object managed by this updater
     *  with the results of applying the given function, returning the updated
     *  value.
     */
    def updateAndGet(obj: T, updateFunction: UnaryOperator[V]): V
}

object AtomicReferenceFieldUpdater {
    /** Creates and returns an updater for objects with the given field. */
    @stub
    def newUpdater[U, W](tclass: Class[U], vclass: Class[W], fieldName: String): AtomicReferenceFieldUpdater[U, W] = ???
}
