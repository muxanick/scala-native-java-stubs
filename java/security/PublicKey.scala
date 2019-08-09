package java.security

import scala.scalanative.annotation.stub

/** A public key. This interface contains no methods or constants.
 *  It merely serves to group (and provide type safety for) all public key
 *  interfaces.
 * 
 *  Note: The specialized public key interfaces extend this interface.
 *  See, for example, the DSAPublicKey interface in
 *  java.security.interfaces.
 */
trait PublicKey extends Key {
}

object PublicKey {
    /** The class fingerprint that is set to indicate serialization
     *  compatibility with a previous version of the class.
     */
    @stub
    val serialVersionUID: Long = ???
}
