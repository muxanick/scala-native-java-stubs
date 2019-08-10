package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point, Rectangle}
import java.lang.{Number, Object, String}
import javax.accessibility.{Accessible, AccessibleAction, AccessibleContext, AccessibleEditableText, AccessibleRole, AccessibleText, AccessibleValue}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** AccessibleJSpinner implements accessibility
 *  support for the JSpinner class.
 */
protected class JSpinner_AccessibleJSpinner extends JComponent.AccessibleJComponent with AccessibleValue with AccessibleAction with AccessibleText with AccessibleEditableText with ChangeListener {

    /** AccessibleJSpinner constructor */
    @stub
    protected def AccessibleJSpinner() = ???

    /** Cuts the text between two indices into the system clipboard. */
    @stub
    def cut(startIndex: Int, endIndex: Int): Unit = ???

    /** Deletes the text between two indices */
    @stub
    def delete(startIndex: Int, endIndex: Int): Unit = ???

    /** Performs the specified Action on the object */
    @stub
    def doAccessibleAction(i: Int): Boolean = ???

    /** Gets the AccessibleAction associated with this object that supports
     *  one or more actions.
     */
    @stub
    def getAccessibleAction(): AccessibleAction = ???

    /** Returns the number of accessible actions available in this object
     *  If there are more than one, the first one is considered the "default"
     *  action of the object.
     */
    @stub
    def getAccessibleActionCount(): Int = ???

    /** Returns a description of the specified action of the object. */
    @stub
    def getAccessibleActionDescription(i: Int): String = ???

    /** Returns the specified Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children of the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the AccessibleText associated with this object presenting
     *  text on the display.
     */
    @stub
    def getAccessibleText(): AccessibleText = ???

    /** Gets the AccessibleValue associated with this object. */
    @stub
    def getAccessibleValue(): AccessibleValue = ???

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

    /** Get the value of this object as a Number. */
    @stub
    def getCurrentAccessibleValue(): Number = ???

    /** Given a point in local coordinates, return the zero-based index
     *  of the character under that Point.
     */
    @stub
    def getIndexAtPoint(p: Point): Int = ???

    /** Get the maximum value of this object as a Number. */
    @stub
    def getMaximumAccessibleValue(): Number = ???

    /** Get the minimum value of this object as a Number. */
    @stub
    def getMinimumAccessibleValue(): Number = ???

    /** Returns the portion of the text that is selected. */
    @stub
    def getSelectedText(): String = ???

    /** Returns the end offset within the selected text. */
    @stub
    def getSelectionEnd(): Int = ???

    /** Returns the start offset within the selected text. */
    @stub
    def getSelectionStart(): Int = ???

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

    /** Set the value of this object as a Number. */
    @stub
    def setCurrentAccessibleValue(n: Number): Boolean = ???

    /** Sets the text contents to the specified string. */
    @stub
    def setTextContents(s: String): Unit = ???

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
