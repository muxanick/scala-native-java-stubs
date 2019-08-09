package java.security.acl

import java.lang.Object

// This interface represents a permission, such as that used to grant
// a particular type of access to a resource.
trait Permission {

    @stub
    // Returns true if the object passed matches the permission represented
    // in this interface.
    def equals(another: Object): Boolean = ???
}
