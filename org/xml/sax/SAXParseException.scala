package org.xml.sax

import java.lang.{Exception, Object, String, Throwable}

// Encapsulate an XML parse error or warning.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This exception may include information for locating the error
// in the original XML document, as if it came from a Locator
// object.  Note that although the application
// will receive a SAXParseException as the argument to the handlers
// in the ErrorHandler interface,
// the application is not actually required to throw the exception;
// instead, it can simply read the information in it and take a
// different action.
//
// Since this exception is a subclass of SAXException, it inherits the ability to wrap another exception.
class SAXParseException extends SAXException {

    @stub
    // Create a new SAXParseException from a message and a Locator.
    def this(message: String, locator: Locator) = ???

    @stub
    // Wrap an existing exception in a SAXParseException.
    def this(message: String, locator: Locator, e: Exception) = ???

    @stub
    // Create a new SAXParseException.
    def this(message: String, publicId: String, systemId: String, lineNumber: Int, columnNumber: Int) = ???

    @stub
    // The column number of the end of the text where the exception occurred.
    def getColumnNumber(): Int = ???

    @stub
    // The line number of the end of the text where the exception occurred.
    def getLineNumber(): Int = ???

    @stub
    // Get the public identifier of the entity where the exception occurred.
    def getPublicId(): String = ???

    @stub
    // Get the system identifier of the entity where the exception occurred.
    def getSystemId(): String = ???
}
