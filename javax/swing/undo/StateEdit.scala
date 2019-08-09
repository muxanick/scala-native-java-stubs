package javax.swing.undo

import java.lang.{Object, String}
import java.util.Hashtable
import scala.scalanative.annotation.stub

/** StateEdit is a general edit for objects that change state.
 *  Objects being edited must conform to the StateEditable interface.
 * 
 *  This edit class works by asking an object to store it's state in
 *  Hashtables before and after editing occurs.  Upon undo or redo the
 *  object is told to restore it's state from these Hashtables.
 * 
 *  A state edit is used as follows:
 *  
 *       // Create the edit during the "before" state of the object
 *       StateEdit newEdit = new StateEdit(myObject);
 *       // Modify the object
 *       myObject.someStateModifyingMethod();
 *       // "end" the edit when you are done modifying the object
 *       newEdit.end();
 *  
 * 
 *  Note that when a StateEdit ends, it removes redundant state from
 *  the Hashtables - A state Hashtable is not guaranteed to contain all
 *  keys/values placed into it when the state is stored!
 */
class StateEdit extends AbstractUndoableEdit {

    /** Create and return a new StateEdit. */
    @stub
    def this(anObject: StateEditable) = ???

    /** Create and return a new StateEdit with a presentation name. */
    @stub
    def this(anObject: StateEditable, name: String) = ???

    /** The object being edited */
    @stub
    protected val object: StateEditable = ???

    /** The state information after the edit */
    @stub
    protected val postState: Hashtable[Object, Object] = ???

    /** The state information prior to the edit */
    @stub
    protected val preState: Hashtable[Object, Object] = ???

    /** The undo/redo presentation name */
    @stub
    protected val undoRedoName: String = ???

    /** Gets the post-edit state of the StateEditable object and
     *  ends the edit.
     */
    @stub
    def end(): Unit = ???

    /** Gets the presentation name for this edit */
    @stub
    def getPresentationName(): String = ???

    /**  */
    @stub
    protected def init(anObject: StateEditable, name: String): Unit = ???

    /** Tells the edited object to apply the state after the edit */
    @stub
    def redo(): Unit = ???

    /** Remove redundant key/values in state hashtables. */
    @stub
    protected def removeRedundantState(): Unit = ???

    /** Tells the edited object to apply the state prior to the edit */
    @stub
    def undo(): Unit = ???
}

object StateEdit {
    /**  */
    @stub
    protected val RCSID: String = ???
}
