package javax.swing.text

import java.lang.String

// Interface to describe a structural piece of a document.  It
// is intended to capture the spirit of an SGML element.
trait Element {

    @stub
    // Fetches the collection of attributes this element contains.
    def getAttributes(): AttributeSet = ???

    @stub
    // Fetches the document associated with this element.
    def getDocument(): Document = ???

    @stub
    // Fetches the child element at the given index.
    def getElement(index: Int): Element = ???

    @stub
    // Gets the number of child elements contained by this element.
    def getElementCount(): Int = ???

    @stub
    // Gets the child element index closest to the given offset.
    def getElementIndex(offset: Int): Int = ???

    @stub
    // Fetches the offset from the beginning of the document
    // that this element ends at.
    def getEndOffset(): Int = ???

    @stub
    // Fetches the name of the element.
    def getName(): String = ???

    @stub
    // Fetches the parent element.
    def getParentElement(): Element = ???

    @stub
    // Fetches the offset from the beginning of the document
    // that this element begins at.
    def getStartOffset(): Int = ???
}
