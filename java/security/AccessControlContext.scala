package java.security

import java.lang.Object

// An AccessControlContext is used to make system resource access decisions
// based on the context it encapsulates.
//
// More specifically, it encapsulates a context and
// has a single method, checkPermission,
// that is equivalent to the checkPermission method
// in the AccessController class, with one difference: The AccessControlContext
// checkPermission method makes access decisions based on the
// context it encapsulates,
// rather than that of the current execution thread.
//
// Thus, the purpose of AccessControlContext is for those situations where
// a security check that should be made within a given context
// actually needs to be done from within a
// different context (for example, from within a worker thread).
//
//  An AccessControlContext is created by calling the
// AccessController.getContext method.
// The getContext method takes a "snapshot"
// of the current calling context, and places
// it in an AccessControlContext object, which it returns. A sample call is
// the following:
//
// 
//   AccessControlContext acc = AccessController.getContext()
// 
//
// 
// Code within a different context can subsequently call the
// checkPermission method on the
// previously-saved AccessControlContext object. A sample call is the
// following:
//
// 
//   acc.checkPermission(permission)
// 
final class AccessControlContext extends Object {

    @stub
    // Create a new AccessControlContext with the given
    // AccessControlContext and DomainCombiner.
    def this(acc: AccessControlContext, combiner: DomainCombiner) = ???

    @stub
    // Determines whether the access request indicated by the
    // specified permission should be allowed or denied, based on
    // the security policy currently in effect, and the context in
    // this object.
    def checkPermission(perm: Permission): Unit = ???

    @stub
    // Checks two AccessControlContext objects for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Get the DomainCombiner associated with this
    // AccessControlContext.
    def getDomainCombiner(): DomainCombiner = ???
}
