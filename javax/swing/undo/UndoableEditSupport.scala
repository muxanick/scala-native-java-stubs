package javax.swing.undo

import java.lang.Object
import java.util.Vector
import javax.swing.event.UndoableEditListener

/** A support class used for managing UndoableEdit listeners. */
class UndoableEditSupport extends Object {

    /** Constructs an UndoableEditSupport object. */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val compoundEdit: CompoundEdit = ???

    /**  */
    @stub
    protected val listeners: Vector[UndoableEditListener] = ???

    /**  */
    @stub
    protected val realSource: Object = ???

    /** Called only from postEdit and endUpdate. */
    @stub
    protected def _postEdit(e: UndoableEdit): Unit = ???

    /** Registers an UndoableEditListener. */
    @stub
    def addUndoableEditListener(l: UndoableEditListener): Unit = ???

    /**  */
    @stub
    def beginUpdate(): Unit = ???

    /** Called only from beginUpdate. */
    @stub
    protected def createCompoundEdit(): CompoundEdit = ???

    /** DEADLOCK WARNING: Calling this method may call
     *  undoableEditHappened in all listeners.
     */
    @stub
    def endUpdate(): Unit = ???

    /** Returns an array of all the UndoableEditListeners added
     *  to this UndoableEditSupport with addUndoableEditListener().
     */
    @stub
    def getUndoableEditListeners(): Array[UndoableEditListener] = ???

    /** Returns the update level value. */
    @stub
    def getUpdateLevel(): Int = ???

    /** DEADLOCK WARNING: Calling this method may call
     *  undoableEditHappened in all listeners.
     */
    @stub
    def postEdit(e: UndoableEdit): Unit = ???

    /** Removes an UndoableEditListener. */
    @stub
    def removeUndoableEditListener(l: UndoableEditListener): Unit = ???
}
