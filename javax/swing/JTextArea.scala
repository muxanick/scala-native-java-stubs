package javax.swing

import java.awt.{Component, Container, Dimension, Font, Rectangle}
import java.lang.{Object, String}
import javax.accessibility.AccessibleContext
import javax.swing.text.{Document, JTextComponent}
import scala.scalanative.annotation.stub

/** A JTextArea is a multi-line area that displays plain text.
 *  It is intended to be a lightweight component that provides source
 *  compatibility with the java.awt.TextArea class where it can
 *  reasonably do so.
 *  You can find information and examples of using all the text components in
 *  Using Text Components,
 *  a section in The Java Tutorial.
 * 
 *  
 *  This component has capabilities not found in the
 *  java.awt.TextArea class.  The superclass should be
 *  consulted for additional capabilities.
 *  Alternative multi-line text classes with
 *  more capabilities are JTextPane and JEditorPane.
 *  
 *  The java.awt.TextArea internally handles scrolling.
 *  JTextArea is different in that it doesn't manage scrolling,
 *  but implements the swing Scrollable interface.  This allows it
 *  to be placed inside a JScrollPane if scrolling
 *  behavior is desired, and used directly if scrolling is not desired.
 *  
 *  The java.awt.TextArea has the ability to do line wrapping.
 *  This was controlled by the horizontal scrolling policy.  Since
 *  scrolling is not done by JTextArea directly, backward
 *  compatibility must be provided another way.  JTextArea has
 *  a bound property for line wrapping that controls whether or
 *  not it will wrap lines.  By default, the line wrapping property
 *  is set to false (not wrapped).
 *  
 *  java.awt.TextArea has two properties rows
 *  and columns that are used to determine the preferred size.
 *  JTextArea uses these properties to indicate the
 *  preferred size of the viewport when placed inside a JScrollPane
 *  to match the functionality provided by java.awt.TextArea.
 *  JTextArea has a preferred size of what is needed to
 *  display all of the text, so that it functions properly inside of
 *  a JScrollPane.  If the value for rows
 *  or columns is equal to zero,
 *  the preferred size along that axis is used for
 *  the viewport preferred size along the same axis.
 *  
 *  The java.awt.TextArea could be monitored for changes by adding
 *  a TextListener for TextEvents.
 *  In the JTextComponent based
 *  components, changes are broadcasted from the model via a
 *  DocumentEvent to DocumentListeners.
 *  The DocumentEvent gives
 *  the location of the change and the kind of change if desired.
 *  The code fragment might look something like:
 *  
 *     DocumentListener myListener = ??;
 *     JTextArea myArea = ??;
 *     myArea.getDocument().addDocumentListener(myListener);
 *  
 * 
 *  
 *  Newlines
 *  
 *  For a discussion on how newlines are handled, see
 *  DefaultEditorKit.
 *  
 * 
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JTextArea extends JTextComponent {

    /** Constructs a new TextArea. */
    @stub
    def this() = ???

    /** Constructs a new JTextArea with the given document model, and defaults
     *  for all of the other arguments (null, 0, 0).
     */
    @stub
    def this(doc: Document) = ???

    /** Constructs a new JTextArea with the specified number of rows
     *  and columns, and the given model.
     */
    @stub
    def this(doc: Document, text: String, rows: Int, columns: Int) = ???

    /** Constructs a new empty TextArea with the specified number of
     *  rows and columns.
     */
    @stub
    def this(rows: Int, columns: Int) = ???

    /** Constructs a new TextArea with the specified text displayed. */
    @stub
    def this(text: String) = ???

    /** Constructs a new TextArea with the specified text and number
     *  of rows and columns.
     */
    @stub
    def this(text: String, rows: Int, columns: Int) = ???

    /** This class implements accessibility support for the
     *  JTextArea class.
     */
    protected type AccessibleJTextArea = JTextArea_AccessibleJTextArea

    /** Appends the given text to the end of the document. */
    @stub
    def append(str: String): Unit = ???

    /** Creates the default implementation of the model
     *  to be used at construction if one isn't explicitly
     *  given.
     */
    @stub
    protected def createDefaultModel(): Document = ???

    /** Gets the AccessibleContext associated with this JTextArea. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the number of columns in the TextArea. */
    @stub
    def getColumns(): Int = ???

    /** Gets column width. */
    @stub
    protected def getColumnWidth(): Int = ???

    /** Determines the number of lines contained in the area. */
    @stub
    def getLineCount(): Int = ???

    /** Determines the offset of the end of the given line. */
    @stub
    def getLineEndOffset(line: Int): Int = ???

    /** Translates an offset into the components text to a
     *  line number.
     */
    @stub
    def getLineOfOffset(offset: Int): Int = ???

    /** Determines the offset of the start of the given line. */
    @stub
    def getLineStartOffset(line: Int): Int = ???

    /** Gets the line-wrapping policy of the text area. */
    @stub
    def getLineWrap(): Boolean = ???

    /** Returns the preferred size of the viewport if this component
     *  is embedded in a JScrollPane.
     */
    @stub
    def getPreferredScrollableViewportSize(): Dimension = ???

    /** Returns the preferred size of the TextArea. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Defines the meaning of the height of a row. */
    @stub
    protected def getRowHeight(): Int = ???

    /** Returns the number of rows in the TextArea. */
    @stub
    def getRows(): Int = ???

    /** Returns true if a viewport should always force the width of this
     *  Scrollable to match the width of the viewport.
     */
    @stub
    def getScrollableTracksViewportWidth(): Boolean = ???

    /** Components that display logical rows or columns should compute
     *  the scroll increment that will completely expose one new row
     *  or column, depending on the value of orientation.
     */
    @stub
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Gets the number of characters used to expand tabs. */
    @stub
    def getTabSize(): Int = ???

    /** Returns the class ID for the UI. */
    @stub
    def getUIClassID(): String = ???

    /** Gets the style of wrapping used if the text area is wrapping
     *  lines.
     */
    @stub
    def getWrapStyleWord(): Boolean = ???

    /** Inserts the specified text at the specified position. */
    @stub
    def insert(str: String, pos: Int): Unit = ???

    /** Returns a string representation of this JTextArea. */
    @stub
    protected def paramString(): String = ???

    /** Replaces text from the indicated start to end position with the
     *  new text specified.
     */
    @stub
    def replaceRange(str: String, start: Int, end: Int): Unit = ???

    /** Sets the number of columns for this TextArea. */
    @stub
    def setColumns(columns: Int): Unit = ???

    /** Sets the current font. */
    @stub
    def setFont(f: Font): Unit = ???

    /** Sets the line-wrapping policy of the text area. */
    @stub
    def setLineWrap(wrap: Boolean): Unit = ???

    /** Sets the number of rows for this TextArea. */
    @stub
    def setRows(rows: Int): Unit = ???

    /** Sets the number of characters to expand tabs to. */
    @stub
    def setTabSize(size: Int): Unit = ???

    /** Sets the style of wrapping used if the text area is wrapping
     *  lines.
     */
    @stub
    def setWrapStyleWord(word: Boolean): Unit = ???
}
