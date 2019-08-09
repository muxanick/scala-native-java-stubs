package org.w3c.dom

import java.lang.String

// The Document interface represents the entire HTML or XML
// document. Conceptually, it is the root of the document tree, and provides
// the primary access to the document's data.
// Since elements, text nodes, comments, processing instructions, etc.
// cannot exist outside the context of a Document, the
// Document interface also contains the factory methods needed
// to create these objects. The Node objects created have a
// ownerDocument attribute which associates them with the
// Document within whose context they were created.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait Document extends Node {

    @stub
    // Attempts to adopt a node from another document to this document.
    def adoptNode(source: Node): Node = ???

    @stub
    // Creates an Attr of the given name.
    def createAttribute(name: String): Attr = ???

    @stub
    // Creates an attribute of the given qualified name and namespace URI.
    def createAttributeNS(namespaceURI: String, qualifiedName: String): Attr = ???

    @stub
    // Creates a CDATASection node whose value is the specified
    // string.
    def createCDATASection(data: String): CDATASection = ???

    @stub
    // Creates a Comment node given the specified string.
    def createComment(data: String): Comment = ???

    @stub
    // Creates an empty DocumentFragment object.
    def createDocumentFragment(): DocumentFragment = ???

    @stub
    // Creates an element of the type specified.
    def createElement(tagName: String): Element = ???

    @stub
    // Creates an element of the given qualified name and namespace URI.
    def createElementNS(namespaceURI: String, qualifiedName: String): Element = ???

    @stub
    // Creates an EntityReference object.
    def createEntityReference(name: String): EntityReference = ???

    @stub
    // Creates a ProcessingInstruction node given the specified
    // name and data strings.
    def createProcessingInstruction(target: String, data: String): ProcessingInstruction = ???

    @stub
    // Creates a Text node given the specified string.
    def createTextNode(data: String): Text = ???

    @stub
    // The Document Type Declaration (see DocumentType)
    // associated with this document.
    def getDoctype(): DocumentType = ???

    @stub
    // This is a convenience attribute that allows direct access to the child
    // node that is the document element of the document.
    def getDocumentElement(): Element = ???

    @stub
    // The location of the document or null if undefined or if
    // the Document was created using
    // DOMImplementation.createDocument.
    def getDocumentURI(): String = ???

    @stub
    // The configuration used when Document.normalizeDocument()
    // is invoked.
    def getDomConfig(): DOMConfiguration = ???

    @stub
    // Returns the Element that has an ID attribute with the
    // given value.
    def getElementById(elementId: String): Element = ???

    @stub
    // Returns a NodeList of all the Elements in
    // document order with a given tag name and are contained in the
    // document.
    def getElementsByTagName(tagname: String): NodeList = ???

    @stub
    // Returns a NodeList of all the Elements with a
    // given local name and namespace URI in document order.
    def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList = ???

    @stub
    // The DOMImplementation object that handles this document.
    def getImplementation(): DOMImplementation = ???

    @stub
    // An attribute specifying the encoding used for this document at the time
    // of the parsing.
    def getInputEncoding(): String = ???

    @stub
    // An attribute specifying whether error checking is enforced or not.
    def getStrictErrorChecking(): Boolean = ???

    @stub
    // An attribute specifying, as part of the XML declaration, the encoding of this document.
    def getXmlEncoding(): String = ???

    @stub
    // An attribute specifying, as part of the XML declaration, whether this document is standalone.
    def getXmlStandalone(): Boolean = ???

    @stub
    // An attribute specifying, as part of the XML declaration, the version number of this document.
    def getXmlVersion(): String = ???

    @stub
    // Imports a node from another document to this document, without altering
    // or removing the source node from the original document; this method
    // creates a new copy of the source node.
    def importNode(importedNode: Node, deep: Boolean): Node = ???

    @stub
    // This method acts as if the document was going through a save and load
    // cycle, putting the document in a "normal" form.
    def normalizeDocument(): Unit = ???

    @stub
    // Rename an existing node of type ELEMENT_NODE or
    // ATTRIBUTE_NODE.
    def renameNode(n: Node, namespaceURI: String, qualifiedName: String): Node = ???

    @stub
    // The location of the document or null if undefined or if
    // the Document was created using
    // DOMImplementation.createDocument.
    def setDocumentURI(documentURI: String): Unit = ???

    @stub
    // An attribute specifying whether error checking is enforced or not.
    def setStrictErrorChecking(strictErrorChecking: Boolean): Unit = ???

    @stub
    // An attribute specifying, as part of the XML declaration, whether this document is standalone.
    def setXmlStandalone(xmlStandalone: Boolean): Unit = ???
}
