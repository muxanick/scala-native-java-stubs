package javax.crypto

import java.lang.{Object, String}
import java.security.{AlgorithmParameters, Key, Provider}
import java.security.spec.PKCS8EncodedKeySpec

/** This class implements the EncryptedPrivateKeyInfo type
 *  as defined in PKCS #8.
 *  Its ASN.1 definition is as follows:
 * 
 *  
 *  EncryptedPrivateKeyInfo ::=  SEQUENCE {
 *      encryptionAlgorithm   AlgorithmIdentifier,
 *      encryptedData   OCTET STRING }
 * 
 *  AlgorithmIdentifier  ::=  SEQUENCE  {
 *      algorithm              OBJECT IDENTIFIER,
 *      parameters             ANY DEFINED BY algorithm OPTIONAL  }
 *  
 */
class EncryptedPrivateKeyInfo extends Object {

    /** Constructs an EncryptedPrivateKeyInfo from the
     *  encryption algorithm parameters and the encrypted data.
     */
    @stub
    def this(algParams: AlgorithmParameters, encryptedData: Array[Byte]) = ???

    /** Constructs (i.e., parses) an EncryptedPrivateKeyInfo from
     *  its ASN.1 encoding.
     */
    @stub
    def this(encoded: Array[Byte]) = ???

    /** Returns the encryption algorithm. */
    @stub
    def getAlgName(): String = ???

    /** Returns the algorithm parameters used by the encryption algorithm. */
    @stub
    def getAlgParameters(): AlgorithmParameters = ???

    /** Returns the ASN.1 encoding of this object. */
    @stub
    def getEncoded(): Array[Byte] = ???

    /** Returns the encrypted data. */
    @stub
    def getEncryptedData(): Array[Byte] = ???

    /** Extract the enclosed PKCS8EncodedKeySpec object from the
     *  encrypted data and return it.
     */
    @stub
    def getKeySpec(cipher: Cipher): PKCS8EncodedKeySpec = ???

    /** Extract the enclosed PKCS8EncodedKeySpec object from the
     *  encrypted data and return it.
     */
    @stub
    def getKeySpec(decryptKey: Key): PKCS8EncodedKeySpec = ???

    /** Extract the enclosed PKCS8EncodedKeySpec object from the
     *  encrypted data and return it.
     */
    @stub
    def getKeySpec(decryptKey: Key, provider: Provider): PKCS8EncodedKeySpec = ???
}
