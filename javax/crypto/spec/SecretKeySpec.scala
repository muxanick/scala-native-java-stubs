package javax.crypto.spec

import java.lang.{Object, String}
import java.security.spec.KeySpec
import javax.crypto.SecretKey

// This class specifies a secret key in a provider-independent fashion.
//
// It can be used to construct a SecretKey from a byte array,
// without having to go through a (provider-based)
// SecretKeyFactory.
//
// This class is only useful for raw secret keys that can be represented as
// a byte array and have no key parameters associated with them, e.g., DES or
// Triple DES keys.
class SecretKeySpec extends Object with KeySpec, with SecretKey {

    @stub
    // Constructs a secret key from the given byte array, using the first
    // len bytes of key, starting at
    // offset inclusive.
    def this(key: Array[Byte], offset: Int, len: Int, algorithm: String) = ???

    @stub
    // Tests for equality between the specified object and this
    // object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the name of the algorithm associated with this secret key.
    def getAlgorithm(): String = ???

    @stub
    // Returns the key material of this secret key.
    def getEncoded(): Array[Byte] = ???

    @stub
    // Returns the name of the encoding format for this secret key.
    def getFormat(): String = ???
}
