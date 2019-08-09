package org.xml.sax

// Basic interface for SAX error handlers.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// If a SAX application needs to implement customized error
// handling, it must implement this interface and then register an
// instance with the XML reader using the
// setErrorHandler
// method.  The parser will then report all errors and warnings
// through this interface.
//
// WARNING: If an application does not
// register an ErrorHandler, XML parsing errors will go unreported,
// except that SAXParseExceptions will be thrown for fatal errors.
// In order to detect validity errors, an ErrorHandler that does something
// with error() calls must be registered.
//
// For XML processing errors, a SAX driver must use this interface
// in preference to throwing an exception: it is up to the application
// to decide whether to throw an exception for different types of
// errors and warnings.  Note, however, that there is no requirement that
// the parser continue to report additional errors after a call to
// fatalError.  In other words, a SAX driver class
// may throw an exception after reporting any fatalError.
// Also parsers may throw appropriate exceptions for non-XML errors.
// For example, XMLReader.parse() would throw
// an IOException for errors accessing entities or the document.
trait ErrorHandler {

    @stub
    // Receive notification of a recoverable error.
    def error(exception: SAXParseException): Unit = ???

    @stub
    // Receive notification of a non-recoverable error.
    def fatalError(exception: SAXParseException): Unit = ???
}
