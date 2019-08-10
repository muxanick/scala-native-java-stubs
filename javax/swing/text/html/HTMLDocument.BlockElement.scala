package javax.swing.text.html

import java.lang.{Object, String}
import javax.swing.text.{AbstractDocument.AbstractElement, AbstractDocument.BranchElement, AttributeSet, Element}
import scala.scalanative.annotation.stub

/** An element that represents a structural block of
 *  HTML.
 */
class HTMLDocument_BlockElement extends AbstractDocument.BranchElement {

    /** Constructs a composite element that initially contains
     *  no children.
     */
    @stub
    def BlockElement(parent: Element, a: AttributeSet) = ???

    /** Gets the name of the element. */
    @stub
    def getName(): String = ???

    /** Gets the resolving parent. */
    @stub
    def getResolveParent(): AttributeSet = ???
}
