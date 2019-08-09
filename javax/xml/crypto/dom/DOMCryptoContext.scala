package javax.xml.crypto.dom

import java.lang.{Object, String}
import java.util.Iterator
import javax.xml.crypto.{KeySelector, URIDereferencer, XMLCryptoContext}
import scala.scalanative.annotation.stub

/** This class provides a DOM-specific implementation of the
 *  XMLCryptoContext interface. It also includes additional
 *  methods that are specific to a DOM-based implementation for registering
 *  and retrieving elements that contain attributes of type ID.
 */
class DOMCryptoContext extends Object with XMLCryptoContext {

    /** Default constructor. */
    @stub
    protected def this() = ???

    /** This implementation uses an internal HashMap to get the object
     *  that the specified key maps to.
     */
    @stub
    def get(key: Object): Object = ???

    /** Returns the base URI. */
    @stub
    def getBaseURI(): String = ???

    /** Returns the default namespace prefix. */
    @stub
    def getDefaultNamespacePrefix(): String = ???

    /** Returns the Element with the specified ID attribute value. */
    @stub
    def getElementById(idValue: String): Element = ???

    /** Returns the key selector for finding a key. */
    @stub
    def getKeySelector(): KeySelector = ???

    /** This implementation uses an internal HashMap to get the prefix
     *  that the specified URI maps to.
     */
    @stub
    def getNamespacePrefix(namespaceURI: String, defaultPrefix: String): String = ???

    /** This implementation uses an internal HashMap to get the object
     *  that the specified name maps to.
     */
    @stub
    def getProperty(name: String): Object = ???

    /** Returns a URIDereferencer that is used to dereference
     *  URIReferences.
     */
    @stub
    def getURIDereferencer(): URIDereferencer = ???

    /** Returns a read-only iterator over the set of Id/Element mappings of
     *  this DOMCryptoContext.
     */
    @stub
    def iterator(): Iterator = ???

    /** This implementation uses an internal HashMap to map the key
     *  to the specified object.
     */
    @stub
    def put(key: Object, value: Object): Object = ???

    /** This implementation uses an internal HashMap to map the URI
     *  to the specified prefix.
     */
    @stub
    def putNamespacePrefix(namespaceURI: String, prefix: String): String = ???

    /** Sets the base URI. */
    @stub
    def setBaseURI(baseURI: String): Unit = ???

    /** Sets the default namespace prefix. */
    @stub
    def setDefaultNamespacePrefix(defaultPrefix: String): Unit = ???

    /** Registers the element's attribute specified by the namespace URI and
     *  local name to be of type ID.
     */
    @stub
    def setIdAttributeNS(element: Element, namespaceURI: String, localName: String): Unit = ???

    /** Sets the key selector for finding a key. */
    @stub
    def setKeySelector(ks: KeySelector): Unit = ???

    /** This implementation uses an internal HashMap to map the name
     *  to the specified object.
     */
    @stub
    def setProperty(name: String, value: Object): Object = ???

    /** Sets a URIDereferencer that is used to dereference
     *  URIReferences.
     */
    @stub
    def setURIDereferencer(dereferencer: URIDereferencer): Unit = ???
}
