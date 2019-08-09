package javax.accessibility

import java.lang.String
import javax.swing.text.AttributeSet

// The AccessibleEditableText interface should be implemented by all
// classes that present editable textual information on the display.
// Along with the AccessibleText interface, this interface provides
// the standard mechanism for an assistive technology to access
// that text via its content, attributes, and spatial location.
// Applications can determine if an object supports the AccessibleEditableText
// interface by first obtaining its AccessibleContext (see Accessible)
// and then calling the AccessibleContext.getAccessibleEditableText()
// method of AccessibleContext.  If the return value is not null, the object
// supports this interface.
trait AccessibleEditableText extends AccessibleText {

    @stub
    // Cuts the text between two indices into the system clipboard.
    def cut(startIndex: Int, endIndex: Int): Unit = ???

    @stub
    // Deletes the text between two indices
    def delete(startIndex: Int, endIndex: Int): Unit = ???

    @stub
    // Returns the text string between two indices.
    def getTextRange(startIndex: Int, endIndex: Int): String = ???

    @stub
    // Inserts the specified string at the given index/
    def insertTextAtIndex(index: Int, s: String): Unit = ???

    @stub
    // Pastes the text from the system clipboard into the text
    // starting at the specified index.
    def paste(startIndex: Int): Unit = ???

    @stub
    // Replaces the text between two indices with the specified
    // string.
    def replaceText(startIndex: Int, endIndex: Int, s: String): Unit = ???

    @stub
    // Selects the text between two indices.
    def selectText(startIndex: Int, endIndex: Int): Unit = ???

    @stub
    // Sets attributes for the text between two indices.
    def setAttributes(startIndex: Int, endIndex: Int, as: AttributeSet): Unit = ???
}
