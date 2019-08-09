package java.security

import java.io.Serializable
import java.lang.Object

// This class is a simple holder for a key pair (a public key and a
// private key). It does not enforce any security, and, when initialized,
// should be treated like a PrivateKey.
final class KeyPair extends Object with Serializable {

    @stub
    // Returns a reference to the private key component of this key pair.
    def getPrivate(): PrivateKey = ???
}
