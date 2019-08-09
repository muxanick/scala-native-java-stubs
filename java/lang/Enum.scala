package java.lang

import java.io.Serializable

/** This is the common base class of all Java language enumeration types.
 * 
 *  More information about enums, including descriptions of the
 *  implicitly declared methods synthesized by the compiler, can be
 *  found in section 8.9 of
 *  The Java™ Language Specification.
 * 
 *   Note that when using an enumeration type as the type of a set
 *  or as the type of the keys in a map, specialized and efficient
 *  set and map implementations are available.
 */
abstract class Enum[E <: Enum[E]] extends Object with Comparable[E] with Serializable {

    /** Throws CloneNotSupportedException. */
    protected def clone(): Object

    /** Compares this enum with the specified object for order. */
    def compareTo(o: E): Int

    /** Returns true if the specified object is equal to this
     *  enum constant.
     */
    def equals(other: Object): Boolean

    /** enum classes cannot have finalize methods. */
    protected def finalize(): Unit

    /** Returns the Class object corresponding to this enum constant's
     *  enum type.
     */
    def getDeclaringClass(): Class[E]

    /** Returns a hash code for this enum constant. */
    def hashCode(): Int

    /** Returns the name of this enum constant, exactly as declared in its
     *  enum declaration.
     */
    def name(): String

    /** Returns the ordinal of this enumeration constant (its position
     *  in its enum declaration, where the initial constant is assigned
     *  an ordinal of zero).
     */
    def ordinal(): Int

    /** Returns the name of this enum constant, as contained in the
     *  declaration.
     */
    def toString(): String
}
