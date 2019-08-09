package javax.xml.crypto

import java.lang.{Object, String}

// Contains common context information for XML cryptographic operations.
//
// This interface contains methods for setting and retrieving properties
// that affect the processing of XML signatures or XML encrypted structures.
//
// Note that XMLCryptoContext instances can contain information
// and state specific to the XML cryptographic structure it is used with.
// The results are unpredictable if an XMLCryptoContext is
// used with multiple structures (for example, you should not use the same
// XMLValidateContext instance to validate two
// different XMLSignature objects).
trait XMLCryptoContext {

    @stub
    // Returns the value to which this context maps the specified key.
    def get(key: Object): Object = ???

    @stub
    // Returns the base URI.
    def getBaseURI(): String = ???

    @stub
    // Returns the default namespace prefix.
    def getDefaultNamespacePrefix(): String = ???

    @stub
    // Returns the key selector for finding a key.
    def getKeySelector(): KeySelector = ???

    @stub
    // Returns the namespace prefix that the specified namespace URI is
    // associated with.
    def getNamespacePrefix(namespaceURI: String, defaultPrefix: String): String = ???

    @stub
    // Returns the value of the specified property.
    def getProperty(name: String): Object = ???

    @stub
    // Returns a URIDereferencer that is used to dereference
    // URIReferences.
    def getURIDereferencer(): URIDereferencer = ???

    @stub
    // Associates the specified value with the specified key in this context.
    def put(key: Object, value: Object): Object = ???

    @stub
    // Maps the specified namespace URI to the specified prefix.
    def putNamespacePrefix(namespaceURI: String, prefix: String): String = ???

    @stub
    // Sets the base URI.
    def setBaseURI(baseURI: String): Unit = ???

    @stub
    // Sets the default namespace prefix.
    def setDefaultNamespacePrefix(defaultPrefix: String): Unit = ???

    @stub
    // Sets the key selector for finding a key.
    def setKeySelector(ks: KeySelector): Unit = ???

    @stub
    // Sets the specified property.
    def setProperty(name: String, value: Object): Object = ???
}
