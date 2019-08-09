package java.security

import java.lang.{Enum, Object, String}

/** An enumeration of cryptographic primitives. */
class CryptoPrimitive private (name: String, ordinal: Int) extends Enum[CryptoPrimitive](name, ordinal) {
}

object CryptoPrimitive {
    /** Symmetric primitive: block cipher */
    final val BLOCK_CIPHER = new CryptoPrimitive(BLOCK_CIPHER, 0)

    /** Asymmetric primitive: key agreement and key distribution */
    final val KEY_AGREEMENT = new CryptoPrimitive(KEY_AGREEMENT, 1)

    /** Asymmetric primitive: key encapsulation mechanism */
    final val KEY_ENCAPSULATION = new CryptoPrimitive(KEY_ENCAPSULATION, 2)

    /** Symmetric primitive: key wrap */
    final val KEY_WRAP = new CryptoPrimitive(KEY_WRAP, 3)

    /** Symmetric primitive: message authentication code */
    final val MAC = new CryptoPrimitive(MAC, 4)

    /** Hash function */
    final val MESSAGE_DIGEST = new CryptoPrimitive(MESSAGE_DIGEST, 5)

    /** Asymmetric primitive: public key encryption */
    final val PUBLIC_KEY_ENCRYPTION = new CryptoPrimitive(PUBLIC_KEY_ENCRYPTION, 6)

    /** Cryptographic random number generator */
    final val SECURE_RANDOM = new CryptoPrimitive(SECURE_RANDOM, 7)

    /** Asymmetric primitive: signature scheme */
    final val SIGNATURE = new CryptoPrimitive(SIGNATURE, 8)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): CryptoPrimitive = ???
}
