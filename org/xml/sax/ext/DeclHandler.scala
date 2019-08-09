package org.xml.sax.ext

import java.lang.String

// SAX2 extension handler for DTD declaration events.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This is an optional extension handler for SAX2 to provide more
// complete information about DTD declarations in an XML document.
// XML readers are not required to recognize this handler, and it
// is not part of core-only SAX2 distributions.
//
// Note that data-related DTD declarations (unparsed entities and
// notations) are already reported through the DTDHandler interface.
//
// If you are using the declaration handler together with a lexical
// handler, all of the events will occur between the
// startDTD and the
// endDTD events.
//
// To set the DeclHandler for an XML reader, use the
// setProperty method
// with the property name
// http://xml.org/sax/properties/declaration-handler
// and an object implementing this interface (or null) as the value.
// If the reader does not report declaration events, it will throw a
// SAXNotRecognizedException
// when you attempt to register the handler.
trait DeclHandler {

    @stub
    // Report an attribute type declaration.
    def attributeDecl(eName: String, aName: String, type: String, mode: String, value: String): Unit = ???

    @stub
    // Report an element type declaration.
    def elementDecl(name: String, model: String): Unit = ???

    @stub
    // Report a parsed external entity declaration.
    def externalEntityDecl(name: String, publicId: String, systemId: String): Unit = ???
}
