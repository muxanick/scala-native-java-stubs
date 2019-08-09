package javax.swing.text

import java.lang.{Object, String}
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange, DocumentEvent.EventType}
import javax.swing.undo.{AbstractUndoableEdit, CompoundEdit, UndoableEdit}

/** Stores document changes as the document is being
 *  modified.  Can subsequently be used for change notification
 *  when done with the document modification transaction.
 *  This is used by the AbstractDocument class and its extensions
 *  for broadcasting change information to the document listeners.
 */
class AbstractDocument.DefaultDocumentEvent extends CompoundEdit with DocumentEvent {

    /** Adds a document edit. */
    @stub
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    /** Gets the changes for an element. */
    @stub
    def getChange(elem: Element): DocumentEvent.ElementChange = ???

    /** Gets the document that sourced the change event. */
    @stub
    def getDocument(): Document = ???

    /** Returns the length of the change. */
    @stub
    def getLength(): Int = ???

    /** Returns the offset within the document of the start of the change. */
    @stub
    def getOffset(): Int = ???

    /** Provides a localized, human readable description of this edit
     *  suitable for use in, say, a change log.
     */
    @stub
    def getPresentationName(): String = ???

    /** Provides a localized, human readable description of the redoable
     *  form of this edit, e.g.
     */
    @stub
    def getRedoPresentationName(): String = ???

    /** Returns the type of event. */
    @stub
    def getType(): DocumentEvent.EventType = ???

    /** Provides a localized, human readable description of the undoable
     *  form of this edit, e.g.
     */
    @stub
    def getUndoPresentationName(): String = ???

    /** DefaultDocument events are significant. */
    @stub
    def isSignificant(): Boolean = ???

    /** Redoes a change. */
    @stub
    def redo(): Unit = ???

    /** Returns a string description of the change event. */
    @stub
    def toString(): String = ???
}
