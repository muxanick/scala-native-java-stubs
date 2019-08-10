package java.util

import java.lang.{Object, String, Throwable}
import java.util.function.{LongConsumer, LongSupplier, Supplier}
import scala.scalanative.annotation.stub

/** A container object which may or may not contain a long value.
 *  If a value is present, isPresent() will return true and
 *  getAsLong() will return the value.
 * 
 *  Additional methods that depend on the presence or absence of a contained
 *  value are provided, such as orElse()
 *  (return a default value if value not present) and
 *  ifPresent() (execute a block
 *  of code if the value is present).
 * 
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  OptionalLong may have unpredictable results and should be avoided.
 */
final class OptionalLong extends Object {

    /** Indicates whether some other object is "equal to" this OptionalLong. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** If a value is present in this OptionalLong, returns the value,
     *  otherwise throws NoSuchElementException.
     */
    @stub
    def getAsLong(): Long = ???

    /** Returns the hash code value of the present value, if any, or 0 (zero) if
     *  no value is present.
     */
    @stub
    def hashCode(): Int = ???

    /** Have the specified consumer accept the value if a value is present,
     *  otherwise do nothing.
     */
    @stub
    def ifPresent(consumer: LongConsumer): Unit = ???

    /** Return true if there is a value present, otherwise false. */
    @stub
    def isPresent(): Boolean = ???

    /** Return the value if present, otherwise return other. */
    @stub
    def orElse(other: Long): Long = ???

    /** Return the value if present, otherwise invoke other and return
     *  the result of that invocation.
     */
    @stub
    def orElseGet(other: LongSupplier): Long = ???

    /** Return the contained value, if present, otherwise throw an exception
     *  to be created by the provided supplier.
     */
    @stub
    def orElseThrow[X <: Throwable](exceptionSupplier: Supplier[X]): Long = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object OptionalLong {
    /** Returns an empty OptionalLong instance. */
    @stub
    def empty(): OptionalLong = ???

    /** Return an OptionalLong with the specified value present. */
    @stub
    def of(value: Long): OptionalLong = ???
}
