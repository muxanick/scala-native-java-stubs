package javax.swing.text

import java.lang.Object
import javax.swing.event.DocumentEvent.ElementChange
import javax.swing.undo.AbstractUndoableEdit

// An implementation of ElementChange that can be added to the document
// event.
object AbstractDocument.ElementEdit extends AbstractUndoableEdit with DocumentEvent.ElementChange {

    @stub
    // Gets a list of children that were added.
    def getChildrenAdded(): Array[Element] = ???

    @stub
    // Gets a list of children that were removed.
    def getChildrenRemoved(): Array[Element] = ???

    @stub
    // Returns the underlying element.
    def getElement(): Element = ???

    @stub
    // Returns the index into the list of elements.
    def getIndex(): Int = ???

    @stub
    // Redoes a change.
    def redo(): Unit = ???
}
