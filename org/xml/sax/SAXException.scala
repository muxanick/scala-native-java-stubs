package org.xml.sax

import java.lang.{Exception, Object, String, Throwable}

// Encapsulate a general SAX error or warning.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class can contain basic error or warning information from
// either the XML parser or the application: a parser writer or
// application writer can subclass it to provide additional
// functionality.  SAX handlers may throw this exception or
// any exception subclassed from it.
//
// If the application needs to pass through other types of
// exceptions, it must wrap those exceptions in a SAXException
// or an exception derived from a SAXException.
//
// If the parser or application needs to include information about a
// specific location in an XML document, it should use the
// SAXParseException subclass.
class SAXException extends Exception {

    @stub
    // Create a new SAXException.
    def this() = ???

    @stub
    // Create a new SAXException wrapping an existing exception.
    def this(e: Exception) = ???

    @stub
    // Create a new SAXException.
    def this(message: String) = ???

    @stub
    // Return the cause of the exception
    def getCause(): Throwable = ???

    @stub
    // Return the embedded exception, if any.
    def getException(): Exception = ???

    @stub
    // Return a detail message for this exception.
    def getMessage(): String = ???
}
