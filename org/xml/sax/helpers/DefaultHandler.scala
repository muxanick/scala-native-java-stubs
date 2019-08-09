package org.xml.sax.helpers

import java.lang.{Object, String}
import org.xml.sax.{Attributes, ContentHandler, DTDHandler, EntityResolver, ErrorHandler, InputSource, Locator, SAXParseException}

// Default base class for SAX2 event handlers.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class is available as a convenience base class for SAX2
// applications: it provides default implementations for all of the
// callbacks in the four core SAX2 handler classes:
//
// 
// EntityResolver
// DTDHandler
// ContentHandler
// ErrorHandler
// 
//
// Application writers can extend this class when they need to
// implement only part of an interface; parser writers can
// instantiate this class to provide default handlers when the
// application has not supplied its own.
//
// This class replaces the deprecated SAX1
// HandlerBase class.
class DefaultHandler extends Object with EntityResolver, with DTDHandler, with ContentHandler, with ErrorHandler {

    @stub
    // Receive notification of character data inside an element.
    def characters(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Receive notification of the end of the document.
    def endDocument(): Unit = ???

    @stub
    // Receive notification of the end of an element.
    def endElement(uri: String, localName: String, qName: String): Unit = ???

    @stub
    // Receive notification of the end of a Namespace mapping.
    def endPrefixMapping(prefix: String): Unit = ???

    @stub
    // Receive notification of a recoverable parser error.
    def error(e: SAXParseException): Unit = ???

    @stub
    // Report a fatal XML parsing error.
    def fatalError(e: SAXParseException): Unit = ???

    @stub
    // Receive notification of ignorable whitespace in element content.
    def ignorableWhitespace(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Receive notification of a notation declaration.
    def notationDecl(name: String, publicId: String, systemId: String): Unit = ???

    @stub
    // Receive notification of a processing instruction.
    def processingInstruction(target: String, data: String): Unit = ???

    @stub
    // Resolve an external entity.
    def resolveEntity(publicId: String, systemId: String): InputSource = ???

    @stub
    // Receive a Locator object for document events.
    def setDocumentLocator(locator: Locator): Unit = ???

    @stub
    // Receive notification of a skipped entity.
    def skippedEntity(name: String): Unit = ???

    @stub
    // Receive notification of the beginning of the document.
    def startDocument(): Unit = ???

    @stub
    // Receive notification of the start of an element.
    def startElement(uri: String, localName: String, qName: String, attributes: Attributes): Unit = ???

    @stub
    // Receive notification of the start of a Namespace mapping.
    def startPrefixMapping(prefix: String, uri: String): Unit = ???

    @stub
    // Receive notification of an unparsed entity declaration.
    def unparsedEntityDecl(name: String, publicId: String, systemId: String, notationName: String): Unit = ???
}
