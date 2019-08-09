package org.w3c.dom.ls

import java.lang.String

// DOMImplementationLS contains the factory methods for creating
// Load and Save objects.
//  The expectation is that an instance of the
// DOMImplementationLS interface can be obtained by using
// binding-specific casting methods on an instance of the
// DOMImplementation interface or, if the Document
// supports the feature "Core" version "3.0"
// defined in [DOM Level 3 Core]
// , by using the method DOMImplementation.getFeature with
// parameter values "LS" (or "LS-Async") and
// "3.0" (respectively).
// See also the Document Object Model (DOM) Level 3 Load
//and Save Specification.
trait DOMImplementationLS {

    @stub
    // Create a new empty input source object where
    // LSInput.characterStream, LSInput.byteStream
    // , LSInput.stringData LSInput.systemId,
    // LSInput.publicId, LSInput.baseURI, and
    // LSInput.encoding are null, and
    // LSInput.certifiedText is false.
    def createLSInput(): LSInput = ???

    @stub
    // Create a new empty output destination object where
    // LSOutput.characterStream,
    // LSOutput.byteStream, LSOutput.systemId,
    // LSOutput.encoding are null.
    def createLSOutput(): LSOutput = ???

    @stub
    // Create a new LSParser.
    def createLSParser(mode: Short, schemaType: String): LSParser = ???
}

object DOMImplementationLS {
    @stub
    // Create an asynchronous LSParser.
    def MODE_ASYNCHRONOUS: Short = ???
}
