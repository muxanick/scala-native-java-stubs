package javax.swing.text

import java.lang.{Object, String}
import javax.swing.event.{DocumentListener, UndoableEditListener}

// 
// The Document is a container for text that serves
// as the model for swing text components.  The goal for this
// interface is to scale from very simple needs (a plain text textfield)
// to complex needs (an HTML or XML document, for example).
//
// Content
// 
// At the simplest level, text can be
// modeled as a linear sequence of characters. To support
// internationalization, the Swing text model uses
// unicode characters.
// The sequence of characters displayed in a text component is
// generally referred to as the component's content.
// 
// To refer to locations within the sequence, the coordinates
// used are the location between two characters.  As the diagram
// below shows, a location in a text document can be referred to
// as a position, or an offset. This position is zero-based.
// 
// 
// In the example, if the content of a document is the
// sequence "The quick brown fox," as shown in the preceding diagram,
// the location just before the word "The" is 0, and the location after
// the word "The" and before the whitespace that follows it is 3.
// The entire sequence of characters in the sequence "The" is called a
// range.
// The following methods give access to the character data
// that makes up the content.
// 
// getLength()
// getText(int, int)
// getText(int, int, javax.swing.text.Segment)
// 
// Structure
// 
// Text is rarely represented simply as featureless content. Rather,
// text typically has some sort of structure associated with it.
// Exactly what structure is modeled is up to a particular Document
// implementation.  It might be as simple as no structure (i.e. a
// simple text field), or it might be something like diagram below.
// 
// 
// The unit of structure (i.e. a node of the tree) is referred to
// by the Element interface.  Each Element
// can be tagged with a set of attributes.  These attributes
// (name/value pairs) are defined by the
// AttributeSet interface.
// The following methods give access to the document structure.
// 
// getDefaultRootElement()
// getRootElements()
// 
//
// Mutations
// 
// All documents need to be able to add and remove simple text.
// Typically, text is inserted and removed via gestures from
// a keyboard or a mouse.  What effect the insertion or removal
// has upon the document structure is entirely up to the
// implementation of the document.
// The following methods are related to mutation of the
// document content:
// 
// insertString(int, java.lang.String, javax.swing.text.AttributeSet)
// remove(int, int)
// createPosition(int)
// 
//
// Notification
// 
// Mutations to the Document must be communicated to
// interested observers.  The notification of change follows the event model
// guidelines that are specified for JavaBeans.  In the JavaBeans
// event model, once an event notification is dispatched, all listeners
// must be notified before any further mutations occur to the source
// of the event.  Further, order of delivery is not guaranteed.
// 
// Notification is provided as two separate events,
// DocumentEvent, and
// UndoableEditEvent.
// If a mutation is made to a Document through its api,
// a DocumentEvent will be sent to all of the registered
// DocumentListeners.  If the Document
// implementation supports undo/redo capabilities, an
// UndoableEditEvent will be sent
// to all of the registered UndoableEditListeners.
// If an undoable edit is undone, a DocumentEvent should be
// fired from the Document to indicate it has changed again.
// In this case however, there should be no UndoableEditEvent
// generated since that edit is actually the source of the change
// rather than a mutation to the Document made through its
// api.
// 
// 
// Referring to the above diagram, suppose that the component shown
// on the left mutates the document object represented by the blue
// rectangle. The document responds by dispatching a DocumentEvent to
// both component views and sends an UndoableEditEvent to the listening
// logic, which maintains a history buffer.
// 
// Now suppose that the component shown on the right mutates the same
// document.  Again, the document dispatches a DocumentEvent to both
// component views and sends an UndoableEditEvent to the listening logic
// that is maintaining the history buffer.
// 
// If the history buffer is then rolled back (i.e. the last UndoableEdit
// undone), a DocumentEvent is sent to both views, causing both of them to
// reflect the undone mutation to the document (that is, the
// removal of the right component's mutation). If the history buffer again
// rolls back another change, another DocumentEvent is sent to both views,
// causing them to reflect the undone mutation to the document -- that is,
// the removal of the left component's mutation.
// 
// The methods related to observing mutations to the document are:
// 
// addDocumentListener(DocumentListener)
// removeDocumentListener(DocumentListener)
// addUndoableEditListener(UndoableEditListener)
// removeUndoableEditListener(UndoableEditListener)
// 
//
// Properties
// 
// Document implementations will generally have some set of properties
// associated with them at runtime.  Two well known properties are the
// StreamDescriptionProperty,
// which can be used to describe where the Document came from,
// and the TitleProperty, which can be used to
// name the Document.  The methods related to the properties are:
// 
// getProperty(java.lang.Object)
// putProperty(java.lang.Object, java.lang.Object)
// 
//
// For more information on the Document class, see
// The Swing Connection
// and most particularly the article,
// 
// The Element Interface.
trait Document {

    @stub
    // Registers the given observer to begin receiving notifications
    // when changes are made to the document.
    def addDocumentListener(listener: DocumentListener): Unit = ???

    @stub
    // Registers the given observer to begin receiving notifications
    // when undoable edits are made to the document.
    def addUndoableEditListener(listener: UndoableEditListener): Unit = ???

    @stub
    // This method allows an application to mark a place in
    // a sequence of character content.
    def createPosition(offs: Int): Position = ???

    @stub
    // Returns the root element that views should be based upon,
    // unless some other mechanism for assigning views to element
    // structures is provided.
    def getDefaultRootElement(): Element = ???

    @stub
    // Returns a position that represents the end of the document.
    def getEndPosition(): Position = ???

    @stub
    // Returns number of characters of content currently
    // in the document.
    def getLength(): Int = ???

    @stub
    // Gets the properties associated with the document.
    def getProperty(key: Object): Object = ???

    @stub
    // Returns all of the root elements that are defined.
    def getRootElements(): Array[Element] = ???

    @stub
    // Returns a position that represents the start of the document.
    def getStartPosition(): Position = ???

    @stub
    // Fetches the text contained within the given portion
    // of the document.
    def getText(offset: Int, length: Int): String = ???

    @stub
    // Fetches the text contained within the given portion
    // of the document.
    def getText(offset: Int, length: Int, txt: Segment): Unit = ???

    @stub
    // Inserts a string of content.
    def insertString(offset: Int, str: String, a: AttributeSet): Unit = ???

    @stub
    // Associates a property with the document.
    def putProperty(key: Object, value: Object): Unit = ???

    @stub
    // Removes a portion of the content of the document.
    def remove(offs: Int, len: Int): Unit = ???

    @stub
    // Unregisters the given observer from the notification list
    // so it will no longer receive change updates.
    def removeDocumentListener(listener: DocumentListener): Unit = ???

    @stub
    // Unregisters the given observer from the notification list
    // so it will no longer receive updates.
    def removeUndoableEditListener(listener: UndoableEditListener): Unit = ???
}

object Document {
    @stub
    // The property name for the description of the stream
    // used to initialize the document.
    def StreamDescriptionProperty: String = ???
}
