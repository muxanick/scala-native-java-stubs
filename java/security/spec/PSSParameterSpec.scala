package java.security.spec

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class specifies a parameter spec for RSA-PSS signature scheme,
 *  as defined in the
 *  PKCS#1 v2.1
 *  standard.
 * 
 *  Its ASN.1 definition in PKCS#1 standard is described below:
 *  
 *  RSASSA-PSS-params ::= SEQUENCE {
 *    hashAlgorithm      [0] OAEP-PSSDigestAlgorithms  DEFAULT sha1,
 *    maskGenAlgorithm   [1] PKCS1MGFAlgorithms  DEFAULT mgf1SHA1,
 *    saltLength         [2] INTEGER  DEFAULT 20,
 *    trailerField       [3] INTEGER  DEFAULT 1
 *  }
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
 *  PKCS1MGFAlgorithms    ALGORITHM-IDENTIFIER ::= {
 *    { OID id-mgf1 PARAMETERS OAEP-PSSDigestAlgorithms },
 *    ...  -- Allows for future expansion --
 *  }
 *  
 *  Note: the PSSParameterSpec.DEFAULT uses the following:
 *      message digest  -- "SHA-1"
 *      mask generation function (mgf) -- "MGF1"
 *      parameters for mgf -- MGF1ParameterSpec.SHA1
 *      SaltLength   -- 20
 *      TrailerField -- 1
 */
class PSSParameterSpec extends Object with AlgorithmParameterSpec {

    /** Creates a new PSSParameterSpec
     *  using the specified salt length and other default values as
     *  defined in PKCS#1.
     */
    @stub
    def this(saltLen: Int) = ???

    /** Creates a new PSSParameterSpec as defined in
     *  the PKCS #1 standard using the specified message digest,
     *  mask generation function, parameters for mask generation
     *  function, salt length, and trailer field values.
     */
    @stub
    def this(mdName: String, mgfName: String, mgfSpec: AlgorithmParameterSpec, saltLen: Int, trailerField: Int) = ???

    /** Returns the message digest algorithm name. */
    @stub
    def getDigestAlgorithm(): String = ???

    /** Returns the mask generation function algorithm name. */
    @stub
    def getMGFAlgorithm(): String = ???

    /** Returns the parameters for the mask generation function. */
    @stub
    def getMGFParameters(): AlgorithmParameterSpec = ???

    /** Returns the salt length in bits. */
    @stub
    def getSaltLength(): Int = ???

    /** Returns the value for the trailer field, i.e. */
    @stub
    def getTrailerField(): Int = ???
}

object PSSParameterSpec {
    /** The PSS parameter set with all default values. */
    @stub
    val DEFAULT: PSSParameterSpec = ???
}
