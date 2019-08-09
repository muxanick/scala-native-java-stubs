package java.security

import java.lang.{Object, String}
import javax.security.auth.Subject

// This interface represents the abstract notion of a principal, which
// can be used to represent any entity, such as an individual, a
// corporation, and a login id.
trait Principal {

    @stub
    // Compares this principal to the specified object.
    def equals(another: Object): Boolean = ???

    @stub
    // Returns the name of this principal.
    def getName(): String = ???

    @stub
    // Returns a hashcode for this principal.
    def hashCode(): Int = ???

    @stub
    // Returns true if the specified subject is implied by this principal.
    def Boolean: default = ???
}
