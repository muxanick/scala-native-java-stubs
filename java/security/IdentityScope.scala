package java.security

import java.lang.{Deprecated, Object, String}
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** This class represents a scope for identities. It is an Identity
 *  itself, and therefore has a name and can have a scope. It can also
 *  optionally have a public key and associated certificates.
 * 
 *  An IdentityScope can contain Identity objects of all kinds, including
 *  Signers. All types of Identity objects can be retrieved, added, and
 *  removed using the same methods. Note that it is possible, and in fact
 *  expected, that different types of identity scopes will
 *  apply different policies for their various operations on the
 *  various types of Identities.
 * 
 *  There is a one-to-one mapping between keys and identities, and
 *  there can only be one copy of one key per scope. For example, suppose
 *  Acme Software, Inc is a software publisher known to a user.
 *  Suppose it is an Identity, that is, it has a public key, and a set of
 *  associated certificates. It is named in the scope using the name
 *  "Acme Software". No other named Identity in the scope has the same
 *  public  key. Of course, none has the same name as well.
 */
@Deprecated
abstract class IdentityScope extends Identity {

    /** Deprecated.  */
    @stub
    protected def this() = ???

    /** Deprecated.  */
    @stub
    def this(name: String) = ???

    /** Deprecated.  */
    @stub
    def this(name: String, scope: IdentityScope) = ???

    /** Deprecated.  */
    def addIdentity(identity: Identity): Unit

    /** Deprecated.  */
    def getIdentity(principal: Principal): Identity

    /** Deprecated.  */
    def getIdentity(key: PublicKey): Identity

    /** Deprecated.  */
    def getIdentity(name: String): Identity

    /** Deprecated.  */
    def identities(): Enumeration[Identity]

    /** Deprecated.  */
    def removeIdentity(identity: Identity): Unit

    /** Deprecated.  */
    def size(): Int

    /** Deprecated.  */
    def toString(): String
}

object IdentityScope {
    /** Deprecated.  */
    @stub
    def getSystemScope(): IdentityScope = ???

    /** Deprecated.  */
    @stub
    protected def setSystemScope(scope: IdentityScope): Unit = ???
}
