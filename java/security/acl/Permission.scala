package java.security.acl

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This interface represents a permission, such as that used to grant
 *  a particular type of access to a resource.
 */
trait Permission {

    /** Returns true if the object passed matches the permission represented
     *  in this interface.
     */
    @stub
    def equals(another: Any): Boolean = ???

    /** Prints a string representation of this permission. */
    @stub
    def toString(): String = ???
}
