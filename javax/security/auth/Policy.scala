package javax.security.auth

import java.lang.{Deprecated, Object}
import java.security.{CodeSource, PermissionCollection}
import scala.scalanative.annotation.stub

/**  This is an abstract class for representing the system policy for
 *  Subject-based authorization.  A subclass implementation
 *  of this class provides a means to specify a Subject-based
 *  access control Policy.
 * 
 *   A Policy object can be queried for the set of
 *  Permissions granted to code running as a
 *  Principal in the following manner:
 * 
 *  
 *       policy = Policy.getPolicy();
 *       PermissionCollection perms = policy.getPermissions(subject,
 *                                                       codeSource);
 *  
 * 
 *  The Policy object consults the local policy and returns
 *  and appropriate Permissions object with the
 *  Permissions granted to the Principals associated with the
 *  provided subject, and granted to the code specified
 *  by the provided codeSource.
 * 
 *   A Policy contains the following information.
 *  Note that this example only represents the syntax for the default
 *  Policy implementation. Subclass implementations of this class
 *  may implement alternative syntaxes and may retrieve the
 *  Policy from any source such as files, databases,
 *  or servers.
 * 
 *   Each entry in the Policy is represented as
 *  a grant entry.  Each grant entry
 *  specifies a codebase, code signers, and Principals triplet,
 *  as well as the Permissions granted to that triplet.
 * 
 *  
 *       grant CodeBase ["URL"], Signedby ["signers"],
 *             Principal [Principal_Class] "Principal_Name" {
 *           Permission Permission_Class ["Target_Name"]
 *                                       [, "Permission_Actions"]
 *                                       [, signedBy "SignerName"];
 *       };
 *  
 * 
 *  The CodeBase and Signedby components of the triplet name/value pairs
 *  are optional.  If they are not present, then any any codebase will match,
 *  and any signer (including unsigned code) will match.
 *  For Example,
 * 
 *  
 *       grant CodeBase "foo.com", Signedby "foo",
 *             Principal com.sun.security.auth.SolarisPrincipal "duke" {
 *           permission java.io.FilePermission "/home/duke", "read, write";
 *       };
 *  
 * 
 *  This grant entry specifies that code from "foo.com",
 *  signed by "foo', and running as a SolarisPrincipal with the
 *  name, duke, has one Permission.  This Permission
 *  permits the executing code to read and write files in the directory,
 *  "/home/duke".
 * 
 *   To "run" as a particular Principal,
 *  code invokes the Subject.doAs(subject, ...) method.
 *  After invoking that method, the code runs as all the Principals
 *  associated with the specified Subject.
 *  Note that this Policy (and the Permissions
 *  granted in this Policy) only become effective
 *  after the call to Subject.doAs has occurred.
 * 
 *   Multiple Principals may be listed within one grant entry.
 *  All the Principals in the grant entry must be associated with
 *  the Subject provided to Subject.doAs
 *  for that Subject to be granted the specified Permissions.
 * 
 *  
 *       grant Principal com.sun.security.auth.SolarisPrincipal "duke",
 *             Principal com.sun.security.auth.SolarisNumericUserPrincipal "0" {
 *           permission java.io.FilePermission "/home/duke", "read, write";
 *           permission java.net.SocketPermission "duke.com", "connect";
 *       };
 *  
 * 
 *  This entry grants any code running as both "duke" and "0"
 *  permission to read and write files in duke's home directory,
 *  as well as permission to make socket connections to "duke.com".
 * 
 *   Note that non Principal-based grant entries are not permitted
 *  in this Policy.  Therefore, grant entries such as:
 * 
 *  
 *       grant CodeBase "foo.com", Signedby "foo" {
 *           permission java.io.FilePermission "/tmp/scratch", "read, write";
 *       };
 *  
 * 
 *  are rejected.  Such permission must be listed in the
 *  java.security.Policy.
 * 
 *   The default Policy implementation can be changed by
 *  setting the value of the auth.policy.provider security property to
 *  the fully qualified name of the desired Policy implementation class.
 */
@Deprecated
abstract class Policy extends Object {

    /** Deprecated.  */
    @stub
    protected def this() = ???

    /** Deprecated.  */
    def getPermissions(subject: Subject, cs: CodeSource): PermissionCollection

    /** Deprecated.  */
    def refresh(): Unit
}

object Policy {
    /** Deprecated.  */
    @stub
    def getPolicy(): Policy = ???

    /** Deprecated.  */
    @stub
    def setPolicy(policy: Policy): Unit = ???
}
