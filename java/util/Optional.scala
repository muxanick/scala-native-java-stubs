package java.util

import java.lang.{Object, Throwable}
import java.util.function.{Consumer, Function, Predicate, Supplier}

// A container object which may or may not contain a non-null value.
// If a value is present, isPresent() will return true and
// get() will return the value.
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
// Optional may have unpredictable results and should be avoided.
final class Optional[T] extends Object {

    @stub
    // Indicates whether some other object is "equal to" this Optional.
    def equals(obj: Object): Boolean = ???

    @stub
    // If a value is present, and the value matches the given predicate,
    // return an Optional describing the value, otherwise return an
    // empty Optional.
    def filter(predicate: Predicate[_ >: T]): Optional[T] = ???

    @stub
    // If a value is present, apply the provided Optional-bearing
    // mapping function to it, return that result, otherwise return an empty
    // Optional.
    def Optional[U]: [U] = ???

    @stub
    // If a value is present in this Optional, returns the value,
    // otherwise throws NoSuchElementException.
    def get(): T = ???

    @stub
    // Returns the hash code value of the present value, if any, or 0 (zero) if
    // no value is present.
    def hashCode(): Int = ???

    @stub
    // If a value is present, invoke the specified consumer with the value,
    // otherwise do nothing.
    def ifPresent(consumer: Consumer[_ >: T]): Unit = ???

    @stub
    // Return true if there is a value present, otherwise false.
    def isPresent(): Boolean = ???

    @stub
    // If a value is present, apply the provided mapping function to it,
    // and if the result is non-null, return an Optional describing the
    // result.
    def Optional[U]: [U] = ???

    @stub
    // Return the value if present, otherwise return other.
    def orElse(other: T): T = ???

    @stub
    // Return the value if present, otherwise invoke other and return
    // the result of that invocation.
    def orElseGet(other: Supplier[_ <: T]): T = ???

    @stub
    // Return the contained value, if present, otherwise throw an exception
    // to be created by the provided supplier.
    def T: [X <: Throwable] = ???
}

object Optional {
    @stub
    // Returns an empty Optional instance.
    def Optional[T]: [T] = ???

    @stub
    // Returns an Optional with the specified present non-null value.
    def Optional[T]: [T] = ???

    @stub
    // Returns an Optional describing the specified value, if non-null,
    // otherwise returns an empty Optional.
    def Optional[T]: [T] = ???
}
