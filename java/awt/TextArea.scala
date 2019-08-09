package java.awt

import java.lang.{Object, String}
import javax.accessibility.AccessibleContext

// A TextArea object is a multi-line region
// that displays text. It can be set to allow editing or
// to be read-only.
// 
// The following image shows the appearance of a text area:
// 
// 
// 
// This text area could be created by the following line of code:
//
// 
// new TextArea("Hello", 5, 40);
// 
// 
class TextArea extends TextComponent {

    @stub
    // Constructs a new text area with the empty string as text.
    def this() = ???

    @stub
    // Constructs a new text area with the specified number of
    // rows and columns and the empty string as text.
    def this(rows: Int, columns: Int) = ???

    @stub
    // Constructs a new text area with the specified text.
    def this(text: String) = ???

    @stub
    // Constructs a new text area with the specified text,
    // and with the specified number of rows and columns.
    def this(text: String, rows: Int, columns: Int) = ???

    @stub
    // Creates the TextArea's peer.
    def addNotify(): Unit = ???

    @stub
    // Appends the given text to the text area's current text.
    def append(str: String): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by append(String).
    //
    def appendText(str: String): Unit = ???

    @stub
    // Returns the AccessibleContext associated with
    // this TextArea.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the number of columns in this text area.
    def getColumns(): Int = ???

    @stub
    // Determines the minimum size of this text area.
    def getMinimumSize(): Dimension = ???

    @stub
    // Determines the minimum size of a text area with the specified
    // number of rows and columns.
    def getMinimumSize(rows: Int, columns: Int): Dimension = ???

    @stub
    // Determines the preferred size of this text area.
    def getPreferredSize(): Dimension = ???

    @stub
    // Determines the preferred size of a text area with the specified
    // number of rows and columns.
    def getPreferredSize(rows: Int, columns: Int): Dimension = ???

    @stub
    // Returns the number of rows in the text area.
    def getRows(): Int = ???

    @stub
    // Returns an enumerated value that indicates which scroll bars
    // the text area uses.
    def getScrollbarVisibility(): Int = ???

    @stub
    // Inserts the specified text at the specified position
    // in this text area.
    def insert(str: String, pos: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by insert(String, int).
    //
    def insertText(str: String, pos: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getMinimumSize().
    //
    def minimumSize(): Dimension = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getMinimumSize(int, int).
    //
    def minimumSize(rows: Int, columns: Int): Dimension = ???

    @stub
    // Returns a string representing the state of this TextArea.
    protected def paramString(): String = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getPreferredSize().
    //
    def preferredSize(): Dimension = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getPreferredSize(int, int).
    //
    def preferredSize(rows: Int, columns: Int): Dimension = ???

    @stub
    // Replaces text between the indicated start and end positions
    // with the specified replacement text.
    def replaceRange(str: String, start: Int, end: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by replaceRange(String, int, int).
    //
    def replaceText(str: String, start: Int, end: Int): Unit = ???

    @stub
    // Sets the number of columns for this text area.
    def setColumns(columns: Int): Unit = ???
}

object TextArea {
    @stub
    // Create and display both vertical and horizontal scrollbars.
    def SCROLLBARS_BOTH: Int = ???

    @stub
    // Create and display horizontal scrollbar only.
    def SCROLLBARS_HORIZONTAL_ONLY: Int = ???

    @stub
    // Do not create or display any scrollbars for the text area.
    def SCROLLBARS_NONE: Int = ???
}
