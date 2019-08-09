package javax.xml.transform.dom

import java.lang.{Object, String}
import javax.xml.transform.Source
import org.w3c.dom.Node

// Acts as a holder for a transformation Source tree in the
// form of a Document Object Model (DOM) tree.
//
// Note that XSLT requires namespace support. Attempting to transform a DOM
// that was not contructed with a namespace-aware parser may result in errors.
// Parsers can be made namespace aware by calling
// DocumentBuilderFactory.setNamespaceAware(boolean awareness).
class DOMSource extends Object with Source {

    @stub
    // Zero-argument default constructor.
    def this() = ???

    @stub
    // Create a new input source with a DOM node.
    def this(n: Node) = ???

    @stub
    // Get the node that represents a Source DOM tree.
    def getNode(): Node = ???

    @stub
    // Get the base ID (URL or system ID) from where URLs
    // will be resolved.
    def getSystemId(): String = ???

    @stub
    // Set the node that will represents a Source DOM tree.
    def setNode(node: Node): Unit = ???
}
