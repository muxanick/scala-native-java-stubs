package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A boolean value that may be updated atomically. See the
 *  java.util.concurrent.atomic package specification for
 *  description of the properties of atomic variables. An
 *  AtomicBoolean is used in applications such as atomically
 *  updated flags, and cannot be used as a replacement for a
 *  Boolean.
 */
class AtomicBoolean extends Object with Serializable {

    /** Creates a new AtomicBoolean with initial value false. */
    @stub
    def this() = ???

    /** Creates a new AtomicBoolean with the given initial value. */
    @stub
    def this(initialValue: Boolean) = ???

    /** Atomically sets the value to the given updated value
     *  if the current value == the expected value.
     */
    @stub
    def compareAndSet(expect: Boolean, update: Boolean): Boolean = ???

    /** Returns the current value. */
    @stub
    def get(): Boolean = ???

    /** Atomically sets to the given value and returns the previous value. */
    @stub
    def getAndSet(newValue: Boolean): Boolean = ???

    /** Eventually sets to the given value. */
    @stub
    def lazySet(newValue: Boolean): Unit = ???

    /** Unconditionally sets to the given value. */
    @stub
    def set(newValue: Boolean): Unit = ???

    /** Returns the String representation of the current value. */
    @stub
    def toString(): String = ???

    /** Atomically sets the value to the given updated value
     *  if the current value == the expected value.
     */
    @stub
    def weakCompareAndSet(expect: Boolean, update: Boolean): Boolean = ???
}
