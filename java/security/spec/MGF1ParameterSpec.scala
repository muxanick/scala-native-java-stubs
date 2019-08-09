package java.security.spec

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class specifies the set of parameters used with mask generation
 *  function MGF1 in OAEP Padding and RSA-PSS signature scheme, as
 *  defined in the
 *  PKCS #1 v2.1
 *  standard.
 * 
 *  Its ASN.1 definition in PKCS#1 standard is described below:
 *  
 *  MGF1Parameters ::= OAEP-PSSDigestAlgorthms
 *  
 *  where
 *  
 *  OAEP-PSSDigestAlgorithms    ALGORITHM-IDENTIFIER ::= {
 *    { OID id-sha1 PARAMETERS NULL   }|
 *    { OID id-sha224 PARAMETERS NULL   }|
 *    { OID id-sha256 PARAMETERS NULL }|
 *    { OID id-sha384 PARAMETERS NULL }|
 *    { OID id-sha512 PARAMETERS NULL },
 *    ...  -- Allows for future expansion --
 *  }
 *  
 */
class MGF1ParameterSpec extends Object with AlgorithmParameterSpec {

    /** Constructs a parameter set for mask generation function MGF1
     *  as defined in the PKCS #1 standard.
     */
    @stub
    def this(mdName: String) = ???

    /** Returns the algorithm name of the message digest used by the mask
     *  generation function.
     */
    @stub
    def getDigestAlgorithm(): String = ???
}

object MGF1ParameterSpec {
    /** The MGF1ParameterSpec which uses "SHA-1" message digest. */
    @stub
    val SHA1: MGF1ParameterSpec = ???

    /** The MGF1ParameterSpec which uses "SHA-224" message digest. */
    @stub
    val SHA224: MGF1ParameterSpec = ???

    /** The MGF1ParameterSpec which uses "SHA-256" message digest. */
    @stub
    val SHA256: MGF1ParameterSpec = ???

    /** The MGF1ParameterSpec which uses "SHA-384" message digest. */
    @stub
    val SHA384: MGF1ParameterSpec = ???

    /** The MGF1ParameterSpec which uses SHA-512 message digest. */
    @stub
    val SHA512: MGF1ParameterSpec = ???
}
