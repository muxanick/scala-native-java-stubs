package java.security

import java.lang.{Deprecated, Object, String}

// This class is used to represent an Identity that can also digitally
// sign data.
//
// The management of a signer's private keys is an important and
// sensitive issue that should be handled by subclasses as appropriate
// to their intended use.
@Deprecated abstract class Signer extends Identity {

    @stub
    // Deprecated. 
    protected def this() = ???

    @stub
    // Deprecated. 
    def this(name: String) = ???

    // Deprecated. 
    def getPrivateKey(): PrivateKey

    // Deprecated. 
    def setKeyPair(pair: KeyPair): Unit
}
