package org.w3c.dom

// The DOMImplementationList interface provides the abstraction
// of an ordered collection of DOM implementations, without defining or
// constraining how this collection is implemented. The items in the
// DOMImplementationList are accessible via an integral index,
// starting from 0.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DOMImplementationList {

    @stub
    // The number of DOMImplementations in the list.
    def getLength(): Int = ???
}
