package javax.xml.transform.dom

import java.lang.{Object, String}
import javax.xml.transform.Source
import scala.scalanative.annotation.stub

/** Acts as a holder for a transformation Source tree in the
 *  form of a Document Object Model (DOM) tree.
 * 
 *  Note that XSLT requires namespace support. Attempting to transform a DOM
 *  that was not contructed with a namespace-aware parser may result in errors.
 *  Parsers can be made namespace aware by calling
 *  DocumentBuilderFactory.setNamespaceAware(boolean awareness).
 */
class DOMSource extends Object with Source {

    /** Zero-argument default constructor. */
    @stub
    def this() = ???

    /** Create a new input source with a DOM node. */
    @stub
    def this(n: Node) = ???

    /** Create a new input source with a DOM node, and with the
     *  system ID also passed in as the base URI.
     */
    @stub
    def this(node: Node, systemID: String) = ???

    /** Get the node that represents a Source DOM tree. */
    @stub
    def getNode(): Node = ???

    /** Get the base ID (URL or system ID) from where URLs
     *  will be resolved.
     */
    @stub
    def getSystemId(): String = ???

    /** Set the node that will represents a Source DOM tree. */
    @stub
    def setNode(node: Node): Unit = ???

    /** Set the base ID (URL or system ID) from where URLs
     *  will be resolved.
     */
    @stub
    def setSystemId(systemID: String): Unit = ???
}

object DOMSource {
    /** If TransformerFactory.getFeature(java.lang.String)
     *  returns true when passed this value as an argument,
     *  the Transformer supports Source input of this type.
     */
    @stub
    val FEATURE: String = ???
}
