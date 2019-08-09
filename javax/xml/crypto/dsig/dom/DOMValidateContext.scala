package javax.xml.crypto.dsig.dom

import java.lang.Object
import java.security.Key
import javax.xml.crypto.dom.DOMCryptoContext
import javax.xml.crypto.dsig.XMLValidateContext
import org.w3c.dom.Node

// A DOM-specific XMLValidateContext. This class contains additional
// methods to specify the location in a DOM tree where an XMLSignature
// is to be unmarshalled and validated from.
//
// Note that the behavior of an unmarshalled XMLSignature
// is undefined if the contents of the underlying DOM tree are modified by the
// caller after the XMLSignature is created.
//
// Also, note that DOMValidateContext instances can contain
// information and state specific to the XML signature structure it is
// used with. The results are unpredictable if a
// DOMValidateContext is used with different signature structures
// (for example, you should not use the same DOMValidateContext
// instance to validate two different XMLSignature objects).
class DOMValidateContext extends DOMCryptoContext with XMLValidateContext {

    @stub
    // Creates a DOMValidateContext containing the specified key
    // and node.
    def this(validatingKey: Key, node: Node) = ???

    @stub
    // Returns the node.
    def getNode(): Node = ???
}
