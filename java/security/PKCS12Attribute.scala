package java.security

import java.lang.{Object, String}

// An attribute associated with a PKCS12 keystore entry.
// The attribute name is an ASN.1 Object Identifier and the attribute
// value is a set of ASN.1 types.
final class PKCS12Attribute extends Object with KeyStore.Entry.Attribute {

    @stub
    // Constructs a PKCS12 attribute from its ASN.1 DER encoding.
    def this(encoded: Array[Byte]) = ???

    @stub
    // Compares this PKCS12Attribute and a specified object for
    // equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the attribute's ASN.1 DER encoding.
    def getEncoded(): Array[Byte] = ???

    @stub
    // Returns the attribute's ASN.1 Object Identifier represented as a
    // list of dot-separated integers.
    def getName(): String = ???

    @stub
    // Returns the attribute's ASN.1 DER-encoded value as a string.
    def getValue(): String = ???

    @stub
    // Returns the hashcode for this PKCS12Attribute.
    def hashCode(): Int = ???
}
