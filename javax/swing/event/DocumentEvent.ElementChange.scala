package javax.swing.event

import javax.swing.text.Element

/** Describes changes made to a specific element. */
object trait DocumentEvent.ElementChange {

    /** Gets the child elements that were added to the given
     *  parent element.
     */
    @stub
    def getChildrenAdded(): Array[Element] = ???

    /** Gets the child elements that were removed from the
     *  given parent element.
     */
    @stub
    def getChildrenRemoved(): Array[Element] = ???

    /** Returns the element represented. */
    @stub
    def getElement(): Element = ???
}
