package org.xml.sax.helpers

import java.lang.Object
import org.xml.sax.XMLReader

// Factory for creating an XML reader.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class contains static methods for creating an XML reader
// from an explicit class name, or based on runtime defaults:
//
// 
// try {
//   XMLReader myReader = XMLReaderFactory.createXMLReader();
// } catch (SAXException e) {
//   System.err.println(e.getMessage());
// }
// 
//
// Note to Distributions bundled with parsers:
// You should modify the implementation of the no-arguments
// createXMLReader to handle cases where the external
// configuration mechanisms aren't set up.  That method should do its
// best to return a parser when one is in the class path, even when
// nothing bound its class name to org.xml.sax.driver so
// those configuration mechanisms would see it.
final class XMLReaderFactory extends Object {
}

object XMLReaderFactory {
    @stub
    // Attempt to create an XMLReader from system defaults.
    def createXMLReader(): XMLReader = ???
}
