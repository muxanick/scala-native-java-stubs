package org.w3c.dom.ls

import java.lang.{Exception, Object, RuntimeException, Throwable}

// Parser or write operations may throw an LSException if the
// processing is stopped. The processing can be stopped due to a
// DOMError with a severity of
// DOMError.SEVERITY_FATAL_ERROR or a non recovered
// DOMError.SEVERITY_ERROR, or if
// DOMErrorHandler.handleError() returned false.
// Note:  As suggested in the definition of the constants in the
// DOMError interface, a DOM implementation may choose to
// continue after a fatal error, but the resulting DOM tree is then
// implementation dependent.
// See also the Document Object Model (DOM) Level 3 Load
//and Save Specification.
class LSException extends RuntimeException {

    @stub
    // 
    def code: Short = ???
}

object LSException {
    @stub
    // If an attempt was made to load a document, or an XML Fragment, using
    // LSParser and the processing has been stopped.
    def PARSE_ERR: Short = ???
}
