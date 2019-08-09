package javax.security.auth.x500

import java.io.{InputStream, Serializable}
import java.lang.{Object, String}
import java.security.Principal
import java.util.Map

//  This class represents an X.500 Principal.
// X500Principals are represented by distinguished names such as
// "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US".
//
//  This class can be instantiated by using a string representation
// of the distinguished name, or by using the ASN.1 DER encoded byte
// representation of the distinguished name.  The current specification
// for the string representation of a distinguished name is defined in
// RFC 2253: Lightweight
// Directory Access Protocol (v3): UTF-8 String Representation of
// Distinguished Names. This class, however, accepts string formats from
// both RFC 2253 and RFC 1779:
// A String Representation of Distinguished Names, and also recognizes
// attribute type keywords whose OIDs (Object Identifiers) are defined in
// RFC 3280: Internet X.509
// Public Key Infrastructure Certificate and CRL Profile.
//
//  The string representation for this X500Principal
// can be obtained by calling the getName methods.
//
//  Note that the getSubjectX500Principal and
// getIssuerX500Principal methods of
// X509Certificate return X500Principals representing the
// issuer and subject fields of the certificate.
final class X500Principal extends Object with Principal, with Serializable {

    @stub
    // Creates an X500Principal from a distinguished name in
    // ASN.1 DER encoded form.
    def this(name: Array[Byte]) = ???

    @stub
    // Creates an X500Principal from an InputStream
    // containing the distinguished name in ASN.1 DER encoded form.
    def this(is: InputStream) = ???

    @stub
    // Creates an X500Principal from a string representation of
    // an X.500 distinguished name (ex:
    // "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US").
    def this(name: String) = ???

    @stub
    // Compares the specified Object with this
    // X500Principal for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the distinguished name in ASN.1 DER encoded form.
    def getEncoded(): Array[Byte] = ???

    @stub
    // Returns a string representation of the X.500 distinguished name using
    // the format defined in RFC 2253.
    def getName(): String = ???

    @stub
    // Returns a string representation of the X.500 distinguished name
    // using the specified format.
    def getName(format: String): String = ???

    @stub
    // Returns a string representation of the X.500 distinguished name
    // using the specified format.
    def getName(format: String, oidMap: Map[String, String]): String = ???

    @stub
    // Return a hash code for this X500Principal.
    def hashCode(): Int = ???
}

object X500Principal {
    @stub
    // Canonical String format of Distinguished Names.
    def CANONICAL: String = ???

    @stub
    // RFC 1779 String format of Distinguished Names.
    def RFC1779: String = ???
}
