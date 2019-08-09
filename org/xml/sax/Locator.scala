package org.xml.sax

import java.lang.String

// Interface for associating a SAX event with a document location.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// If a SAX parser provides location information to the SAX
// application, it does so by implementing this interface and then
// passing an instance to the application using the content
// handler's setDocumentLocator method.  The application can use the
// object to obtain the location of any other SAX event
// in the XML source document.
//
// Note that the results returned by the object will be valid only
// during the scope of each callback method: the application
// will receive unpredictable results if it attempts to use the
// locator at any other time, or after parsing completes.
//
// SAX parsers are not required to supply a locator, but they are
// very strongly encouraged to do so.  If the parser supplies a
// locator, it must do so before reporting any other document events.
// If no locator has been set by the time the application receives
// the startDocument
// event, the application should assume that a locator is not
// available.
trait Locator {

    @stub
    // Return the column number where the current document event ends.
    def getColumnNumber(): Int = ???

    @stub
    // Return the line number where the current document event ends.
    def getLineNumber(): Int = ???

    @stub
    // Return the public identifier for the current document event.
    def getPublicId(): String = ???
}
