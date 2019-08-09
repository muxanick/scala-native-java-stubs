package javax.management.remote

import java.io.Serializable
import java.lang.{Object, String}
import java.security.Principal

/** The identity of a remote client of the JMX Remote API.
 * 
 *  Principals such as this JMXPrincipal
 *  may be associated with a particular Subject
 *  to augment that Subject with an additional
 *  identity.  Refer to the Subject
 *  class for more information on how to achieve this.
 *  Authorization decisions can then be based upon
 *  the Principals associated with a Subject.
 */
class JMXPrincipal extends Object with Principal with Serializable {

    /** Compares the specified Object with this JMXPrincipal
     *  for equality.
     */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the name of this principal. */
    @stub
    def getName(): String = ???

    /** Returns a hash code for this JMXPrincipal. */
    @stub
    def hashCode(): Int = ???
}
