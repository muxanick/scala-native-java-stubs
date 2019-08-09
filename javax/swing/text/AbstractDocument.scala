package javax.swing.text

import java.io.{PrintStream, Serializable}
import java.lang.{Class, Object, Runnable, String, Thread}
import java.util.{Dictionary, EventListener}
import javax.swing.event.{DocumentEvent, DocumentListener, EventListenerList, UndoableEditEvent, UndoableEditListener}
import scala.scalanative.annotation.stub

/** An implementation of the document interface to serve as a
 *  basis for implementing various kinds of documents.  At this
 *  level there is very little policy, so there is a corresponding
 *  increase in difficulty of use.
 *  
 *  This class implements a locking mechanism for the document.  It
 *  allows multiple readers or one writer, and writers must wait until
 *  all observers of the document have been notified of a previous
 *  change before beginning another mutation to the document.  The
 *  read lock is acquired and released using the render
 *  method.  A write lock is acquired by the methods that mutate the
 *  document, and are held for the duration of the method call.
 *  Notification is done on the thread that produced the mutation,
 *  and the thread has full read access to the document for the
 *  duration of the notification, but other readers are kept out
 *  until the notification has finished.  The notification is a
 *  beans event notification which does not allow any further
 *  mutations until all listeners have been notified.
 *  
 *  Any models subclassed from this class and used in conjunction
 *  with a text component that has a look and feel implementation
 *  that is derived from BasicTextUI may be safely updated
 *  asynchronously, because all access to the View hierarchy
 *  is serialized by BasicTextUI if the document is of type
 *  AbstractDocument.  The locking assumes that an
 *  independent thread will access the View hierarchy only from
 *  the DocumentListener methods, and that there will be only
 *  one event thread active at a time.
 *  
 *  If concurrency support is desired, there are the following
 *  additional implications.  The code path for any DocumentListener
 *  implementation and any UndoListener implementation must be threadsafe,
 *  and not access the component lock if trying to be safe from deadlocks.
 *  The repaint and revalidate methods
 *  on JComponent are safe.
 *  
 *  AbstractDocument models an implied break at the end of the document.
 *  Among other things this allows you to position the caret after the last
 *  character. As a result of this, getLength returns one less
 *  than the length of the Content. If you create your own Content, be
 *  sure and initialize it to have an additional character. Refer to
 *  StringContent and GapContent for examples of this. Another implication
 *  of this is that Elements that model the implied end character will have
 *  an endOffset == (getLength() + 1). For example, in DefaultStyledDocument
 *  getParagraphElement(getLength()).getEndOffset() == getLength() + 1
 *  .
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
abstract class AbstractDocument extends Object with Document with Serializable {

    /** Constructs a new AbstractDocument, wrapped around some
     *  specified content storage mechanism.
     */
    @stub
    protected def this(data: AbstractDocument.Content) = ???

    /** Constructs a new AbstractDocument, wrapped around some
     *  specified content storage mechanism.
     */
    @stub
    protected def this(data: AbstractDocument.Content, context: AbstractDocument.AttributeContext) = ???

    /** Implements the abstract part of an element. */
    class AbstractElement extends AbstractDocument.AbstractElement

    /** Implements a composite element that contains other elements. */
    class BranchElement extends AbstractDocument.BranchElement

    /** Stores document changes as the document is being
     *  modified.
     */
    class DefaultDocumentEvent extends AbstractDocument.DefaultDocumentEvent

    /** Implements an element that directly represents content of
     *  some kind.
     */
    class LeafElement extends AbstractDocument.LeafElement

    /** The event listener list for the document. */
    protected val listenerList: EventListenerList

    /** Adds a document listener for notification of any changes. */
    def addDocumentListener(listener: DocumentListener): Unit

    /** Adds an undo listener for notification of any changes. */
    def addUndoableEditListener(listener: UndoableEditListener): Unit

    /** Creates a document branch element, that can contain other elements. */
    protected def createBranchElement(parent: Element, a: AttributeSet): Element

    /** Creates a document leaf element. */
    protected def createLeafElement(parent: Element, a: AttributeSet, p0: Int, p1: Int): Element

    /** Returns a position that will track change as the document
     *  is altered.
     */
    def createPosition(offs: Int): Position

    /** Gives a diagnostic dump. */
    def dump(out: PrintStream): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireChangedUpdate(e: DocumentEvent): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireInsertUpdate(e: DocumentEvent): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireRemoveUpdate(e: DocumentEvent): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireUndoableEditUpdate(e: UndoableEditEvent): Unit

    /** Gets the asynchronous loading priority. */
    def getAsynchronousLoadPriority(): Int

    /** Fetches the context for managing attributes. */
    protected def getAttributeContext(): AbstractDocument.AttributeContext

    /** Returns the root element of the bidirectional structure for this
     *  document.
     */
    def getBidiRootElement(): Element

    /** Gets the content for the document. */
    protected def getContent(): AbstractDocument.Content

    /** Fetches the current writing thread if there is one. */
    protected def getCurrentWriter(): Thread

    /** Returns the root element that views should be based upon
     *  unless some other mechanism for assigning views to element
     *  structures is provided.
     */
    def getDefaultRootElement(): Element

    /** Returns the DocumentFilter that is responsible for
     *  filtering of insertion/removal.
     */
    def getDocumentFilter(): DocumentFilter

    /** Returns an array of all the document listeners
     *  registered on this document.
     */
    def getDocumentListeners(): Array[DocumentListener]

    /** Supports managing a set of properties. */
    def getDocumentProperties(): Dictionary[Object, Object]

    /** Returns a position that represents the end of the document. */
    def getEndPosition(): Position

    /** Returns the length of the data. */
    def getLength(): Int

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this document.
     */
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T]

    /** Get the paragraph element containing the given position. */
    def getParagraphElement(pos: Int): Element

    /** A convenience method for looking up a property value. */
    def getProperty(key: Object): Object

    /** Gets all root elements defined. */
    def getRootElements(): Array[Element]

    /** Returns a position that represents the start of the document. */
    def getStartPosition(): Position

    /** Gets a sequence of text from the document. */
    def getText(offset: Int, length: Int): String

    /** Fetches the text contained within the given portion
     *  of the document.
     */
    def getText(offset: Int, length: Int, txt: Segment): Unit

    /** Returns an array of all the undoable edit listeners
     *  registered on this document.
     */
    def getUndoableEditListeners(): Array[UndoableEditListener]

    /** Inserts some content into the document. */
    def insertString(offs: Int, str: String, a: AttributeSet): Unit

    /** Updates document structure as a result of text insertion. */
    protected def insertUpdate(chng: AbstractDocument.DefaultDocumentEvent, attr: AttributeSet): Unit

    /** Updates any document structure as a result of text removal. */
    protected def postRemoveUpdate(chng: AbstractDocument.DefaultDocumentEvent): Unit

    /** A convenience method for storing up a property value. */
    def putProperty(key: Object, value: Object): Unit

    /** Acquires a lock to begin reading some state from the
     *  document.
     */
    def readLock(): Unit

    /** Does a read unlock. */
    def readUnlock(): Unit

    /** Removes some content from the document. */
    def remove(offs: Int, len: Int): Unit

    /** Removes a document listener. */
    def removeDocumentListener(listener: DocumentListener): Unit

    /** Removes an undo listener. */
    def removeUndoableEditListener(listener: UndoableEditListener): Unit

    /** Updates any document structure as a result of text removal. */
    protected def removeUpdate(chng: AbstractDocument.DefaultDocumentEvent): Unit

    /** This allows the model to be safely rendered in the presence
     *  of currency, if the model supports being updated asynchronously.
     */
    def render(r: Runnable): Unit

    /** Deletes the region of text from offset to
     *  offset + length, and replaces it with text.
     */
    def replace(offset: Int, length: Int, text: String, attrs: AttributeSet): Unit

    /** Sets the asynchronous loading priority. */
    def setAsynchronousLoadPriority(p: Int): Unit

    /** Sets the DocumentFilter. */
    def setDocumentFilter(filter: DocumentFilter): Unit

    /** Replaces the document properties dictionary for this document. */
    def setDocumentProperties(x: Dictionary[Object, Object]): Unit

    /** Acquires a lock to begin mutating the document this lock
     *  protects.
     */
    protected def writeLock(): Unit

    /** Releases a write lock previously obtained via writeLock. */
    protected def writeUnlock(): Unit
}

object AbstractDocument {
    /** An interface that can be used to allow MutableAttributeSet
     *  implementations to use pluggable attribute compression
     *  techniques.
     */
    @stub
    trait AttributeContext extends AbstractDocument.AttributeContext

    /** Interface to describe a sequence of character content that
     *  can be edited.
     */
    @stub
    trait Content extends AbstractDocument.Content

    /** An implementation of ElementChange that can be added to the document
     *  event.
     */
    @stub
    class ElementEdit extends AbstractDocument.ElementEdit

    /** Error message to indicate a bad location. */
    @stub
    protected val BAD_LOCATION: String = ???

    /** Name of elements used to hold a unidirectional run */
    @stub
    val BidiElementName: String = ???

    /** Name of elements used to represent content */
    @stub
    val ContentElementName: String = ???

    /** Name of the attribute used to specify element
     *  names.
     */
    @stub
    val ElementNameAttribute: String = ???

    /** Name of elements used to represent paragraphs */
    @stub
    val ParagraphElementName: String = ???

    /** Name of elements used to hold sections (lines/paragraphs). */
    @stub
    val SectionElementName: String = ???
}
