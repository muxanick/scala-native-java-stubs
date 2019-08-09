package java.security

import java.lang.{Object, String}

// The AllPermission is a permission that implies all other permissions.
// 
// Note: Granting AllPermission should be done with extreme care,
// as it implies all other permissions. Thus, it grants code the ability
// to run with security
// disabled.  Extreme caution should be taken before granting such
// a permission to code.  This permission should be used only during testing,
// or in extremely rare cases where an application or applet is
// completely trusted and adding the necessary permissions to the policy
// is prohibitively cumbersome.
final class AllPermission extends Permission {

    @stub
    // Creates a new AllPermission object.
    def this() = ???

    @stub
    // Checks two AllPermission objects for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the canonical string representation of the actions.
    def getActions(): String = ???

    @stub
    // Returns the hash code value for this object.
    def hashCode(): Int = ???

    @stub
    // Checks if the specified permission is "implied" by
    // this object.
    def implies(p: Permission): Boolean = ???
}
