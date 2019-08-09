package java.security.acl

import java.security.Principal
import java.util.Enumeration

// This interface is used to represent a group of principals. (A principal
// represents an entity such as an individual user or a company). 
//
// Note that Group extends Principal. Thus, either a Principal or a Group can
// be passed as an argument to methods containing a Principal parameter. For
// example, you can add either a Principal or a Group to a Group object by
// calling the object's addMember method, passing it the
// Principal or Group.
trait Group extends Principal {

    @stub
    // Adds the specified member to the group.
    def addMember(user: Principal): Boolean = ???

    @stub
    // Returns true if the passed principal is a member of the group.
    def isMember(member: Principal): Boolean = ???

    @stub
    // Returns an enumeration of the members in the group.
    def members(): Enumeration[_ <: Principal] = ???
}
