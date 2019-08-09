package javax.crypto.spec

import java.lang.Object
import java.security.spec.KeySpec

// A user-chosen password that can be used with password-based encryption
// (PBE).
//
// The password can be viewed as some kind of raw key material, from which
// the encryption mechanism that uses it derives a cryptographic key.
//
// Different PBE mechanisms may consume different bits of each password
// character. For example, the PBE mechanism defined in
// 
// PKCS #5 looks at only the low order 8 bits of each character, whereas
// PKCS #12 looks at all 16 bits of each character.
//
// You convert the password characters to a PBE key by creating an
// instance of the appropriate secret-key factory. For example, a secret-key
// factory for PKCS #5 will construct a PBE key from only the low order 8 bits
// of each password character, whereas a secret-key factory for PKCS #12 will
// take all 16 bits of each character.
//
// Also note that this class stores passwords as char arrays instead of
// String objects (which would seem more logical), because the
// String class is immutable and there is no way to overwrite its
// internal value when the password stored in it is no longer needed. Hence,
// this class requests the password as a char array, so it can be overwritten
// when done.
class PBEKeySpec extends Object with KeySpec {

    @stub
    // Constructor that takes a password.
    def this(password: Array[Char]) = ???

    @stub
    // Constructor that takes a password, salt, iteration count for
    // generating PBEKey of fixed-key-size PBE ciphers.
    def this(password: Array[Char], salt: Array[Byte], iterationCount: Int) = ???

    @stub
    // Clears the internal copy of the password.
    def clearPassword(): Unit = ???

    @stub
    // Returns the iteration count or 0 if not specified.
    def getIterationCount(): Int = ???

    @stub
    // Returns the to-be-derived key length or 0 if not specified.
    def getKeyLength(): Int = ???

    @stub
    // Returns a copy of the password.
    def getPassword(): Array[Char] = ???
}
