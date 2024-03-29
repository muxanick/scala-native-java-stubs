package java.security.acl

import java.security.Principal
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** This interface is used to represent a group of principals. (A principal
 *  represents an entity such as an individual user or a company). 
 * 
 *  Note that Group extends Principal. Thus, either a Principal or a Group can
 *  be passed as an argument to methods containing a Principal parameter. For
 *  example, you can add either a Principal or a Group to a Group object by
 *  calling the object's addMember method, passing it the
 *  Principal or Group.
 */
trait Group extends Principal {

    /** Adds the specified member to the group. */
    @stub
    def addMember(user: Principal): Boolean = ???

    /** Returns true if the passed principal is a member of the group. */
    @stub
    def isMember(member: Principal): Boolean = ???

    /** Returns an enumeration of the members in the group. */
    @stub
    def members(): Enumeration[_ <: Principal] = ???

    /** Removes the specified member from the group. */
    @stub
    def removeMember(user: Principal): Boolean = ???
}
