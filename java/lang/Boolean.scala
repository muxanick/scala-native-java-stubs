package java.lang

import java.io.Serializable

// The Boolean class wraps a value of the primitive type
// boolean in an object. An object of type
// Boolean contains a single field whose type is
// boolean.
// 
// In addition, this class provides many methods for
// converting a boolean to a String and a
// String to a boolean, as well as other
// constants and methods useful when dealing with a
// boolean.
final class Boolean extends Object with Serializable, with Comparable[Boolean] {

    @stub
    // Allocates a Boolean object representing the
    // value argument.
    def this(value: Boolean) = ???

    @stub
    // Returns the value of this Boolean object as a boolean
    // primitive.
    def booleanValue(): Boolean = ???

    @stub
    // Compares this Boolean instance with another.
    def compareTo(b: Boolean): Int = ???

    @stub
    // Returns true if and only if the argument is not
    // null and is a Boolean object that
    // represents the same boolean value as this object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns a hash code for this Boolean object.
    def hashCode(): Int = ???

    @stub
    // Returns a String object representing this Boolean's
    // value.
    def toString(): String = ???
}

object Boolean {
    @stub
    // The Boolean object corresponding to the primitive
    // value false.
    def FALSE: Boolean = ???

    @stub
    // The Boolean object corresponding to the primitive
    // value true.
    def TRUE: Boolean = ???

    @stub
    // Compares two boolean values.
    def compare(x: Boolean, y: Boolean): Int = ???

    @stub
    // Returns true if and only if the system property
    // named by the argument exists and is equal to the string
    // "true".
    def getBoolean(name: String): Boolean = ???

    @stub
    // Returns a hash code for a boolean value; compatible with
    // Boolean.hashCode().
    def hashCode(value: Boolean): Int = ???

    @stub
    // Returns the result of applying the logical AND operator to the
    // specified boolean operands.
    def logicalAnd(a: Boolean, b: Boolean): Boolean = ???

    @stub
    // Returns the result of applying the logical OR operator to the
    // specified boolean operands.
    def logicalOr(a: Boolean, b: Boolean): Boolean = ???

    @stub
    // Returns the result of applying the logical XOR operator to the
    // specified boolean operands.
    def logicalXor(a: Boolean, b: Boolean): Boolean = ???

    @stub
    // Parses the string argument as a boolean.
    def parseBoolean(s: String): Boolean = ???

    @stub
    // Returns a String object representing the specified
    // boolean.
    def toString(b: Boolean): String = ???

    @stub
    // Returns a Boolean instance representing the specified
    // boolean value.
    def valueOf(b: Boolean): Boolean = ???
}
