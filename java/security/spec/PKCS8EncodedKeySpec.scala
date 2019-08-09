package java.security.spec

import java.lang.Object

// This class represents the ASN.1 encoding of a private key,
// encoded according to the ASN.1 type PrivateKeyInfo.
// The PrivateKeyInfo syntax is defined in the PKCS#8 standard
// as follows:
//
// 
// PrivateKeyInfo ::= SEQUENCE {
//   version Version,
//   privateKeyAlgorithm PrivateKeyAlgorithmIdentifier,
//   privateKey PrivateKey,
//   attributes [0] IMPLICIT Attributes OPTIONAL }
//
// Version ::= INTEGER
//
// PrivateKeyAlgorithmIdentifier ::= AlgorithmIdentifier
//
// PrivateKey ::= OCTET STRING
//
// Attributes ::= SET OF Attribute
// 
class PKCS8EncodedKeySpec extends EncodedKeySpec {

    @stub
    // Returns the key bytes, encoded according to the PKCS #8 standard.
    def getEncoded(): Array[Byte] = ???
}
