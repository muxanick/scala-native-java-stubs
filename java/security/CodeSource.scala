package java.security

import java.io.Serializable
import java.lang.Object
import java.net.URL
import java.security.cert.Certificate

// This class extends the concept of a codebase to
// encapsulate not only the location (URL) but also the certificate chains
// that were used to verify signed code originating from that location.
class CodeSource extends Object with Serializable {

    @stub
    // Constructs a CodeSource and associates it with the specified
    // location and set of certificates.
    def this(url: URL, certs: Array[Certificate]) = ???

    @stub
    // Tests for equality between the specified object and this
    // object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the certificates associated with this CodeSource.
    def getCertificates(): Array[Certificate] = ???

    @stub
    // Returns the code signers associated with this CodeSource.
    def getCodeSigners(): Array[CodeSigner] = ???

    @stub
    // Returns the location associated with this CodeSource.
    def getLocation(): URL = ???

    @stub
    // Returns the hash code value for this object.
    def hashCode(): Int = ???

    @stub
    // Returns true if this CodeSource object "implies" the specified CodeSource.
    def implies(codesource: CodeSource): Boolean = ???
}
