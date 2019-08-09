package javax.xml.parsers

import java.lang.{ClassLoader, Object, String}
import javax.xml.validation.Schema

// Defines a factory API that enables applications to configure and
// obtain a SAX based parser to parse XML documents.
abstract class SAXParserFactory extends Object {

    // Returns the particular property requested for in the underlying
    // implementation of org.xml.sax.XMLReader.
    def getFeature(name: String): Boolean

    // Gets the Schema object specified through
    // the setSchema(Schema schema) method.
    def getSchema(): Schema

    // Indicates whether or not the factory is configured to produce
    // parsers which are namespace aware.
    def isNamespaceAware(): Boolean

    // Indicates whether or not the factory is configured to produce
    // parsers which validate the XML content during parse.
    def isValidating(): Boolean

    // Get state of XInclude processing.
    def isXIncludeAware(): Boolean

    // Creates a new instance of a SAXParser using the currently
    // configured factory parameters.
    def newSAXParser(): SAXParser

    // Sets the particular feature in the underlying implementation of
    // org.xml.sax.XMLReader.
    def setFeature(name: String, value: Boolean): Unit

    // Specifies that the parser produced by this code will
    // provide support for XML namespaces.
    def setNamespaceAware(awareness: Boolean): Unit

    // Set the Schema to be used by parsers created
    // from this factory.
    def setSchema(schema: Schema): Unit

    // Specifies that the parser produced by this code will
    // validate documents as they are parsed.
    def setValidating(validating: Boolean): Unit
}

object SAXParserFactory {
    @stub
    // Obtain a new instance of a SAXParserFactory.
    def newInstance(): SAXParserFactory = ???

    @stub
    // Obtain a new instance of a SAXParserFactory from class name.
    def newInstance(factoryClassName: String, classLoader: ClassLoader): SAXParserFactory = ???
}
