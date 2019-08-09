package javax.swing.undo

import java.io.Serializable
import java.lang.{Object, String}

// An abstract implementation of UndoableEdit,
// implementing simple responses to all boolean methods in
// that interface.
class AbstractUndoableEdit extends Object with UndoableEdit, with Serializable {

    @stub
    // This default implementation returns false.
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    @stub
    // Returns true if this edit is alive
    // and hasBeenDone is false.
    def canRedo(): Boolean = ???

    @stub
    // Returns true if this edit is alive
    // and hasBeenDone is true.
    def canUndo(): Boolean = ???

    @stub
    // Sets alive to false.
    def die(): Unit = ???

    @stub
    // This default implementation returns "".
    def getPresentationName(): String = ???

    @stub
    // Retreives the value from the defaults table with key
    // AbstractUndoableEdit.redoText and returns
    // that value followed by a space, followed by
    // getPresentationName.
    def getRedoPresentationName(): String = ???

    @stub
    // Retreives the value from the defaults table with key
    // AbstractUndoableEdit.undoText and returns
    // that value followed by a space, followed by
    // getPresentationName.
    def getUndoPresentationName(): String = ???

    @stub
    // This default implementation returns true.
    def isSignificant(): Boolean = ???

    @stub
    // Throws CannotRedoException if canRedo
    // returns false.
    def redo(): Unit = ???

    @stub
    // This default implementation returns false.
    def replaceEdit(anEdit: UndoableEdit): Boolean = ???

    @stub
    // Returns a string that displays and identifies this
    // object's properties.
    def toString(): String = ???
}

object AbstractUndoableEdit {
    @stub
    // String returned by getRedoPresentationName;
    // as of Java 2 platform v1.3.1 this field is no longer used.
    protected def RedoName: String = ???
}
