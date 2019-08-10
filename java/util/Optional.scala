package java.util

import java.lang.{Object, String, Throwable}
import java.util.function.{Consumer, Function, Predicate, Supplier}
import scala.scalanative.annotation.stub

/** A container object which may or may not contain a non-null value.
 *  If a value is present, isPresent() will return true and
 *  get() will return the value.
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
 *  Optional may have unpredictable results and should be avoided.
 */
final class Optional[T] extends Object {

    /** Indicates whether some other object is "equal to" this Optional. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** If a value is present, and the value matches the given predicate,
     *  return an Optional describing the value, otherwise return an
     *  empty Optional.
     */
    @stub
    def filter(predicate: Predicate[_ >: T]): Optional[T] = ???

    /** If a value is present, apply the provided Optional-bearing
     *  mapping function to it, return that result, otherwise return an empty
     *  Optional.
     */
    @stub
    def flatMap[U](mapper: Function[_ >: T, Optional[U]]): Optional[U] = ???

    /** If a value is present in this Optional, returns the value,
     *  otherwise throws NoSuchElementException.
     */
    @stub
    def get(): T = ???

    /** Returns the hash code value of the present value, if any, or 0 (zero) if
     *  no value is present.
     */
    @stub
    def hashCode(): Int = ???

    /** If a value is present, invoke the specified consumer with the value,
     *  otherwise do nothing.
     */
    @stub
    def ifPresent(consumer: Consumer[_ >: T]): Unit = ???

    /** Return true if there is a value present, otherwise false. */
    @stub
    def isPresent(): Boolean = ???

    /** If a value is present, apply the provided mapping function to it,
     *  and if the result is non-null, return an Optional describing the
     *  result.
     */
    @stub
    def map[U](mapper: Function[_ >: T, _ <: U]): Optional[U] = ???

    /** Return the value if present, otherwise return other. */
    @stub
    def orElse(other: T): T = ???

    /** Return the value if present, otherwise invoke other and return
     *  the result of that invocation.
     */
    @stub
    def orElseGet(other: Supplier[_ <: T]): T = ???

    /** Return the contained value, if present, otherwise throw an exception
     *  to be created by the provided supplier.
     */
    @stub
    def orElseThrow[X <: Throwable](exceptionSupplier: Supplier[_ <: X]): T = ???

    /** Returns a non-empty string representation of this Optional suitable for
     *  debugging.
     */
    @stub
    def toString(): String = ???
}

object Optional {
    /** Returns an empty Optional instance. */
    @stub
    def empty[T](): Optional[T] = ???

    /** Returns an Optional with the specified present non-null value. */
    @stub
    def of[T](value: T): Optional[T] = ???

    /** Returns an Optional describing the specified value, if non-null,
     *  otherwise returns an empty Optional.
     */
    @stub
    def ofNullable[T](value: T): Optional[T] = ???
}
