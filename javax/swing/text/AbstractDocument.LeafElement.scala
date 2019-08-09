package javax.swing.text

import java.lang.{Object, String}
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** Implements an element that directly represents content of
 *  some kind.
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
class AbstractDocument.LeafElement extends AbstractDocument.AbstractElement {

    /** Constructs an element that represents content within the
     *  document (has no children).
     */
    @stub
    def LeafElement(parent: Element, a: AttributeSet, offs0: Int, offs1: Int) = ???

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

    /** Returns the number of child elements. */
    @stub
    def getElementCount(): Int = ???

    /** Gets the child element index closest to the given model offset. */
    @stub
    def getElementIndex(pos: Int): Int = ???

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

    /** Converts the element to a string. */
    @stub
    def toString(): String = ???
}
