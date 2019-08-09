package javax.management.relation

import java.io.Serializable
import java.lang.{Object, String}

// A RoleInfo object summarises a role in a relation type.
//
// The serialVersionUID of this class is 2504952983494636987L.
class RoleInfo extends Object with Serializable {

    @stub
    // Copy constructor.
    def this(roleInfo: RoleInfo) = ???

    @stub
    // Constructor.
    def this(roleName: String, mbeanClassName: String) = ???

    @stub
    // Constructor.
    def this(roleName: String, mbeanClassName: String, read: Boolean, write: Boolean) = ???

    @stub
    // Returns true if the value parameter is lower than or equal to
    // the expected maximum degree, false otherwise.
    def checkMaxDegree(value: Int): Boolean = ???

    @stub
    // Returns true if the value parameter is greater than or equal to
    // the expected minimum degree, false otherwise.
    def checkMinDegree(value: Int): Boolean = ???

    @stub
    // Returns description text for the role.
    def getDescription(): String = ???

    @stub
    // Returns maximum degree for corresponding role reference.
    def getMaxDegree(): Int = ???

    @stub
    // Returns minimum degree for corresponding role reference.
    def getMinDegree(): Int = ???

    @stub
    // Returns the name of the role.
    def getName(): String = ???

    @stub
    // Returns name of type of MBean expected to be referenced in
    // corresponding role.
    def getRefMBeanClassName(): String = ???

    @stub
    // Returns read access mode for the role (true if it is readable).
    def isReadable(): Boolean = ???

    @stub
    // Returns write access mode for the role (true if it is writable).
    def isWritable(): Boolean = ???
}
