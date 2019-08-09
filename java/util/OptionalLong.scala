package java.util

import java.lang.{Object, Throwable}
import java.util.function.{LongConsumer, LongSupplier, Supplier}

// A container object which may or may not contain a long value.
// If a value is present, isPresent() will return true and
// getAsLong() will return the value.
//
// Additional methods that depend on the presence or absence of a contained
// value are provided, such as orElse()
// (return a default value if value not present) and
// ifPresent() (execute a block
// of code if the value is present).
//
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// OptionalLong may have unpredictable results and should be avoided.
final class OptionalLong extends Object {

    @stub
    // Indicates whether some other object is "equal to" this OptionalLong.
    def equals(obj: Object): Boolean = ???

    @stub
    // If a value is present in this OptionalLong, returns the value,
    // otherwise throws NoSuchElementException.
    def getAsLong(): Long = ???

    @stub
    // Returns the hash code value of the present value, if any, or 0 (zero) if
    // no value is present.
    def hashCode(): Int = ???

    @stub
    // Have the specified consumer accept the value if a value is present,
    // otherwise do nothing.
    def ifPresent(consumer: LongConsumer): Unit = ???

    @stub
    // Return true if there is a value present, otherwise false.
    def isPresent(): Boolean = ???

    @stub
    // Return the value if present, otherwise return other.
    def orElse(other: Long): Long = ???

    @stub
    // Return the value if present, otherwise invoke other and return
    // the result of that invocation.
    def orElseGet(other: LongSupplier): Long = ???

    @stub
    // Return the contained value, if present, otherwise throw an exception
    // to be created by the provided supplier.
    def Long: [X <: Throwable] = ???
}

object OptionalLong {
    @stub
    // Returns an empty OptionalLong instance.
    def empty(): OptionalLong = ???

    @stub
    // Return an OptionalLong with the specified value present.
    def of(value: Long): OptionalLong = ???
}
