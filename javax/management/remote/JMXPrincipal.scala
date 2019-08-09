package javax.management.remote

import java.io.Serializable
import java.lang.{Object, String}
import java.security.Principal

// The identity of a remote client of the JMX Remote API.
//
// Principals such as this JMXPrincipal
// may be associated with a particular Subject
// to augment that Subject with an additional
// identity.  Refer to the Subject
// class for more information on how to achieve this.
// Authorization decisions can then be based upon
// the Principals associated with a Subject.
class JMXPrincipal extends Object with Principal, with Serializable {

    @stub
    // Compares the specified Object with this JMXPrincipal
    // for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the name of this principal.
    def getName(): String = ???

    @stub
    // Returns a hash code for this JMXPrincipal.
    def hashCode(): Int = ???
}
