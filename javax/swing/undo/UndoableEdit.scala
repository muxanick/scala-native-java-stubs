package javax.swing.undo

import java.lang.String

// An UndoableEdit represents an edit.  The edit may
// be undone, or if already undone the edit may be redone.
// 
// UndoableEdit is designed to be used with the
// UndoManager.  As UndoableEdits are generated
// by an UndoableEditListener they are typically added to
// the UndoManager.  When an UndoableEdit
// is added to an UndoManager the following occurs (assuming
// end has not been called on the UndoManager):
// 
// If the UndoManager contains edits it will call
//     addEdit on the current edit passing in the new edit
//     as the argument.  If addEdit returns true the
//     new edit is assumed to have been incorporated into the current edit and
//     the new edit will not be added to the list of current edits.
//     Edits can use addEdit as a way for smaller edits to
//     be incorporated into a larger edit and treated as a single edit.
// If addEdit returns false replaceEdit
//     is called on the new edit with the current edit passed in as the
//     argument. This is the inverse of addEdit —
//     if the new edit returns true from replaceEdit, the new
//     edit replaces the current edit.
// 
// The UndoManager makes use of
// isSignificant to determine how many edits should be
// undone or redone.  The UndoManager will undo or redo
// all insignificant edits (isSignificant returns false)
// between the current edit and the last or
// next significant edit.   addEdit and
// replaceEdit can be used to treat multiple edits as
// a single edit, returning false from isSignificant
// allows for treating can be used to
// have many smaller edits undone or redone at once.  Similar functionality
// can also be done using the addEdit method.
trait UndoableEdit {

    @stub
    // Adds an UndoableEdit to this UndoableEdit.
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    @stub
    // Returns true if this edit may be redone.
    def canRedo(): Boolean = ???

    @stub
    // Returns true if this edit may be undone.
    def canUndo(): Boolean = ???

    @stub
    // Informs the edit that it should no longer be used.
    def die(): Unit = ???

    @stub
    // Returns a localized, human-readable description of this edit, suitable
    // for use in a change log, for example.
    def getPresentationName(): String = ???

    @stub
    // Returns a localized, human-readable description of the redoable form of
    // this edit, suitable for use as a Redo menu item, for example.
    def getRedoPresentationName(): String = ???

    @stub
    // Returns a localized, human-readable description of the undoable form of
    // this edit, suitable for use as an Undo menu item, for example.
    def getUndoPresentationName(): String = ???

    @stub
    // Returns true if this edit is considered significant.
    def isSignificant(): Boolean = ???

    @stub
    // Re-applies the edit.
    def redo(): Unit = ???

    @stub
    // Returns true if this UndoableEdit should replace
    // anEdit.
    def replaceEdit(anEdit: UndoableEdit): Boolean = ???
}
