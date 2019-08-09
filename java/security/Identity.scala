package java.security

import java.io.Serializable
import java.lang.{Deprecated, Object, String}
import scala.scalanative.annotation.stub

/** This class represents identities: real-world objects such as people,
 *  companies or organizations whose identities can be authenticated using
 *  their public keys. Identities may also be more abstract (or concrete)
 *  constructs, such as daemon threads or smart cards.
 * 
 *  All Identity objects have a name and a public key. Names are
 *  immutable. Identities may also be scoped. That is, if an Identity is
 *  specified to have a particular scope, then the name and public
 *  key of the Identity are unique within that scope.
 * 
 *  An Identity also has a set of certificates (all certifying its own
 *  public key). The Principal names specified in these certificates need
 *  not be the same, only the key.
 * 
 *  An Identity can be subclassed, to include postal and email addresses,
 *  telephone numbers, images of faces and logos, and so on.
 */
@Deprecated abstract class Identity extends Object with Principal with Serializable {

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
    def addCertificate(certificate: Certificate): Unit

    /** Deprecated.  */
    def certificates(): Array[Certificate]

    /** Deprecated.  */
    def equals(identity: Object): Boolean

    /** Deprecated.  */
    def getInfo(): String

    /** Deprecated.  */
    def getName(): String

    /** Deprecated.  */
    def getPublicKey(): PublicKey

    /** Deprecated.  */
    def getScope(): IdentityScope

    /** Deprecated.  */
    def hashCode(): Int

    /** Deprecated.  */
    protected def identityEquals(identity: Identity): Boolean

    /** Deprecated.  */
    def removeCertificate(certificate: Certificate): Unit

    /** Deprecated.  */
    def setInfo(info: String): Unit

    /** Deprecated.  */
    def setPublicKey(key: PublicKey): Unit

    /** Deprecated.  */
    def toString(): String

    /** Deprecated.  */
    def toString(detailed: Boolean): String
}
