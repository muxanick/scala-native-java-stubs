package org.xml.sax

import java.lang.{Object, String}

// Default base class for handlers.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class implements the default behaviour for four SAX1
// interfaces: EntityResolver, DTDHandler, DocumentHandler,
// and ErrorHandler.  It is now obsolete, but is included in SAX2 to
// support legacy SAX1 applications.  SAX2 applications should use
// the DefaultHandler
// class instead.
//
// Application writers can extend this class when they need to
// implement only part of an interface; parser writers can
// instantiate this class to provide default handlers when the
// application has not supplied its own.
//
// Note that the use of this class is optional.
class HandlerBase extends Object with EntityResolver, with DTDHandler, with DocumentHandler, with ErrorHandler {

    @stub
    // Deprecated. 
    def characters(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Deprecated. 
    def endDocument(): Unit = ???

    @stub
    // Deprecated. 
    def endElement(name: String): Unit = ???

    @stub
    // Deprecated. 
    def error(e: SAXParseException): Unit = ???

    @stub
    // Deprecated. 
    def fatalError(e: SAXParseException): Unit = ???

    @stub
    // Deprecated. 
    def ignorableWhitespace(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Deprecated. 
    def notationDecl(name: String, publicId: String, systemId: String): Unit = ???

    @stub
    // Deprecated. 
    def processingInstruction(target: String, data: String): Unit = ???

    @stub
    // Deprecated. 
    def resolveEntity(publicId: String, systemId: String): InputSource = ???

    @stub
    // Deprecated. 
    def setDocumentLocator(locator: Locator): Unit = ???

    @stub
    // Deprecated. 
    def startDocument(): Unit = ???

    @stub
    // Deprecated. 
    def startElement(name: String, attributes: AttributeList): Unit = ???

    @stub
    // Deprecated. 
    def unparsedEntityDecl(name: String, publicId: String, systemId: String, notationName: String): Unit = ???
}
