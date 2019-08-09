package javax.swing.text

import java.lang.{Object, String}
import java.util.Enumeration

// Implements a composite element that contains other elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class AbstractDocument.BranchElement extends AbstractDocument.AbstractElement {

    @stub
    // Returns the children of the receiver as an
    // Enumeration.
    def children(): Enumeration = ???

    @stub
    // Returns true if the receiver allows children.
    def getAllowsChildren(): Boolean = ???

    @stub
    // Gets a child element.
    def getElement(index: Int): Element = ???

    @stub
    // Gets the number of children for the element.
    def getElementCount(): Int = ???

    @stub
    // Gets the child element index closest to the given model offset.
    def getElementIndex(offset: Int): Int = ???

    @stub
    // Gets the ending offset in the model for the element.
    def getEndOffset(): Int = ???

    @stub
    // Gets the element name.
    def getName(): String = ???

    @stub
    // Gets the starting offset in the model for the element.
    def getStartOffset(): Int = ???

    @stub
    // Checks whether the element is a leaf.
    def isLeaf(): Boolean = ???

    @stub
    // Gets the child element that contains
    // the given model position.
    def positionToElement(pos: Int): Element = ???

    @stub
    // Replaces content with a new set of elements.
    def replace(offset: Int, length: Int, elems: Array[Element]): Unit = ???
}
