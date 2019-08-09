package java.security

import java.lang.Object

// This class defines the Service Provider Interface (SPI)
// for the Policy class.
// All the abstract methods in this class must be implemented by each
// service provider who wishes to supply a Policy implementation.
//
//  Subclass implementations of this abstract class must provide
// a public constructor that takes a Policy.Parameters
// object as an input parameter.  This constructor also must throw
// an IllegalArgumentException if it does not understand the
// Policy.Parameters input.
abstract class PolicySpi extends Object {

    // Return a PermissionCollection object containing the set of
    // permissions granted to the specified CodeSource.
    protected def engineGetPermissions(codesource: CodeSource): PermissionCollection

    // Return a PermissionCollection object containing the set of
    // permissions granted to the specified ProtectionDomain.
    protected def engineGetPermissions(domain: ProtectionDomain): PermissionCollection

    // Check whether the policy has granted a Permission to a ProtectionDomain.
    protected def engineImplies(domain: ProtectionDomain, permission: Permission): Boolean
}
