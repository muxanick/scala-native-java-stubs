package org.ietf.jgss

import java.io.InputStream
import java.lang.Object

// This class represents Universal Object Identifiers (Oids) and their
// associated operations.
//
// Oids are hierarchically globally-interpretable identifiers used
// within the GSS-API framework to identify mechanisms and name formats.
//
// The structure and encoding of Oids is defined in ISOIEC-8824 and
// ISOIEC-8825.  For example the Oid representation of Kerberos V5
// mechanism is "1.2.840.113554.1.2.2"
//
// The GSSName name class contains public static Oid objects
// representing the standard name types defined in GSS-API.
class Oid extends Object {

    @stub
    // Creates an Oid object from its ASN.1 DER encoding.
    def this(data: Array[Byte]) = ???

    @stub
    // Creates an Oid object from its ASN.1 DER encoding.
    def this(derOid: InputStream) = ???

    @stub
    // A utility method to test if this Oid value is contained within the
    // supplied Oid array.
    def containedIn(oids: Array[Oid]): Boolean = ???

    @stub
    // Tests if two Oid objects represent the same Object identifier
    // value.
    def equals(other: Object): Boolean = ???

    @stub
    // Returns the full ASN.1 DER encoding for this oid object, which
    // includes the tag and length.
    def getDER(): Array[Byte] = ???

    @stub
    // Returns a hashcode value for this Oid.
    def hashCode(): Int = ???
}
