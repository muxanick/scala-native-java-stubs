package java.util

import java.lang.{Object, String}
import java.util.function.Supplier

/** This class consists of static utility methods for operating
 *  on objects.  These utilities include null-safe or null-tolerant methods for computing the hash code of an object,
 *  returning a string for an object, and comparing two objects.
 */
final class Objects extends Object {
}

object Objects {
    /** Returns 0 if the arguments are identical and c.compare(a, b) otherwise. */
    @stub
    def compare[T](a: T, b: T, c: Comparator[_ >: T]): Int = ???

    /** Returns true if the arguments are deeply equal to each other
     *  and false otherwise.
     */
    @stub
    def deepEquals(a: Object, b: Object): Boolean = ???

    /** Returns true if the arguments are equal to each other
     *  and false otherwise.
     */
    @stub
    def equals(a: Object, b: Object): Boolean = ???

    /** Generates a hash code for a sequence of input values. */
    @stub
    def hash(values: Object*): Int = ???

    /** Returns the hash code of a non-null argument and 0 for
     *  a null argument.
     */
    @stub
    def hashCode(o: Object): Int = ???

    /** Returns true if the provided reference is null otherwise
     *  returns false.
     */
    @stub
    def isNull(obj: Object): Boolean = ???

    /** Returns true if the provided reference is non-null
     *  otherwise returns false.
     */
    @stub
    def nonNull(obj: Object): Boolean = ???

    /** Checks that the specified object reference is not null. */
    @stub
    def requireNonNull[T](obj: T): T = ???

    /** Checks that the specified object reference is not null and
     *  throws a customized NullPointerException if it is.
     */
    @stub
    def requireNonNull[T](obj: T, message: String): T = ???

    /** Checks that the specified object reference is not null and
     *  throws a customized NullPointerException if it is.
     */
    @stub
    def requireNonNull[T](obj: T, messageSupplier: Supplier[String]): T = ???

    /** Returns the result of calling toString for a non-null argument and "null" for a null argument. */
    @stub
    def toString(o: Object): String = ???
}
