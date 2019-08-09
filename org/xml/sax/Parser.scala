package org.xml.sax

import java.lang.String

// Basic interface for SAX (Simple API for XML) parsers.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This was the main event supplier interface for SAX1; it has
// been replaced in SAX2 by XMLReader,
// which includes Namespace support and sophisticated configurability
// and extensibility.
//
// All SAX1 parsers must implement this basic interface: it allows
// applications to register handlers for different types of events
// and to initiate a parse from a URI, or a character stream.
//
// All SAX1 parsers must also implement a zero-argument constructor
// (though other constructors are also allowed).
//
// SAX1 parsers are reusable but not re-entrant: the application
// may reuse a parser object (possibly with a different input source)
// once the first parse has completed successfully, but it may not
// invoke the parse() methods recursively within a parse.
trait Parser {

    @stub
    // Deprecated. 
    def parse(source: InputSource): Unit = ???

    @stub
    // Deprecated. 
    def parse(systemId: String): Unit = ???

    @stub
    // Deprecated. 
    def setDocumentHandler(handler: DocumentHandler): Unit = ???

    @stub
    // Deprecated. 
    def setDTDHandler(handler: DTDHandler): Unit = ???

    @stub
    // Deprecated. 
    def setEntityResolver(resolver: EntityResolver): Unit = ???

    @stub
    // Deprecated. 
    def setErrorHandler(handler: ErrorHandler): Unit = ???
}
