package javax.swing.text

import java.lang.{Object, String}
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange, DocumentEvent.EventType}
import javax.swing.undo.{AbstractUndoableEdit, CompoundEdit, UndoableEdit}

// Stores document changes as the document is being
// modified.  Can subsequently be used for change notification
// when done with the document modification transaction.
// This is used by the AbstractDocument class and its extensions
// for broadcasting change information to the document listeners.
class AbstractDocument.DefaultDocumentEvent extends CompoundEdit with DocumentEvent {

    @stub
    // Adds a document edit.
    def addEdit(anEdit: UndoableEdit): Boolean = ???

    @stub
    // Gets the changes for an element.
    def getChange(elem: Element): DocumentEvent.ElementChange = ???

    @stub
    // Gets the document that sourced the change event.
    def getDocument(): Document = ???

    @stub
    // Returns the length of the change.
    def getLength(): Int = ???

    @stub
    // Returns the offset within the document of the start of the change.
    def getOffset(): Int = ???

    @stub
    // Provides a localized, human readable description of this edit
    // suitable for use in, say, a change log.
    def getPresentationName(): String = ???

    @stub
    // Provides a localized, human readable description of the redoable
    // form of this edit, e.g.
    def getRedoPresentationName(): String = ???

    @stub
    // Returns the type of event.
    def getType(): DocumentEvent.EventType = ???

    @stub
    // Provides a localized, human readable description of the undoable
    // form of this edit, e.g.
    def getUndoPresentationName(): String = ???

    @stub
    // DefaultDocument events are significant.
    def isSignificant(): Boolean = ???

    @stub
    // Redoes a change.
    def redo(): Unit = ???

    @stub
    // Returns a string description of the change event.
    def toString(): String = ???
}
