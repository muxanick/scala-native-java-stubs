package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object}

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

    /** Returns whether this integer attribute is equivalent to the passed in
     *  object.
     */
    def equals(object: Object): Boolean

    /** Returns this integer attribute's integer value. */
    def getValue(): Int

    /** Returns a hash code value for this integer attribute. */
    def hashCode(): Int
}
