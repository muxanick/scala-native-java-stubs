package org.xml.sax.helpers

import java.lang.Object
import org.xml.sax.Parser

// Java-specific class for dynamically loading SAX parsers.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// Note: This class is designed to work with the now-deprecated
// SAX1 Parser class.  SAX2 applications should use
// XMLReaderFactory instead.
//
// ParserFactory is not part of the platform-independent definition
// of SAX; it is an additional convenience class designed
// specifically for Java XML application writers.  SAX applications
// can use the static methods in this class to allocate a SAX parser
// dynamically at run-time based either on the value of the
// `org.xml.sax.parser' system property or on a string containing the class
// name.
//
// Note that the application still requires an XML parser that
// implements SAX1.
class ParserFactory extends Object {
}

object ParserFactory {
    @stub
    // Deprecated. 
    def makeParser(): Parser = ???
}
