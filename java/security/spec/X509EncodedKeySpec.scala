package java.security.spec

import java.lang.Object

/** This class represents the ASN.1 encoding of a public key,
 *  encoded according to the ASN.1 type SubjectPublicKeyInfo.
 *  The SubjectPublicKeyInfo syntax is defined in the X.509
 *  standard as follows:
 * 
 *  
 *  SubjectPublicKeyInfo ::= SEQUENCE {
 *    algorithm AlgorithmIdentifier,
 *    subjectPublicKey BIT STRING }
 *  
 */
class X509EncodedKeySpec extends EncodedKeySpec {

    /** Returns the key bytes, encoded according to the X.509 standard. */
    @stub
    def getEncoded(): Array[Byte] = ???
}
