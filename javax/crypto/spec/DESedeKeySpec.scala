package javax.crypto.spec

import java.lang.Object
import java.security.spec.KeySpec
import scala.scalanative.annotation.stub

/** This class specifies a DES-EDE ("triple-DES") key. */
class DESedeKeySpec extends Object with KeySpec {

    /** Creates a DESedeKeySpec object using the first 24 bytes in
     *  key as the key material for the DES-EDE key.
     */
    @stub
    def this(key: Array[Byte]) = ???

    /** Creates a DESedeKeySpec object using the first 24 bytes in
     *  key, beginning at offset inclusive,
     *  as the key material for the DES-EDE key.
     */
    @stub
    def this(key: Array[Byte], offset: Int) = ???

    /** Returns the DES-EDE key. */
    @stub
    def getKey(): Array[Byte] = ???
}

object DESedeKeySpec {
    /** The constant which defines the length of a DESede key in bytes. */
    @stub
    val DES_EDE_KEY_LEN: Int = ???

    /** Checks if the given DES-EDE key, starting at offset
     *  inclusive, is parity-adjusted.
     */
    @stub
    def isParityAdjusted(key: Array[Byte], offset: Int): Boolean = ???
}
