package javax.swing.undo

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An abstract implementation of UndoableEdit,
 *  implementing simple responses to all boolean methods in
 *  that interface.
 */
class AbstractUndoableEdit extends Object with UndoableEdit with Serializable {

    /** Creates an AbstractUndoableEdit which defaults
     *  hasBeenDone and alive to true.
     */
    @stub
    def this() = ???

    /** This default implementation returns false. */
    @stub
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    /** Returns true if this edit is alive
     *  and hasBeenDone is false.
     */
    @stub
    def canRedo(): Boolean = ???

    /** Returns true if this edit is alive
     *  and hasBeenDone is true.
     */
    @stub
    def canUndo(): Boolean = ???

    /** Sets alive to false. */
    @stub
    def die(): Unit = ???

    /** This default implementation returns "". */
    @stub
    def getPresentationName(): String = ???

    /** Retreives the value from the defaults table with key
     *  AbstractUndoableEdit.redoText and returns
     *  that value followed by a space, followed by
     *  getPresentationName.
     */
    @stub
    def getRedoPresentationName(): String = ???

    /** Retreives the value from the defaults table with key
     *  AbstractUndoableEdit.undoText and returns
     *  that value followed by a space, followed by
     *  getPresentationName.
     */
    @stub
    def getUndoPresentationName(): String = ???

    /** This default implementation returns true. */
    @stub
    def isSignificant(): Boolean = ???

    /** Throws CannotRedoException if canRedo
     *  returns false.
     */
    @stub
    def redo(): Unit = ???

    /** This default implementation returns false. */
    @stub
    def replaceEdit(anEdit: UndoableEdit): Boolean = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???

    /** Throws CannotUndoException if canUndo
     *  returns false.
     */
    @stub
    def undo(): Unit = ???
}

object AbstractUndoableEdit {
    /** String returned by getRedoPresentationName;
     *  as of Java 2 platform v1.3.1 this field is no longer used.
     */
    @stub
    protected val RedoName: String = ???

    /** String returned by getUndoPresentationName;
     *  as of Java 2 platform v1.3.1 this field is no longer used.
     */
    @stub
    protected val UndoName: String = ???
}
