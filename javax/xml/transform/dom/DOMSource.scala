package javax.xml.transform.dom

import java.lang.{Object, String}
import javax.xml.transform.Source
import org.w3c.dom.Node

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
}
