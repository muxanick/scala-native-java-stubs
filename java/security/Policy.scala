package java.security

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A Policy object is responsible for determining whether code executing
 *  in the Java runtime environment has permission to perform a
 *  security-sensitive operation.
 * 
 *   There is only one Policy object installed in the runtime at any
 *  given time.  A Policy object can be installed by calling the
 *  setPolicy method.  The installed Policy object can be
 *  obtained by calling the getPolicy method.
 * 
 *   If no Policy object has been installed in the runtime, a call to
 *  getPolicy installs an instance of the default Policy
 *  implementation (a default subclass implementation of this abstract class).
 *  The default Policy implementation can be changed by setting the value
 *  of the policy.provider security property to the fully qualified
 *  name of the desired Policy subclass implementation.
 * 
 *   Application code can directly subclass Policy to provide a custom
 *  implementation.  In addition, an instance of a Policy object can be
 *  constructed by invoking one of the getInstance factory methods
 *  with a standard type.  The default policy type is "JavaPolicy".
 * 
 *   Once a Policy instance has been installed (either by default, or by
 *  calling setPolicy), the Java runtime invokes its
 *  implies method when it needs to
 *  determine whether executing code (encapsulated in a ProtectionDomain)
 *  can perform SecurityManager-protected operations.  How a Policy object
 *  retrieves its policy data is up to the Policy implementation itself.
 *  The policy data may be stored, for example, in a flat ASCII file,
 *  in a serialized binary file of the Policy class, or in a database.
 * 
 *   The refresh method causes the policy object to
 *  refresh/reload its data.  This operation is implementation-dependent.
 *  For example, if the policy object stores its data in configuration files,
 *  calling refresh will cause it to re-read the configuration
 *  policy files.  If a refresh operation is not supported, this method does
 *  nothing.  Note that refreshed policy may not have an effect on classes
 *  in a particular ProtectionDomain. This is dependent on the Policy
 *  provider's implementation of the implies
 *  method and its PermissionCollection caching strategy.
 */
abstract class Policy extends Object {

    /**  */
    @stub
    def this() = ???

    /** Return Policy parameters. */
    def getParameters(): Policy.Parameters

    /** Return a PermissionCollection object containing the set of
     *  permissions granted to the specified CodeSource.
     */
    def getPermissions(codesource: CodeSource): PermissionCollection

    /** Return a PermissionCollection object containing the set of
     *  permissions granted to the specified ProtectionDomain.
     */
    def getPermissions(domain: ProtectionDomain): PermissionCollection

    /** Return the Provider of this Policy. */
    def getProvider(): Provider

    /** Return the type of this Policy. */
    def getType(): String

    /** Evaluates the global policy for the permissions granted to
     *  the ProtectionDomain and tests whether the permission is
     *  granted.
     */
    def implies(domain: ProtectionDomain, permission: Permission): Boolean

    /** Refreshes/reloads the policy configuration. */
    def refresh(): Unit
}

object Policy {
    /** This represents a marker interface for Policy parameters. */
    trait Parameters {


    /** A read-only empty PermissionCollection instance. */
    @stub
    val UNSUPPORTED_EMPTY_COLLECTION: PermissionCollection = ???

    /** Returns a Policy object of the specified type. */
    @stub
    def getInstance(type: String, params: Policy.Parameters): Policy = ???

    /** Returns a Policy object of the specified type. */
    @stub
    def getInstance(type: String, params: Policy.Parameters, provider: Provider): Policy = ???

    /** Returns a Policy object of the specified type. */
    @stub
    def getInstance(type: String, params: Policy.Parameters, provider: String): Policy = ???

    /** Returns the installed Policy object. */
    @stub
    def getPolicy(): Policy = ???

    /** Sets the system-wide Policy object. */
    @stub
    def setPolicy(p: Policy): Unit = ???
}
