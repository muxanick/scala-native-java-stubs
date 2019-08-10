package javax.security.auth

import java.lang.{Object, String}
import java.security.{Permission, PermissionCollection}
import scala.scalanative.annotation.stub

/** This class is used to protect access to private Credentials
 *  belonging to a particular Subject.  The Subject
 *  is represented by a Set of Principals.
 * 
 *   The target name of this Permission specifies
 *  a Credential class name, and a Set of Principals.
 *  The only valid value for this Permission's actions is, "read".
 *  The target name must abide by the following syntax:
 * 
 *  
 *       CredentialClass {PrincipalClass "PrincipalName"}*
 *  
 * 
 *  For example, the following permission grants access to the
 *  com.sun.PrivateCredential owned by Subjects which have
 *  a com.sun.Principal with the name, "duke".  Note that although
 *  this example, as well as all the examples below, do not contain
 *  Codebase, SignedBy, or Principal information in the grant statement
 *  (for simplicity reasons), actual policy configurations should
 *  specify that information when appropriate.
 * 
 *  
 * 
 *     grant {
 *       permission javax.security.auth.PrivateCredentialPermission
 *               "com.sun.PrivateCredential com.sun.Principal \"duke\"",
 *               "read";
 *     };
 *  
 * 
 *  If CredentialClass is "*", then access is granted to
 *  all private Credentials belonging to the specified
 *  Subject.
 *  If "PrincipalName" is "*", then access is granted to the
 *  specified Credential owned by any Subject that has the
 *  specified Principal (the actual PrincipalName doesn't matter).
 *  For example, the following grants access to the
 *  a.b.Credential owned by any Subject that has
 *  an a.b.Principal.
 * 
 *  
 *     grant {
 *       permission javax.security.auth.PrivateCredentialPermission
 *               "a.b.Credential a.b.Principal "*"",
 *               "read";
 *     };
 *  
 * 
 *  If both the PrincipalClass and "PrincipalName" are "*",
 *  then access is granted to the specified Credential owned by
 *  any Subject.
 * 
 *   In addition, the PrincipalClass/PrincipalName pairing may be repeated:
 * 
 *  
 *     grant {
 *       permission javax.security.auth.PrivateCredentialPermission
 *               "a.b.Credential a.b.Principal "duke" c.d.Principal "dukette"",
 *               "read";
 *     };
 *  
 * 
 *  The above grants access to the private Credential, "a.b.Credential",
 *  belonging to a Subject with at least two associated Principals:
 *  "a.b.Principal" with the name, "duke", and "c.d.Principal", with the name,
 *  "dukette".
 */
final class PrivateCredentialPermission extends Permission {

    /** Creates a new PrivateCredentialPermission
     *  with the specified name.
     */
    @stub
    def this(name: String, actions: String) = ???

    /** Checks two PrivateCredentialPermission objects for
     *  equality.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the "canonical string representation" of the actions. */
    @stub
    def getActions(): String = ???

    /** Returns the Class name of the Credential associated with this
     *  PrivateCredentialPermission.
     */
    @stub
    def getCredentialClass(): String = ???

    /** Returns the Principal classes and names
     *  associated with this PrivateCredentialPermission.
     */
    @stub
    def getPrincipals(): Array[Array[String]] = ???

    /** Returns the hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this PrivateCredentialPermission implies
     *  the specified Permission.
     */
    @stub
    def implies(p: Permission): Boolean = ???

    /** Return a homogeneous collection of PrivateCredentialPermissions
     *  in a PermissionCollection.
     */
    @stub
    def newPermissionCollection(): PermissionCollection = ???
}
