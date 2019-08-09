package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec

// Specifies the set of parameters required by a Cipher using the Galois/Counter Mode (GCM) mode.
// 
// Simple block cipher modes (such as CBC) generally require only an
// initialization vector (such as IvParameterSpec),
// but GCM needs these parameters:
// 
// IV: Initialization Vector (IV) 
// tLen: length (in bits) of authentication tag T
// 
// 
// In addition to the parameters described here, other GCM inputs/output
// (Additional Authenticated Data (AAD), Keys, block ciphers,
// plain/ciphertext and authentication tags) are handled in the Cipher class.
// 
// Please see  RFC 5116
//  for more information on the Authenticated Encryption with
// Associated Data (AEAD) algorithm, and 
// NIST Special Publication 800-38D, "NIST Recommendation for Block
// Cipher Modes of Operation:  Galois/Counter Mode (GCM) and GMAC."
// 
// The GCM specification states that tLen may only have the
// values {128, 120, 112, 104, 96}, or {64, 32} for certain
// applications.  Other values can be specified for this class, but not
// all CSP implementations will support them.
class GCMParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Constructs a GCMParameterSpec using the specified authentication
    // tag bit-length and IV buffer.
    def this(tLen: Int, src: Array[Byte]) = ???

    @stub
    // Returns the Initialization Vector (IV).
    def getIV(): Array[Byte] = ???
}
