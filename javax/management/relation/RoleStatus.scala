package javax.management.relation

import java.lang.Object

// This class describes the various problems which can be encountered when
// accessing a role.
class RoleStatus extends Object {
}

object RoleStatus {
    @stub
    // Problem type when trying to set a role value with less ObjectNames than
    // the minimum expected cardinality.
    def LESS_THAN_MIN_ROLE_DEGREE: Int = ???

    @stub
    // Problem type when trying to set a role value with more ObjectNames than
    // the maximum expected cardinality.
    def MORE_THAN_MAX_ROLE_DEGREE: Int = ???

    @stub
    // Problem type when trying to access an unknown role.
    def NO_ROLE_WITH_NAME: Int = ???

    @stub
    // Problem type when trying to set a role value including the ObjectName of
    // a MBean not registered in the MBean Server.
    def REF_MBEAN_NOT_REGISTERED: Int = ???

    @stub
    // Problem type when trying to set a role value including the ObjectName of
    // a MBean not of the class expected for that role.
    def REF_MBEAN_OF_INCORRECT_CLASS: Int = ???

    @stub
    // Problem type when trying to read a non-readable attribute.
    def ROLE_NOT_READABLE: Int = ???
}
