package javax.management

import java.io.Serializable

/** Represents values that can be passed as arguments to
 *  relational expressions. Strings, numbers, attributes are valid values
 *  and should be represented by implementations of ValueExp.
 */
trait ValueExp extends Serializable {

    /** Applies the ValueExp on a MBean. */
    @stub
    def apply(name: ObjectName): ValueExp = ???
}
