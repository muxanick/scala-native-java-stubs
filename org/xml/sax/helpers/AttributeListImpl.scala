package org.xml.sax.helpers

import java.lang.{Object, String}
import org.xml.sax.AttributeList

// Default implementation for AttributeList.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// AttributeList implements the deprecated SAX1 AttributeList interface, and has been
// replaced by the new SAX2 AttributesImpl interface.
//
// This class provides a convenience implementation of the SAX
// AttributeList interface.  This
// implementation is useful both for SAX parser writers, who can use
// it to provide attributes to the application, and for SAX application
// writers, who can use it to create a persistent copy of an element's
// attribute specifications:
//
// 
// private AttributeList myatts;
//
// public void startElement (String name, AttributeList atts)
// {
//              // create a persistent copy of the attribute list
//              // for use outside this method
//   myatts = new AttributeListImpl(atts);
//   [...]
// }
// 
//
// Please note that SAX parsers are not required to use this
// class to provide an implementation of AttributeList; it is
// supplied only as an optional convenience.  In particular,
// parser writers are encouraged to invent more efficient
// implementations.
class AttributeListImpl extends Object with AttributeList {

    @stub
    // Deprecated. 
    def this() = ???

    @stub
    // Deprecated. 
    def addAttribute(name: String, type: String, value: String): Unit = ???

    @stub
    // Deprecated. 
    def clear(): Unit = ???

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

    @stub
    // Deprecated. 
    def getValue(name: String): String = ???

    @stub
    // Deprecated. 
    def removeAttribute(name: String): Unit = ???
}
