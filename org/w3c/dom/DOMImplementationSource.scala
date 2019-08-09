package org.w3c.dom

import java.lang.String

// This interface permits a DOM implementer to supply one or more
// implementations, based upon requested features and versions, as specified
// in DOM
// Features. Each implemented DOMImplementationSource object is
// listed in the binding-specific list of available sources so that its
// DOMImplementation objects are made available.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DOMImplementationSource {

    @stub
    // A method to request the first DOM implementation that supports the
    // specified features.
    def getDOMImplementation(features: String): DOMImplementation = ???
}
