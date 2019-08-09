package org.w3c.dom

// The NodeList interface provides the abstraction of an ordered
// collection of nodes, without defining or constraining how this collection
// is implemented. NodeList objects in the DOM are live.
// The items in the NodeList are accessible via an integral
// index, starting from 0.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait NodeList {

    @stub
    // The number of nodes in the list.
    def getLength(): Int = ???
}
