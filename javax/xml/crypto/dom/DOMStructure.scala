package javax.xml.crypto.dom

import java.lang.Object
import javax.xml.crypto.XMLStructure
import org.w3c.dom.Node

/** A DOM-specific XMLStructure. The purpose of this class is to
 *  allow a DOM node to be used to represent extensible content (any elements
 *  or mixed content) in XML Signature structures.
 * 
 *  If a sequence of nodes is needed, the node contained in the
 *  DOMStructure is the first node of the sequence and successive
 *  nodes can be accessed by invoking Node.getNextSibling().
 * 
 *  If the owner document of the DOMStructure is different than
 *  the target document of an XMLSignature, the
 *  XMLSignature.sign(XMLSignContext) method imports the node into the
 *  target document before generating the signature.
 */
class DOMStructure extends Object with XMLStructure {

    /** Returns the node contained in this DOMStructure. */
    @stub
    def getNode(): Node = ???
}
