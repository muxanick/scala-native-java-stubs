package java.security.acl

import java.security.Principal

/** Interface for managing owners of Access Control Lists (ACLs) or ACL
 *  configurations. (Note that the Acl interface in the
 *  java.security.acl package extends this Owner
 *  interface.) The initial owner Principal should be specified as an
 *  argument to the constructor of the class implementing this interface.
 */
trait Owner {

    /** Adds an owner. */
    @stub
    def addOwner(caller: Principal, owner: Principal): Boolean = ???

    /** Deletes an owner. */
    @stub
    def deleteOwner(caller: Principal, owner: Principal): Boolean = ???
}
