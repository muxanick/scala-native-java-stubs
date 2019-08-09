package org.xml.sax

import java.io.{InputStream, Reader}
import java.lang.{Object, String}

// A single input source for an XML entity.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class allows a SAX application to encapsulate information
// about an input source in a single object, which may include
// a public identifier, a system identifier, a byte stream (possibly
// with a specified encoding), and/or a character stream.
//
// There are two places that the application can deliver an
// input source to the parser: as the argument to the Parser.parse
// method, or as the return value of the EntityResolver.resolveEntity
// method.
//
// The SAX parser will use the InputSource object to determine how
// to read XML input.  If there is a character stream available, the
// parser will read that stream directly, disregarding any text
// encoding declaration found in that stream.
// If there is no character stream, but there is
// a byte stream, the parser will use that byte stream, using the
// encoding specified in the InputSource or else (if no encoding is
// specified) autodetecting the character encoding using an algorithm
// such as the one in the XML specification.  If neither a character
// stream nor a
// byte stream is available, the parser will attempt to open a URI
// connection to the resource identified by the system
// identifier.
//
// An InputSource object belongs to the application: the SAX parser
// shall never modify it in any way (it may modify a copy if
// necessary).  However, standard processing of both byte and
// character streams is to close them on as part of end-of-parse cleanup,
// so applications should not attempt to re-use such streams after they
// have been handed to a parser.  
class InputSource extends Object {

    @stub
    // Zero-argument default constructor.
    def this() = ???

    @stub
    // Create a new input source with a byte stream.
    def this(byteStream: InputStream) = ???

    @stub
    // Create a new input source with a character stream.
    def this(characterStream: Reader) = ???

    @stub
    // Get the byte stream for this input source.
    def getByteStream(): InputStream = ???

    @stub
    // Get the character stream for this input source.
    def getCharacterStream(): Reader = ???

    @stub
    // Get the character encoding for a byte stream or URI.
    def getEncoding(): String = ???

    @stub
    // Get the public identifier for this input source.
    def getPublicId(): String = ???

    @stub
    // Get the system identifier for this input source.
    def getSystemId(): String = ???

    @stub
    // Set the byte stream for this input source.
    def setByteStream(byteStream: InputStream): Unit = ???

    @stub
    // Set the character stream for this input source.
    def setCharacterStream(characterStream: Reader): Unit = ???

    @stub
    // Set the character encoding, if known.
    def setEncoding(encoding: String): Unit = ???

    @stub
    // Set the public identifier for this input source.
    def setPublicId(publicId: String): Unit = ???
}
