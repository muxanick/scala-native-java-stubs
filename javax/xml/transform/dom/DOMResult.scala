package javax.xml.transform.dom

import java.lang.{Object, String}
import javax.xml.transform.Result
import org.w3c.dom.Node

// Acts as a holder for a transformation result tree in the form of a Document Object Model (DOM) tree.
//
// If no output DOM source is set, the transformation will create a Document node as the holder for the result of the transformation,
// which may be retrieved with getNode().
class DOMResult extends Object with Result {

    @stub
    // Zero-argument default constructor.
    def this() = ???

    @stub
    // Use a DOM node to create a new output target.
    def this(node: Node) = ???

    @stub
    // Use a DOM node to create a new output target specifying the child node where the result nodes should be inserted before.
    def this(node: Node, nextSibling: Node) = ???

    @stub
    // Use a DOM node to create a new output target specifying the child node where the result nodes should be inserted before and
    // the specified System ID.
    def this(node: Node, nextSibling: Node, systemId: String) = ???

    @stub
    // Get the child node before which the result nodes will be inserted.
    def getNextSibling(): Node = ???

    @stub
    // Get the node that will contain the result DOM tree.
    def getNode(): Node = ???

    @stub
    // Get the System Identifier.
    def getSystemId(): String = ???

    @stub
    // Set the child node before which the result nodes will be inserted.
    def setNextSibling(nextSibling: Node): Unit = ???

    @stub
    // Set the node that will contain the result DOM tree.
    def setNode(node: Node): Unit = ???
}
