package javax.xml.crypto.dsig

import java.lang.String
import javax.xml.crypto.{AlgorithmMethod, XMLStructure}

// A representation of the XML DigestMethod element as
// defined in the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// The XML Schema Definition is defined as:
// 
// 
//   <element name="DigestMethod" type="ds:DigestMethodType"/>
//     <complexType name="DigestMethodType" mixed="true">
//       <sequence>
//         <any namespace="##any" minOccurs="0" maxOccurs="unbounded"/>
//           <!-- (0,unbounded) elements from (1,1) namespace -->
//       </sequence>
//       <attribute name="Algorithm" type="anyURI" use="required"/>
//     </complexType>
// 
//
// A DigestMethod instance may be created by invoking the
// newDigestMethod method
// of the XMLSignatureFactory class.
trait DigestMethod extends XMLStructure , AlgorithmMethod {
}

object DigestMethod {
    @stub
    // The 
    // RIPEMD-160 digest method algorithm URI.
    def RIPEMD160: String = ???

    @stub
    // The 
    // SHA1 digest method algorithm URI.
    def SHA1: String = ???

    @stub
    // The 
    // SHA256 digest method algorithm URI.
    def SHA256: String = ???
}