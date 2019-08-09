package org.xml.sax.ext

import java.lang.{Object, String}
import org.xml.sax.helpers.LocatorImpl

// SAX2 extension helper for holding additional Entity information,
// implementing the Locator2 interface.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// 
//
//  This is not part of core-only SAX2 distributions.
class Locator2Impl extends LocatorImpl with Locator2 {

    @stub
    // Construct a new, empty Locator2Impl object.
    def this() = ???

    @stub
    // Returns the current value of the encoding property.
    def getEncoding(): String = ???

    @stub
    // Returns the current value of the version property.
    def getXMLVersion(): String = ???

    @stub
    // Assigns the current value of the encoding property.
    def setEncoding(encoding: String): Unit = ???
}
