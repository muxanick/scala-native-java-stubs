package java.security

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** An enumeration of cryptographic primitives. */
class CryptoPrimitive private (name: String, ordinal: Int) extends Enum[CryptoPrimitive](name, ordinal) {
}

object CryptoPrimitive {
    /** Symmetric primitive: block cipher */
    final val BLOCK_CIPHER: CryptoPrimitive = new CryptoPrimitive("BLOCK_CIPHER", 0)

    /** Asymmetric primitive: key agreement and key distribution */
    final val KEY_AGREEMENT: CryptoPrimitive = new CryptoPrimitive("KEY_AGREEMENT", 1)

    /** Asymmetric primitive: key encapsulation mechanism */
    final val KEY_ENCAPSULATION: CryptoPrimitive = new CryptoPrimitive("KEY_ENCAPSULATION", 2)

    /** Symmetric primitive: key wrap */
    final val KEY_WRAP: CryptoPrimitive = new CryptoPrimitive("KEY_WRAP", 3)

    /** Symmetric primitive: message authentication code */
    final val MAC: CryptoPrimitive = new CryptoPrimitive("MAC", 4)

    /** Hash function */
    final val MESSAGE_DIGEST: CryptoPrimitive = new CryptoPrimitive("MESSAGE_DIGEST", 5)

    /** Asymmetric primitive: public key encryption */
    final val PUBLIC_KEY_ENCRYPTION: CryptoPrimitive = new CryptoPrimitive("PUBLIC_KEY_ENCRYPTION", 6)

    /** Cryptographic random number generator */
    final val SECURE_RANDOM: CryptoPrimitive = new CryptoPrimitive("SECURE_RANDOM", 7)

    /** Asymmetric primitive: signature scheme */
    final val SIGNATURE: CryptoPrimitive = new CryptoPrimitive("SIGNATURE", 8)

    /** Symmetric primitive: stream cipher */
    final val STREAM_CIPHER: CryptoPrimitive = new CryptoPrimitive("STREAM_CIPHER", 9)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): CryptoPrimitive = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[CryptoPrimitive] = ???
}
