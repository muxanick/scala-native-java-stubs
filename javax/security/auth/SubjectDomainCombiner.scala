package javax.security.auth

import java.lang.Object
import java.security.{DomainCombiner, ProtectionDomain}

// A SubjectDomainCombiner updates ProtectionDomains
// with Principals from the Subject associated with this
// SubjectDomainCombiner.
class SubjectDomainCombiner extends Object with DomainCombiner {

    @stub
    // Update the relevant ProtectionDomains with the Principals
    // from the Subject associated with this
    // SubjectDomainCombiner.
    def combine(currentDomains: Array[ProtectionDomain], assignedDomains: Array[ProtectionDomain]): Array[ProtectionDomain] = ???
}
