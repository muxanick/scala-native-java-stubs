package javax.xml.soap

import java.lang.String
import scala.scalanative.annotation.stub

/** A representation of a node (element) in an XML document.
 *  This interface extnends the standard DOM Node interface with methods for
 *  getting and setting the value of a node, for
 *  getting and setting the parent of a node, and for removing a node.
 */
trait Node extends Node {

    /** Removes this Node object from the tree. */
    @stub
    def detachNode(): Unit = ???

    /** Returns the parent element of this Node object. */
    @stub
    def getParentElement(): SOAPElement = ???

    /** Returns the value of this node if this is a Text node or the
     *  value of the immediate child of this node otherwise.
     */
    @stub
    def getValue(): String = ???

    /** Notifies the implementation that this Node
     *  object is no longer being used by the application and that the
     *  implementation is free to reuse this object for nodes that may
     *  be created later.
     */
    @stub
    def recycleNode(): Unit = ???

    /** Sets the parent of this Node object to the given
     *  SOAPElement object.
     */
    @stub
    def setParentElement(parent: SOAPElement): Unit = ???

    /** If this is a Text node then this method will set its value,
     *  otherwise it sets the value of  the immediate (Text) child of this node.
     */
    @stub
    def setValue(value: String): Unit = ???
}
