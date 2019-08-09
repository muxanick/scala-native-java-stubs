package javax.xml.crypto.dsig

import java.io.InputStream
import java.lang.String
import java.util.List
import javax.xml.crypto.XMLStructure

// An representation of the XML SignedInfo element as
// defined in the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// The XML Schema Definition is defined as:
// 
// <element name="SignedInfo" type="ds:SignedInfoType"/>
// <complexType name="SignedInfoType">
//   <sequence>
//     <element ref="ds:CanonicalizationMethod"/>
//     <element ref="ds:SignatureMethod"/>
//     <element ref="ds:Reference" maxOccurs="unbounded"/>
//   </sequence>
//   <attribute name="Id" type="ID" use="optional"/>
// </complexType>
// 
//
// A SignedInfo instance may be created by invoking one of the
// newSignedInfo methods of the
// XMLSignatureFactory class.
trait SignedInfo extends XMLStructure {

    @stub
    // Returns the canonicalization method of this SignedInfo.
    def getCanonicalizationMethod(): CanonicalizationMethod = ???

    @stub
    // Returns the canonicalized signed info bytes after a signing or
    // validation operation.
    def getCanonicalizedData(): InputStream = ???

    @stub
    // Returns the optional Id attribute of this
    // SignedInfo.
    def getId(): String = ???

    @stub
    // Returns an unmodifiable list of one or more References.
    def getReferences(): List = ???
}
