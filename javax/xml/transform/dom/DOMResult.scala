package javax.xml.transform.dom

import java.lang.{Object, String}
import javax.xml.transform.Result
import org.w3c.dom.Node

/** Acts as a holder for a transformation result tree in the form of a Document Object Model (DOM) tree.
 * 
 *  If no output DOM source is set, the transformation will create a Document node as the holder for the result of the transformation,
 *  which may be retrieved with getNode().
 */
class DOMResult extends Object with Result {

    /** Zero-argument default constructor. */
    @stub
    def this() = ???

    /** Use a DOM node to create a new output target. */
    @stub
    def this(node: Node) = ???

    /** Use a DOM node to create a new output target specifying the child node where the result nodes should be inserted before. */
    @stub
    def this(node: Node, nextSibling: Node) = ???

    /** Use a DOM node to create a new output target specifying the child node where the result nodes should be inserted before and
     *  the specified System ID.
     */
    @stub
    def this(node: Node, nextSibling: Node, systemId: String) = ???

    /** Get the child node before which the result nodes will be inserted. */
    @stub
    def getNextSibling(): Node = ???

    /** Get the node that will contain the result DOM tree. */
    @stub
    def getNode(): Node = ???

    /** Get the System Identifier. */
    @stub
    def getSystemId(): String = ???

    /** Set the child node before which the result nodes will be inserted. */
    @stub
    def setNextSibling(nextSibling: Node): Unit = ???

    /** Set the node that will contain the result DOM tree. */
    @stub
    def setNode(node: Node): Unit = ???
}
