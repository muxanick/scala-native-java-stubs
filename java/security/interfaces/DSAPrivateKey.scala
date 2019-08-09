package java.security.interfaces

import java.security.PrivateKey

// The standard interface to a DSA private key. DSA (Digital Signature
// Algorithm) is defined in NIST's FIPS-186.
trait DSAPrivateKey extends DSAKey , PrivateKey {
}
