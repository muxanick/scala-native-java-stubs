package javax.swing.undo

import java.lang.{Object, String}
import javax.swing.event.{UndoableEditEvent, UndoableEditListener}
import scala.scalanative.annotation.stub

/** UndoManager manages a list of UndoableEdits,
 *  providing a way to undo or redo the appropriate edits.  There are
 *  two ways to add edits to an UndoManager.  Add the edit
 *  directly using the addEdit method, or add the
 *  UndoManager to a bean that supports
 *  UndoableEditListener.  The following examples creates
 *  an UndoManager and adds it as an
 *  UndoableEditListener to a JTextField:
 *  
 *    UndoManager undoManager = new UndoManager();
 *    JTextField tf = ...;
 *    tf.getDocument().addUndoableEditListener(undoManager);
 *  
 *  
 *  UndoManager maintains an ordered list of edits and the
 *  index of the next edit in that list. The index of the next edit is
 *  either the size of the current list of edits, or if
 *  undo has been invoked it corresponds to the index
 *  of the last significant edit that was undone. When
 *  undo is invoked all edits from the index of the next
 *  edit to the last significant edit are undone, in reverse order.
 *  For example, consider an UndoManager consisting of the
 *  following edits: A b c D.  Edits with a
 *  upper-case letter in bold are significant, those in lower-case
 *  and italicized are insignificant.
 *  
 *  
 *  
 *  
 *      
 *  Figure 1
 *  
 *  
 *  As shown in figure 1, if D was just added, the
 *  index of the next edit will be 4. Invoking undo
 *  results in invoking undo on D and setting the
 *  index of the next edit to 3 (edit c), as shown in the following
 *  figure.
 *  
 *  
 *  
 *  
 *      
 *  Figure 2
 *  
 *  
 *  The last significant edit is A, so that invoking
 *  undo again invokes undo on c,
 *  b, and A, in that order, setting the index of the
 *  next edit to 0, as shown in the following figure.
 *  
 *  
 *  
 *  
 *      
 *  Figure 3
 *  
 *  
 *  Invoking redo results in invoking redo on
 *  all edits between the index of the next edit and the next
 *  significant edit (or the end of the list).  Continuing with the previous
 *  example if redo were invoked, redo would in
 *  turn be invoked on A, b and c.  In addition
 *  the index of the next edit is set to 3 (as shown in figure 2).
 *  
 *  Adding an edit to an UndoManager results in
 *  removing all edits from the index of the next edit to the end of
 *  the list.  Continuing with the previous example, if a new edit,
 *  e, is added the edit D is removed from the list
 *  (after having die invoked on it).  If c is not
 *  incorporated by the next edit
 *  (c.addEdit(e) returns true), or replaced
 *  by it (e.replaceEdit(c) returns true),
 *  the new edit is added after c, as shown in the following
 *  figure.
 *  
 *  
 *  
 *  
 *      
 *  Figure 4
 *  
 *  
 *  Once end has been invoked on an UndoManager
 *  the superclass behavior is used for all UndoableEdit
 *  methods.  Refer to CompoundEdit for more details on its
 *  behavior.
 *  
 *  Unlike the rest of Swing, this class is thread safe.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class UndoManager extends CompoundEdit with UndoableEditListener {

    /** Creates a new UndoManager. */
    @stub
    def this() = ???

    /** Adds an UndoableEdit to this
     *  UndoManager, if it's possible.
     */
    @stub
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    /** Returns true if edits may be redone. */
    @stub
    def canRedo(): Boolean = ???

    /** Returns true if edits may be undone. */
    @stub
    def canUndo(): Boolean = ???

    /** Returns true if it is possible to invoke undo or
     *  redo.
     */
    @stub
    def canUndoOrRedo(): Boolean = ???

    /** Empties the undo manager sending each edit a die message
     *  in the process.
     */
    @stub
    def discardAllEdits(): Unit = ???

    /** Returns the the next significant edit to be redone if redo
     *  is invoked.
     */
    @stub
    protected def editToBeRedone(): UndoableEdit = ???

    /** Returns the the next significant edit to be undone if undo
     *  is invoked.
     */
    @stub
    protected def editToBeUndone(): UndoableEdit = ???

    /** Turns this UndoManager into a normal
     *  CompoundEdit.
     */
    @stub
    def end(): Unit = ???

    /** Returns the maximum number of edits this UndoManager
     *  holds.
     */
    @stub
    def getLimit(): Int = ???

    /** Returns a description of the redoable form of this edit. */
    @stub
    def getRedoPresentationName(): String = ???

    /** Convenience method that returns either
     *  getUndoPresentationName or
     *  getRedoPresentationName.
     */
    @stub
    def getUndoOrRedoPresentationName(): String = ???

    /** Returns a description of the undoable form of this edit. */
    @stub
    def getUndoPresentationName(): String = ???

    /** Redoes the appropriate edits. */
    @stub
    def redo(): Unit = ???

    /** Redoes all changes from the index of the next edit to
     *  edit, updating the index of the next edit appropriately.
     */
    @stub
    protected def redoTo(edit: UndoableEdit): Unit = ???

    /** Sets the maximum number of edits this UndoManager
     *  holds.
     */
    @stub
    def setLimit(l: Int): Unit = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???

    /** Removes edits in the specified range. */
    @stub
    protected def trimEdits(from: Int, to: Int): Unit = ???

    /** Reduces the number of queued edits to a range of size limit,
     *  centered on the index of the next edit.
     */
    @stub
    protected def trimForLimit(): Unit = ???

    /** Undoes the appropriate edits. */
    @stub
    def undo(): Unit = ???

    /** An UndoableEditListener method. */
    @stub
    def undoableEditHappened(e: UndoableEditEvent): Unit = ???

    /** Convenience method that invokes one of undo or
     *  redo.
     */
    @stub
    def undoOrRedo(): Unit = ???

    /** Undoes all changes from the index of the next edit to
     *  edit, updating the index of the next edit appropriately.
     */
    @stub
    protected def undoTo(edit: UndoableEdit): Unit = ???
}
