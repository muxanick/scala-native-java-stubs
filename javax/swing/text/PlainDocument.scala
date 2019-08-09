package javax.swing.text

import java.lang.{Object, String}

// A plain document that maintains no character attributes.  The
// default element structure for this document is a map of the lines in
// the text.  The Element returned by getDefaultRootElement is
// a map of the lines, and each child element represents a line.
// This model does not maintain any character level attributes,
// but each line can be tagged with an arbitrary set of attributes.
// Line to offset, and offset to line translations can be quickly
// performed using the default root element.  The structure information
// of the DocumentEvent's fired by edits will indicate the line
// structure changes.
// 
// The default content storage management is performed by a
// gapped buffer implementation (GapContent).  It supports
// editing reasonably large documents with good efficiency when
// the edits are contiguous or clustered, as is typical.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class PlainDocument extends AbstractDocument {

    @stub
    // Constructs a plain text document.
    def this() = ???

    @stub
    // Creates the root element to be used to represent the
    // default document structure.
    protected def createDefaultRoot(): AbstractDocument.AbstractElement = ???

    @stub
    // Gets the default root element for the document model.
    def getDefaultRootElement(): Element = ???

    @stub
    // Get the paragraph element containing the given position.
    def getParagraphElement(pos: Int): Element = ???

    @stub
    // Inserts some content into the document.
    def insertString(offs: Int, str: String, a: AttributeSet): Unit = ???

    @stub
    // Updates document structure as a result of text insertion.
    protected def insertUpdate(chng: AbstractDocument.DefaultDocumentEvent, attr: AttributeSet): Unit = ???
}

object PlainDocument {
    @stub
    // Name of the attribute that specifies the maximum
    // length of a line, if there is a maximum length.
    def lineLimitAttribute: String = ???
}
