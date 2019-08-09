package javax.management

import java.lang.{Object, String}

/** Represents strings that are arguments to relational constraints.
 *  A StringValueExp may be used anywhere a ValueExp is required.
 */
class StringValueExp extends Object with ValueExp {

    /** Basic constructor. */
    @stub
    def this() = ???

    /** Applies the ValueExp on a MBean. */
    @stub
    def apply(name: ObjectName): ValueExp = ???

    /** Returns the string represented by the
     *  StringValueExp instance.
     */
    @stub
    def getValue(): String = ???

    /** Deprecated.  */
    @stub
    def setMBeanServer(s: MBeanServer): Unit = ???
}
