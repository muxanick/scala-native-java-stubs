package org.w3c.dom

import java.lang.String

// Each Document has a doctype attribute whose value
// is either null or a DocumentType object. The
// DocumentType interface in the DOM Core provides an interface
// to the list of entities that are defined for the document, and little
// else because the effect of namespaces and the various XML schema efforts
// on DTD representation are not clearly understood as of this writing.
// DOM Level 3 doesn't support editing DocumentType nodes.
// DocumentType nodes are read-only.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DocumentType extends Node {

    @stub
    // A NamedNodeMap containing the general entities, both
    // external and internal, declared in the DTD.
    def getEntities(): NamedNodeMap = ???

    @stub
    // The internal subset as a string, or null if there is none.
    def getInternalSubset(): String = ???

    @stub
    // The name of DTD; i.e., the name immediately following the
    // DOCTYPE keyword.
    def getName(): String = ???

    @stub
    // A NamedNodeMap containing the notations declared in the
    // DTD.
    def getNotations(): NamedNodeMap = ???

    @stub
    // The public identifier of the external subset.
    def getPublicId(): String = ???
}
