package java.security

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class is a simple holder for a key pair (a public key and a
 *  private key). It does not enforce any security, and, when initialized,
 *  should be treated like a PrivateKey.
 */
final class KeyPair extends Object with Serializable {

    /** Constructs a key pair from the given public key and private key. */
    @stub
    def this(publicKey: PublicKey, privateKey: PrivateKey) = ???

    /** Returns a reference to the private key component of this key pair. */
    @stub
    def getPrivate(): PrivateKey = ???

    /** Returns a reference to the public key component of this key pair. */
    @stub
    def getPublic(): PublicKey = ???
}
