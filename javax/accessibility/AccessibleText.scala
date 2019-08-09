package javax.accessibility

import java.awt.{Point, Rectangle}
import java.lang.String
import javax.swing.text.AttributeSet

// The AccessibleText interface should be implemented by all
// classes that present textual information on the display.  This interface
// provides the standard mechanism for an assistive technology to access
// that text via its content, attributes, and spatial location.
// Applications can determine if an object supports the AccessibleText
// interface by first obtaining its AccessibleContext (see Accessible)
// and then calling the AccessibleContext.getAccessibleText() method of
// AccessibleContext.  If the return value is not null, the object supports this
// interface.
trait AccessibleText {

    @stub
    // Returns the String after a given index.
    def getAfterIndex(part: Int, index: Int): String = ???

    @stub
    // Returns the String at a given index.
    def getAtIndex(part: Int, index: Int): String = ???

    @stub
    // Returns the String before a given index.
    def getBeforeIndex(part: Int, index: Int): String = ???

    @stub
    // Returns the zero-based offset of the caret.
    def getCaretPosition(): Int = ???

    @stub
    // Returns the AttributeSet for a given character at a given index
    def getCharacterAttribute(i: Int): AttributeSet = ???

    @stub
    // Determines the bounding box of the character at the given
    // index into the string.
    def getCharacterBounds(i: Int): Rectangle = ???

    @stub
    // Returns the number of characters (valid indicies)
    def getCharCount(): Int = ???

    @stub
    // Given a point in local coordinates, return the zero-based index
    // of the character under that Point.
    def getIndexAtPoint(p: Point): Int = ???

    @stub
    // Returns the portion of the text that is selected.
    def getSelectedText(): String = ???

    @stub
    // Returns the end offset within the selected text.
    def getSelectionEnd(): Int = ???
}

object AccessibleText {
    @stub
    // Constant used to indicate that the part of the text that should be
    // retrieved is a character.
    def CHARACTER: Int = ???

    @stub
    // Constant used to indicate that the part of the text that should be
    // retrieved is a sentence.
    def SENTENCE: Int = ???
}
