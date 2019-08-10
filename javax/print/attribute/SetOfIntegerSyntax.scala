package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** Class SetOfIntegerSyntax is an abstract base class providing the common
 *  implementation of all attributes whose value is a set of nonnegative
 *  integers. This includes attributes whose value is a single range of integers
 *  and attributes whose value is a set of ranges of integers.
 *  
 *  You can construct an instance of SetOfIntegerSyntax by giving it in "string
 *  form." The string consists of zero or more comma-separated integer groups.
 *  Each integer group consists of either one integer, two integers separated by
 *  a hyphen (-), or two integers separated by a colon
 *  (:). Each integer consists of one or more decimal digits
 *  (0 through 9). Whitespace characters cannot
 *  appear within an integer but are otherwise ignored. For example:
 *  "", "1", "5-10", "1:2,
 *  4".
 *  
 *  You can also construct an instance of SetOfIntegerSyntax by giving it in
 *  "array form." Array form consists of an array of zero or more integer groups
 *  where each integer group is a length-1 or length-2 array of
 *  ints; for example, int[0][],
 *  int[][]{{1}}, int[][]{{5,10}},
 *  int[][]{{1,2},{4}}.
 *  
 *  In both string form and array form, each successive integer group gives a
 *  range of integers to be included in the set. The first integer in each group
 *  gives the lower bound of the range; the second integer in each group gives
 *  the upper bound of the range; if there is only one integer in the group, the
 *  upper bound is the same as the lower bound. If the upper bound is less than
 *  the lower bound, it denotes a null range (no values). If the upper bound is
 *  equal to the lower bound, it denotes a range consisting of a single value. If
 *  the upper bound is greater than the lower bound, it denotes a range
 *  consisting of more than one value. The ranges may appear in any order and are
 *  allowed to overlap. The union of all the ranges gives the set's contents.
 *  Once a SetOfIntegerSyntax instance is constructed, its value is immutable.
 *  
 *  The SetOfIntegerSyntax object's value is actually stored in "canonical
 *  array form." This is the same as array form, except there are no null ranges;
 *  the members of the set are represented in as few ranges as possible (i.e.,
 *  overlapping ranges are coalesced); the ranges appear in ascending order; and
 *  each range is always represented as a length-two array of ints
 *  in the form {lower bound, upper bound}. An empty set is represented as a
 *  zero-length array.
 *  
 *  Class SetOfIntegerSyntax has operations to return the set's members in
 *  canonical array form, to test whether a given integer is a member of the
 *  set, and to iterate through the members of the set.
 *  
 */
abstract class SetOfIntegerSyntax extends Object with Serializable with Cloneable {

    /** Construct a new set-of-integer attribute containing a single integer. */
    @stub
    protected def this(member: Int) = ???

    /** Construct a new set-of-integer attribute with the given members in
     *  array form.
     */
    @stub
    protected def this(members: Array[Array[Int]]) = ???

    /** Construct a new set-of-integer attribute containing a single range of
     *  integers.
     */
    @stub
    protected def this(lowerBound: Int, upperBound: Int) = ???

    /** Construct a new set-of-integer attribute with the given members in
     *  string form.
     */
    @stub
    protected def this(members: String) = ???

    /** Determine if this set-of-integer attribute contains the given value. */
    def contains(x: Int): Boolean

    /** Determine if this set-of-integer attribute contains the given integer
     *  attribute's value.
     */
    def contains(attribute: IntegerSyntax): Boolean

    /** Returns whether this set-of-integer attribute is equivalent to the passed
     *  in object.
     */
    def equals(object: Any): Boolean

    /** Obtain this set-of-integer attribute's members in canonical array form. */
    def getMembers(): Array[Array[Int]]

    /** Returns a hash code value for this set-of-integer attribute. */
    def hashCode(): Int

    /** Determine the smallest integer in this set-of-integer attribute that is
     *  greater than the given value.
     */
    def next(x: Int): Int

    /** Returns a string value corresponding to this set-of-integer attribute. */
    def toString(): String
}
