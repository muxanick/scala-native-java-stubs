package javax.xml.crypto

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Contains common context information for XML cryptographic operations.
 * 
 *  This interface contains methods for setting and retrieving properties
 *  that affect the processing of XML signatures or XML encrypted structures.
 * 
 *  Note that XMLCryptoContext instances can contain information
 *  and state specific to the XML cryptographic structure it is used with.
 *  The results are unpredictable if an XMLCryptoContext is
 *  used with multiple structures (for example, you should not use the same
 *  XMLValidateContext instance to validate two
 *  different XMLSignature objects).
 */
trait XMLCryptoContext {

    /** Returns the value to which this context maps the specified key. */
    @stub
    def get(key: Any): Any = ???

    /** Returns the base URI. */
    @stub
    def getBaseURI(): String = ???

    /** Returns the default namespace prefix. */
    @stub
    def getDefaultNamespacePrefix(): String = ???

    /** Returns the key selector for finding a key. */
    @stub
    def getKeySelector(): KeySelector = ???

    /** Returns the namespace prefix that the specified namespace URI is
     *  associated with.
     */
    @stub
    def getNamespacePrefix(namespaceURI: String, defaultPrefix: String): String = ???

    /** Returns the value of the specified property. */
    @stub
    def getProperty(name: String): Any = ???

    /** Returns a URIDereferencer that is used to dereference
     *  URIReferences.
     */
    @stub
    def getURIDereferencer(): URIDereferencer = ???

    /** Associates the specified value with the specified key in this context. */
    @stub
    def put(key: Any, value: Any): Any = ???

    /** Maps the specified namespace URI to the specified prefix. */
    @stub
    def putNamespacePrefix(namespaceURI: String, prefix: String): String = ???

    /** Sets the base URI. */
    @stub
    def setBaseURI(baseURI: String): Unit = ???

    /** Sets the default namespace prefix. */
    @stub
    def setDefaultNamespacePrefix(defaultPrefix: String): Unit = ???

    /** Sets the key selector for finding a key. */
    @stub
    def setKeySelector(ks: KeySelector): Unit = ???

    /** Sets the specified property. */
    @stub
    def setProperty(name: String, value: Any): Any = ???

    /** Sets a URIDereferencer that is used to dereference
     *  URIReferences.
     */
    @stub
    def setURIDereferencer(dereferencer: URIDereferencer): Unit = ???
}
