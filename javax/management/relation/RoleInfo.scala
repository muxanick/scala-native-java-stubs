package javax.management.relation

import java.io.Serializable
import java.lang.{Object, String}

/** A RoleInfo object summarises a role in a relation type.
 * 
 *  The serialVersionUID of this class is 2504952983494636987L.
 */
class RoleInfo extends Object with Serializable {

    /** Copy constructor. */
    @stub
    def this(roleInfo: RoleInfo) = ???

    /** Constructor. */
    @stub
    def this(roleName: String, mbeanClassName: String) = ???

    /** Constructor. */
    @stub
    def this(roleName: String, mbeanClassName: String, read: Boolean, write: Boolean) = ???

    /** Returns true if the value parameter is lower than or equal to
     *  the expected maximum degree, false otherwise.
     */
    @stub
    def checkMaxDegree(value: Int): Boolean = ???

    /** Returns true if the value parameter is greater than or equal to
     *  the expected minimum degree, false otherwise.
     */
    @stub
    def checkMinDegree(value: Int): Boolean = ???

    /** Returns description text for the role. */
    @stub
    def getDescription(): String = ???

    /** Returns maximum degree for corresponding role reference. */
    @stub
    def getMaxDegree(): Int = ???

    /** Returns minimum degree for corresponding role reference. */
    @stub
    def getMinDegree(): Int = ???

    /** Returns the name of the role. */
    @stub
    def getName(): String = ???

    /** Returns name of type of MBean expected to be referenced in
     *  corresponding role.
     */
    @stub
    def getRefMBeanClassName(): String = ???

    /** Returns read access mode for the role (true if it is readable). */
    @stub
    def isReadable(): Boolean = ???

    /** Returns write access mode for the role (true if it is writable). */
    @stub
    def isWritable(): Boolean = ???
}
