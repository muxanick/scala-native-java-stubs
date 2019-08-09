package javax.xml.crypto.dsig.dom

import java.lang.Object
import java.security.Key
import javax.xml.crypto.KeySelector
import javax.xml.crypto.dom.DOMCryptoContext
import javax.xml.crypto.dsig.XMLSignContext
import org.w3c.dom.Node

/** A DOM-specific XMLSignContext. This class contains additional methods
 *  to specify the location in a DOM tree where an XMLSignature
 *  object is to be marshalled when generating the signature.
 * 
 *  Note that DOMSignContext instances can contain
 *  information and state specific to the XML signature structure it is
 *  used with. The results are unpredictable if a
 *  DOMSignContext is used with different signature structures
 *  (for example, you should not use the same DOMSignContext
 *  instance to sign two different XMLSignature objects).
 */
class DOMSignContext extends DOMCryptoContext with XMLSignContext {

    /** Creates a DOMSignContext with the specified signing key
     *  and parent node.
     */
    @stub
    def this(signingKey: Key, parent: Node) = ???

    /** Creates a DOMSignContext with the specified signing key,
     *  parent and next sibling nodes.
     */
    @stub
    def this(signingKey: Key, parent: Node, nextSibling: Node) = ???

    /** Creates a DOMSignContext with the specified key selector
     *  and parent node.
     */
    @stub
    def this(ks: KeySelector, parent: Node) = ???

    /** Returns the nextSibling node. */
    @stub
    def getNextSibling(): Node = ???

    /** Returns the parent node. */
    @stub
    def getParent(): Node = ???

    /** Sets the next sibling node. */
    @stub
    def setNextSibling(nextSibling: Node): Unit = ???
}
