package javax.xml.transform

import java.lang.{ClassLoader, Object, String}

// A TransformerFactory instance can be used to create
// Transformer and
// Templates objects.
//
// The system property that determines which Factory implementation
// to create is named "javax.xml.transform.TransformerFactory".
// This property names a concrete subclass of the
// TransformerFactory abstract class. If the property is not
// defined, a platform default is be used.
abstract class TransformerFactory extends Object {

    // Get the stylesheet specification(s) associated with the
    // XML Source document via the
    // 
    // xml-stylesheet processing instruction that match the given criteria.
    def getAssociatedStylesheet(source: Source, media: String, title: String, charset: String): Source

    // Allows the user to retrieve specific attributes on the underlying
    // implementation.
    def getAttribute(name: String): Object

    // Get the error event handler for the TransformerFactory.
    def getErrorListener(): ErrorListener

    // Look up the value of a feature.
    def getFeature(name: String): Boolean

    // Get the object that is used by default during the transformation
    // to resolve URIs used in document(), xsl:import, or xsl:include.
    def getURIResolver(): URIResolver

    // Process the Source into a Templates object, which is a
    // a compiled representation of the source.
    def newTemplates(source: Source): Templates

    // Create a new Transformer that performs a copy
    // of the Source to the Result.
    def newTransformer(): Transformer

    // Process the Source into a Transformer
    // Object.
    def newTransformer(source: Source): Transformer

    // Allows the user to set specific attributes on the underlying
    // implementation.
    def setAttribute(name: String, value: Object): Unit

    // Set the error event listener for the TransformerFactory, which
    // is used for the processing of transformation instructions,
    // and not for the transformation itself.
    def setErrorListener(listener: ErrorListener): Unit

    // Set a feature for this TransformerFactory and Transformers
    // or Templates created by this factory.
    def setFeature(name: String, value: Boolean): Unit
}

object TransformerFactory {
    @stub
    // Obtain a new instance of a TransformerFactory.
    def newInstance(): TransformerFactory = ???

    @stub
    // Obtain a new instance of a TransformerFactory from factory class name.
    def newInstance(factoryClassName: String, classLoader: ClassLoader): TransformerFactory = ???
}
