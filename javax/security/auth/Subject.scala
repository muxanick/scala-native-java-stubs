package javax.security.auth

import java.io.Serializable
import java.lang.{Class, Object, String}
import java.security.{AccessControlContext, Principal, PrivilegedAction, PrivilegedExceptionAction}
import java.util.Set
import scala.scalanative.annotation.stub

/**  A Subject represents a grouping of related information
 *  for a single entity, such as a person.
 *  Such information includes the Subject's identities as well as
 *  its security-related attributes
 *  (passwords and cryptographic keys, for example).
 * 
 *   Subjects may potentially have multiple identities.
 *  Each identity is represented as a Principal
 *  within the Subject.  Principals simply bind names to a
 *  Subject.  For example, a Subject that happens
 *  to be a person, Alice, might have two Principals:
 *  one which binds "Alice Bar", the name on her driver license,
 *  to the Subject, and another which binds,
 *  "999-99-9999", the number on her student identification card,
 *  to the Subject.  Both Principals refer to the same
 *  Subject even though each has a different name.
 * 
 *   A Subject may also own security-related attributes,
 *  which are referred to as credentials.
 *  Sensitive credentials that require special protection, such as
 *  private cryptographic keys, are stored within a private credential
 *  Set.  Credentials intended to be shared, such as
 *  public key certificates or Kerberos server tickets are stored
 *  within a public credential Set.  Different permissions
 *  are required to access and modify the different credential Sets.
 * 
 *   To retrieve all the Principals associated with a Subject,
 *  invoke the getPrincipals method.  To retrieve
 *  all the public or private credentials belonging to a Subject,
 *  invoke the getPublicCredentials method or
 *  getPrivateCredentials method, respectively.
 *  To modify the returned Set of Principals and credentials,
 *  use the methods defined in the Set class.
 *  For example:
 *  
 *       Subject subject;
 *       Principal principal;
 *       Object credential;
 * 
 *       // add a Principal and credential to the Subject
 *       subject.getPrincipals().add(principal);
 *       subject.getPublicCredentials().add(credential);
 *  
 * 
 *   This Subject class implements Serializable.
 *  While the Principals associated with the Subject are serialized,
 *  the credentials associated with the Subject are not.
 *  Note that the java.security.Principal class
 *  does not implement Serializable.  Therefore all concrete
 *  Principal implementations associated with Subjects
 *  must implement Serializable.
 */
final class Subject extends Object with Serializable {

    /** Create an instance of a Subject
     *  with an empty Set of Principals and empty
     *  Sets of public and private credentials.
     */
    @stub
    def this() = ???

    /** Create an instance of a Subject with
     *  Principals and credentials.
     */
    @stub
    def this(readOnly: Boolean, principals: Set[_ <: Principal], pubCredentials: Set[_], privCredentials: Set[_]) = ???

    /** Compares the specified Object with this Subject
     *  for equality.
     */
    @stub
    def equals(o: Any): Boolean = ???

    /** Return the Set of Principals associated with this
     *  Subject.
     */
    @stub
    def getPrincipals(): Set[Principal] = ???

    /** Return a Set of Principals associated with this
     *  Subject that are instances or subclasses of the specified
     *  Class.
     */
    @stub
    def getPrincipals[T <: Principal](c: Class[T]): Set[T] = ???

    /** Return the Set of private credentials held by this
     *  Subject.
     */
    @stub
    def getPrivateCredentials(): Set[Object] = ???

    /** Return a Set of private credentials associated with this
     *  Subject that are instances or subclasses of the specified
     *  Class.
     */
    @stub
    def getPrivateCredentials[T](c: Class[T]): Set[T] = ???

    /** Return the Set of public credentials held by this
     *  Subject.
     */
    @stub
    def getPublicCredentials(): Set[Object] = ???

    /** Return a Set of public credentials associated with this
     *  Subject that are instances or subclasses of the specified
     *  Class.
     */
    @stub
    def getPublicCredentials[T](c: Class[T]): Set[T] = ???

    /** Returns a hashcode for this Subject. */
    @stub
    def hashCode(): Int = ???

    /** Query whether this Subject is read-only. */
    @stub
    def isReadOnly(): Boolean = ???

    /** Set this Subject to be read-only. */
    @stub
    def setReadOnly(): Unit = ???

    /** Return the String representation of this Subject. */
    @stub
    def toString(): String = ???
}

object Subject {
    /** Perform work as a particular Subject. */
    @stub
    def doAs[T](subject: Subject, action: PrivilegedAction[T]): T = ???

    /** Perform work as a particular Subject. */
    @stub
    def doAs[T](subject: Subject, action: PrivilegedExceptionAction[T]): T = ???

    /** Perform privileged work as a particular Subject. */
    @stub
    def doAsPrivileged[T](subject: Subject, action: PrivilegedAction[T], acc: AccessControlContext): T = ???

    /** Perform privileged work as a particular Subject. */
    @stub
    def doAsPrivileged[T](subject: Subject, action: PrivilegedExceptionAction[T], acc: AccessControlContext): T = ???

    /** Get the Subject associated with the provided
     *  AccessControlContext.
     */
    @stub
    def getSubject(acc: AccessControlContext): Subject = ???
}
