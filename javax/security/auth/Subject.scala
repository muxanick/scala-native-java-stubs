package javax.security.auth

import java.io.Serializable
import java.lang.{Class, Object}
import java.security.{AccessControlContext, Principal, PrivilegedAction, PrivilegedExceptionAction}
import java.util.Set

//  A Subject represents a grouping of related information
// for a single entity, such as a person.
// Such information includes the Subject's identities as well as
// its security-related attributes
// (passwords and cryptographic keys, for example).
//
//  Subjects may potentially have multiple identities.
// Each identity is represented as a Principal
// within the Subject.  Principals simply bind names to a
// Subject.  For example, a Subject that happens
// to be a person, Alice, might have two Principals:
// one which binds "Alice Bar", the name on her driver license,
// to the Subject, and another which binds,
// "999-99-9999", the number on her student identification card,
// to the Subject.  Both Principals refer to the same
// Subject even though each has a different name.
//
//  A Subject may also own security-related attributes,
// which are referred to as credentials.
// Sensitive credentials that require special protection, such as
// private cryptographic keys, are stored within a private credential
// Set.  Credentials intended to be shared, such as
// public key certificates or Kerberos server tickets are stored
// within a public credential Set.  Different permissions
// are required to access and modify the different credential Sets.
//
//  To retrieve all the Principals associated with a Subject,
// invoke the getPrincipals method.  To retrieve
// all the public or private credentials belonging to a Subject,
// invoke the getPublicCredentials method or
// getPrivateCredentials method, respectively.
// To modify the returned Set of Principals and credentials,
// use the methods defined in the Set class.
// For example:
// 
//      Subject subject;
//      Principal principal;
//      Object credential;
//
//      // add a Principal and credential to the Subject
//      subject.getPrincipals().add(principal);
//      subject.getPublicCredentials().add(credential);
// 
//
//  This Subject class implements Serializable.
// While the Principals associated with the Subject are serialized,
// the credentials associated with the Subject are not.
// Note that the java.security.Principal class
// does not implement Serializable.  Therefore all concrete
// Principal implementations associated with Subjects
// must implement Serializable.
final class Subject extends Object with Serializable {

    @stub
    // Create an instance of a Subject
    // with an empty Set of Principals and empty
    // Sets of public and private credentials.
    def this() = ???

    @stub
    // Compares the specified Object with this Subject
    // for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Return the Set of Principals associated with this
    // Subject.
    def getPrincipals(): Set[Principal] = ???

    @stub
    // Return a Set of Principals associated with this
    // Subject that are instances or subclasses of the specified
    // Class.
    def Set[T]: [T <: Principal] = ???

    @stub
    // Return the Set of private credentials held by this
    // Subject.
    def getPrivateCredentials(): Set[Object] = ???

    @stub
    // Return a Set of private credentials associated with this
    // Subject that are instances or subclasses of the specified
    // Class.
    def Set[T]: [T] = ???

    @stub
    // Return the Set of public credentials held by this
    // Subject.
    def getPublicCredentials(): Set[Object] = ???

    @stub
    // Return a Set of public credentials associated with this
    // Subject that are instances or subclasses of the specified
    // Class.
    def Set[T]: [T] = ???

    @stub
    // Returns a hashcode for this Subject.
    def hashCode(): Int = ???

    @stub
    // Query whether this Subject is read-only.
    def isReadOnly(): Boolean = ???

    @stub
    // Set this Subject to be read-only.
    def setReadOnly(): Unit = ???
}

object Subject {
    @stub
    // Perform work as a particular Subject.
    def T: [T] = ???

    @stub
    // Perform work as a particular Subject.
    def T: [T] = ???

    @stub
    // Perform privileged work as a particular Subject.
    def T: [T] = ???

    @stub
    // Perform privileged work as a particular Subject.
    def T: [T] = ???

    @stub
    // Get the Subject associated with the provided
    // AccessControlContext.
    def getSubject(acc: AccessControlContext): Subject = ???
}
