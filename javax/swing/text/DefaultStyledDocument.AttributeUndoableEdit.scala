package javax.swing.text

import java.lang.Object
import javax.swing.undo.AbstractUndoableEdit

// An UndoableEdit used to remember AttributeSet changes to an
// Element.
object DefaultStyledDocument.AttributeUndoableEdit extends AbstractUndoableEdit {

    @stub
    // 
    protected def copy: AttributeSet = ???

    @stub
    // 
    protected def element: Element = ???

    @stub
    // 
    protected def isReplacing: Boolean = ???

    @stub
    // Redoes a change.
    def redo(): Unit = ???
}
