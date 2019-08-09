package org.w3c.dom

import java.lang.{Object, String}

// The DOMImplementation interface provides a number of methods
// for performing operations that are independent of any particular instance
// of the document object model.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DOMImplementation {

    @stub
    // Creates a DOM Document object of the specified type with its document
    // element.
    def createDocument(namespaceURI: String, qualifiedName: String, doctype: DocumentType): Document = ???

    @stub
    // Creates an empty DocumentType node.
    def createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType = ???

    @stub
    // This method returns a specialized object which implements the
    // specialized APIs of the specified feature and version, as specified
    // in DOM Features.
    def getFeature(feature: String, version: String): Object = ???
}
