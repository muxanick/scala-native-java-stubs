package org.xml.sax

import java.lang.String

// Receive notification of the logical content of a document.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This is the main interface that most SAX applications
// implement: if the application needs to be informed of basic parsing
// events, it implements this interface and registers an instance with
// the SAX parser using the setContentHandler method.  The parser uses the instance to report
// basic document-related events like the start and end of elements
// and character data.
//
// The order of events in this interface is very important, and
// mirrors the order of information in the document itself.  For
// example, all of an element's content (character data, processing
// instructions, and/or subelements) will appear, in order, between
// the startElement event and the corresponding endElement event.
//
// This interface is similar to the now-deprecated SAX 1.0
// DocumentHandler interface, but it adds support for Namespaces
// and for reporting skipped entities (in non-validating XML
// processors).
//
// Implementors should note that there is also a
// ContentHandler class in the java.net
// package; that means that it's probably a bad idea to do
//
// import java.net.*;
// import org.xml.sax.*;
// 
//
// In fact, "import ...*" is usually a sign of sloppy programming
// anyway, so the user should consider this a feature rather than a
// bug.
trait ContentHandler {

    @stub
    // Receive notification of character data.
    def characters(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Receive notification of the end of a document.
    def endDocument(): Unit = ???

    @stub
    // Receive notification of the end of an element.
    def endElement(uri: String, localName: String, qName: String): Unit = ???

    @stub
    // End the scope of a prefix-URI mapping.
    def endPrefixMapping(prefix: String): Unit = ???

    @stub
    // Receive notification of ignorable whitespace in element content.
    def ignorableWhitespace(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Receive notification of a processing instruction.
    def processingInstruction(target: String, data: String): Unit = ???

    @stub
    // Receive an object for locating the origin of SAX document events.
    def setDocumentLocator(locator: Locator): Unit = ???

    @stub
    // Receive notification of a skipped entity.
    def skippedEntity(name: String): Unit = ???

    @stub
    // Receive notification of the beginning of a document.
    def startDocument(): Unit = ???

    @stub
    // Receive notification of the beginning of an element.
    def startElement(uri: String, localName: String, qName: String, atts: Attributes): Unit = ???
}
