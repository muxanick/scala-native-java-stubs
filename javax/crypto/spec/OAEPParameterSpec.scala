package javax.crypto.spec

import java.lang.{Object, String}
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class specifies the set of parameters used with OAEP Padding,
 *  as defined in the
 *  PKCS #1
 *  standard.
 * 
 *  Its ASN.1 definition in PKCS#1 standard is described below:
 *  
 *  RSAES-OAEP-params ::= SEQUENCE {
 *    hashAlgorithm      [0] OAEP-PSSDigestAlgorithms     DEFAULT sha1,
 *    maskGenAlgorithm   [1] PKCS1MGFAlgorithms  DEFAULT mgf1SHA1,
 *    pSourceAlgorithm   [2] PKCS1PSourceAlgorithms  DEFAULT pSpecifiedEmpty
 *  }
 *  
 *  where
 *  
 *  OAEP-PSSDigestAlgorithms    ALGORITHM-IDENTIFIER ::= {
 *    { OID id-sha1 PARAMETERS NULL   }|
 *    { OID id-sha256 PARAMETERS NULL }|
 *    { OID id-sha384 PARAMETERS NULL }|
 *    { OID id-sha512 PARAMETERS NULL },
 *    ...  -- Allows for future expansion --
 *  }
 *  PKCS1MGFAlgorithms    ALGORITHM-IDENTIFIER ::= {
 *    { OID id-mgf1 PARAMETERS OAEP-PSSDigestAlgorithms },
 *    ...  -- Allows for future expansion --
 *  }
 *  PKCS1PSourceAlgorithms    ALGORITHM-IDENTIFIER ::= {
 *    { OID id-pSpecified PARAMETERS OCTET STRING },
 *    ...  -- Allows for future expansion --
 *  }
 *  
 *  Note: the OAEPParameterSpec.DEFAULT uses the following:
 *      message digest  -- "SHA-1"
 *      mask generation function (mgf) -- "MGF1"
 *      parameters for mgf -- MGF1ParameterSpec.SHA1
 *      source of encoding input -- PSource.PSpecified.DEFAULT
 */
class OAEPParameterSpec extends Object with AlgorithmParameterSpec {

    /** Constructs a parameter set for OAEP padding as defined in
     *  the PKCS #1 standard using the specified message digest
     *  algorithm mdName, mask generation function
     *  algorithm mgfName, parameters for the mask
     *  generation function mgfSpec, and source of
     *  the encoding input P pSrc.
     */
    @stub
    def this(mdName: String, mgfName: String, mgfSpec: AlgorithmParameterSpec, pSrc: PSource) = ???

    /** Returns the message digest algorithm name. */
    @stub
    def getDigestAlgorithm(): String = ???

    /** Returns the mask generation function algorithm name. */
    @stub
    def getMGFAlgorithm(): String = ???

    /** Returns the parameters for the mask generation function. */
    @stub
    def getMGFParameters(): AlgorithmParameterSpec = ???

    /** Returns the source of encoding input P. */
    @stub
    def getPSource(): PSource = ???
}

object OAEPParameterSpec {
    /** The OAEP parameter set with all default values. */
    @stub
    val DEFAULT: OAEPParameterSpec = ???
}
