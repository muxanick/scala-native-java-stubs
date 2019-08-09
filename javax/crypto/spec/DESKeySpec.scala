package javax.crypto.spec

import java.lang.Object
import java.security.spec.KeySpec

// This class specifies a DES key.
class DESKeySpec extends Object with KeySpec {

    @stub
    // Creates a DESKeySpec object using the first 8 bytes in
    // key as the key material for the DES key.
    def this(key: Array[Byte]) = ???

    @stub
    // Returns the DES key material.
    def getKey(): Array[Byte] = ???
}

object DESKeySpec {
    @stub
    // Checks if the given DES key material, starting at offset
    // inclusive, is parity-adjusted.
    def isParityAdjusted(key: Array[Byte], offset: Int): Boolean = ???
}
