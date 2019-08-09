package javax.swing.text

import java.lang.String
import scala.scalanative.annotation.stub

/** Interface to describe a structural piece of a document.  It
 *  is intended to capture the spirit of an SGML element.
 */
trait Element {

    /** Fetches the collection of attributes this element contains. */
    @stub
    def getAttributes(): AttributeSet = ???

    /** Fetches the document associated with this element. */
    @stub
    def getDocument(): Document = ???

    /** Fetches the child element at the given index. */
    @stub
    def getElement(index: Int): Element = ???

    /** Gets the number of child elements contained by this element. */
    @stub
    def getElementCount(): Int = ???

    /** Gets the child element index closest to the given offset. */
    @stub
    def getElementIndex(offset: Int): Int = ???

    /** Fetches the offset from the beginning of the document
     *  that this element ends at.
     */
    @stub
    def getEndOffset(): Int = ???

    /** Fetches the name of the element. */
    @stub
    def getName(): String = ???

    /** Fetches the parent element. */
    @stub
    def getParentElement(): Element = ???

    /** Fetches the offset from the beginning of the document
     *  that this element begins at.
     */
    @stub
    def getStartOffset(): Int = ???

    /** Is this element a leaf element? An element that
     *  may have children, even if it currently
     *  has no children, would return false.
     */
    @stub
    def isLeaf(): Boolean = ???
}
