package javax.accessibility

import java.awt.{Point, Rectangle}
import java.lang.String
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** The AccessibleText interface should be implemented by all
 *  classes that present textual information on the display.  This interface
 *  provides the standard mechanism for an assistive technology to access
 *  that text via its content, attributes, and spatial location.
 *  Applications can determine if an object supports the AccessibleText
 *  interface by first obtaining its AccessibleContext (see Accessible)
 *  and then calling the AccessibleContext.getAccessibleText() method of
 *  AccessibleContext.  If the return value is not null, the object supports this
 *  interface.
 */
trait AccessibleText {

    /** Returns the String after a given index. */
    @stub
    def getAfterIndex(part: Int, index: Int): String = ???

    /** Returns the String at a given index. */
    @stub
    def getAtIndex(part: Int, index: Int): String = ???

    /** Returns the String before a given index. */
    @stub
    def getBeforeIndex(part: Int, index: Int): String = ???

    /** Returns the zero-based offset of the caret. */
    @stub
    def getCaretPosition(): Int = ???

    /** Returns the AttributeSet for a given character at a given index */
    @stub
    def getCharacterAttribute(i: Int): AttributeSet = ???

    /** Determines the bounding box of the character at the given
     *  index into the string.
     */
    @stub
    def getCharacterBounds(i: Int): Rectangle = ???

    /** Returns the number of characters (valid indicies) */
    @stub
    def getCharCount(): Int = ???

    /** Given a point in local coordinates, return the zero-based index
     *  of the character under that Point.
     */
    @stub
    def getIndexAtPoint(p: Point): Int = ???

    /** Returns the portion of the text that is selected. */
    @stub
    def getSelectedText(): String = ???

    /** Returns the end offset within the selected text. */
    @stub
    def getSelectionEnd(): Int = ???

    /** Returns the start offset within the selected text. */
    @stub
    def getSelectionStart(): Int = ???
}

object AccessibleText {
    /** Constant used to indicate that the part of the text that should be
     *  retrieved is a character.
     */
    @stub
    val CHARACTER: Int = ???

    /** Constant used to indicate that the part of the text that should be
     *  retrieved is a sentence.
     */
    @stub
    val SENTENCE: Int = ???

    /** Constant used to indicate that the part of the text that should be
     *  retrieved is a word.
     */
    @stub
    val WORD: Int = ???
}
