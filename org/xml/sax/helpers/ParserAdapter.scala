package org.xml.sax.helpers

import java.lang.{Object, String}
import org.xml.sax.{ContentHandler, DTDHandler, DocumentHandler, EntityResolver, ErrorHandler, InputSource, Locator, XMLReader}

// Adapt a SAX1 Parser as a SAX2 XMLReader.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class wraps a SAX1 Parser
// and makes it act as a SAX2 XMLReader,
// with feature, property, and Namespace support.  Note
// that it is not possible to report skippedEntity events, since SAX1 does not make that information available.
//
// This adapter does not test for duplicate Namespace-qualified
// attribute names.
class ParserAdapter extends Object with XMLReader, with DocumentHandler {

    @stub
    // Construct a new parser adapter.
    def this() = ???

    @stub
    // Adapter implementation method; do not call.
    def characters(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Adapter implementation method; do not call.
    def endDocument(): Unit = ???

    @stub
    // Adapter implementation method; do not call.
    def endElement(qName: String): Unit = ???

    @stub
    // Return the current content handler.
    def getContentHandler(): ContentHandler = ???

    @stub
    // Return the current DTD handler.
    def getDTDHandler(): DTDHandler = ???

    @stub
    // Return the current entity resolver.
    def getEntityResolver(): EntityResolver = ???

    @stub
    // Return the current error handler.
    def getErrorHandler(): ErrorHandler = ???

    @stub
    // Check a parser feature flag.
    def getFeature(name: String): Boolean = ???

    @stub
    // Get a parser property.
    def getProperty(name: String): Object = ???

    @stub
    // Adapter implementation method; do not call.
    def ignorableWhitespace(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Parse an XML document.
    def parse(input: InputSource): Unit = ???

    @stub
    // Parse an XML document.
    def parse(systemId: String): Unit = ???

    @stub
    // Adapter implementation method; do not call.
    def processingInstruction(target: String, data: String): Unit = ???

    @stub
    // Set the content handler.
    def setContentHandler(handler: ContentHandler): Unit = ???

    @stub
    // Adapter implementation method; do not call.
    def setDocumentLocator(locator: Locator): Unit = ???

    @stub
    // Set the DTD handler.
    def setDTDHandler(handler: DTDHandler): Unit = ???

    @stub
    // Set the entity resolver.
    def setEntityResolver(resolver: EntityResolver): Unit = ???

    @stub
    // Set the error handler.
    def setErrorHandler(handler: ErrorHandler): Unit = ???

    @stub
    // Set a feature flag for the parser.
    def setFeature(name: String, value: Boolean): Unit = ???

    @stub
    // Set a parser property.
    def setProperty(name: String, value: Object): Unit = ???

    @stub
    // Adapter implementation method; do not call.
    def startDocument(): Unit = ???
}
