package javax.xml.crypto.dsig

import java.lang.String
import java.util.List
import javax.xml.crypto.XMLStructure

// A representation of the XML SignatureProperty element as
// defined in the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// The XML Schema Definition is defined as:
// 
//<element name="SignatureProperty" type="ds:SignaturePropertyType"/>
//   <complexType name="SignaturePropertyType" mixed="true">
//     <choice maxOccurs="unbounded">
//       <any namespace="##other" processContents="lax"/>
//       <!-- (1,1) elements from (1, unbounded) namespaces -->
//     </choice>
//     <attribute name="Target" type="anyURI" use="required"/>
//     <attribute name="Id" type="ID" use="optional"/>
//   </complexType>
// 
//
// A SignatureProperty instance may be created by invoking the
// newSignatureProperty
// method of the XMLSignatureFactory class; for example:
//
// 
//   XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
//   SignatureProperty property = factory.newSignatureProperty
//      (Collections.singletonList(content), "#Signature-1", "TimeStamp");
// 
trait SignatureProperty extends XMLStructure {

    @stub
    // Returns an unmodifiable
    // list of one or more XMLStructures that are contained in
    // this SignatureProperty.
    def getContent(): List = ???

    @stub
    // Returns the Id of this SignatureProperty.
    def getId(): String = ???
}
