package javax.swing.undo

import java.lang.{Object, String}
import java.util.Hashtable

// StateEdit is a general edit for objects that change state.
// Objects being edited must conform to the StateEditable interface.
//
// This edit class works by asking an object to store it's state in
// Hashtables before and after editing occurs.  Upon undo or redo the
// object is told to restore it's state from these Hashtables.
//
// A state edit is used as follows:
// 
//      // Create the edit during the "before" state of the object
//      StateEdit newEdit = new StateEdit(myObject);
//      // Modify the object
//      myObject.someStateModifyingMethod();
//      // "end" the edit when you are done modifying the object
//      newEdit.end();
// 
//
// Note that when a StateEdit ends, it removes redundant state from
// the Hashtables - A state Hashtable is not guaranteed to contain all
// keys/values placed into it when the state is stored!
class StateEdit extends AbstractUndoableEdit {

    @stub
    // Create and return a new StateEdit.
    def this(anObject: StateEditable) = ???

    @stub
    // The object being edited
    protected def object: StateEditable = ???

    @stub
    // The state information after the edit
    protected def postState: Hashtable[Object, Object] = ???

    @stub
    // The state information prior to the edit
    protected def preState: Hashtable[Object, Object] = ???

    @stub
    // Gets the post-edit state of the StateEditable object and
    // ends the edit.
    def end(): Unit = ???

    @stub
    // Gets the presentation name for this edit
    def getPresentationName(): String = ???

    @stub
    // 
    protected def init(anObject: StateEditable, name: String): Unit = ???

    @stub
    // Tells the edited object to apply the state after the edit
    def redo(): Unit = ???

    @stub
    // Remove redundant key/values in state hashtables.
    protected def removeRedundantState(): Unit = ???
}

object StateEdit {
    @stub
    // 
    protected def RCSID: String = ???
}
