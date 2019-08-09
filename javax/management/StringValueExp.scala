package javax.management

import java.lang.{Object, String}

// Represents strings that are arguments to relational constraints.
// A StringValueExp may be used anywhere a ValueExp is required.
class StringValueExp extends Object with ValueExp {

    @stub
    // Basic constructor.
    def this() = ???

    @stub
    // Applies the ValueExp on a MBean.
    def apply(name: ObjectName): ValueExp = ???

    @stub
    // Returns the string represented by the
    // StringValueExp instance.
    def getValue(): String = ???

    @stub
    // Deprecated. 
    def setMBeanServer(s: MBeanServer): Unit = ???
}
