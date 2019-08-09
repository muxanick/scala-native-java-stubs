package java.security.cert

import java.lang.String
import java.util.Set

// Interface for an X.509 extension.
//
// The extensions defined for X.509 v3
// Certificates and v2
// CRLs (Certificate Revocation
// Lists) provide methods
// for associating additional attributes with users or public keys,
// for managing the certification hierarchy, and for managing CRL
// distribution. The X.509 extensions format also allows communities
// to define private extensions to carry information unique to those
// communities.
//
// Each extension in a certificate/CRL may be designated as
// critical or non-critical.  A certificate/CRL-using system (an application
// validating a certificate/CRL) must reject the certificate/CRL if it
// encounters a critical extension it does not recognize.  A non-critical
// extension may be ignored if it is not recognized.
// 
// The ASN.1 definition for this is:
// 
// Extensions  ::=  SEQUENCE SIZE (1..MAX) OF Extension
//
// Extension  ::=  SEQUENCE  {
//     extnId        OBJECT IDENTIFIER,
//     critical      BOOLEAN DEFAULT FALSE,
//     extnValue     OCTET STRING
//                   -- contains a DER encoding of a value
//                   -- of the type registered for use with
//                   -- the extnId object identifier value
// }
// 
// Since not all extensions are known, the getExtensionValue
// method returns the DER-encoded OCTET STRING of the
// extension value (i.e., the extnValue). This can then
// be handled by a Class that understands the extension.
trait X509Extension {

    @stub
    // Gets a Set of the OID strings for the extension(s) marked
    // CRITICAL in the certificate/CRL managed by the object
    // implementing this interface.
    def getCriticalExtensionOIDs(): Set[String] = ???

    @stub
    // Gets the DER-encoded OCTET string for the extension value
    // (extnValue) identified by the passed-in oid
    // String.
    def getExtensionValue(oid: String): Array[Byte] = ???

    @stub
    // Gets a Set of the OID strings for the extension(s) marked
    // NON-CRITICAL in the certificate/CRL managed by the object
    // implementing this interface.
    def getNonCriticalExtensionOIDs(): Set[String] = ???
}
