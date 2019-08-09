package javax.xml.crypto.dsig

import java.lang.String

// A representation of the XML CanonicalizationMethod
// element as defined in the
// 
// W3C Recommendation for XML-Signature Syntax and Processing. The XML
// Schema Definition is defined as:
// 
// 
//   <element name="CanonicalizationMethod" type="ds:CanonicalizationMethodType"/>
//     <complexType name="CanonicalizationMethodType" mixed="true">
//       <sequence>
//         <any namespace="##any" minOccurs="0" maxOccurs="unbounded"/>
//           <!-- (0,unbounded) elements from (1,1) namespace -->
//       </sequence>
//       <attribute name="Algorithm" type="anyURI" use="required"/>
//     </complexType>
// 
//
// A CanonicalizationMethod instance may be created by invoking
// the newCanonicalizationMethod method of the XMLSignatureFactory class.
trait CanonicalizationMethod extends Transform {
}

object CanonicalizationMethod {
    @stub
    // The Exclusive
    // Canonical XML (without comments) canonicalization method algorithm
    // URI.
    def EXCLUSIVE: String = ???

    @stub
    // The 
    // Exclusive Canonical XML with comments canonicalization method
    // algorithm URI.
    def EXCLUSIVE_WITH_COMMENTS: String = ???

    @stub
    // The Canonical
    // XML (without comments) canonicalization method algorithm URI.
    def INCLUSIVE: String = ???
}
