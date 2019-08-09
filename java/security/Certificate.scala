package java.security

import java.io.{InputStream, OutputStream}
import java.lang.{Deprecated, String}

// This is an interface of abstract methods for managing a
// variety of identity certificates.
// An identity certificate is a guarantee by a principal that
// a public key is that of another principal.  (A principal represents
// an entity such as an individual user, a group, or a corporation.)
//
// In particular, this interface is intended to be a common
// abstraction for constructs that have different formats but
// important common uses.  For example, different types of
// certificates, such as X.509 certificates and PGP certificates,
// share general certificate functionality (the need to encode and
// decode certificates) and some types of information, such as a
// public key, the principal whose key it is, and the guarantor
// guaranteeing that the public key is that of the specified
// principal. So an implementation of X.509 certificates and an
// implementation of PGP certificates can both utilize the Certificate
// interface, even though their formats and additional types and
// amounts of information stored are different.
//
// Important: This interface is useful for cataloging and
// grouping objects sharing certain common uses. It does not have any
// semantics of its own. In particular, a Certificate object does not
// make any statement as to the validity of the binding. It is
// the duty of the application implementing this interface to verify
// the certificate and satisfy itself of its validity.
@Deprecated trait Certificate {

    @stub
    // Deprecated. 
    def decode(stream: InputStream): Unit = ???

    @stub
    // Deprecated. 
    def encode(stream: OutputStream): Unit = ???

    @stub
    // Deprecated. 
    def getFormat(): String = ???

    @stub
    // Deprecated. 
    def getGuarantor(): Principal = ???

    @stub
    // Deprecated. 
    def getPrincipal(): Principal = ???

    @stub
    // Deprecated. 
    def getPublicKey(): PublicKey = ???
}
