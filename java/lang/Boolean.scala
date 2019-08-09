package java.lang

import java.io.Serializable

/** The Boolean class wraps a value of the primitive type
 *  boolean in an object. An object of type
 *  Boolean contains a single field whose type is
 *  boolean.
 *  
 *  In addition, this class provides many methods for
 *  converting a boolean to a String and a
 *  String to a boolean, as well as other
 *  constants and methods useful when dealing with a
 *  boolean.
 */
final class Boolean extends Object with Serializable with Comparable[Boolean] {

    /** Allocates a Boolean object representing the
     *  value argument.
     */
    @stub
    def this(value: Boolean) = ???

    /** Returns the value of this Boolean object as a boolean
     *  primitive.
     */
    @stub
    def booleanValue(): Boolean = ???

    /** Compares this Boolean instance with another. */
    @stub
    def compareTo(b: Boolean): Int = ???

    /** Returns true if and only if the argument is not
     *  null and is a Boolean object that
     *  represents the same boolean value as this object.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns a hash code for this Boolean object. */
    @stub
    def hashCode(): Int = ???

    /** Returns a String object representing this Boolean's
     *  value.
     */
    @stub
    def toString(): String = ???
}

object Boolean {
    /** The Boolean object corresponding to the primitive
     *  value false.
     */
    @stub
    val FALSE: Boolean = ???

    /** The Boolean object corresponding to the primitive
     *  value true.
     */
    @stub
    val TRUE: Boolean = ???

    /** Compares two boolean values. */
    @stub
    def compare(x: Boolean, y: Boolean): Int = ???

    /** Returns true if and only if the system property
     *  named by the argument exists and is equal to the string
     *  "true".
     */
    @stub
    def getBoolean(name: String): Boolean = ???

    /** Returns a hash code for a boolean value; compatible with
     *  Boolean.hashCode().
     */
    @stub
    def hashCode(value: Boolean): Int = ???

    /** Returns the result of applying the logical AND operator to the
     *  specified boolean operands.
     */
    @stub
    def logicalAnd(a: Boolean, b: Boolean): Boolean = ???

    /** Returns the result of applying the logical OR operator to the
     *  specified boolean operands.
     */
    @stub
    def logicalOr(a: Boolean, b: Boolean): Boolean = ???

    /** Returns the result of applying the logical XOR operator to the
     *  specified boolean operands.
     */
    @stub
    def logicalXor(a: Boolean, b: Boolean): Boolean = ???

    /** Parses the string argument as a boolean. */
    @stub
    def parseBoolean(s: String): Boolean = ???

    /** Returns a String object representing the specified
     *  boolean.
     */
    @stub
    def toString(b: Boolean): String = ???

    /** Returns a Boolean instance representing the specified
     *  boolean value.
     */
    @stub
    def valueOf(b: Boolean): Boolean = ???
}
