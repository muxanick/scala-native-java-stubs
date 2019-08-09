package javax.crypto.spec

import java.lang.Object
import java.security.spec.KeySpec

/** This class specifies a DES key. */
class DESKeySpec extends Object with KeySpec {

    /** Creates a DESKeySpec object using the first 8 bytes in
     *  key as the key material for the DES key.
     */
    @stub
    def this(key: Array[Byte]) = ???

    /** Returns the DES key material. */
    @stub
    def getKey(): Array[Byte] = ???
}

object DESKeySpec {
    /** Checks if the given DES key material, starting at offset
     *  inclusive, is parity-adjusted.
     */
    @stub
    def isParityAdjusted(key: Array[Byte], offset: Int): Boolean = ???
}
