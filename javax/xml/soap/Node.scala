package javax.xml.soap

import java.lang.String
import org.w3c.dom.Node

// A representation of a node (element) in an XML document.
// This interface extnends the standard DOM Node interface with methods for
// getting and setting the value of a node, for
// getting and setting the parent of a node, and for removing a node.
trait Node extends Node {

    @stub
    // Removes this Node object from the tree.
    def detachNode(): Unit = ???

    @stub
    // Returns the parent element of this Node object.
    def getParentElement(): SOAPElement = ???

    @stub
    // Returns the value of this node if this is a Text node or the
    // value of the immediate child of this node otherwise.
    def getValue(): String = ???

    @stub
    // Notifies the implementation that this Node
    // object is no longer being used by the application and that the
    // implementation is free to reuse this object for nodes that may
    // be created later.
    def recycleNode(): Unit = ???

    @stub
    // Sets the parent of this Node object to the given
    // SOAPElement object.
    def setParentElement(parent: SOAPElement): Unit = ???
}
