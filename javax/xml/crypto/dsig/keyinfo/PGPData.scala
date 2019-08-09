package javax.xml.crypto.dsig.keyinfo

import java.util.List
import javax.xml.crypto.XMLStructure

// A representation of the XML PGPData element as defined in
// the 
// W3C Recommendation for XML-Signature Syntax and Processing. A
// PGPData object is used to convey information related to
// PGP public key pairs and signatures on such keys. The XML Schema Definition
// is defined as:
//
// 
//    <element name="PGPData" type="ds:PGPDataType"/>
//    <complexType name="PGPDataType">
//      <choice>
//        <sequence>
//          <element name="PGPKeyID" type="base64Binary"/>
//          <element name="PGPKeyPacket" type="base64Binary" minOccurs="0"/>
//          <any namespace="##other" processContents="lax" minOccurs="0"
//           maxOccurs="unbounded"/>
//        </sequence>
//        <sequence>
//          <element name="PGPKeyPacket" type="base64Binary"/>
//          <any namespace="##other" processContents="lax" minOccurs="0"
//           maxOccurs="unbounded"/>
//        </sequence>
//      </choice>
//    </complexType>
// 
//
// A PGPData instance may be created by invoking one of the
// newPGPData methods of the KeyInfoFactory class, and passing it
// byte arrays representing the contents of the PGP public key
// identifier and/or PGP key material packet, and an optional list of
// elements from an external namespace.
trait PGPData extends XMLStructure {

    @stub
    // Returns an unmodifiable list
    // of XMLStructures representing elements from an external
    // namespace.
    def getExternalElements(): List = ???

    @stub
    // Returns the PGP public key identifier of this PGPData as
    // defined in RFC 2440,
    // section 11.2.
    def getKeyId(): Array[Byte] = ???
}
