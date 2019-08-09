package org.xml.sax

// Interface for an XML filter.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// An XML filter is like an XML reader, except that it obtains its
// events from another XML reader rather than a primary source like
// an XML document or database.  Filters can modify a stream of
// events as they pass on to the final application.
//
// The XMLFilterImpl helper class provides a convenient base
// for creating SAX2 filters, by passing on all EntityResolver, DTDHandler,
// ContentHandler and ErrorHandler events automatically.
trait XMLFilter extends XMLReader {

    @stub
    // Get the parent reader.
    def getParent(): XMLReader = ???
}
