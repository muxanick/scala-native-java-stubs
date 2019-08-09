package javax.xml.parsers

import java.io.{File, InputStream}
import java.lang.{Object, String}
import javax.xml.validation.Schema
import org.xml.sax.{HandlerBase, InputSource, Parser, XMLReader}
import org.xml.sax.helpers.DefaultHandler

// Defines the API that wraps an XMLReader
// implementation class. In JAXP 1.0, this class wrapped the
// Parser interface, however this interface was
// replaced by the XMLReader. For ease
// of transition, this class continues to support the same name
// and interface as well as supporting new methods.
//
// An instance of this class can be obtained from the
// SAXParserFactory.newSAXParser() method.
// Once an instance of this class is obtained, XML can be parsed from
// a variety of input sources. These input sources are InputStreams,
// Files, URLs, and SAX InputSources.
//
// This static method creates a new factory instance based
// on a system property setting or uses the platform default
// if no property has been defined.
//
// The system property that controls which Factory implementation
// to create is named "javax.xml.parsers.SAXParserFactory".
// This property names a class that is a concrete subclass of this
// abstract class. If no property is defined, a platform default
// will be used.
//
// As the content is parsed by the underlying parser, methods of the
// given HandlerBase or the
// DefaultHandler are called.
//
// Implementors of this class which wrap an underlaying implementation
// can consider using the ParserAdapter
// class to initially adapt their SAX1 implementation to work under
// this revised class.
abstract class SAXParser extends Object {

    // Returns the SAX parser that is encapsultated by the
    // implementation of this class.
    def getParser(): Parser

    // Returns the particular property requested for in the underlying
    // implementation of XMLReader.
    def getProperty(name: String): Object

    // Get a reference to the the Schema being used by
    // the XML processor.
    def getSchema(): Schema

    // Returns the XMLReader that is encapsulated by the
    // implementation of this class.
    def getXMLReader(): XMLReader

    // Indicates whether or not this parser is configured to
    // understand namespaces.
    def isNamespaceAware(): Boolean

    // Indicates whether or not this parser is configured to
    // validate XML documents.
    def isValidating(): Boolean

    // Get the XInclude processing mode for this parser.
    def isXIncludeAware(): Boolean

    // Parse the content of the file specified as XML using the
    // specified DefaultHandler.
    def parse(f: File, dh: DefaultHandler): Unit

    // Parse the content of the file specified as XML using the
    // specified HandlerBase.
    def parse(f: File, hb: HandlerBase): Unit

    // Parse the content given InputSource
    // as XML using the specified
    // DefaultHandler.
    def parse(is: InputSource, dh: DefaultHandler): Unit

    // Parse the content given InputSource
    // as XML using the specified
    // HandlerBase.
    def parse(is: InputSource, hb: HandlerBase): Unit

    // Parse the content of the given InputStream
    // instance as XML using the specified
    // DefaultHandler.
    def parse(is: InputStream, dh: DefaultHandler): Unit

    // Parse the content of the given InputStream
    // instance as XML using the specified
    // DefaultHandler.
    def parse(is: InputStream, dh: DefaultHandler, systemId: String): Unit

    // Parse the content of the given InputStream
    // instance as XML using the specified HandlerBase.
    def parse(is: InputStream, hb: HandlerBase): Unit

    // Parse the content of the given InputStream
    // instance as XML using the specified HandlerBase.
    def parse(is: InputStream, hb: HandlerBase, systemId: String): Unit

    // Parse the content described by the giving Uniform Resource
    // Identifier (URI) as XML using the specified
    // DefaultHandler.
    def parse(uri: String, dh: DefaultHandler): Unit

    // Parse the content described by the giving Uniform Resource
    // Identifier (URI) as XML using the specified
    // HandlerBase.
    def parse(uri: String, hb: HandlerBase): Unit

    // Reset this SAXParser to its original configuration.
    def reset(): Unit
}
