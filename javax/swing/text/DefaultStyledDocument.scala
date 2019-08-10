package javax.swing.text

import java.awt.{Color, Font}
import java.io.Serializable
import java.lang.{Object, String}
import java.util.Enumeration
import javax.swing.event.DocumentListener
import javax.swing.undo.AbstractUndoableEdit
import scala.scalanative.annotation.stub

/** A document that can be marked up with character and paragraph
 *  styles in a manner similar to the Rich Text Format.  The element
 *  structure for this document represents style crossings for
 *  style runs.  These style runs are mapped into a paragraph element
 *  structure (which may reside in some other structure).  The
 *  style runs break at paragraph boundaries since logical styles are
 *  assigned to paragraph boundaries.
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
class DefaultStyledDocument extends AbstractDocument with StyledDocument {

    /** Constructs a default styled document. */
    @stub
    def this() = ???

    /** Constructs a styled document. */
    @stub
    def this(c: AbstractDocument.Content, styles: StyleContext) = ???

    /** Constructs a styled document with the default content
     *  storage implementation and a shared set of styles.
     */
    @stub
    def this(styles: StyleContext) = ???

    /** Class to manage changes to the element
     *  hierarchy.
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
    class ElementBuffer extends Object with Serializable {

        /** Creates a new ElementBuffer. */
        @stub
        def this(root: Element) = ???

        /** Changes content. */
        @stub
        def change(offset: Int, length: Int, de: AbstractDocument.DefaultDocumentEvent): Unit = ???

        /** Updates the element structure in response to a change in the
         *  document.
         */
        @stub
        protected def changeUpdate(): Unit = ???

        /** Creates a copy of this element, with a different
         *  parent.
         */
        @stub
        def clone(parent: Element, clonee: Element): Element = ???

        /** Gets the root element. */
        @stub
        def getRootElement(): Element = ???

        /** Inserts new content. */
        @stub
        def insert(offset: Int, length: Int, data: Array[DefaultStyledDocument.ElementSpec], de: AbstractDocument.DefaultDocumentEvent): Unit = ???

        /** Inserts an update into the document. */
        @stub
        protected def insertUpdate(data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

        /** Removes content. */
        @stub
        def remove(offset: Int, length: Int, de: AbstractDocument.DefaultDocumentEvent): Unit = ???

        /** Updates the element structure in response to a removal from the
         *  associated sequence in the document.
         */
        @stub
        protected def removeUpdate(): Unit = ???
    }


    /** Default root element for a document... maps out the
     *  paragraphs/lines contained.
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
    protected class SectionElement extends AbstractDocument.BranchElement {

        /** Creates a new SectionElement. */
        @stub
        def this() = ???

        /** Gets the name of the element. */
        @stub
        def getName(): String = ???
    }


    /**  */
    @stub
    protected val buffer: DefaultStyledDocument.ElementBuffer = ???

    /** Adds a document listener for notification of any changes. */
    @stub
    def addDocumentListener(listener: DocumentListener): Unit = ???

    /** Adds a new style into the logical style hierarchy. */
    @stub
    def addStyle(nm: String, parent: Style): Style = ???

    /** Initialize the document to reflect the given element
     *  structure (i.e.
     */
    @stub
    protected def create(data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    /** Creates the root element to be used to represent the
     *  default document structure.
     */
    @stub
    protected def createDefaultRoot(): AbstractDocument.AbstractElement = ???

    /** Gets the background color from an attribute set. */
    @stub
    def getBackground(attr: AttributeSet): Color = ???

    /** Gets a character element based on a position. */
    @stub
    def getCharacterElement(pos: Int): Element = ???

    /** Gets the default root element. */
    @stub
    def getDefaultRootElement(): Element = ???

    /** Gets the font from an attribute set. */
    @stub
    def getFont(attr: AttributeSet): Font = ???

    /** Gets the foreground color from an attribute set. */
    @stub
    def getForeground(attr: AttributeSet): Color = ???

    /** Fetches the logical style assigned to the paragraph
     *  represented by the given position.
     */
    @stub
    def getLogicalStyle(p: Int): Style = ???

    /** Gets the paragraph element at the offset pos. */
    @stub
    def getParagraphElement(pos: Int): Element = ???

    /** Fetches a named style previously added. */
    @stub
    def getStyle(nm: String): Style = ???

    /** Fetches the list of of style names. */
    @stub
    def getStyleNames(): Enumeration[_] = ???

    /** Inserts new elements in bulk. */
    @stub
    protected def insert(offset: Int, data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    /** Updates document structure as a result of text insertion. */
    @stub
    protected def insertUpdate(chng: AbstractDocument.DefaultDocumentEvent, attr: AttributeSet): Unit = ???

    /** Removes a document listener. */
    @stub
    def removeDocumentListener(listener: DocumentListener): Unit = ???

    /** Removes an element from this document. */
    @stub
    def removeElement(elem: Element): Unit = ???

    /** Removes a named style previously added to the document. */
    @stub
    def removeStyle(nm: String): Unit = ???

    /** Updates document structure as a result of text removal. */
    @stub
    protected def removeUpdate(chng: AbstractDocument.DefaultDocumentEvent): Unit = ???

    /** Sets attributes for some part of the document. */
    @stub
    def setCharacterAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???

    /** Sets the logical style to use for the paragraph at the
     *  given position.
     */
    @stub
    def setLogicalStyle(pos: Int, s: Style): Unit = ???

    /** Sets attributes for a paragraph. */
    @stub
    def setParagraphAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???

    /** Called when any of this document's styles have changed. */
    @stub
    protected def styleChanged(style: Style): Unit = ???
}

object DefaultStyledDocument {
    /** An UndoableEdit used to remember AttributeSet changes to an
     *  Element.
     */
    object AttributeUndoableEdit extends AbstractUndoableEdit {

        /**  */
        @stub
        def apply(element: Element, newAttributes: AttributeSet, isReplacing: Boolean) = ???

        /**  */
        @stub
        protected val copy: AttributeSet = ???

        /**  */
        @stub
        protected val element: Element = ???

        /**  */
        @stub
        protected val isReplacing: Boolean = ???

        /**  */
        @stub
        protected val newAttributes: AttributeSet = ???

        /** Redoes a change. */
        @stub
        def redo(): Unit = ???

        /** Undoes a change. */
        @stub
        def undo(): Unit = ???
    }


    /** Specification for building elements.
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
    object ElementSpec extends Object {

        /** Constructor useful for markup when the markup will not
         *  be stored in the document.
         */
        @stub
        def apply(a: AttributeSet, type: Short) = ???

        /** Constructor for creating a spec externally for batch
         *  input of content and markup into the document.
         */
        @stub
        def apply(a: AttributeSet, type: Short, txt: Array[Char], offs: Int, len: Int) = ???

        /** Constructor for parsing inside the document when
         *  the data has already been added, but len information
         *  is needed.
         */
        @stub
        def apply(a: AttributeSet, type: Short, len: Int) = ???

        /** A possible value for getType. */
        @stub
        val ContentType: Short = ???

        /** A possible value for getType. */
        @stub
        val EndTagType: Short = ???

        /** A possible value for getDirection. */
        @stub
        val JoinFractureDirection: Short = ???

        /** A possible value for getDirection. */
        @stub
        val JoinNextDirection: Short = ???

        /** A possible value for getDirection. */
        @stub
        val JoinPreviousDirection: Short = ???

        /** A possible value for getDirection. */
        @stub
        val OriginateDirection: Short = ???

        /** A possible value for getType. */
        @stub
        val StartTagType: Short = ???

        /** Gets the array of characters. */
        @stub
        def getArray(): Array[Char] = ???

        /** Gets the element attributes. */
        @stub
        def getAttributes(): AttributeSet = ???

        /** Gets the direction. */
        @stub
        def getDirection(): Short = ???

        /** Gets the length. */
        @stub
        def getLength(): Int = ???

        /** Gets the starting offset. */
        @stub
        def getOffset(): Int = ???

        /** Gets the element type. */
        @stub
        def getType(): Short = ???

        /** Sets the direction. */
        @stub
        def setDirection(direction: Short): Unit = ???

        /** Sets the element type. */
        @stub
        def setType(type: Short): Unit = ???

        /** Converts the element to a string. */
        @stub
        def toString(): String = ???
    }


    /** The default size of the initial content buffer. */
    @stub
    val BUFFER_SIZE_DEFAULT: Int = ???
}
