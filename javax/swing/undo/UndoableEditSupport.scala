package javax.swing.undo

import java.lang.Object
import java.util.Vector
import javax.swing.event.UndoableEditListener

// A support class used for managing UndoableEdit listeners.
class UndoableEditSupport extends Object {

    @stub
    // Constructs an UndoableEditSupport object.
    def this() = ???

    @stub
    // 
    protected def compoundEdit: CompoundEdit = ???

    @stub
    // 
    protected def listeners: Vector[UndoableEditListener] = ???

    @stub
    // 
    protected def realSource: Object = ???

    @stub
    // Called only from postEdit and endUpdate.
    protected def _postEdit(e: UndoableEdit): Unit = ???

    @stub
    // Registers an UndoableEditListener.
    def addUndoableEditListener(l: UndoableEditListener): Unit = ???

    @stub
    // 
    def beginUpdate(): Unit = ???

    @stub
    // Called only from beginUpdate.
    protected def createCompoundEdit(): CompoundEdit = ???

    @stub
    // DEADLOCK WARNING: Calling this method may call
    // undoableEditHappened in all listeners.
    def endUpdate(): Unit = ???

    @stub
    // Returns an array of all the UndoableEditListeners added
    // to this UndoableEditSupport with addUndoableEditListener().
    def getUndoableEditListeners(): Array[UndoableEditListener] = ???

    @stub
    // Returns the update level value.
    def getUpdateLevel(): Int = ???

    @stub
    // DEADLOCK WARNING: Calling this method may call
    // undoableEditHappened in all listeners.
    def postEdit(e: UndoableEdit): Unit = ???

    @stub
    // Removes an UndoableEditListener.
    def removeUndoableEditListener(l: UndoableEditListener): Unit = ???
}
