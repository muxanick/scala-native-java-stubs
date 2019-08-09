package org.xml.sax.ext

import java.lang.String

// SAX2 extension handler for lexical events.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This is an optional extension handler for SAX2 to provide
// lexical information about an XML document, such as comments
// and CDATA section boundaries.
// XML readers are not required to recognize this handler, and it
// is not part of core-only SAX2 distributions.
//
// The events in the lexical handler apply to the entire document,
// not just to the document element, and all lexical handler events
// must appear between the content handler's startDocument and
// endDocument events.
//
// To set the LexicalHandler for an XML reader, use the
// setProperty method
// with the property name
// http://xml.org/sax/properties/lexical-handler
// and an object implementing this interface (or null) as the value.
// If the reader does not report lexical events, it will throw a
// SAXNotRecognizedException
// when you attempt to register the handler.
trait LexicalHandler {

    @stub
    // Report an XML comment anywhere in the document.
    def comment(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Report the end of a CDATA section.
    def endCDATA(): Unit = ???

    @stub
    // Report the end of DTD declarations.
    def endDTD(): Unit = ???

    @stub
    // Report the end of an entity.
    def endEntity(name: String): Unit = ???

    @stub
    // Report the start of a CDATA section.
    def startCDATA(): Unit = ???

    @stub
    // Report the start of DTD declarations, if any.
    def startDTD(name: String, publicId: String, systemId: String): Unit = ???
}
