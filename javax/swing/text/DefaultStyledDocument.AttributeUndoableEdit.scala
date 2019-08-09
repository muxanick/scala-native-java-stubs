package javax.swing.text

import java.lang.Object
import javax.swing.undo.AbstractUndoableEdit

/** An UndoableEdit used to remember AttributeSet changes to an
 *  Element.
 */
object DefaultStyledDocument.AttributeUndoableEdit extends AbstractUndoableEdit {

    /**  */
    @stub
    protected val copy: AttributeSet = ???

    /**  */
    @stub
    protected val element: Element = ???

    /**  */
    @stub
    protected val isReplacing: Boolean = ???

    /** Redoes a change. */
    @stub
    def redo(): Unit = ???
}
