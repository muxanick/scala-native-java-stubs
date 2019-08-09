package java.util

import java.lang.{Object, String, Throwable}
import java.util.function.{DoubleConsumer, DoubleSupplier, Supplier}
import scala.scalanative.annotation.stub

/** A container object which may or may not contain a double value.
 *  If a value is present, isPresent() will return true and
 *  getAsDouble() will return the value.
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
 *  OptionalDouble may have unpredictable results and should be avoided.
 */
final class OptionalDouble extends Object {

    /** Indicates whether some other object is "equal to" this OptionalDouble. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** If a value is present in this OptionalDouble, returns the value,
     *  otherwise throws NoSuchElementException.
     */
    @stub
    def getAsDouble(): Double = ???

    /** Returns the hash code value of the present value, if any, or 0 (zero) if
     *  no value is present.
     */
    @stub
    def hashCode(): Int = ???

    /** Have the specified consumer accept the value if a value is present,
     *  otherwise do nothing.
     */
    @stub
    def ifPresent(consumer: DoubleConsumer): Unit = ???

    /** Return true if there is a value present, otherwise false. */
    @stub
    def isPresent(): Boolean = ???

    /** Return the value if present, otherwise return other. */
    @stub
    def orElse(other: Double): Double = ???

    /** Return the value if present, otherwise invoke other and return
     *  the result of that invocation.
     */
    @stub
    def orElseGet(other: DoubleSupplier): Double = ???

    /** Return the contained value, if present, otherwise throw an exception
     *  to be created by the provided supplier.
     */
    @stub
    def orElseThrow[X <: Throwable](exceptionSupplier: Supplier[X]): Double = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object OptionalDouble {
    /** Returns an empty OptionalDouble instance. */
    @stub
    def empty(): OptionalDouble = ???

    /** Return an OptionalDouble with the specified value present. */
    @stub
    def of(value: Double): OptionalDouble = ???
}
