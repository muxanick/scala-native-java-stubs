package javax.swing.undo

import java.lang.{Object, String}
import java.util.Vector
import javax.swing.event.UndoableEditListener
import scala.scalanative.annotation.stub

/** A support class used for managing UndoableEdit listeners. */
class UndoableEditSupport extends Object {

    /** Constructs an UndoableEditSupport object. */
    @stub
    def this() = ???

    /** Constructs an UndoableEditSupport object. */
    @stub
    def this(r: Any) = ???

    /**  */
    @stub
    protected val compoundEdit: CompoundEdit = ???

    /**  */
    @stub
    protected val listeners: Vector[UndoableEditListener] = ???

    /**  */
    @stub
    protected val realSource: Any = ???

    /**  */
    @stub
    protected val updateLevel: Int = ???

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

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???
}
