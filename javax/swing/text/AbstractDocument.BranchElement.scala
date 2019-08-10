package javax.swing.text

import java.lang.{Object, String}
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** Implements a composite element that contains other elements.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class AbstractDocument_BranchElement extends AbstractDocument.AbstractElement {

    /** Constructs a composite element that initially contains
     *  no children.
     */
    @stub
    def BranchElement(parent: Element, a: AttributeSet) = ???

    /** Returns the children of the receiver as an
     *  Enumeration.
     */
    @stub
    def children(): Enumeration = ???

    /** Returns true if the receiver allows children. */
    @stub
    def getAllowsChildren(): Boolean = ???

    /** Gets a child element. */
    @stub
    def getElement(index: Int): Element = ???

    /** Gets the number of children for the element. */
    @stub
    def getElementCount(): Int = ???

    /** Gets the child element index closest to the given model offset. */
    @stub
    def getElementIndex(offset: Int): Int = ???

    /** Gets the ending offset in the model for the element. */
    @stub
    def getEndOffset(): Int = ???

    /** Gets the element name. */
    @stub
    def getName(): String = ???

    /** Gets the starting offset in the model for the element. */
    @stub
    def getStartOffset(): Int = ???

    /** Checks whether the element is a leaf. */
    @stub
    def isLeaf(): Boolean = ???

    /** Gets the child element that contains
     *  the given model position.
     */
    @stub
    def positionToElement(pos: Int): Element = ???

    /** Replaces content with a new set of elements. */
    @stub
    def replace(offset: Int, length: Int, elems: Array[Element]): Unit = ???

    /** Converts the element to a string. */
    @stub
    def toString(): String = ???
}
