package org.xml.sax

import java.lang.String

// Interface for an element's attribute specifications.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This is the original SAX1 interface for reporting an element's
// attributes.  Unlike the new Attributes
// interface, it does not support Namespace-related information.
//
// When an attribute list is supplied as part of a
// startElement
// event, the list will return valid results only during the
// scope of the event; once the event handler returns control
// to the parser, the attribute list is invalid.  To save a
// persistent copy of the attribute list, use the SAX1
// AttributeListImpl
// helper class.
//
// An attribute list includes only attributes that have been
// specified or defaulted: #IMPLIED attributes will not be included.
//
// There are two ways for the SAX application to obtain information
// from the AttributeList.  First, it can iterate through the entire
// list:
//
// 
// public void startElement (String name, AttributeList atts) {
//   for (int i = 0; i < atts.getLength(); i++) {
//     String name = atts.getName(i);
//     String type = atts.getType(i);
//     String value = atts.getValue(i);
//     [...]
//   }
// }
// 
//
// (Note that the result of getLength() will be zero if there
// are no attributes.)
//
// As an alternative, the application can request the value or
// type of specific attributes:
//
// 
// public void startElement (String name, AttributeList atts) {
//   String identifier = atts.getValue("id");
//   String label = atts.getValue("label");
//   [...]
// }
// 
trait AttributeList {

    @stub
    // Deprecated. 
    def getLength(): Int = ???

    @stub
    // Deprecated. 
    def getName(i: Int): String = ???

    @stub
    // Deprecated. 
    def getType(i: Int): String = ???

    @stub
    // Deprecated. 
    def getType(name: String): String = ???

    @stub
    // Deprecated. 
    def getValue(i: Int): String = ???
}
