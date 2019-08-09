package org.w3c.dom

import java.lang.String

// The DOMStringList interface provides the abstraction of an
// ordered collection of DOMString values, without defining or
// constraining how this collection is implemented. The items in the
// DOMStringList are accessible via an integral index, starting
// from 0.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DOMStringList {

    @stub
    // Test if a string is part of this DOMStringList.
    def contains(str: String): Boolean = ???

    @stub
    // The number of DOMStrings in the list.
    def getLength(): Int = ???
}
