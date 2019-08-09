package org.xml.sax

import java.lang.{Exception, Object, Throwable}

// Exception class for an unsupported operation.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// An XMLReader will throw this exception when it recognizes a
// feature or property identifier, but cannot perform the requested
// operation (setting a state or value).  Other SAX2 applications and
// extensions may use this class for similar purposes.
class SAXNotSupportedException extends SAXException {

    @stub
    // Construct a new exception with no message.
    def this() = ???
}
