package javax.swing

import java.awt.{Component, Container, Dimension, Font, Rectangle}
import java.lang.{Object, String}
import javax.accessibility.AccessibleContext
import javax.swing.text.{Document, JTextComponent}

// A JTextArea is a multi-line area that displays plain text.
// It is intended to be a lightweight component that provides source
// compatibility with the java.awt.TextArea class where it can
// reasonably do so.
// You can find information and examples of using all the text components in
// Using Text Components,
// a section in The Java Tutorial.
//
// 
// This component has capabilities not found in the
// java.awt.TextArea class.  The superclass should be
// consulted for additional capabilities.
// Alternative multi-line text classes with
// more capabilities are JTextPane and JEditorPane.
// 
// The java.awt.TextArea internally handles scrolling.
// JTextArea is different in that it doesn't manage scrolling,
// but implements the swing Scrollable interface.  This allows it
// to be placed inside a JScrollPane if scrolling
// behavior is desired, and used directly if scrolling is not desired.
// 
// The java.awt.TextArea has the ability to do line wrapping.
// This was controlled by the horizontal scrolling policy.  Since
// scrolling is not done by JTextArea directly, backward
// compatibility must be provided another way.  JTextArea has
// a bound property for line wrapping that controls whether or
// not it will wrap lines.  By default, the line wrapping property
// is set to false (not wrapped).
// 
// java.awt.TextArea has two properties rows
// and columns that are used to determine the preferred size.
// JTextArea uses these properties to indicate the
// preferred size of the viewport when placed inside a JScrollPane
// to match the functionality provided by java.awt.TextArea.
// JTextArea has a preferred size of what is needed to
// display all of the text, so that it functions properly inside of
// a JScrollPane.  If the value for rows
// or columns is equal to zero,
// the preferred size along that axis is used for
// the viewport preferred size along the same axis.
// 
// The java.awt.TextArea could be monitored for changes by adding
// a TextListener for TextEvents.
// In the JTextComponent based
// components, changes are broadcasted from the model via a
// DocumentEvent to DocumentListeners.
// The DocumentEvent gives
// the location of the change and the kind of change if desired.
// The code fragment might look something like:
// 
//    DocumentListener myListener = ??;
//    JTextArea myArea = ??;
//    myArea.getDocument().addDocumentListener(myListener);
// 
//
// 
// Newlines
// 
// For a discussion on how newlines are handled, see
// DefaultEditorKit.
// 
//
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JTextArea extends JTextComponent {

    @stub
    // Constructs a new TextArea.
    def this() = ???

    @stub
    // Constructs a new JTextArea with the given document model, and defaults
    // for all of the other arguments (null, 0, 0).
    def this(doc: Document) = ???

    @stub
    // Constructs a new JTextArea with the specified number of rows
    // and columns, and the given model.
    def this(doc: Document, text: String, rows: Int, columns: Int) = ???

    @stub
    // Constructs a new empty TextArea with the specified number of
    // rows and columns.
    def this(rows: Int, columns: Int) = ???

    @stub
    // Constructs a new TextArea with the specified text displayed.
    def this(text: String) = ???

    @stub
    // Appends the given text to the end of the document.
    def append(str: String): Unit = ???

    @stub
    // Creates the default implementation of the model
    // to be used at construction if one isn't explicitly
    // given.
    protected def createDefaultModel(): Document = ???

    @stub
    // Gets the AccessibleContext associated with this JTextArea.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the number of columns in the TextArea.
    def getColumns(): Int = ???

    @stub
    // Gets column width.
    protected def getColumnWidth(): Int = ???

    @stub
    // Determines the number of lines contained in the area.
    def getLineCount(): Int = ???

    @stub
    // Determines the offset of the end of the given line.
    def getLineEndOffset(line: Int): Int = ???

    @stub
    // Translates an offset into the components text to a
    // line number.
    def getLineOfOffset(offset: Int): Int = ???

    @stub
    // Determines the offset of the start of the given line.
    def getLineStartOffset(line: Int): Int = ???

    @stub
    // Gets the line-wrapping policy of the text area.
    def getLineWrap(): Boolean = ???

    @stub
    // Returns the preferred size of the viewport if this component
    // is embedded in a JScrollPane.
    def getPreferredScrollableViewportSize(): Dimension = ???

    @stub
    // Returns the preferred size of the TextArea.
    def getPreferredSize(): Dimension = ???

    @stub
    // Defines the meaning of the height of a row.
    protected def getRowHeight(): Int = ???

    @stub
    // Returns the number of rows in the TextArea.
    def getRows(): Int = ???

    @stub
    // Returns true if a viewport should always force the width of this
    // Scrollable to match the width of the viewport.
    def getScrollableTracksViewportWidth(): Boolean = ???

    @stub
    // Components that display logical rows or columns should compute
    // the scroll increment that will completely expose one new row
    // or column, depending on the value of orientation.
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Gets the number of characters used to expand tabs.
    def getTabSize(): Int = ???

    @stub
    // Returns the class ID for the UI.
    def getUIClassID(): String = ???

    @stub
    // Gets the style of wrapping used if the text area is wrapping
    // lines.
    def getWrapStyleWord(): Boolean = ???

    @stub
    // Inserts the specified text at the specified position.
    def insert(str: String, pos: Int): Unit = ???

    @stub
    // Returns a string representation of this JTextArea.
    protected def paramString(): String = ???

    @stub
    // Replaces text from the indicated start to end position with the
    // new text specified.
    def replaceRange(str: String, start: Int, end: Int): Unit = ???

    @stub
    // Sets the number of columns for this TextArea.
    def setColumns(columns: Int): Unit = ???

    @stub
    // Sets the current font.
    def setFont(f: Font): Unit = ???

    @stub
    // Sets the line-wrapping policy of the text area.
    def setLineWrap(wrap: Boolean): Unit = ???

    @stub
    // Sets the number of rows for this TextArea.
    def setRows(rows: Int): Unit = ???

    @stub
    // Sets the number of characters to expand tabs to.
    def setTabSize(size: Int): Unit = ???
}
