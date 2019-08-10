package javax.management

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Represents attributes used as arguments to relational constraints.
 *  Instances of this class are usually obtained using Query.attr.
 * 
 *  An AttributeValueExp may be used anywhere a
 *  ValueExp is required.
 */
class AttributeValueExp extends Object with ValueExp {

    /** Deprecated. 
     * An instance created with this constructor cannot be
     *  used in a query.
     * 
     */
    @stub
    def this() = ???

    /** Creates a new AttributeValueExp representing the
     *  specified object attribute, named attr.
     */
    @stub
    def this(attr: String) = ???

    /** Applies the AttributeValueExp on an MBean. */
    @stub
    def apply(name: ObjectName): ValueExp = ???

    /** Return the value of the given attribute in the named MBean. */
    @stub
    protected def getAttribute(name: ObjectName): Any = ???

    /** Returns a string representation of the name of the attribute. */
    @stub
    def getAttributeName(): String = ???

    /** Deprecated. 
     * This method has no effect.  The MBean Server used to
     *  obtain an attribute value is QueryEval.getMBeanServer().
     * 
     */
    @stub
    def setMBeanServer(s: MBeanServer): Unit = ???

    /** Returns the string representing its value. */
    @stub
    def toString(): String = ???
}
