package javax.swing.undo

import java.lang.{Object, String}
import java.util.Vector
import scala.scalanative.annotation.stub

/** A concrete subclass of AbstractUndoableEdit, used to assemble little
 *  UndoableEdits into great big ones.
 */
class CompoundEdit extends AbstractUndoableEdit {

    /**  */
    @stub
    def this() = ???

    /** The collection of UndoableEdits
     *  undone/redone en masse by this CompoundEdit.
     */
    @stub
    protected val edits: Vector[UndoableEdit] = ???

    /** If this edit is inProgress,
     *  accepts anEdit and returns true.
     */
    @stub
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    /** Returns false if isInProgress or if super
     *  returns false.
     */
    @stub
    def canRedo(): Boolean = ???

    /** Returns false if isInProgress or if super
     *  returns false.
     */
    @stub
    def canUndo(): Boolean = ???

    /** Sends die to each subedit,
     *  in the reverse of the order that they were added.
     */
    @stub
    def die(): Unit = ???

    /** Sets inProgress to false. */
    @stub
    def end(): Unit = ???

    /** Returns getPresentationName from the
     *  last UndoableEdit added to
     *  edits.
     */
    @stub
    def getPresentationName(): String = ???

    /** Returns getRedoPresentationName
     *  from the last UndoableEdit
     *  added to edits.
     */
    @stub
    def getRedoPresentationName(): String = ???

    /** Returns getUndoPresentationName
     *  from the last UndoableEdit
     *  added to edits.
     */
    @stub
    def getUndoPresentationName(): String = ???

    /** Returns true if this edit is in progress--that is, it has not
     *  received end.
     */
    @stub
    def isInProgress(): Boolean = ???

    /** Returns true if any of the UndoableEdits
     *  in edits do.
     */
    @stub
    def isSignificant(): Boolean = ???

    /** Returns the last UndoableEdit in
     *  edits, or null
     *  if edits is empty.
     */
    @stub
    protected def lastEdit(): UndoableEdit = ???

    /** Sends redo to all contained
     *  UndoableEdits in the order in
     *  which they were added.
     */
    @stub
    def redo(): Unit = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???

    /** Sends undo to all contained
     *  UndoableEdits in the reverse of
     *  the order in which they were added.
     */
    @stub
    def undo(): Unit = ???
}
