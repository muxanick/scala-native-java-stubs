package org.xml.sax.helpers

import java.lang.{Object, String}
import org.xml.sax.{Attributes, ContentHandler, DTDHandler, EntityResolver, ErrorHandler, InputSource, Locator, SAXParseException, XMLFilter, XMLReader}

// Base class for deriving an XML filter.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class is designed to sit between an XMLReader and the client application's event handlers.  By default, it
// does nothing but pass requests up to the reader and events
// on to the handlers unmodified, but subclasses can override
// specific methods to modify the event stream or the configuration
// requests as they pass through.
class XMLFilterImpl extends Object with XMLFilter, with EntityResolver, with DTDHandler, with ContentHandler, with ErrorHandler {

    @stub
    // Construct an empty XML filter, with no parent.
    def this() = ???

    @stub
    // Filter a character data event.
    def characters(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Filter an end document event.
    def endDocument(): Unit = ???

    @stub
    // Filter an end element event.
    def endElement(uri: String, localName: String, qName: String): Unit = ???

    @stub
    // Filter an end Namespace prefix mapping event.
    def endPrefixMapping(prefix: String): Unit = ???

    @stub
    // Filter an error event.
    def error(e: SAXParseException): Unit = ???

    @stub
    // Filter a fatal error event.
    def fatalError(e: SAXParseException): Unit = ???

    @stub
    // Get the content event handler.
    def getContentHandler(): ContentHandler = ???

    @stub
    // Get the current DTD event handler.
    def getDTDHandler(): DTDHandler = ???

    @stub
    // Get the current entity resolver.
    def getEntityResolver(): EntityResolver = ???

    @stub
    // Get the current error event handler.
    def getErrorHandler(): ErrorHandler = ???

    @stub
    // Look up the value of a feature.
    def getFeature(name: String): Boolean = ???

    @stub
    // Get the parent reader.
    def getParent(): XMLReader = ???

    @stub
    // Look up the value of a property.
    def getProperty(name: String): Object = ???

    @stub
    // Filter an ignorable whitespace event.
    def ignorableWhitespace(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Filter a notation declaration event.
    def notationDecl(name: String, publicId: String, systemId: String): Unit = ???

    @stub
    // Parse a document.
    def parse(input: InputSource): Unit = ???

    @stub
    // Parse a document.
    def parse(systemId: String): Unit = ???

    @stub
    // Filter a processing instruction event.
    def processingInstruction(target: String, data: String): Unit = ???

    @stub
    // Filter an external entity resolution.
    def resolveEntity(publicId: String, systemId: String): InputSource = ???

    @stub
    // Set the content event handler.
    def setContentHandler(handler: ContentHandler): Unit = ???

    @stub
    // Filter a new document locator event.
    def setDocumentLocator(locator: Locator): Unit = ???

    @stub
    // Set the DTD event handler.
    def setDTDHandler(handler: DTDHandler): Unit = ???

    @stub
    // Set the entity resolver.
    def setEntityResolver(resolver: EntityResolver): Unit = ???

    @stub
    // Set the error event handler.
    def setErrorHandler(handler: ErrorHandler): Unit = ???

    @stub
    // Set the value of a feature.
    def setFeature(name: String, value: Boolean): Unit = ???

    @stub
    // Set the parent reader.
    def setParent(parent: XMLReader): Unit = ???

    @stub
    // Set the value of a property.
    def setProperty(name: String, value: Object): Unit = ???

    @stub
    // Filter a skipped entity event.
    def skippedEntity(name: String): Unit = ???

    @stub
    // Filter a start document event.
    def startDocument(): Unit = ???

    @stub
    // Filter a start element event.
    def startElement(uri: String, localName: String, qName: String, atts: Attributes): Unit = ???

    @stub
    // Filter a start Namespace prefix mapping event.
    def startPrefixMapping(prefix: String, uri: String): Unit = ???

    @stub
    // Filter an unparsed entity declaration event.
    def unparsedEntityDecl(name: String, publicId: String, systemId: String, notationName: String): Unit = ???
}
