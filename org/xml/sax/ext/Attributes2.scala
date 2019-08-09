package org.xml.sax.ext

import java.lang.String
import org.xml.sax.Attributes

// SAX2 extension to augment the per-attribute information
// provided though Attributes.
// If an implementation supports this extension, the attributes
// provided in ContentHandler.startElement()  will implement this interface,
// and the http://xml.org/sax/features/use-attributes2
// feature flag will have the value true.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// 
//
//  XMLReader implementations are not required to support this
// information, and it is not part of core-only SAX2 distributions.
//
// Note that if an attribute was defaulted (!isSpecified())
// it will of necessity also have been declared (isDeclared())
// in the DTD.
// Similarly if an attribute's type is anything except CDATA, then it
// must have been declared.
// 
trait Attributes2 extends Attributes {

    @stub
    // Returns false unless the attribute was declared in the DTD.
    def isDeclared(index: Int): Boolean = ???

    @stub
    // Returns false unless the attribute was declared in the DTD.
    def isDeclared(qName: String): Boolean = ???

    @stub
    // Returns false unless the attribute was declared in the DTD.
    def isDeclared(uri: String, localName: String): Boolean = ???

    @stub
    // Returns true unless the attribute value was provided
    // by DTD defaulting.
    def isSpecified(index: Int): Boolean = ???

    @stub
    // Returns true unless the attribute value was provided
    // by DTD defaulting.
    def isSpecified(qName: String): Boolean = ???
}
