package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** Class IntegerSyntax is an abstract base class providing the common
 *  implementation of all attributes with integer values.
 *  
 *  Under the hood, an integer attribute is just an integer. You can get an
 *  integer attribute's integer value by calling getValue(). An integer attribute's integer value is
 *  established when it is constructed (see IntegerSyntax(int)). Once constructed, an integer attribute's
 *  value is immutable.
 *  
 */
abstract class IntegerSyntax extends Object with Serializable with Cloneable {

    /** Construct a new integer attribute with the given integer value. */
    @stub
    protected def this(value: Int) = ???

    /** Construct a new integer attribute with the given integer value, which
     *  must lie within the given range.
     */
    @stub
    protected def this(value: Int, lowerBound: Int, upperBound: Int) = ???

    /** Returns whether this integer attribute is equivalent to the passed in
     *  object.
     */
    def equals(object: Any): Boolean

    /** Returns this integer attribute's integer value. */
    def getValue(): Int

    /** Returns a hash code value for this integer attribute. */
    def hashCode(): Int

    /** Returns a string value corresponding to this integer attribute. */
    def toString(): String
}
