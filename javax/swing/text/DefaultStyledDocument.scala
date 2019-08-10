package javax.swing.text

import java.awt.{Color, Font}
import java.lang.{Object, String}
import java.util.Enumeration
import javax.swing.event.DocumentListener
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
     */
    type ElementBuffer = DefaultStyledDocument_ElementBuffer

    /** Default root element for a document... */
    protected type SectionElement = DefaultStyledDocument_SectionElement

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
    type AttributeUndoableEdit = DefaultStyledDocument_AttributeUndoableEdit

    /** Specification for building elements. */
    type ElementSpec = DefaultStyledDocument_ElementSpec

    /** The default size of the initial content buffer. */
    @stub
    val BUFFER_SIZE_DEFAULT: Int = ???
}
