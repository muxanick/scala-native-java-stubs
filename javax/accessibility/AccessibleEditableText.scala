package javax.accessibility

import java.lang.String
import javax.swing.text.AttributeSet

/** The AccessibleEditableText interface should be implemented by all
 *  classes that present editable textual information on the display.
 *  Along with the AccessibleText interface, this interface provides
 *  the standard mechanism for an assistive technology to access
 *  that text via its content, attributes, and spatial location.
 *  Applications can determine if an object supports the AccessibleEditableText
 *  interface by first obtaining its AccessibleContext (see Accessible)
 *  and then calling the AccessibleContext.getAccessibleEditableText()
 *  method of AccessibleContext.  If the return value is not null, the object
 *  supports this interface.
 */
trait AccessibleEditableText extends AccessibleText {

    /** Cuts the text between two indices into the system clipboard. */
    @stub
    def cut(startIndex: Int, endIndex: Int): Unit = ???

    /** Deletes the text between two indices */
    @stub
    def delete(startIndex: Int, endIndex: Int): Unit = ???

    /** Returns the text string between two indices. */
    @stub
    def getTextRange(startIndex: Int, endIndex: Int): String = ???

    /** Inserts the specified string at the given index/ */
    @stub
    def insertTextAtIndex(index: Int, s: String): Unit = ???

    /** Pastes the text from the system clipboard into the text
     *  starting at the specified index.
     */
    @stub
    def paste(startIndex: Int): Unit = ???

    /** Replaces the text between two indices with the specified
     *  string.
     */
    @stub
    def replaceText(startIndex: Int, endIndex: Int, s: String): Unit = ???

    /** Selects the text between two indices. */
    @stub
    def selectText(startIndex: Int, endIndex: Int): Unit = ???

    /** Sets attributes for the text between two indices. */
    @stub
    def setAttributes(startIndex: Int, endIndex: Int, as: AttributeSet): Unit = ???
}
