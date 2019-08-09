package javax.management

import java.io.Serializable

// Represents values that can be passed as arguments to
// relational expressions. Strings, numbers, attributes are valid values
// and should be represented by implementations of ValueExp.
trait ValueExp extends Serializable {

    @stub
    // Applies the ValueExp on a MBean.
    def apply(name: ObjectName): ValueExp = ???
}
