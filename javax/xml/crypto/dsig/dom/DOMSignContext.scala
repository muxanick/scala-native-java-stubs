package javax.xml.crypto.dsig.dom

import java.lang.Object
import java.security.Key
import javax.xml.crypto.KeySelector
import javax.xml.crypto.dom.DOMCryptoContext
import javax.xml.crypto.dsig.XMLSignContext
import org.w3c.dom.Node

// A DOM-specific XMLSignContext. This class contains additional methods
// to specify the location in a DOM tree where an XMLSignature
// object is to be marshalled when generating the signature.
//
// Note that DOMSignContext instances can contain
// information and state specific to the XML signature structure it is
// used with. The results are unpredictable if a
// DOMSignContext is used with different signature structures
// (for example, you should not use the same DOMSignContext
// instance to sign two different XMLSignature objects).
class DOMSignContext extends DOMCryptoContext with XMLSignContext {

    @stub
    // Creates a DOMSignContext with the specified signing key
    // and parent node.
    def this(signingKey: Key, parent: Node) = ???

    @stub
    // Creates a DOMSignContext with the specified signing key,
    // parent and next sibling nodes.
    def this(signingKey: Key, parent: Node, nextSibling: Node) = ???

    @stub
    // Creates a DOMSignContext with the specified key selector
    // and parent node.
    def this(ks: KeySelector, parent: Node) = ???

    @stub
    // Returns the nextSibling node.
    def getNextSibling(): Node = ???

    @stub
    // Returns the parent node.
    def getParent(): Node = ???

    @stub
    // Sets the next sibling node.
    def setNextSibling(nextSibling: Node): Unit = ???
}
