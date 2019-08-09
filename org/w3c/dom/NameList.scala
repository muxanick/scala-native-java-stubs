package org.w3c.dom

import java.lang.String

// The NameList interface provides the abstraction of an ordered
// collection of parallel pairs of name and namespace values (which could be
// null values), without defining or constraining how this collection is
// implemented. The items in the NameList are accessible via an
// integral index, starting from 0.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait NameList {

    @stub
    // Test if a name is part of this NameList.
    def contains(str: String): Boolean = ???

    @stub
    // Test if the pair namespaceURI/name is part of this
    // NameList.
    def containsNS(namespaceURI: String, name: String): Boolean = ???

    @stub
    // The number of pairs (name and namespaceURI) in the list.
    def getLength(): Int = ???

    @stub
    // Returns the indexth name item in the collection.
    def getName(index: Int): String = ???
}
