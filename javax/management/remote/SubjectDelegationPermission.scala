package javax.management.remote

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

// Permission required by an authentication identity to perform
// operations on behalf of an authorization identity.
//
// A SubjectDelegationPermission contains a name (also referred
// to as a "target name") but no actions list; you either have the
// named permission or you don't.
//
// The target name is the name of the authorization principal
// classname followed by a period and the authorization principal
// name, that is
// "PrincipalClassName.PrincipalName".
//
// An asterisk may appear by itself, or if immediately preceded
// by a "." may appear at the end of the target name, to signify a
// wildcard match.
//
// For example, "*", "javax.management.remote.JMXPrincipal.*" and
// "javax.management.remote.JMXPrincipal.delegate" are valid target
// names. The first one denotes any principal name from any principal
// class, the second one denotes any principal name of the concrete
// principal class javax.management.remote.JMXPrincipal
// and the third one denotes a concrete principal name
// delegate of the concrete principal class
// javax.management.remote.JMXPrincipal.
final class SubjectDelegationPermission extends BasicPermission {

    @stub
    // Creates a new SubjectDelegationPermission with the specified name.
    def this(name: String) = ???
}
