package java.util

import java.lang.{Object, String}
import java.util.function.Supplier

// This class consists of static utility methods for operating
// on objects.  These utilities include null-safe or null-tolerant methods for computing the hash code of an object,
// returning a string for an object, and comparing two objects.
final class Objects extends Object {
}

object Objects {
    @stub
    // Returns 0 if the arguments are identical and c.compare(a, b) otherwise.
    def Int: [T] = ???

    @stub
    // Returns true if the arguments are deeply equal to each other
    // and false otherwise.
    def deepEquals(a: Object, b: Object): Boolean = ???

    @stub
    // Returns true if the arguments are equal to each other
    // and false otherwise.
    def equals(a: Object, b: Object): Boolean = ???

    @stub
    // Generates a hash code for a sequence of input values.
    def hash(values: Object*): Int = ???

    @stub
    // Returns the hash code of a non-null argument and 0 for
    // a null argument.
    def hashCode(o: Object): Int = ???

    @stub
    // Returns true if the provided reference is null otherwise
    // returns false.
    def isNull(obj: Object): Boolean = ???

    @stub
    // Returns true if the provided reference is non-null
    // otherwise returns false.
    def nonNull(obj: Object): Boolean = ???

    @stub
    // Checks that the specified object reference is not null.
    def T: [T] = ???

    @stub
    // Checks that the specified object reference is not null and
    // throws a customized NullPointerException if it is.
    def T: [T] = ???

    @stub
    // Checks that the specified object reference is not null and
    // throws a customized NullPointerException if it is.
    def T: [T] = ???

    @stub
    // Returns the result of calling toString for a non-null argument and "null" for a null argument.
    def toString(o: Object): String = ???
}
