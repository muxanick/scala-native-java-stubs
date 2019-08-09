package javax.xml.crypto.dom

import java.lang.{Object, String}
import java.util.Iterator
import javax.xml.crypto.{KeySelector, URIDereferencer, XMLCryptoContext}
import org.w3c.dom.Element

// This class provides a DOM-specific implementation of the
// XMLCryptoContext interface. It also includes additional
// methods that are specific to a DOM-based implementation for registering
// and retrieving elements that contain attributes of type ID.
class DOMCryptoContext extends Object with XMLCryptoContext {

    @stub
    // This implementation uses an internal HashMap to get the object
    // that the specified key maps to.
    def get(key: Object): Object = ???

    @stub
    // Returns the base URI.
    def getBaseURI(): String = ???

    @stub
    // Returns the default namespace prefix.
    def getDefaultNamespacePrefix(): String = ???

    @stub
    // Returns the Element with the specified ID attribute value.
    def getElementById(idValue: String): Element = ???

    @stub
    // Returns the key selector for finding a key.
    def getKeySelector(): KeySelector = ???

    @stub
    // This implementation uses an internal HashMap to get the prefix
    // that the specified URI maps to.
    def getNamespacePrefix(namespaceURI: String, defaultPrefix: String): String = ???

    @stub
    // This implementation uses an internal HashMap to get the object
    // that the specified name maps to.
    def getProperty(name: String): Object = ???

    @stub
    // Returns a URIDereferencer that is used to dereference
    // URIReferences.
    def getURIDereferencer(): URIDereferencer = ???

    @stub
    // Returns a read-only iterator over the set of Id/Element mappings of
    // this DOMCryptoContext.
    def iterator(): Iterator = ???

    @stub
    // This implementation uses an internal HashMap to map the key
    // to the specified object.
    def put(key: Object, value: Object): Object = ???

    @stub
    // This implementation uses an internal HashMap to map the URI
    // to the specified prefix.
    def putNamespacePrefix(namespaceURI: String, prefix: String): String = ???

    @stub
    // Sets the base URI.
    def setBaseURI(baseURI: String): Unit = ???

    @stub
    // Sets the default namespace prefix.
    def setDefaultNamespacePrefix(defaultPrefix: String): Unit = ???

    @stub
    // Registers the element's attribute specified by the namespace URI and
    // local name to be of type ID.
    def setIdAttributeNS(element: Element, namespaceURI: String, localName: String): Unit = ???

    @stub
    // Sets the key selector for finding a key.
    def setKeySelector(ks: KeySelector): Unit = ???

    @stub
    // This implementation uses an internal HashMap to map the name
    // to the specified object.
    def setProperty(name: String, value: Object): Object = ???
}
