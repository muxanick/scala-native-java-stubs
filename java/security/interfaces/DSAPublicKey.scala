package java.security.interfaces

import java.security.PublicKey

// The interface to a DSA public key. DSA (Digital Signature Algorithm)
// is defined in NIST's FIPS-186.
trait DSAPublicKey extends DSAKey , PublicKey {
}
