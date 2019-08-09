package org.xml.sax

import java.lang.String

// Interface for a list of XML attributes.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This interface allows access to a list of attributes in
// three different ways:
//
// 
// by attribute index;
// by Namespace-qualified name; or
// by qualified (prefixed) name.
// 
//
// The list will not contain attributes that were declared
// #IMPLIED but not specified in the start tag.  It will also not
// contain attributes used as Namespace declarations (xmlns*) unless
// the http://xml.org/sax/features/namespace-prefixes
// feature is set to true (it is false by
// default).
// Because SAX2 conforms to the original "Namespaces in XML"
// recommendation, it normally does not
// give namespace declaration attributes a namespace URI.
// 
//
// Some SAX2 parsers may support using an optional feature flag
// (http://xml.org/sax/features/xmlns-uris) to request
// that those attributes be given URIs, conforming to a later
// backwards-incompatible revision of that recommendation.  (The
// attribute's "local name" will be the prefix, or "xmlns" when
// defining a default element namespace.)  For portability, handler
// code should always resolve that conflict, rather than requiring
// parsers that can change the setting of that feature flag.  
//
// If the namespace-prefixes feature (see above) is
// false, access by qualified name may not be available; if
// the http://xml.org/sax/features/namespaces feature is
// false, access by Namespace-qualified names may not be
// available.
//
// This interface replaces the now-deprecated SAX1 AttributeList interface, which does not
// contain Namespace support.  In addition to Namespace support, it
// adds the getIndex methods (below).
//
// The order of attributes in the list is unspecified, and will
// vary from implementation to implementation.
trait Attributes {

    @stub
    // Look up the index of an attribute by XML qualified (prefixed) name.
    def getIndex(qName: String): Int = ???

    @stub
    // Look up the index of an attribute by Namespace name.
    def getIndex(uri: String, localName: String): Int = ???

    @stub
    // Return the number of attributes in the list.
    def getLength(): Int = ???

    @stub
    // Look up an attribute's local name by index.
    def getLocalName(index: Int): String = ???

    @stub
    // Look up an attribute's XML qualified (prefixed) name by index.
    def getQName(index: Int): String = ???

    @stub
    // Look up an attribute's type by index.
    def getType(index: Int): String = ???

    @stub
    // Look up an attribute's type by XML qualified (prefixed) name.
    def getType(qName: String): String = ???

    @stub
    // Look up an attribute's type by Namespace name.
    def getType(uri: String, localName: String): String = ???

    @stub
    // Look up an attribute's Namespace URI by index.
    def getURI(index: Int): String = ???

    @stub
    // Look up an attribute's value by index.
    def getValue(index: Int): String = ???

    @stub
    // Look up an attribute's value by XML qualified (prefixed) name.
    def getValue(qName: String): String = ???
}
