package javax.management

import java.lang.{Object, String}

// Represents attributes used as arguments to relational constraints.
// Instances of this class are usually obtained using Query.attr.
//
// An AttributeValueExp may be used anywhere a
// ValueExp is required.
class AttributeValueExp extends Object with ValueExp {

    @stub
    // Deprecated. 
    //An instance created with this constructor cannot be
    // used in a query.
    //
    def this() = ???

    @stub
    // Applies the AttributeValueExp on an MBean.
    def apply(name: ObjectName): ValueExp = ???

    @stub
    // Return the value of the given attribute in the named MBean.
    protected def getAttribute(name: ObjectName): Object = ???

    @stub
    // Returns a string representation of the name of the attribute.
    def getAttributeName(): String = ???

    @stub
    // Deprecated. 
    //This method has no effect.  The MBean Server used to
    // obtain an attribute value is QueryEval.getMBeanServer().
    //
    def setMBeanServer(s: MBeanServer): Unit = ???
}
