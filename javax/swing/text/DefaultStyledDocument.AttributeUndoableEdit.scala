package javax.swing.text

import java.lang.Object
import javax.swing.undo.AbstractUndoableEdit
import scala.scalanative.annotation.stub

/** An UndoableEdit used to remember AttributeSet changes to an
 *  Element.
 */
object DefaultStyledDocument.AttributeUndoableEdit extends AbstractUndoableEdit {

    /**  */
    @stub
    def AttributeUndoableEdit(element: Element, newAttributes: AttributeSet, isReplacing: Boolean) = ???

    /**  */
    @stub
    protected val copy: AttributeSet = ???

    /**  */
    @stub
    protected val element: Element = ???

    /**  */
    @stub
    protected val isReplacing: Boolean = ???

    /**  */
    @stub
    protected val newAttributes: AttributeSet = ???

    /** Redoes a change. */
    @stub
    def redo(): Unit = ???

    /** Undoes a change. */
    @stub
    def undo(): Unit = ???
}
