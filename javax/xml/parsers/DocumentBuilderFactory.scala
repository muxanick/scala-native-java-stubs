package javax.xml.parsers

import java.lang.{ClassLoader, Object, String}
import javax.xml.validation.Schema

// Defines a factory API that enables applications to obtain a
// parser that produces DOM object trees from XML documents.
abstract class DocumentBuilderFactory extends Object {

    // Allows the user to retrieve specific attributes on the underlying
    // implementation.
    def getAttribute(name: String): Object

    // Get the state of the named feature.
    def getFeature(name: String): Boolean

    // Gets the Schema object specified through
    // the setSchema(Schema schema) method.
    def getSchema(): Schema

    // Indicates whether or not the factory is configured to produce
    // parsers which converts CDATA nodes to Text nodes and appends it to
    // the adjacent (if any) Text node.
    def isCoalescing(): Boolean

    // Indicates whether or not the factory is configured to produce
    // parsers which expand entity reference nodes.
    def isExpandEntityReferences(): Boolean

    // Indicates whether or not the factory is configured to produce
    // parsers which ignores comments.
    def isIgnoringComments(): Boolean

    // Indicates whether or not the factory is configured to produce
    // parsers which ignore ignorable whitespace in element content.
    def isIgnoringElementContentWhitespace(): Boolean

    // Indicates whether or not the factory is configured to produce
    // parsers which are namespace aware.
    def isNamespaceAware(): Boolean

    // Indicates whether or not the factory is configured to produce
    // parsers which validate the XML content during parse.
    def isValidating(): Boolean

    // Get state of XInclude processing.
    def isXIncludeAware(): Boolean

    // Creates a new instance of a DocumentBuilder
    // using the currently configured parameters.
    def newDocumentBuilder(): DocumentBuilder

    // Allows the user to set specific attributes on the underlying
    // implementation.
    def setAttribute(name: String, value: Object): Unit

    // Specifies that the parser produced by this code will
    // convert CDATA nodes to Text nodes and append it to the
    // adjacent (if any) text node.
    def setCoalescing(coalescing: Boolean): Unit

    // Specifies that the parser produced by this code will
    // expand entity reference nodes.
    def setExpandEntityReferences(expandEntityRef: Boolean): Unit

    // Set a feature for this DocumentBuilderFactory and DocumentBuilders created by this factory.
    def setFeature(name: String, value: Boolean): Unit

    // Specifies that the parser produced by this code will
    // ignore comments.
    def setIgnoringComments(ignoreComments: Boolean): Unit

    // Specifies that the parsers created by this  factory must eliminate
    // whitespace in element content (sometimes known loosely as
    // 'ignorable whitespace') when parsing XML documents (see XML Rec
    // 2.10).
    def setIgnoringElementContentWhitespace(whitespace: Boolean): Unit

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

object DocumentBuilderFactory {
    @stub
    // Obtain a new instance of a
    // DocumentBuilderFactory.
    def newInstance(): DocumentBuilderFactory = ???

    @stub
    // Obtain a new instance of a DocumentBuilderFactory from class name.
    def newInstance(factoryClassName: String, classLoader: ClassLoader): DocumentBuilderFactory = ???
}
