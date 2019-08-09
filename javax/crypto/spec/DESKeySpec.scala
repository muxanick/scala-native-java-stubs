package javax.crypto.spec

import java.lang.Object
import java.security.spec.KeySpec
import scala.scalanative.annotation.stub

/** This class specifies a DES key. */
class DESKeySpec extends Object with KeySpec {

    /** Creates a DESKeySpec object using the first 8 bytes in
     *  key as the key material for the DES key.
     */
    @stub
    def this(key: Array[Byte]) = ???

    /** Creates a DESKeySpec object using the first 8 bytes in
     *  key, beginning at offset inclusive,
     *  as the key material for the DES key.
     */
    @stub
    def this(key: Array[Byte], offset: Int) = ???

    /** Returns the DES key material. */
    @stub
    def getKey(): Array[Byte] = ???
}

object DESKeySpec {
    /** The constant which defines the length of a DES key in bytes. */
    @stub
    val DES_KEY_LEN: Int = ???

    /** Checks if the given DES key material, starting at offset
     *  inclusive, is parity-adjusted.
     */
    @stub
    def isParityAdjusted(key: Array[Byte], offset: Int): Boolean = ???

    /** Checks if the given DES key material is weak or semi-weak. */
    @stub
    def isWeak(key: Array[Byte], offset: Int): Boolean = ???
}
