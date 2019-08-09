package javax.swing.text

import java.lang.Object
import javax.swing.event.DocumentEvent.ElementChange
import javax.swing.undo.AbstractUndoableEdit
import scala.scalanative.annotation.stub

/** An implementation of ElementChange that can be added to the document
 *  event.
 */
object AbstractDocument.ElementEdit extends AbstractUndoableEdit with DocumentEvent.ElementChange {

    /** Constructs an edit record. */
    @stub
    def ElementEdit(e: Element, index: Int, removed: Array[Element], added: Array[Element]) = ???

    /** Gets a list of children that were added. */
    @stub
    def getChildrenAdded(): Array[Element] = ???

    /** Gets a list of children that were removed. */
    @stub
    def getChildrenRemoved(): Array[Element] = ???

    /** Returns the underlying element. */
    @stub
    def getElement(): Element = ???

    /** Returns the index into the list of elements. */
    @stub
    def getIndex(): Int = ???

    /** Redoes a change. */
    @stub
    def redo(): Unit = ???

    /** Undoes a change. */
    @stub
    def undo(): Unit = ???
}
