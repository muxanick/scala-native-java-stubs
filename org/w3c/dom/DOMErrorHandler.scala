package org.w3c.dom

// DOMErrorHandler is a callback interface that the DOM
// implementation can call when reporting errors that happens while
// processing XML data, or when doing some other processing (e.g. validating
// a document). A DOMErrorHandler object can be attached to a
// Document using the "error-handler" on the
// DOMConfiguration interface. If more than one error needs to
// be reported during an operation, the sequence and numbers of the errors
// passed to the error handler are implementation dependent.
//  The application that is using the DOM implementation is expected to
// implement this interface.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait DOMErrorHandler {
}
