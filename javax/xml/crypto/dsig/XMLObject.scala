package javax.xml.crypto.dsig

import java.lang.String
import java.util.List
import javax.xml.crypto.XMLStructure

// A representation of the XML Object element as defined in
// the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// An XMLObject may contain any data and may include optional
// MIME type, ID, and encoding attributes. The XML Schema Definition is
// defined as:
//
// 
// <element name="Object" type="ds:ObjectType"/>
// <complexType name="ObjectType" mixed="true">
//   <sequence minOccurs="0" maxOccurs="unbounded">
//     <any namespace="##any" processContents="lax"/>
//   </sequence>
//   <attribute name="Id" type="ID" use="optional"/>
//   <attribute name="MimeType" type="string" use="optional"/>
//   <attribute name="Encoding" type="anyURI" use="optional"/>
// </complexType>
// 
//
// A XMLObject instance may be created by invoking the
// newXMLObject method of the
// XMLSignatureFactory class; for example:
//
// 
//   XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
//   List content = Collections.singletonList(fac.newManifest(references)));
//   XMLObject object = factory.newXMLObject(content, "object-1", null, null);
// 
//
// Note that this class is named XMLObject rather than
// Object to avoid naming clashes with the existing
// java.lang.Object class.
trait XMLObject extends XMLStructure {

    @stub
    // Returns an unmodifiable
    // list of XMLStructures contained in this XMLObject,
    // which represent elements from any namespace.
    def getContent(): List = ???

    @stub
    // Returns the encoding URI of this XMLObject.
    def getEncoding(): String = ???

    @stub
    // Returns the Id of this XMLObject.
    def getId(): String = ???
}
