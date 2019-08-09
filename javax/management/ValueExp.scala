package javax.management

import java.io.Serializable
import scala.scalanative.annotation.stub

/** Represents values that can be passed as arguments to
 *  relational expressions. Strings, numbers, attributes are valid values
 *  and should be represented by implementations of ValueExp.
 */
trait ValueExp extends Serializable {

    /** Applies the ValueExp on a MBean. */
    @stub
    def apply(name: ObjectName): ValueExp = ???

    /** Deprecated. 
     * This method is not needed because a
     *  ValueExp can access the MBean server in which it
     *  is being evaluated by using QueryEval.getMBeanServer().
     * 
     */
    @stub
    def setMBeanServer(s: MBeanServer): Unit = ???
}
