package java.lang

import java.util.stream.IntStream
import scala.scalanative.annotation.stub

/** A CharSequence is a readable sequence of char values. This
 *  interface provides uniform, read-only access to many different kinds of
 *  char sequences.
 *  A char value represents a character in the Basic
 *  Multilingual Plane (BMP) or a surrogate. Refer to Unicode Character Representation for details.
 * 
 *   This interface does not refine the general contracts of the equals and hashCode methods.  The result of comparing two
 *  objects that implement CharSequence is therefore, in general,
 *  undefined.  Each object may be implemented by a different class, and there
 *  is no guarantee that each class will be capable of testing its instances
 *  for equality with those of the other.  It is therefore inappropriate to use
 *  arbitrary CharSequence instances as elements in a set or as keys in
 *  a map. 
 */
trait CharSequence {

    /** Returns the char value at the specified index. */
    @stub
    def charAt(index: Int): Char = ???

    /** Returns a stream of int zero-extending the char values
     *  from this sequence.
     */
    @stub
    val IntStream: default = ???

    /** Returns a stream of code point values from this sequence. */
    @stub
    val IntStream: default = ???

    /** Returns the length of this character sequence. */
    @stub
    def length(): Int = ???

    /** Returns a CharSequence that is a subsequence of this sequence. */
    @stub
    def subSequence(start: Int, end: Int): CharSequence = ???

    /** Returns a string containing the characters in this sequence in the same
     *  order as this sequence.
     */
    @stub
    def toString(): String = ???
}
