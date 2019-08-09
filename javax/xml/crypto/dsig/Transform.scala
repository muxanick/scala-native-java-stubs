package javax.xml.crypto.dsig

import java.lang.String
import java.security.spec.AlgorithmParameterSpec
import javax.xml.crypto.{AlgorithmMethod, Data, XMLCryptoContext, XMLStructure}

// A representation of the XML Transform element as
// defined in the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// The XML Schema Definition is defined as:
//
// 
// <element name="Transform" type="ds:TransformType"/>
//   <complexType name="TransformType" mixed="true">
//     <choice minOccurs="0" maxOccurs="unbounded">
//       <any namespace="##other" processContents="lax"/>
//       <!-- (1,1) elements from (0,unbounded) namespaces -->
//       <element name="XPath" type="string"/>
//     </choice>
//     <attribute name="Algorithm" type="anyURI" use="required"/>
//   </complexType>
// 
//
// A Transform instance may be created by invoking the
// newTransform method
// of the XMLSignatureFactory class.
trait Transform extends XMLStructure , AlgorithmMethod {

    @stub
    // Returns the algorithm-specific input parameters associated with this
    // Transform.
    def getParameterSpec(): AlgorithmParameterSpec = ???

    @stub
    // Transforms the specified data using the underlying transform algorithm.
    def transform(data: Data, context: XMLCryptoContext): Data = ???
}

object Transform {
    @stub
    // The Base64
    // transform algorithm URI.
    def BASE64: String = ???

    @stub
    // The 
    // Enveloped Signature transform algorithm URI.
    def ENVELOPED: String = ???

    @stub
    // The XPath
    // transform algorithm URI.
    def XPATH: String = ???

    @stub
    // The 
    // XPath Filter 2 transform algorithm URI.
    def XPATH2: String = ???
}
