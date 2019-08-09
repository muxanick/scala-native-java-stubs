package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// Disable consideration of XOP encoding for datatypes that are bound to
// base64-encoded binary data in XML.
//
// 
// When XOP encoding is enabled as described in AttachmentMarshaller.isXOPPackage(), this annotation disables datatypes such as Image or Source or byte[] that are bound to base64-encoded binary from being considered for
// XOP encoding. If a JAXB property is annotated with this annotation or if
// the JAXB property's base type is annotated with this annotation,
// neither
// AttachmentMarshaller.addMtomAttachment(DataHandler, String, String)
// nor
// AttachmentMarshaller.addMtomAttachment(byte[], int, int, String, String, String) is
// ever called for the property. The binary data will always be inlined.
@Retention ( value = RUNTIME ) @Target ( value ={ FIELD , METHOD , TYPE } ) @interface XmlInlineBinaryData {
}
