package javax.swing.text

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point, Rectangle}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleAction, AccessibleContext, AccessibleEditableText, AccessibleExtendedText, AccessibleRole, AccessibleStateSet, AccessibleText, AccessibleTextSequence}
import javax.swing.JComponent.AccessibleJComponent
import javax.swing.event.{CaretEvent, CaretListener, DocumentEvent, DocumentListener}

// This class implements accessibility support for the
// JTextComponent class.  It provides an implementation of
// the Java Accessibility API appropriate to menu user-interface elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JTextComponent.AccessibleJTextComponent extends JComponent.AccessibleJComponent with AccessibleText, with CaretListener, with DocumentListener, with AccessibleAction, with AccessibleEditableText, with AccessibleExtendedText {

    @stub
    // Handles caret updates (fire appropriate property change event,
    // which are AccessibleContext.ACCESSIBLE_CARET_PROPERTY and
    // AccessibleContext.ACCESSIBLE_SELECTION_PROPERTY).
    def caretUpdate(e: CaretEvent): Unit = ???

    @stub
    // Handles document remove (fire appropriate property change event,
    // which is AccessibleContext.ACCESSIBLE_TEXT_PROPERTY).
    def changedUpdate(e: DocumentEvent): Unit = ???

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
    // If there are more than one, the first one is considered the
    // "default" action of the object.
    def getAccessibleActionCount(): Int = ???

    @stub
    // Returns a description of the specified action of the object.
    def getAccessibleActionDescription(i: Int): String = ???

    @stub
    // Returns the AccessibleEditableText interface for
    // this text component.
    def getAccessibleEditableText(): AccessibleEditableText = ???

    @stub
    // Gets the role of this object.
    def getAccessibleRole(): AccessibleRole = ???

    @stub
    // Gets the state set of the JTextComponent.
    def getAccessibleStateSet(): AccessibleStateSet = ???

    @stub
    // Get the AccessibleText associated with this object.
    def getAccessibleText(): AccessibleText = ???

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
    // Returns the AttributeSet for a given character (at a given index).
    def getCharacterAttribute(i: Int): AttributeSet = ???

    @stub
    // Determines the bounding box of the character at the given
    // index into the string.
    def getCharacterBounds(i: Int): Rectangle = ???

    @stub
    // Returns the number of characters (valid indices)
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

    @stub
    // Returns the start offset within the selected text.
    def getSelectionStart(): Int = ???

    @stub
    // Returns the Rectangle enclosing the text between
    // two indicies.
    def getTextBounds(startIndex: Int, endIndex: Int): Rectangle = ???

    @stub
    // Returns the text string between two indices.
    def getTextRange(startIndex: Int, endIndex: Int): String = ???

    @stub
    // Returns the AccessibleTextSequence after a given
    // index.
    def getTextSequenceAfter(part: Int, index: Int): AccessibleTextSequence = ???

    @stub
    // Returns the AccessibleTextSequence at a given
    // index.
    def getTextSequenceAt(part: Int, index: Int): AccessibleTextSequence = ???

    @stub
    // Returns the AccessibleTextSequence before a given
    // index.
    def getTextSequenceBefore(part: Int, index: Int): AccessibleTextSequence = ???

    @stub
    // Inserts the specified string at the given index
    def insertTextAtIndex(index: Int, s: String): Unit = ???

    @stub
    // Handles document insert (fire appropriate property change event
    // which is AccessibleContext.ACCESSIBLE_TEXT_PROPERTY).
    def insertUpdate(e: DocumentEvent): Unit = ???

    @stub
    // Pastes the text from the system clipboard into the text
    // starting at the specified index.
    def paste(startIndex: Int): Unit = ???

    @stub
    // Handles document remove (fire appropriate property change event,
    // which is AccessibleContext.ACCESSIBLE_TEXT_PROPERTY).
    def removeUpdate(e: DocumentEvent): Unit = ???

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
