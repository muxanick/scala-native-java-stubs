package javax.xml.crypto.dsig

import java.lang.String
import javax.xml.crypto.{AlgorithmMethod, XMLStructure}

// A representation of the XML SignatureMethod element
// as defined in the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// The XML Schema Definition is defined as:
// 
// 
//   <element name="SignatureMethod" type="ds:SignatureMethodType"/>
//     <complexType name="SignatureMethodType" mixed="true">
//       <sequence>
//         <element name="HMACOutputLength" minOccurs="0" type="ds:HMACOutputLengthType"/>
//         <any namespace="##any" minOccurs="0" maxOccurs="unbounded"/>
//           <!-- (0,unbounded) elements from (1,1) namespace -->
//       </sequence>
//       <attribute name="Algorithm" type="anyURI" use="required"/>
//     </complexType>
// 
//
// A SignatureMethod instance may be created by invoking the
// newSignatureMethod method
// of the XMLSignatureFactory class.
trait SignatureMethod extends XMLStructure , AlgorithmMethod {
}

object SignatureMethod {
    @stub
    // The DSAwithSHA1
    // (DSS) signature method algorithm URI.
    def DSA_SHA1: String = ???

    @stub
    // The HMAC-SHA1
    // MAC signature method algorithm URI
    def HMAC_SHA1: String = ???
}
