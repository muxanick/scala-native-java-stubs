package javax.xml.crypto.dsig.keyinfo

import javax.xml.crypto.XMLStructure

// A representation of the XML KeyName element as
// defined in the 
// W3C Recommendation for XML-Signature Syntax and Processing.
// A KeyName object contains a string value which may be used
// by the signer to communicate a key identifier to the recipient. The
// XML Schema Definition is defined as:
//
// 
// <element name="KeyName" type="string"/>
// 
//
// A KeyName instance may be created by invoking the
// newKeyName method of the
// KeyInfoFactory class, and passing it a String
// representing the name of the key; for example:
// 
// KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
// KeyName keyName = factory.newKeyName("Alice");
// 
trait KeyName extends XMLStructure {
}
