package javax.swing.text

import java.awt.{Color, Font}
import java.lang.{Object, String}
import java.util.Enumeration
import javax.swing.event.DocumentListener

// A document that can be marked up with character and paragraph
// styles in a manner similar to the Rich Text Format.  The element
// structure for this document represents style crossings for
// style runs.  These style runs are mapped into a paragraph element
// structure (which may reside in some other structure).  The
// style runs break at paragraph boundaries since logical styles are
// assigned to paragraph boundaries.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultStyledDocument extends AbstractDocument with StyledDocument {

    @stub
    // Constructs a default styled document.
    def this() = ???

    @stub
    // Constructs a styled document.
    def this(c: AbstractDocument.Content, styles: StyleContext) = ???

    @stub
    // Class to manage changes to the element
    // hierarchy.
    def DefaultStyledDocument.ElementBuffer: class = ???

    @stub
    // 
    protected def buffer: DefaultStyledDocument.ElementBuffer = ???

    @stub
    // Adds a document listener for notification of any changes.
    def addDocumentListener(listener: DocumentListener): Unit = ???

    @stub
    // Adds a new style into the logical style hierarchy.
    def addStyle(nm: String, parent: Style): Style = ???

    @stub
    // Initialize the document to reflect the given element
    // structure (i.e.
    protected def create(data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    @stub
    // Creates the root element to be used to represent the
    // default document structure.
    protected def createDefaultRoot(): AbstractDocument.AbstractElement = ???

    @stub
    // Gets the background color from an attribute set.
    def getBackground(attr: AttributeSet): Color = ???

    @stub
    // Gets a character element based on a position.
    def getCharacterElement(pos: Int): Element = ???

    @stub
    // Gets the default root element.
    def getDefaultRootElement(): Element = ???

    @stub
    // Gets the font from an attribute set.
    def getFont(attr: AttributeSet): Font = ???

    @stub
    // Gets the foreground color from an attribute set.
    def getForeground(attr: AttributeSet): Color = ???

    @stub
    // Fetches the logical style assigned to the paragraph
    // represented by the given position.
    def getLogicalStyle(p: Int): Style = ???

    @stub
    // Gets the paragraph element at the offset pos.
    def getParagraphElement(pos: Int): Element = ???

    @stub
    // Fetches a named style previously added.
    def getStyle(nm: String): Style = ???

    @stub
    // Fetches the list of of style names.
    def getStyleNames(): Enumeration[_] = ???

    @stub
    // Inserts new elements in bulk.
    protected def insert(offset: Int, data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    @stub
    // Updates document structure as a result of text insertion.
    protected def insertUpdate(chng: AbstractDocument.DefaultDocumentEvent, attr: AttributeSet): Unit = ???

    @stub
    // Removes a document listener.
    def removeDocumentListener(listener: DocumentListener): Unit = ???

    @stub
    // Removes an element from this document.
    def removeElement(elem: Element): Unit = ???

    @stub
    // Removes a named style previously added to the document.
    def removeStyle(nm: String): Unit = ???

    @stub
    // Updates document structure as a result of text removal.
    protected def removeUpdate(chng: AbstractDocument.DefaultDocumentEvent): Unit = ???

    @stub
    // Sets attributes for some part of the document.
    def setCharacterAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???

    @stub
    // Sets the logical style to use for the paragraph at the
    // given position.
    def setLogicalStyle(pos: Int, s: Style): Unit = ???

    @stub
    // Sets attributes for a paragraph.
    def setParagraphAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???
}

object DefaultStyledDocument {
    @stub
    // An UndoableEdit used to remember AttributeSet changes to an
    // Element.
    def DefaultStyledDocument.AttributeUndoableEdit: class = ???

    @stub
    // Specification for building elements.
    def DefaultStyledDocument.ElementSpec: class = ???
}
