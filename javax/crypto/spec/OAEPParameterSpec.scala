package javax.crypto.spec

import java.lang.{Object, String}
import java.security.spec.AlgorithmParameterSpec

// This class specifies the set of parameters used with OAEP Padding,
// as defined in the
// PKCS #1
// standard.
//
// Its ASN.1 definition in PKCS#1 standard is described below:
// 
// RSAES-OAEP-params ::= SEQUENCE {
//   hashAlgorithm      [0] OAEP-PSSDigestAlgorithms     DEFAULT sha1,
//   maskGenAlgorithm   [1] PKCS1MGFAlgorithms  DEFAULT mgf1SHA1,
//   pSourceAlgorithm   [2] PKCS1PSourceAlgorithms  DEFAULT pSpecifiedEmpty
// }
// 
// where
// 
// OAEP-PSSDigestAlgorithms    ALGORITHM-IDENTIFIER ::= {
//   { OID id-sha1 PARAMETERS NULL   }|
//   { OID id-sha256 PARAMETERS NULL }|
//   { OID id-sha384 PARAMETERS NULL }|
//   { OID id-sha512 PARAMETERS NULL },
//   ...  -- Allows for future expansion --
// }
// PKCS1MGFAlgorithms    ALGORITHM-IDENTIFIER ::= {
//   { OID id-mgf1 PARAMETERS OAEP-PSSDigestAlgorithms },
//   ...  -- Allows for future expansion --
// }
// PKCS1PSourceAlgorithms    ALGORITHM-IDENTIFIER ::= {
//   { OID id-pSpecified PARAMETERS OCTET STRING },
//   ...  -- Allows for future expansion --
// }
// 
// Note: the OAEPParameterSpec.DEFAULT uses the following:
//     message digest  -- "SHA-1"
//     mask generation function (mgf) -- "MGF1"
//     parameters for mgf -- MGF1ParameterSpec.SHA1
//     source of encoding input -- PSource.PSpecified.DEFAULT
class OAEPParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Returns the message digest algorithm name.
    def getDigestAlgorithm(): String = ???

    @stub
    // Returns the mask generation function algorithm name.
    def getMGFAlgorithm(): String = ???

    @stub
    // Returns the parameters for the mask generation function.
    def getMGFParameters(): AlgorithmParameterSpec = ???
}