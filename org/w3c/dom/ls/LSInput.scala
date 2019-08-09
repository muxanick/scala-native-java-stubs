package org.w3c.dom.ls

import java.io.{InputStream, Reader}
import java.lang.String

// This interface represents an input source for data.
//  This interface allows an application to encapsulate information about
// an input source in a single object, which may include a public
// identifier, a system identifier, a byte stream (possibly with a specified
// encoding), a base URI, and/or a character stream.
//  The exact definitions of a byte stream and a character stream are
// binding dependent.
//  The application is expected to provide objects that implement this
// interface whenever such objects are needed. The application can either
// provide its own objects that implement this interface, or it can use the
// generic factory method DOMImplementationLS.createLSInput()
// to create objects that implement this interface.
//  The LSParser will use the LSInput object to
// determine how to read data. The LSParser will look at the
// different inputs specified in the LSInput in the following
// order to know which one to read from, the first one that is not null and
// not an empty string will be used:
// 
//  LSInput.characterStream
// 
// 
// LSInput.byteStream
// 
//  LSInput.stringData
// 
// 
// LSInput.systemId
// 
//  LSInput.publicId
// 
// 
//  If all inputs are null, the LSParser will report a
// DOMError with its DOMError.type set to
// "no-input-specified" and its DOMError.severity
// set to DOMError.SEVERITY_FATAL_ERROR.
//  LSInput objects belong to the application. The DOM
// implementation will never modify them (though it may make copies and
// modify the copies, if necessary).
// See also the Document Object Model (DOM) Level 3 Load
//and Save Specification.
trait LSInput {

    @stub
    // The base URI to be used (see section 5.1.4 in [IETF RFC 2396]) for
    // resolving a relative systemId to an absolute URI.
    def getBaseURI(): String = ???

    @stub
    // An attribute of a language and binding dependent type that represents
    // a stream of bytes.
    def getByteStream(): InputStream = ???

    @stub
    // If set to true, assume that the input is certified (see section 2.13
    // in [XML 1.1]) when
    // parsing [XML 1.1].
    def getCertifiedText(): Boolean = ???

    @stub
    // An attribute of a language and binding dependent type that represents
    // a stream of 16-bit units.
    def getCharacterStream(): Reader = ???

    @stub
    // The character encoding, if known.
    def getEncoding(): String = ???

    @stub
    // The public identifier for this input source.
    def getPublicId(): String = ???

    @stub
    // String data to parse.
    def getStringData(): String = ???

    @stub
    // The system identifier, a URI reference [IETF RFC 2396], for this
    // input source.
    def getSystemId(): String = ???

    @stub
    // The base URI to be used (see section 5.1.4 in [IETF RFC 2396]) for
    // resolving a relative systemId to an absolute URI.
    def setBaseURI(baseURI: String): Unit = ???

    @stub
    // An attribute of a language and binding dependent type that represents
    // a stream of bytes.
    def setByteStream(byteStream: InputStream): Unit = ???

    @stub
    // If set to true, assume that the input is certified (see section 2.13
    // in [XML 1.1]) when
    // parsing [XML 1.1].
    def setCertifiedText(certifiedText: Boolean): Unit = ???

    @stub
    // An attribute of a language and binding dependent type that represents
    // a stream of 16-bit units.
    def setCharacterStream(characterStream: Reader): Unit = ???

    @stub
    // The character encoding, if known.
    def setEncoding(encoding: String): Unit = ???

    @stub
    // The public identifier for this input source.
    def setPublicId(publicId: String): Unit = ???

    @stub
    // String data to parse.
    def setStringData(stringData: String): Unit = ???
}
