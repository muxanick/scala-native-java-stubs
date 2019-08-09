package org.w3c.dom

import java.lang.{Object, String}

// DOMError is an interface that describes an error.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DOMError {

    @stub
    // The location of the error.
    def getLocation(): DOMLocator = ???

    @stub
    // An implementation specific string describing the error that occurred.
    def getMessage(): String = ???

    @stub
    // The related DOMError.type dependent data if any.
    def getRelatedData(): Object = ???

    @stub
    // The related platform dependent exception if any.
    def getRelatedException(): Object = ???

    @stub
    // The severity of the error, either SEVERITY_WARNING,
    // SEVERITY_ERROR, or SEVERITY_FATAL_ERROR.
    def getSeverity(): Short = ???
}

object DOMError {
    @stub
    // The severity of the error described by the DOMError is
    // error.
    def SEVERITY_ERROR: Short = ???

    @stub
    // The severity of the error described by the DOMError is
    // fatal error.
    def SEVERITY_FATAL_ERROR: Short = ???
}
