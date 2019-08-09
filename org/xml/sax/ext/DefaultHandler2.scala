package org.xml.sax.ext

import java.lang.{Object, String}
import org.xml.sax.InputSource
import org.xml.sax.helpers.DefaultHandler

// This class extends the SAX2 base handler class to support the
// SAX2 LexicalHandler, DeclHandler, and
// EntityResolver2 extensions.  Except for overriding the
// original SAX1 resolveEntity()
// method the added handler methods just return.  Subclassers may
// override everything on a method-by-method basis.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// 
//
//  Note: this class might yet learn that the
// ContentHandler.setDocumentLocator() call might be passed a
// Locator2 object, and that the
// ContentHandler.startElement() call might be passed a
// Attributes2 object.
class DefaultHandler2 extends DefaultHandler with LexicalHandler, with DeclHandler, with EntityResolver2 {

    @stub
    // Report an attribute type declaration.
    def attributeDecl(eName: String, aName: String, type: String, mode: String, value: String): Unit = ???

    @stub
    // Report an XML comment anywhere in the document.
    def comment(ch: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Report an element type declaration.
    def elementDecl(name: String, model: String): Unit = ???

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
    // Report a parsed external entity declaration.
    def externalEntityDecl(name: String, publicId: String, systemId: String): Unit = ???

    @stub
    // Tells the parser that if no external subset has been declared
    // in the document text, none should be used.
    def getExternalSubset(name: String, baseURI: String): InputSource = ???

    @stub
    // Report an internal entity declaration.
    def internalEntityDecl(name: String, value: String): Unit = ???

    @stub
    // Invokes
    // EntityResolver2.resolveEntity()
    // with null entity name and base URI.
    def resolveEntity(publicId: String, systemId: String): InputSource = ???

    @stub
    // Tells the parser to resolve the systemId against the baseURI
    // and read the entity text from that resulting absolute URI.
    def resolveEntity(name: String, publicId: String, baseURI: String, systemId: String): InputSource = ???

    @stub
    // Report the start of a CDATA section.
    def startCDATA(): Unit = ???

    @stub
    // Report the start of DTD declarations, if any.
    def startDTD(name: String, publicId: String, systemId: String): Unit = ???
}
