package java.security

import java.lang.{Object, String}
import javax.security.auth.Subject
import scala.scalanative.annotation.stub

/** This interface represents the abstract notion of a principal, which
 *  can be used to represent any entity, such as an individual, a
 *  corporation, and a login id.
 */
trait Principal {

    /** Compares this principal to the specified object. */
    @stub
    def equals(another: Any): Boolean = ???

    /** Returns the name of this principal. */
    @stub
    def getName(): String = ???

    /** Returns a hashcode for this principal. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the specified subject is implied by this principal. */
    @stub
    def implies(subject: Subject): Boolean = ???

    /** Returns a string representation of this principal. */
    @stub
    def toString(): String = ???
}
