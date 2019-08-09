package java.util

import java.lang.{Object, Throwable}
import java.util.function.{IntConsumer, IntSupplier, Supplier}

/** A container object which may or may not contain a int value.
 *  If a value is present, isPresent() will return true and
 *  getAsInt() will return the value.
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
 *  OptionalInt may have unpredictable results and should be avoided.
 */
final class OptionalInt extends Object {

    /** Indicates whether some other object is "equal to" this OptionalInt. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** If a value is present in this OptionalInt, returns the value,
     *  otherwise throws NoSuchElementException.
     */
    @stub
    def getAsInt(): Int = ???

    /** Returns the hash code value of the present value, if any, or 0 (zero) if
     *  no value is present.
     */
    @stub
    def hashCode(): Int = ???

    /** Have the specified consumer accept the value if a value is present,
     *  otherwise do nothing.
     */
    @stub
    def ifPresent(consumer: IntConsumer): Unit = ???

    /** Return true if there is a value present, otherwise false. */
    @stub
    def isPresent(): Boolean = ???

    /** Return the value if present, otherwise return other. */
    @stub
    def orElse(other: Int): Int = ???

    /** Return the value if present, otherwise invoke other and return
     *  the result of that invocation.
     */
    @stub
    def orElseGet(other: IntSupplier): Int = ???

    /** Return the contained value, if present, otherwise throw an exception
     *  to be created by the provided supplier.
     */
    @stub
    def orElseThrow[X <: Throwable](exceptionSupplier: Supplier[X]): Int = ???
}

object OptionalInt {
    /** Returns an empty OptionalInt instance. */
    @stub
    def empty(): OptionalInt = ???

    /** Return an OptionalInt with the specified value present. */
    @stub
    def of(value: Int): OptionalInt = ???
}
