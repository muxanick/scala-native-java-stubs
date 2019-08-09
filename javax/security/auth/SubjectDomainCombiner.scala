package javax.security.auth

import java.lang.Object
import java.security.{DomainCombiner, ProtectionDomain}
import scala.scalanative.annotation.stub

/** A SubjectDomainCombiner updates ProtectionDomains
 *  with Principals from the Subject associated with this
 *  SubjectDomainCombiner.
 */
class SubjectDomainCombiner extends Object with DomainCombiner {

    /** Associate the provided Subject with this
     *  SubjectDomainCombiner.
     */
    @stub
    def this(subject: Subject) = ???

    /** Update the relevant ProtectionDomains with the Principals
     *  from the Subject associated with this
     *  SubjectDomainCombiner.
     */
    @stub
    def combine(currentDomains: Array[ProtectionDomain], assignedDomains: Array[ProtectionDomain]): Array[ProtectionDomain] = ???

    /** Get the Subject associated with this
     *  SubjectDomainCombiner.
     */
    @stub
    def getSubject(): Subject = ???
}
