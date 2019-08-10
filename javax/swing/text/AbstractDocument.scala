package javax.swing.text

import java.io.{PrintStream, Serializable}
import java.lang.{Class, Object, Runnable, String, Thread}
import java.util.{Dictionary, Enumeration, EventListener}
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange, DocumentEvent.EventType, DocumentListener, EventListenerList, UndoableEditEvent, UndoableEditListener}
import javax.swing.tree.TreeNode
import javax.swing.undo.{AbstractUndoableEdit, CompoundEdit, UndoableEdit}
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

    /** Implements the abstract part of an element.  By default elements
     *  support attributes by having a field that represents the immutable
     *  part of the current attribute set for the element.  The element itself
     *  implements MutableAttributeSet which can be used to modify the set
     *  by fetching a new immutable set.  The immutable sets are provided
     *  by the AttributeContext associated with the document.
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
    abstract class AbstractElement extends Object with Element with MutableAttributeSet with Serializable with TreeNode {

        /** Creates a new AbstractElement. */
        @stub
        def this(parent: Element, a: AttributeSet) = ???

        /** Adds an attribute to the element. */
        def addAttribute(name: Any, value: Any): Unit

        /** Adds a set of attributes to the element. */
        def addAttributes(attr: AttributeSet): Unit

        /** Returns the children of the receiver as an
         *  Enumeration.
         */
        def children(): Enumeration

        /** Checks whether a given attribute name/value is defined. */
        def containsAttribute(name: Any, value: Any): Boolean

        /** Checks whether the element contains all the attributes. */
        def containsAttributes(attrs: AttributeSet): Boolean

        /** Copies a set of attributes. */
        def copyAttributes(): AttributeSet

        /** Dumps a debugging representation of the element hierarchy. */
        def dump(psOut: PrintStream, indentAmount: Int): Unit

        /** Returns true if the receiver allows children. */
        def getAllowsChildren(): Boolean

        /** Gets the value of an attribute. */
        def getAttribute(attrName: Any): Any

        /** Gets the number of attributes that are defined. */
        def getAttributeCount(): Int

        /** Gets the names of all attributes. */
        def getAttributeNames(): Enumeration[_]

        /** Gets the attributes for the element. */
        def getAttributes(): AttributeSet

        /** Returns the child TreeNode at index
         *  childIndex.
         */
        def getChildAt(childIndex: Int): TreeNode

        /** Returns the number of children TreeNode's
         *  receiver contains.
         */
        def getChildCount(): Int

        /** Retrieves the underlying model. */
        def getDocument(): Document

        /** Gets a child element. */
        def getElement(index: Int): Element

        /** Gets the number of children for the element. */
        def getElementCount(): Int

        /** Gets the child element index closest to the given model offset. */
        def getElementIndex(offset: Int): Int

        /** Gets the ending offset in the model for the element. */
        def getEndOffset(): Int

        /** Returns the index of node in the receivers children. */
        def getIndex(node: TreeNode): Int

        /** Gets the name of the element. */
        def getName(): String

        /** Returns the parent TreeNode of the receiver. */
        def getParent(): TreeNode

        /** Gets the parent of the element. */
        def getParentElement(): Element

        /** Gets the resolving parent. */
        def getResolveParent(): AttributeSet

        /** Gets the starting offset in the model for the element. */
        def getStartOffset(): Int

        /** Checks whether a given attribute is defined. */
        def isDefined(attrName: Any): Boolean

        /** Checks whether two attribute sets are equal. */
        def isEqual(attr: AttributeSet): Boolean

        /** Checks whether the element is a leaf. */
        def isLeaf(): Boolean

        /** Removes an attribute from the set. */
        def removeAttribute(name: Any): Unit

        /** Removes a set of attributes for the element. */
        def removeAttributes(attrs: AttributeSet): Unit

        /** Removes a set of attributes for the element. */
        def removeAttributes(names: Enumeration[_]): Unit

        /** Sets the resolving parent. */
        def setResolveParent(parent: AttributeSet): Unit
    }


    /** Implements a composite element that contains other elements.
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
    class BranchElement extends AbstractDocument.AbstractElement {

        /** Constructs a composite element that initially contains
         *  no children.
         */
        @stub
        def this(parent: Element, a: AttributeSet) = ???

        /** Returns the children of the receiver as an
         *  Enumeration.
         */
        @stub
        def children(): Enumeration = ???

        /** Returns true if the receiver allows children. */
        @stub
        def getAllowsChildren(): Boolean = ???

        /** Gets a child element. */
        @stub
        def getElement(index: Int): Element = ???

        /** Gets the number of children for the element. */
        @stub
        def getElementCount(): Int = ???

        /** Gets the child element index closest to the given model offset. */
        @stub
        def getElementIndex(offset: Int): Int = ???

        /** Gets the ending offset in the model for the element. */
        @stub
        def getEndOffset(): Int = ???

        /** Gets the element name. */
        @stub
        def getName(): String = ???

        /** Gets the starting offset in the model for the element. */
        @stub
        def getStartOffset(): Int = ???

        /** Checks whether the element is a leaf. */
        @stub
        def isLeaf(): Boolean = ???

        /** Gets the child element that contains
         *  the given model position.
         */
        @stub
        def positionToElement(pos: Int): Element = ???

        /** Replaces content with a new set of elements. */
        @stub
        def replace(offset: Int, length: Int, elems: Array[Element]): Unit = ???

        /** Converts the element to a string. */
        @stub
        def toString(): String = ???
    }


    /** Stores document changes as the document is being
     *  modified.  Can subsequently be used for change notification
     *  when done with the document modification transaction.
     *  This is used by the AbstractDocument class and its extensions
     *  for broadcasting change information to the document listeners.
     */
    class DefaultDocumentEvent extends CompoundEdit with DocumentEvent {

        /** Constructs a change record. */
        @stub
        def this(offs: Int, len: Int, type: DocumentEvent.EventType) = ???

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

        /** Undoes a change. */
        @stub
        def undo(): Unit = ???
    }


    /** Implements an element that directly represents content of
     *  some kind.
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
    class LeafElement extends AbstractDocument.AbstractElement {

        /** Constructs an element that represents content within the
         *  document (has no children).
         */
        @stub
        def this(parent: Element, a: AttributeSet, offs0: Int, offs1: Int) = ???

        /** Returns the children of the receiver as an
         *  Enumeration.
         */
        @stub
        def children(): Enumeration = ???

        /** Returns true if the receiver allows children. */
        @stub
        def getAllowsChildren(): Boolean = ???

        /** Gets a child element. */
        @stub
        def getElement(index: Int): Element = ???

        /** Returns the number of child elements. */
        @stub
        def getElementCount(): Int = ???

        /** Gets the child element index closest to the given model offset. */
        @stub
        def getElementIndex(pos: Int): Int = ???

        /** Gets the ending offset in the model for the element. */
        @stub
        def getEndOffset(): Int = ???

        /** Gets the element name. */
        @stub
        def getName(): String = ???

        /** Gets the starting offset in the model for the element. */
        @stub
        def getStartOffset(): Int = ???

        /** Checks whether the element is a leaf. */
        @stub
        def isLeaf(): Boolean = ???

        /** Converts the element to a string. */
        @stub
        def toString(): String = ???
    }


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
    def getProperty(key: Any): Any

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
    def putProperty(key: Any, value: Any): Unit

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
     *  techniques.  Each mutation of the attribute set can be
     *  used to exchange a previous AttributeSet instance with
     *  another, preserving the possibility of the AttributeSet
     *  remaining immutable.  An implementation is provided by
     *  the StyleContext class.
     * 
     *  The Element implementations provided by this class use
     *  this interface to provide their MutableAttributeSet
     *  implementations, so that different AttributeSet compression
     *  techniques can be employed.  The method
     *  getAttributeContext should be implemented to
     *  return the object responsible for implementing the desired
     *  compression technique.
     */
    trait AttributeContext {

        /** Adds an attribute to the given set, and returns
         *  the new representative set.
         */
        @stub
        def addAttribute(old: AttributeSet, name: Any, value: Any): AttributeSet = ???

        /** Adds a set of attributes to the element. */
        @stub
        def addAttributes(old: AttributeSet, attr: AttributeSet): AttributeSet = ???

        /** Fetches an empty AttributeSet. */
        @stub
        def getEmptySet(): AttributeSet = ???

        /** Reclaims an attribute set. */
        @stub
        def reclaim(a: AttributeSet): Unit = ???

        /** Removes an attribute from the set. */
        @stub
        def removeAttribute(old: AttributeSet, name: Any): AttributeSet = ???

        /** Removes a set of attributes for the element. */
        @stub
        def removeAttributes(old: AttributeSet, attrs: AttributeSet): AttributeSet = ???

        /** Removes a set of attributes for the element. */
        @stub
        def removeAttributes(old: AttributeSet, names: Enumeration[_]): AttributeSet = ???
    }


    /** Interface to describe a sequence of character content that
     *  can be edited.  Implementations may or may not support a
     *  history mechanism which will be reflected by whether or not
     *  mutations return an UndoableEdit implementation.
     */
    trait Content {

        /** Creates a position within the content that will
         *  track change as the content is mutated.
         */
        @stub
        def createPosition(offset: Int): Position = ???

        /** Gets a sequence of characters and copies them into a Segment. */
        @stub
        def getChars(where: Int, len: Int, txt: Segment): Unit = ???

        /** Fetches a string of characters contained in the sequence. */
        @stub
        def getString(where: Int, len: Int): String = ???

        /** Inserts a string of characters into the sequence. */
        @stub
        def insertString(where: Int, str: String): UndoableEdit = ???

        /** Current length of the sequence of character content. */
        @stub
        def length(): Int = ???

        /** Removes some portion of the sequence. */
        @stub
        def remove(where: Int, nitems: Int): UndoableEdit = ???
    }


    /** An implementation of ElementChange that can be added to the document
     *  event.
     */
    object ElementEdit extends AbstractUndoableEdit with DocumentEvent.ElementChange {

        /** Constructs an edit record. */
        @stub
        def apply(e: Element, index: Int, removed: Array[Element], added: Array[Element]) = ???

        /** Gets a list of children that were added. */
        @stub
        def getChildrenAdded(): Array[Element] = ???

        /** Gets a list of children that were removed. */
        @stub
        def getChildrenRemoved(): Array[Element] = ???

        /** Returns the underlying element. */
        @stub
        def getElement(): Element = ???

        /** Returns the index into the list of elements. */
        @stub
        def getIndex(): Int = ???

        /** Redoes a change. */
        @stub
        def redo(): Unit = ???

        /** Undoes a change. */
        @stub
        def undo(): Unit = ???
    }


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
