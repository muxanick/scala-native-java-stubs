package org.xml.sax.helpers

import java.lang.{Object, String}
import org.xml.sax.Attributes

// Default implementation of the Attributes interface.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class provides a default implementation of the SAX2
// Attributes interface, with the
// addition of manipulators so that the list can be modified or
// reused.
//
// There are two typical uses of this class:
//
// 
// to take a persistent snapshot of an Attributes object
//  in a startElement event; or
// to construct or modify an Attributes object in a SAX2 driver or filter.
// 
//
// This class replaces the now-deprecated SAX1 AttributeListImpl
// class; in addition to supporting the updated Attributes
// interface rather than the deprecated AttributeList interface, it also includes a much more efficient
// implementation using a single array rather than a set of Vectors.
class AttributesImpl extends Object with Attributes {

    @stub
    // Construct a new, empty AttributesImpl object.
    def this() = ???

    @stub
    // Add an attribute to the end of the list.
    def addAttribute(uri: String, localName: String, qName: String, type: String, value: String): Unit = ???

    @stub
    // Clear the attribute list for reuse.
    def clear(): Unit = ???

    @stub
    // Look up an attribute's index by qualified (prefixed) name.
    def getIndex(qName: String): Int = ???

    @stub
    // Look up an attribute's index by Namespace name.
    def getIndex(uri: String, localName: String): Int = ???

    @stub
    // Return the number of attributes in the list.
    def getLength(): Int = ???

    @stub
    // Return an attribute's local name.
    def getLocalName(index: Int): String = ???

    @stub
    // Return an attribute's qualified (prefixed) name.
    def getQName(index: Int): String = ???

    @stub
    // Return an attribute's type by index.
    def getType(index: Int): String = ???

    @stub
    // Look up an attribute's type by qualified (prefixed) name.
    def getType(qName: String): String = ???

    @stub
    // Look up an attribute's type by Namespace-qualified name.
    def getType(uri: String, localName: String): String = ???

    @stub
    // Return an attribute's Namespace URI.
    def getURI(index: Int): String = ???

    @stub
    // Return an attribute's value by index.
    def getValue(index: Int): String = ???

    @stub
    // Look up an attribute's value by qualified (prefixed) name.
    def getValue(qName: String): String = ???

    @stub
    // Look up an attribute's value by Namespace-qualified name.
    def getValue(uri: String, localName: String): String = ???

    @stub
    // Remove an attribute from the list.
    def removeAttribute(index: Int): Unit = ???

    @stub
    // Set an attribute in the list.
    def setAttribute(index: Int, uri: String, localName: String, qName: String, type: String, value: String): Unit = ???

    @stub
    // Copy an entire Attributes object.
    def setAttributes(atts: Attributes): Unit = ???

    @stub
    // Set the local name of a specific attribute.
    def setLocalName(index: Int, localName: String): Unit = ???

    @stub
    // Set the qualified name of a specific attribute.
    def setQName(index: Int, qName: String): Unit = ???

    @stub
    // Set the type of a specific attribute.
    def setType(index: Int, type: String): Unit = ???

    @stub
    // Set the Namespace URI of a specific attribute.
    def setURI(index: Int, uri: String): Unit = ???
}
