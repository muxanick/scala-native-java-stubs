package javax.crypto

import java.lang.{Object, String}
import java.security.{AlgorithmParameters, Key, Provider}
import java.security.spec.PKCS8EncodedKeySpec

// This class implements the EncryptedPrivateKeyInfo type
// as defined in PKCS #8.
// Its ASN.1 definition is as follows:
//
// 
// EncryptedPrivateKeyInfo ::=  SEQUENCE {
//     encryptionAlgorithm   AlgorithmIdentifier,
//     encryptedData   OCTET STRING }
//
// AlgorithmIdentifier  ::=  SEQUENCE  {
//     algorithm              OBJECT IDENTIFIER,
//     parameters             ANY DEFINED BY algorithm OPTIONAL  }
// 
class EncryptedPrivateKeyInfo extends Object {

    @stub
    // Constructs an EncryptedPrivateKeyInfo from the
    // encryption algorithm parameters and the encrypted data.
    def this(algParams: AlgorithmParameters, encryptedData: Array[Byte]) = ???

    @stub
    // Constructs (i.e., parses) an EncryptedPrivateKeyInfo from
    // its ASN.1 encoding.
    def this(encoded: Array[Byte]) = ???

    @stub
    // Returns the encryption algorithm.
    def getAlgName(): String = ???

    @stub
    // Returns the algorithm parameters used by the encryption algorithm.
    def getAlgParameters(): AlgorithmParameters = ???

    @stub
    // Returns the ASN.1 encoding of this object.
    def getEncoded(): Array[Byte] = ???

    @stub
    // Returns the encrypted data.
    def getEncryptedData(): Array[Byte] = ???

    @stub
    // Extract the enclosed PKCS8EncodedKeySpec object from the
    // encrypted data and return it.
    def getKeySpec(cipher: Cipher): PKCS8EncodedKeySpec = ???

    @stub
    // Extract the enclosed PKCS8EncodedKeySpec object from the
    // encrypted data and return it.
    def getKeySpec(decryptKey: Key): PKCS8EncodedKeySpec = ???

    @stub
    // Extract the enclosed PKCS8EncodedKeySpec object from the
    // encrypted data and return it.
    def getKeySpec(decryptKey: Key, provider: Provider): PKCS8EncodedKeySpec = ???
}
