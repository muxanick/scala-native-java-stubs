package java.security.spec

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

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

    /** Creates a new X509EncodedKeySpec with the given encoded key. */
    @stub
    def this(encodedKey: Array[Byte]) = ???

    /** Returns the key bytes, encoded according to the X.509 standard. */
    @stub
    def getEncoded(): Array[Byte] = ???

    /** Returns the name of the encoding format associated with this
     *  key specification.
     */
    @stub
    def getFormat(): String = ???
}
