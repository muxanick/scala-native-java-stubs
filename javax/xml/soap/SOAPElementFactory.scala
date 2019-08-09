package javax.xml.soap

import java.lang.{Object, String}

// SOAPElementFactory is a factory for XML fragments that
// will eventually end up in the SOAP part. These fragments
// can be inserted as children of the SOAPHeader or
// SOAPBody or SOAPEnvelope.
//
// Elements created using this factory do not have the properties
// of an element that lives inside a SOAP header document. These
// elements are copied into the XML document tree when they are
// inserted.
class SOAPElementFactory extends Object {

    @stub
    // Deprecated. 
    //Use
    // javax.xml.soap.SOAPFactory.createElement(javax.xml.soap.Name)
    // instead
    //
    def create(name: Name): SOAPElement = ???

    @stub
    // Deprecated. 
    //Use
    // javax.xml.soap.SOAPFactory.createElement(String localName) instead
    //
    def create(localName: String): SOAPElement = ???

    @stub
    // Deprecated. 
    //Use
    // javax.xml.soap.SOAPFactory.createElement(String localName,
    //                      String prefix,
    //                      String uri)
    // instead
    //
    def create(localName: String, prefix: String, uri: String): SOAPElement = ???
}
