package java.security

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An attribute associated with a PKCS12 keystore entry.
 *  The attribute name is an ASN.1 Object Identifier and the attribute
 *  value is a set of ASN.1 types.
 */
final class PKCS12Attribute extends Object with KeyStore.Entry.Attribute {

    /** Constructs a PKCS12 attribute from its ASN.1 DER encoding. */
    @stub
    def this(encoded: Array[Byte]) = ???

    /** Constructs a PKCS12 attribute from its name and value. */
    @stub
    def this(name: String, value: String) = ???

    /** Compares this PKCS12Attribute and a specified object for
     *  equality.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the attribute's ASN.1 DER encoding. */
    @stub
    def getEncoded(): Array[Byte] = ???

    /** Returns the attribute's ASN.1 Object Identifier represented as a
     *  list of dot-separated integers.
     */
    @stub
    def getName(): String = ???

    /** Returns the attribute's ASN.1 DER-encoded value as a string. */
    @stub
    def getValue(): String = ???

    /** Returns the hashcode for this PKCS12Attribute. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of this PKCS12Attribute. */
    @stub
    def toString(): String = ???
}
