package java.awt

import java.awt.event.{TextEvent, TextListener}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleText}
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  TextComponent class.  It provides an implementation of the
 *  Java Accessibility API appropriate to text component user-interface
 *  elements.
 */
protected class TextComponent.AccessibleAWTTextComponent extends Component.AccessibleAWTComponent with AccessibleText with TextListener {

    /** Constructs an AccessibleAWTTextComponent. */
    @stub
    def AccessibleAWTTextComponent() = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the state set of the TextComponent. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Get the AccessibleText associated with this object. */
    @stub
    def getAccessibleText(): AccessibleText = ???

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

    /** Returns the AttributeSet for a given character (at a given index). */
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

    /** TextListener notification of a text value change. */
    @stub
    def textValueChanged(textEvent: TextEvent): Unit = ???
}
