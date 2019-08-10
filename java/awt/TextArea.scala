package java.awt

import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** A TextArea object is a multi-line region
 *  that displays text. It can be set to allow editing or
 *  to be read-only.
 *  
 *  The following image shows the appearance of a text area:
 *  
 *  
 *  
 *  This text area could be created by the following line of code:
 * 
 *  
 *  new TextArea("Hello", 5, 40);
 *  
 *  
 */
class TextArea extends TextComponent {

    /** Constructs a new text area with the empty string as text. */
    @stub
    def this() = ???

    /** Constructs a new text area with the specified number of
     *  rows and columns and the empty string as text.
     */
    @stub
    def this(rows: Int, columns: Int) = ???

    /** Constructs a new text area with the specified text. */
    @stub
    def this(text: String) = ???

    /** Constructs a new text area with the specified text,
     *  and with the specified number of rows and columns.
     */
    @stub
    def this(text: String, rows: Int, columns: Int) = ???

    /** Constructs a new text area with the specified text,
     *  and with the rows, columns, and scroll bar visibility
     *  as specified.
     */
    @stub
    def this(text: String, rows: Int, columns: Int, scrollbars: Int) = ???

    /** This class implements accessibility support for the
     *  TextArea class.  It provides an implementation of the
     *  Java Accessibility API appropriate to text area user-interface elements.
     */
    protected class AccessibleAWTTextArea extends TextComponent.AccessibleAWTTextComponent {

        /**  */
        @stub
        protected def this() = ???

        /** Gets the state set of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???
    }


    /** Creates the TextArea's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Appends the given text to the text area's current text. */
    @stub
    def append(str: String): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by append(String).
     * 
     */
    @stub
    def appendText(str: String): Unit = ???

    /** Returns the AccessibleContext associated with
     *  this TextArea.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the number of columns in this text area. */
    @stub
    def getColumns(): Int = ???

    /** Determines the minimum size of this text area. */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Determines the minimum size of a text area with the specified
     *  number of rows and columns.
     */
    @stub
    def getMinimumSize(rows: Int, columns: Int): Dimension = ???

    /** Determines the preferred size of this text area. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Determines the preferred size of a text area with the specified
     *  number of rows and columns.
     */
    @stub
    def getPreferredSize(rows: Int, columns: Int): Dimension = ???

    /** Returns the number of rows in the text area. */
    @stub
    def getRows(): Int = ???

    /** Returns an enumerated value that indicates which scroll bars
     *  the text area uses.
     */
    @stub
    def getScrollbarVisibility(): Int = ???

    /** Inserts the specified text at the specified position
     *  in this text area.
     */
    @stub
    def insert(str: String, pos: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by insert(String, int).
     * 
     */
    @stub
    def insertText(str: String, pos: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getMinimumSize().
     * 
     */
    @stub
    def minimumSize(): Dimension = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getMinimumSize(int, int).
     * 
     */
    @stub
    def minimumSize(rows: Int, columns: Int): Dimension = ???

    /** Returns a string representing the state of this TextArea. */
    @stub
    protected def paramString(): String = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getPreferredSize().
     * 
     */
    @stub
    def preferredSize(): Dimension = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getPreferredSize(int, int).
     * 
     */
    @stub
    def preferredSize(rows: Int, columns: Int): Dimension = ???

    /** Replaces text between the indicated start and end positions
     *  with the specified replacement text.
     */
    @stub
    def replaceRange(str: String, start: Int, end: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by replaceRange(String, int, int).
     * 
     */
    @stub
    def replaceText(str: String, start: Int, end: Int): Unit = ???

    /** Sets the number of columns for this text area. */
    @stub
    def setColumns(columns: Int): Unit = ???

    /** Sets the number of rows for this text area. */
    @stub
    def setRows(rows: Int): Unit = ???
}

object TextArea {
    /** Create and display both vertical and horizontal scrollbars. */
    @stub
    val SCROLLBARS_BOTH: Int = ???

    /** Create and display horizontal scrollbar only. */
    @stub
    val SCROLLBARS_HORIZONTAL_ONLY: Int = ???

    /** Do not create or display any scrollbars for the text area. */
    @stub
    val SCROLLBARS_NONE: Int = ???

    /** Create and display vertical scrollbar only. */
    @stub
    val SCROLLBARS_VERTICAL_ONLY: Int = ???
}
