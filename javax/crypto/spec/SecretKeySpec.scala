package javax.crypto.spec

import java.lang.{Object, String}
import java.security.spec.KeySpec
import javax.crypto.SecretKey
import scala.scalanative.annotation.stub

/** This class specifies a secret key in a provider-independent fashion.
 * 
 *  It can be used to construct a SecretKey from a byte array,
 *  without having to go through a (provider-based)
 *  SecretKeyFactory.
 * 
 *  This class is only useful for raw secret keys that can be represented as
 *  a byte array and have no key parameters associated with them, e.g., DES or
 *  Triple DES keys.
 */
class SecretKeySpec extends Object with KeySpec with SecretKey {

    /** Constructs a secret key from the given byte array, using the first
     *  len bytes of key, starting at
     *  offset inclusive.
     */
    @stub
    def this(key: Array[Byte], offset: Int, len: Int, algorithm: String) = ???

    /** Constructs a secret key from the given byte array. */
    @stub
    def this(key: Array[Byte], algorithm: String) = ???

    /** Tests for equality between the specified object and this
     *  object.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the name of the algorithm associated with this secret key. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the key material of this secret key. */
    @stub
    def getEncoded(): Array[Byte] = ???

    /** Returns the name of the encoding format for this secret key. */
    @stub
    def getFormat(): String = ???

    /** Calculates a hash code value for the object. */
    @stub
    def hashCode(): Int = ???
}
