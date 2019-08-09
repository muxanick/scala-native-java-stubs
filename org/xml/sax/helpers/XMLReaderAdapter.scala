package org.xml.sax.helpers

import java.lang.{Object, String}
import java.util.Locale
import org.xml.sax.{Attributes, ContentHandler, DTDHandler, DocumentHandler, EntityResolver, ErrorHandler, InputSource, Locator, Parser}

// Adapt a SAX2 XMLReader as a SAX1 Parser.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class wraps a SAX2 XMLReader
// and makes it act as a SAX1 Parser.  The XMLReader
// must support a true value for the
// http://xml.org/sax/features/namespace-prefixes property or parsing will fail
// with a SAXException; if the XMLReader
// supports a false value for the http://xml.org/sax/features/namespaces
// property, that will also be used to improve efficiency.
class XMLReaderAdapter extends Object with Parser, with ContentHandler {

    @stub
    // Create a new adapter.
    def this() = ???

    @stub
    // Adapt a SAX2 characters event.
    def characters(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // End document event.
    def endDocument(): Unit = ???

    @stub
    // Adapt a SAX2 end element event.
    def endElement(uri: String, localName: String, qName: String): Unit = ???

    @stub
    // Adapt a SAX2 end prefix mapping event.
    def endPrefixMapping(prefix: String): Unit = ???

    @stub
    // Adapt a SAX2 ignorable whitespace event.
    def ignorableWhitespace(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Parse the document.
    def parse(input: InputSource): Unit = ???

    @stub
    // Parse the document.
    def parse(systemId: String): Unit = ???

    @stub
    // Adapt a SAX2 processing instruction event.
    def processingInstruction(target: String, data: String): Unit = ???

    @stub
    // Register the SAX1 document event handler.
    def setDocumentHandler(handler: DocumentHandler): Unit = ???

    @stub
    // Set a document locator.
    def setDocumentLocator(locator: Locator): Unit = ???

    @stub
    // Register the DTD event handler.
    def setDTDHandler(handler: DTDHandler): Unit = ???

    @stub
    // Register the entity resolver.
    def setEntityResolver(resolver: EntityResolver): Unit = ???

    @stub
    // Register the error event handler.
    def setErrorHandler(handler: ErrorHandler): Unit = ???

    @stub
    // Set the locale for error reporting.
    def setLocale(locale: Locale): Unit = ???

    @stub
    // Adapt a SAX2 skipped entity event.
    def skippedEntity(name: String): Unit = ???

    @stub
    // Start document event.
    def startDocument(): Unit = ???

    @stub
    // Adapt a SAX2 start element event.
    def startElement(uri: String, localName: String, qName: String, atts: Attributes): Unit = ???
}
