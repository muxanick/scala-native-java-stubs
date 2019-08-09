package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point, Rectangle}
import java.lang.{Number, Object, String}
import javax.accessibility.{Accessible, AccessibleAction, AccessibleContext, AccessibleEditableText, AccessibleRole, AccessibleText, AccessibleValue}
import javax.swing.event.ChangeListener
import javax.swing.text.AttributeSet

// AccessibleJSpinner implements accessibility
// support for the JSpinner class.
protected class JSpinner.AccessibleJSpinner extends JComponent.AccessibleJComponent with AccessibleValue, with AccessibleAction, with AccessibleText, with AccessibleEditableText, with ChangeListener {

    @stub
    // Cuts the text between two indices into the system clipboard.
    def cut(startIndex: Int, endIndex: Int): Unit = ???

    @stub
    // Deletes the text between two indices
    def delete(startIndex: Int, endIndex: Int): Unit = ???

    @stub
    // Performs the specified Action on the object
    def doAccessibleAction(i: Int): Boolean = ???

    @stub
    // Gets the AccessibleAction associated with this object that supports
    // one or more actions.
    def getAccessibleAction(): AccessibleAction = ???

    @stub
    // Returns the number of accessible actions available in this object
    // If there are more than one, the first one is considered the "default"
    // action of the object.
    def getAccessibleActionCount(): Int = ???

    @stub
    // Returns a description of the specified action of the object.
    def getAccessibleActionDescription(i: Int): String = ???

    @stub
    // Returns the specified Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children of the object.
    def getAccessibleChildrenCount(): Int = ???

    @stub
    // Gets the role of this object.
    def getAccessibleRole(): AccessibleRole = ???

    @stub
    // Gets the AccessibleText associated with this object presenting
    // text on the display.
    def getAccessibleText(): AccessibleText = ???

    @stub
    // Gets the AccessibleValue associated with this object.
    def getAccessibleValue(): AccessibleValue = ???

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
    // Get the value of this object as a Number.
    def getCurrentAccessibleValue(): Number = ???

    @stub
    // Given a point in local coordinates, return the zero-based index
    // of the character under that Point.
    def getIndexAtPoint(p: Point): Int = ???

    @stub
    // Get the maximum value of this object as a Number.
    def getMaximumAccessibleValue(): Number = ???

    @stub
    // Get the minimum value of this object as a Number.
    def getMinimumAccessibleValue(): Number = ???

    @stub
    // Returns the portion of the text that is selected.
    def getSelectedText(): String = ???

    @stub
    // Returns the end offset within the selected text.
    def getSelectionEnd(): Int = ???

    @stub
    // Returns the start offset within the selected text.
    def getSelectionStart(): Int = ???

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

    @stub
    // Set the value of this object as a Number.
    def setCurrentAccessibleValue(n: Number): Boolean = ???

    @stub
    // Sets the text contents to the specified string.
    def setTextContents(s: String): Unit = ???
}
