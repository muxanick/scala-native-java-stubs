package javax.crypto

import java.lang.Object

/** The NullCipher class is a class that provides an
 *  "identity cipher" -- one that does not transform the plain text.  As
 *  a consequence, the ciphertext is identical to the plaintext.  All
 *  initialization methods do nothing, while the blocksize is set to 1
 *  byte.
 */
class NullCipher extends Cipher {
}
