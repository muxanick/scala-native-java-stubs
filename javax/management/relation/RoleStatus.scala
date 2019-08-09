package javax.management.relation

import java.lang.Object

/** This class describes the various problems which can be encountered when
 *  accessing a role.
 */
class RoleStatus extends Object {
}

object RoleStatus {
    /** Problem type when trying to set a role value with less ObjectNames than
     *  the minimum expected cardinality.
     */
    @stub
    val LESS_THAN_MIN_ROLE_DEGREE: Int = ???

    /** Problem type when trying to set a role value with more ObjectNames than
     *  the maximum expected cardinality.
     */
    @stub
    val MORE_THAN_MAX_ROLE_DEGREE: Int = ???

    /** Problem type when trying to access an unknown role. */
    @stub
    val NO_ROLE_WITH_NAME: Int = ???

    /** Problem type when trying to set a role value including the ObjectName of
     *  a MBean not registered in the MBean Server.
     */
    @stub
    val REF_MBEAN_NOT_REGISTERED: Int = ???

    /** Problem type when trying to set a role value including the ObjectName of
     *  a MBean not of the class expected for that role.
     */
    @stub
    val REF_MBEAN_OF_INCORRECT_CLASS: Int = ???

    /** Problem type when trying to read a non-readable attribute. */
    @stub
    val ROLE_NOT_READABLE: Int = ???
}
