package java.security.spec

import java.lang.Object

// This class represents a public or private key in encoded format.
abstract class EncodedKeySpec extends Object with KeySpec {

    // Returns the encoded key.
    def getEncoded(): Array[Byte]
}
