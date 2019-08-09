package javax.swing.undo

import java.lang.{Object, String}
import javax.swing.event.{UndoableEditEvent, UndoableEditListener}

// UndoManager manages a list of UndoableEdits,
// providing a way to undo or redo the appropriate edits.  There are
// two ways to add edits to an UndoManager.  Add the edit
// directly using the addEdit method, or add the
// UndoManager to a bean that supports
// UndoableEditListener.  The following examples creates
// an UndoManager and adds it as an
// UndoableEditListener to a JTextField:
// 
//   UndoManager undoManager = new UndoManager();
//   JTextField tf = ...;
//   tf.getDocument().addUndoableEditListener(undoManager);
// 
// 
// UndoManager maintains an ordered list of edits and the
// index of the next edit in that list. The index of the next edit is
// either the size of the current list of edits, or if
// undo has been invoked it corresponds to the index
// of the last significant edit that was undone. When
// undo is invoked all edits from the index of the next
// edit to the last significant edit are undone, in reverse order.
// For example, consider an UndoManager consisting of the
// following edits: A b c D.  Edits with a
// upper-case letter in bold are significant, those in lower-case
// and italicized are insignificant.
// 
// 
// 
// 
//     
// Figure 1
// 
// 
// As shown in figure 1, if D was just added, the
// index of the next edit will be 4. Invoking undo
// results in invoking undo on D and setting the
// index of the next edit to 3 (edit c), as shown in the following
// figure.
// 
// 
// 
// 
//     
// Figure 2
// 
// 
// The last significant edit is A, so that invoking
// undo again invokes undo on c,
// b, and A, in that order, setting the index of the
// next edit to 0, as shown in the following figure.
// 
// 
// 
// 
//     
// Figure 3
// 
// 
// Invoking redo results in invoking redo on
// all edits between the index of the next edit and the next
// significant edit (or the end of the list).  Continuing with the previous
// example if redo were invoked, redo would in
// turn be invoked on A, b and c.  In addition
// the index of the next edit is set to 3 (as shown in figure 2).
// 
// Adding an edit to an UndoManager results in
// removing all edits from the index of the next edit to the end of
// the list.  Continuing with the previous example, if a new edit,
// e, is added the edit D is removed from the list
// (after having die invoked on it).  If c is not
// incorporated by the next edit
// (c.addEdit(e) returns true), or replaced
// by it (e.replaceEdit(c) returns true),
// the new edit is added after c, as shown in the following
// figure.
// 
// 
// 
// 
//     
// Figure 4
// 
// 
// Once end has been invoked on an UndoManager
// the superclass behavior is used for all UndoableEdit
// methods.  Refer to CompoundEdit for more details on its
// behavior.
// 
// Unlike the rest of Swing, this class is thread safe.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class UndoManager extends CompoundEdit with UndoableEditListener {

    @stub
    // Adds an UndoableEdit to this
    // UndoManager, if it's possible.
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    @stub
    // Returns true if edits may be redone.
    def canRedo(): Boolean = ???

    @stub
    // Returns true if edits may be undone.
    def canUndo(): Boolean = ???

    @stub
    // Returns true if it is possible to invoke undo or
    // redo.
    def canUndoOrRedo(): Boolean = ???

    @stub
    // Empties the undo manager sending each edit a die message
    // in the process.
    def discardAllEdits(): Unit = ???

    @stub
    // Returns the the next significant edit to be redone if redo
    // is invoked.
    protected def editToBeRedone(): UndoableEdit = ???

    @stub
    // Returns the the next significant edit to be undone if undo
    // is invoked.
    protected def editToBeUndone(): UndoableEdit = ???

    @stub
    // Turns this UndoManager into a normal
    // CompoundEdit.
    def end(): Unit = ???

    @stub
    // Returns the maximum number of edits this UndoManager
    // holds.
    def getLimit(): Int = ???

    @stub
    // Returns a description of the redoable form of this edit.
    def getRedoPresentationName(): String = ???

    @stub
    // Convenience method that returns either
    // getUndoPresentationName or
    // getRedoPresentationName.
    def getUndoOrRedoPresentationName(): String = ???

    @stub
    // Returns a description of the undoable form of this edit.
    def getUndoPresentationName(): String = ???

    @stub
    // Redoes the appropriate edits.
    def redo(): Unit = ???

    @stub
    // Redoes all changes from the index of the next edit to
    // edit, updating the index of the next edit appropriately.
    protected def redoTo(edit: UndoableEdit): Unit = ???

    @stub
    // Sets the maximum number of edits this UndoManager
    // holds.
    def setLimit(l: Int): Unit = ???

    @stub
    // Returns a string that displays and identifies this
    // object's properties.
    def toString(): String = ???

    @stub
    // Removes edits in the specified range.
    protected def trimEdits(from: Int, to: Int): Unit = ???

    @stub
    // Reduces the number of queued edits to a range of size limit,
    // centered on the index of the next edit.
    protected def trimForLimit(): Unit = ???

    @stub
    // Undoes the appropriate edits.
    def undo(): Unit = ???

    @stub
    // An UndoableEditListener method.
    def undoableEditHappened(e: UndoableEditEvent): Unit = ???

    @stub
    // Convenience method that invokes one of undo or
    // redo.
    def undoOrRedo(): Unit = ???
}
