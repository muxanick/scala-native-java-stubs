package org.xml.sax.helpers

import java.lang.{Object, String}
import org.xml.sax.Locator

// Provide an optional convenience implementation of Locator.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class is available mainly for application writers, who
// can use it to make a persistent snapshot of a locator at any
// point during a document parse:
//
// 
// Locator locator;
// Locator startloc;
//
// public void setLocator (Locator locator)
// {
//         // note the locator
//   this.locator = locator;
// }
//
// public void startDocument ()
// {
//         // save the location of the start of the document
//         // for future use.
//   Locator startloc = new LocatorImpl(locator);
// }
//
//
// Normally, parser writers will not use this class, since it
// is more efficient to provide location information only when
// requested, rather than constantly updating a Locator object.
class LocatorImpl extends Object with Locator {

    @stub
    // Zero-argument constructor.
    def this() = ???

    @stub
    // Return the saved column number (1-based).
    def getColumnNumber(): Int = ???

    @stub
    // Return the saved line number (1-based).
    def getLineNumber(): Int = ???

    @stub
    // Return the saved public identifier.
    def getPublicId(): String = ???

    @stub
    // Return the saved system identifier.
    def getSystemId(): String = ???

    @stub
    // Set the column number for this locator (1-based).
    def setColumnNumber(columnNumber: Int): Unit = ???

    @stub
    // Set the line number for this locator (1-based).
    def setLineNumber(lineNumber: Int): Unit = ???

    @stub
    // Set the public identifier for this locator.
    def setPublicId(publicId: String): Unit = ???
}
