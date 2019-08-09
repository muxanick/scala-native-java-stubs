package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec

/** This class specifies an initialization vector (IV).
 *  Examples which use IVs are ciphers in feedback mode,
 *  e.g., DES in CBC mode and RSA ciphers with OAEP encoding
 *  operation.
 */
class IvParameterSpec extends Object with AlgorithmParameterSpec {

    /** Creates an IvParameterSpec object using the bytes in iv
     *  as the IV.
     */
    @stub
    def this(iv: Array[Byte]) = ???
}
