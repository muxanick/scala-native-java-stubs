package javax.swing.event

import javax.swing.text.Element

// Describes changes made to a specific element.
object trait DocumentEvent.ElementChange {

    @stub
    // Gets the child elements that were added to the given
    // parent element.
    def getChildrenAdded(): Array[Element] = ???

    @stub
    // Gets the child elements that were removed from the
    // given parent element.
    def getChildrenRemoved(): Array[Element] = ???

    @stub
    // Returns the element represented.
    def getElement(): Element = ???
}
