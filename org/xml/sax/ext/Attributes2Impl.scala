package org.xml.sax.ext

import java.lang.{Object, String}
import org.xml.sax.Attributes
import org.xml.sax.helpers.AttributesImpl

// SAX2 extension helper for additional Attributes information,
// implementing the Attributes2 interface.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// 
//
// This is not part of core-only SAX2 distributions.
//
// The specified flag for each attribute will always
// be true, unless it has been set to false in the copy constructor
// or using setSpecified(int, boolean).
// Similarly, the declared flag for each attribute will
// always be false, except for defaulted attributes (specified
// is false), non-CDATA attributes, or when it is set to true using
// setDeclared(int, boolean).
// If you change an attribute's type by hand, you may need to modify
// its declared flag to match.
// 
class Attributes2Impl extends AttributesImpl with Attributes2 {

    @stub
    // Construct a new, empty Attributes2Impl object.
    def this() = ???

    @stub
    // Add an attribute to the end of the list, setting its
    // "specified" flag to true.
    def addAttribute(uri: String, localName: String, qName: String, type: String, value: String): Unit = ???

    @stub
    // Returns the current value of the attribute's "declared" flag.
    def isDeclared(index: Int): Boolean = ???

    @stub
    // Returns the current value of the attribute's "declared" flag.
    def isDeclared(qName: String): Boolean = ???

    @stub
    // Returns the current value of the attribute's "declared" flag.
    def isDeclared(uri: String, localName: String): Boolean = ???

    @stub
    // Returns the current value of an attribute's "specified" flag.
    def isSpecified(index: Int): Boolean = ???

    @stub
    // Returns the current value of an attribute's "specified" flag.
    def isSpecified(qName: String): Boolean = ???

    @stub
    // Returns the current value of an attribute's "specified" flag.
    def isSpecified(uri: String, localName: String): Boolean = ???

    @stub
    // Remove an attribute from the list.
    def removeAttribute(index: Int): Unit = ???

    @stub
    // Copy an entire Attributes object.
    def setAttributes(atts: Attributes): Unit = ???

    @stub
    // Assign a value to the "declared" flag of a specific attribute.
    def setDeclared(index: Int, value: Boolean): Unit = ???
}
