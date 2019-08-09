package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// Marks a field/property that its XML form is a uri reference to mime content.
// The mime content is optimally stored out-of-line as an attachment.
//
// A field/property must always map to the DataHandler class.
//
// Usage
// 
// @XmlRootElement
// class Foo {
//   @XmlAttachmentRef
//   @XmlAttribute
//   DataHandler data;
//
//   @XmlAttachmentRef
//   @XmlElement
//   DataHandler body;
// }
// 
// The above code maps to the following XML:
// 
// <xs:element name="foo" xmlns:ref="http://ws-i.org/profiles/basic/1.1/xsd">
//   <xs:complexType>
//     <xs:sequence>
//       <xs:element name="body" type="ref:swaRef" minOccurs="0" />
//     </xs:sequence>
//     <xs:attribute name="data" type="ref:swaRef" use="optional" />
//   </xs:complexType>
// </xs:element>
// 
//
// 
// The above binding supports WS-I AP 1.0 WS-I Attachments Profile Version 1.0.
@Retention ( value = RUNTIME ) @Target ( value ={ FIELD , METHOD , PARAMETER } ) @interface XmlAttachmentRef {
}
