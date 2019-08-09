package org.xml.sax

import java.lang.String

// Receive notification of general document events.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This was the main event-handling interface for SAX1; in
// SAX2, it has been replaced by ContentHandler, which provides Namespace support and reporting
// of skipped entities.  This interface is included in SAX2 only
// to support legacy SAX1 applications.
//
// The order of events in this interface is very important, and
// mirrors the order of information in the document itself.  For
// example, all of an element's content (character data, processing
// instructions, and/or subelements) will appear, in order, between
// the startElement event and the corresponding endElement event.
//
// Application writers who do not want to implement the entire
// interface can derive a class from HandlerBase, which implements
// the default functionality; parser writers can instantiate
// HandlerBase to obtain a default handler.  The application can find
// the location of any document event using the Locator interface
// supplied by the Parser through the setDocumentLocator method.
trait DocumentHandler {

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
    def ignorableWhitespace(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Deprecated. 
    def processingInstruction(target: String, data: String): Unit = ???

    @stub
    // Deprecated. 
    def setDocumentLocator(locator: Locator): Unit = ???

    @stub
    // Deprecated. 
    def startDocument(): Unit = ???
}
