package javax.management

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

// A Permission to perform actions related to MBeanServers.
//    The name of the permission specifies the operation requested
//    or granted by the permission.  For a granted permission, it can be
//    * to allow all of the MBeanServer operations specified below.
//    Otherwise, for a granted or requested permission, it must be one of the
//    following:
//    
//    createMBeanServer
//    Create a new MBeanServer object using the method
//    MBeanServerFactory.createMBeanServer() or
//    MBeanServerFactory.createMBeanServer(java.lang.String).
//    findMBeanServer
//    Find an MBeanServer with a given name, or all MBeanServers in this
//    JVM, using the method MBeanServerFactory.findMBeanServer(java.lang.String).
//    newMBeanServer
//    Create a new MBeanServer object without keeping a reference to it,
//    using the method MBeanServerFactory.newMBeanServer() or
//    MBeanServerFactory.newMBeanServer(java.lang.String).
//    releaseMBeanServer
//    Remove the MBeanServerFactory's reference to an MBeanServer,
//    using the method MBeanServerFactory.releaseMBeanServer(javax.management.MBeanServer).
//    
//    The name of the permission can also denote a list of one or more
//    comma-separated operations.  Spaces are allowed at the beginning and
//    end of the name and before and after commas.
//    
//    MBeanServerPermission("createMBeanServer") implies
//    MBeanServerPermission("newMBeanServer").
class MBeanServerPermission extends BasicPermission {

    @stub
    // Create a new MBeanServerPermission with the given name.
    def this(name: String) = ???

    @stub
    // Checks two MBeanServerPermission objects for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code value for this object.
    def hashCode(): Int = ???

    @stub
    // Checks if this MBeanServerPermission object "implies" the specified
    // permission.
    def implies(p: Permission): Boolean = ???
}
