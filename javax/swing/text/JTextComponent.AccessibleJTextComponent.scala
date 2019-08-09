package javax.swing.text

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point, Rectangle}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleAction, AccessibleContext, AccessibleEditableText, AccessibleExtendedText, AccessibleRole, AccessibleStateSet, AccessibleText, AccessibleTextSequence}
import javax.swing.JComponent.AccessibleJComponent
import javax.swing.event.{CaretEvent, CaretListener, DocumentEvent, DocumentListener}

/** This class implements accessibility support for the
 *  JTextComponent class.  It provides an implementation of
 *  the Java Accessibility API appropriate to menu user-interface elements.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JTextComponent.AccessibleJTextComponent extends JComponent.AccessibleJComponent with AccessibleText with CaretListener with DocumentListener with AccessibleAction with AccessibleEditableText with AccessibleExtendedText {

    /** Handles caret updates (fire appropriate property change event,
     *  which are AccessibleContext.ACCESSIBLE_CARET_PROPERTY and
     *  AccessibleContext.ACCESSIBLE_SELECTION_PROPERTY).
     */
    @stub
    def caretUpdate(e: CaretEvent): Unit = ???

    /** Handles document remove (fire appropriate property change event,
     *  which is AccessibleContext.ACCESSIBLE_TEXT_PROPERTY).
     */
    @stub
    def changedUpdate(e: DocumentEvent): Unit = ???

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
     *  If there are more than one, the first one is considered the
     *  "default" action of the object.
     */
    @stub
    def getAccessibleActionCount(): Int = ???

    /** Returns a description of the specified action of the object. */
    @stub
    def getAccessibleActionDescription(i: Int): String = ???

    /** Returns the AccessibleEditableText interface for
     *  this text component.
     */
    @stub
    def getAccessibleEditableText(): AccessibleEditableText = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the state set of the JTextComponent. */
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

    /** Returns the number of characters (valid indices) */
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

    /** Returns the Rectangle enclosing the text between
     *  two indicies.
     */
    @stub
    def getTextBounds(startIndex: Int, endIndex: Int): Rectangle = ???

    /** Returns the text string between two indices. */
    @stub
    def getTextRange(startIndex: Int, endIndex: Int): String = ???

    /** Returns the AccessibleTextSequence after a given
     *  index.
     */
    @stub
    def getTextSequenceAfter(part: Int, index: Int): AccessibleTextSequence = ???

    /** Returns the AccessibleTextSequence at a given
     *  index.
     */
    @stub
    def getTextSequenceAt(part: Int, index: Int): AccessibleTextSequence = ???

    /** Returns the AccessibleTextSequence before a given
     *  index.
     */
    @stub
    def getTextSequenceBefore(part: Int, index: Int): AccessibleTextSequence = ???

    /** Inserts the specified string at the given index */
    @stub
    def insertTextAtIndex(index: Int, s: String): Unit = ???

    /** Handles document insert (fire appropriate property change event
     *  which is AccessibleContext.ACCESSIBLE_TEXT_PROPERTY).
     */
    @stub
    def insertUpdate(e: DocumentEvent): Unit = ???

    /** Pastes the text from the system clipboard into the text
     *  starting at the specified index.
     */
    @stub
    def paste(startIndex: Int): Unit = ???

    /** Handles document remove (fire appropriate property change event,
     *  which is AccessibleContext.ACCESSIBLE_TEXT_PROPERTY).
     */
    @stub
    def removeUpdate(e: DocumentEvent): Unit = ???

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
