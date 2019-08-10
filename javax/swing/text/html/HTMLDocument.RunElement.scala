package javax.swing.text.html

import java.lang.{Object, String}
import javax.swing.text.{AbstractDocument.AbstractElement, AbstractDocument.LeafElement, AttributeSet, Element}
import scala.scalanative.annotation.stub

/** An element that represents a chunk of text that has
 *  a set of HTML character level attributes assigned to
 *  it.
 */
class HTMLDocument_RunElement extends AbstractDocument.LeafElement {

    /** Constructs an element that represents content within the
     *  document (has no children).
     */
    @stub
    def RunElement(parent: Element, a: AttributeSet, offs0: Int, offs1: Int) = ???

    /** Gets the name of the element. */
    @stub
    def getName(): String = ???

    /** Gets the resolving parent. */
    @stub
    def getResolveParent(): AttributeSet = ???
}
