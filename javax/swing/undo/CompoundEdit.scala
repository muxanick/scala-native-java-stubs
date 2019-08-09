package javax.swing.undo

import java.lang.{Object, String}

// A concrete subclass of AbstractUndoableEdit, used to assemble little
// UndoableEdits into great big ones.
class CompoundEdit extends AbstractUndoableEdit {

    @stub
    // If this edit is inProgress,
    // accepts anEdit and returns true.
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    @stub
    // Returns false if isInProgress or if super
    // returns false.
    def canRedo(): Boolean = ???

    @stub
    // Returns false if isInProgress or if super
    // returns false.
    def canUndo(): Boolean = ???

    @stub
    // Sends die to each subedit,
    // in the reverse of the order that they were added.
    def die(): Unit = ???

    @stub
    // Sets inProgress to false.
    def end(): Unit = ???

    @stub
    // Returns getPresentationName from the
    // last UndoableEdit added to
    // edits.
    def getPresentationName(): String = ???

    @stub
    // Returns getRedoPresentationName
    // from the last UndoableEdit
    // added to edits.
    def getRedoPresentationName(): String = ???

    @stub
    // Returns getUndoPresentationName
    // from the last UndoableEdit
    // added to edits.
    def getUndoPresentationName(): String = ???

    @stub
    // Returns true if this edit is in progress--that is, it has not
    // received end.
    def isInProgress(): Boolean = ???

    @stub
    // Returns true if any of the UndoableEdits
    // in edits do.
    def isSignificant(): Boolean = ???

    @stub
    // Returns the last UndoableEdit in
    // edits, or null
    // if edits is empty.
    protected def lastEdit(): UndoableEdit = ???

    @stub
    // Sends redo to all contained
    // UndoableEdits in the order in
    // which they were added.
    def redo(): Unit = ???

    @stub
    // Returns a string that displays and identifies this
    // object's properties.
    def toString(): String = ???
}
