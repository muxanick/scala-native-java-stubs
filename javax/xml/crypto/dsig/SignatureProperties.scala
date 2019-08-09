package javax.xml.crypto.dsig

import java.lang.String
import javax.xml.crypto.XMLStructure

// A representation of the XML SignatureProperties element as
// defined in the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// The XML Schema Definition is defined as:
// 
//<element name="SignatureProperties" type="ds:SignaturePropertiesType"/>
//   <complexType name="SignaturePropertiesType">
//     <sequence>
//       <element ref="ds:SignatureProperty" maxOccurs="unbounded"/>
//     </sequence>
//     <attribute name="Id" type="ID" use="optional"/>
//   </complexType>
// 
//
// A SignatureProperties instance may be created by invoking the
// newSignatureProperties
// method of the XMLSignatureFactory class; for example:
//
// 
//   XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
//   SignatureProperties properties =
//      factory.newSignatureProperties(props, "signature-properties-1");
// 
trait SignatureProperties extends XMLStructure {

    @stub
    // Returns the Id of this SignatureProperties.
    def getId(): String = ???
}
