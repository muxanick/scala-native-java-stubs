package javax.crypto.spec

import java.lang.Object
import java.security.spec.KeySpec
import scala.scalanative.annotation.stub

/** A user-chosen password that can be used with password-based encryption
 *  (PBE).
 * 
 *  The password can be viewed as some kind of raw key material, from which
 *  the encryption mechanism that uses it derives a cryptographic key.
 * 
 *  Different PBE mechanisms may consume different bits of each password
 *  character. For example, the PBE mechanism defined in
 *  
 *  PKCS #5 looks at only the low order 8 bits of each character, whereas
 *  PKCS #12 looks at all 16 bits of each character.
 * 
 *  You convert the password characters to a PBE key by creating an
 *  instance of the appropriate secret-key factory. For example, a secret-key
 *  factory for PKCS #5 will construct a PBE key from only the low order 8 bits
 *  of each password character, whereas a secret-key factory for PKCS #12 will
 *  take all 16 bits of each character.
 * 
 *  Also note that this class stores passwords as char arrays instead of
 *  String objects (which would seem more logical), because the
 *  String class is immutable and there is no way to overwrite its
 *  internal value when the password stored in it is no longer needed. Hence,
 *  this class requests the password as a char array, so it can be overwritten
 *  when done.
 */
class PBEKeySpec extends Object with KeySpec {

    /** Constructor that takes a password. */
    @stub
    def this(password: Array[Char]) = ???

    /** Constructor that takes a password, salt, iteration count for
     *  generating PBEKey of fixed-key-size PBE ciphers.
     */
    @stub
    def this(password: Array[Char], salt: Array[Byte], iterationCount: Int) = ???

    /** Constructor that takes a password, salt, iteration count, and
     *  to-be-derived key length for generating PBEKey of variable-key-size
     *  PBE ciphers.
     */
    @stub
    def this(password: Array[Char], salt: Array[Byte], iterationCount: Int, keyLength: Int) = ???

    /** Clears the internal copy of the password. */
    @stub
    def clearPassword(): Unit = ???

    /** Returns the iteration count or 0 if not specified. */
    @stub
    def getIterationCount(): Int = ???

    /** Returns the to-be-derived key length or 0 if not specified. */
    @stub
    def getKeyLength(): Int = ???

    /** Returns a copy of the password. */
    @stub
    def getPassword(): Array[Char] = ???

    /** Returns a copy of the salt or null if not specified. */
    @stub
    def getSalt(): Array[Byte] = ???
}
