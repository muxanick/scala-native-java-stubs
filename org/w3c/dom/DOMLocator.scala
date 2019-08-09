package org.w3c.dom

import java.lang.String

// DOMLocator is an interface that describes a location (e.g.
// where an error occurred).
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DOMLocator {

    @stub
    // The byte offset into the input source this locator is pointing to or
    // -1 if there is no byte offset available.
    def getByteOffset(): Int = ???

    @stub
    // The column number this locator is pointing to, or -1 if
    // there is no column number available.
    def getColumnNumber(): Int = ???

    @stub
    // The line number this locator is pointing to, or -1 if
    // there is no column number available.
    def getLineNumber(): Int = ???

    @stub
    // The node this locator is pointing to, or null if no node
    // is available.
    def getRelatedNode(): Node = ???

    @stub
    // The URI this locator is pointing to, or null if no URI is
    // available.
    def getUri(): String = ???
}
