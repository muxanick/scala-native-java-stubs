package org.xml.sax

import java.lang.{Object, String}

// Interface for reading an XML document using callbacks.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// Note: despite its name, this interface does
// not extend the standard Java Reader
// interface, because reading XML is a fundamentally different activity
// than reading character data.
//
// XMLReader is the interface that an XML parser's SAX2 driver must
// implement.  This interface allows an application to set and
// query features and properties in the parser, to register
// event handlers for document processing, and to initiate
// a document parse.
//
// All SAX interfaces are assumed to be synchronous: the
// parse methods must not return until parsing
// is complete, and readers must wait for an event-handler callback
// to return before reporting the next event.
//
// This interface replaces the (now deprecated) SAX 1.0 Parser interface.  The XMLReader interface
// contains two important enhancements over the old Parser
// interface (as well as some minor ones):
//
// 
// it adds a standard way to query and set features and
//  properties; and
// it adds Namespace support, which is required for many
//  higher-level XML standards.
// 
//
// There are adapters available to convert a SAX1 Parser to
// a SAX2 XMLReader and vice-versa.
trait XMLReader {

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
    // Look up the value of a feature flag.
    def getFeature(name: String): Boolean = ???

    @stub
    // Look up the value of a property.
    def getProperty(name: String): Object = ???

    @stub
    // Parse an XML document.
    def parse(input: InputSource): Unit = ???

    @stub
    // Parse an XML document from a system identifier (URI).
    def parse(systemId: String): Unit = ???

    @stub
    // Allow an application to register a content event handler.
    def setContentHandler(handler: ContentHandler): Unit = ???

    @stub
    // Allow an application to register a DTD event handler.
    def setDTDHandler(handler: DTDHandler): Unit = ???

    @stub
    // Allow an application to register an entity resolver.
    def setEntityResolver(resolver: EntityResolver): Unit = ???

    @stub
    // Allow an application to register an error event handler.
    def setErrorHandler(handler: ErrorHandler): Unit = ???

    @stub
    // Set the value of a feature flag.
    def setFeature(name: String, value: Boolean): Unit = ???
}
