package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point, Rectangle}
import java.lang.{Number, Object, String}
import javax.accessibility.{AccessibleAction, AccessibleContext, AccessibleExtendedComponent, AccessibleIcon, AccessibleKeyBinding, AccessibleRelationSet, AccessibleStateSet, AccessibleText, AccessibleValue}
import javax.swing.text.AttributeSet

// This class implements accessibility support for the
// AbstractButton class.  It provides an implementation of the
// Java Accessibility API appropriate to button and menu item
// user-interface elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected abstract class AbstractButton.AccessibleAbstractButton extends JComponent.AccessibleJComponent with AccessibleAction, with AccessibleValue, with AccessibleText, with AccessibleExtendedComponent {

    // Perform the specified Action on the object
    def doAccessibleAction(i: Int): Boolean

    // Get the AccessibleAction associated with this object.
    def getAccessibleAction(): AccessibleAction

    // Returns the number of Actions available in this object.
    def getAccessibleActionCount(): Int

    // Return a description of the specified action of the object.
    def getAccessibleActionDescription(i: Int): String

    // Get the AccessibleIcons associated with this object if one
    // or more exist.
    def getAccessibleIcon(): Array[AccessibleIcon]

    // Returns key bindings associated with this object
    def getAccessibleKeyBinding(): AccessibleKeyBinding

    // Returns the accessible name of this object.
    def getAccessibleName(): String

    // Get the AccessibleRelationSet associated with this object if one
    // exists.
    def getAccessibleRelationSet(): AccessibleRelationSet

    // Get the state set of this object.
    def getAccessibleStateSet(): AccessibleStateSet

    // Gets the AccessibleText associated with this object presenting
    // text on the display.
    def getAccessibleText(): AccessibleText

    // Get the AccessibleValue associated with this object.
    def getAccessibleValue(): AccessibleValue

    // Returns the String after a given index.
    def getAfterIndex(part: Int, index: Int): String

    // Returns the String at a given index.
    def getAtIndex(part: Int, index: Int): String

    // Returns the String before a given index.
    def getBeforeIndex(part: Int, index: Int): String

    // Return the zero-based offset of the caret.
    def getCaretPosition(): Int

    // Return the AttributeSet for a given character at a given index
    def getCharacterAttribute(i: Int): AttributeSet

    // Determine the bounding box of the character at the given
    // index into the string.
    def getCharacterBounds(i: Int): Rectangle

    // Return the number of characters (valid indicies)
    def getCharCount(): Int

    // Get the value of this object as a Number.
    def getCurrentAccessibleValue(): Number

    // Given a point in local coordinates, return the zero-based index
    // of the character under that Point.
    def getIndexAtPoint(p: Point): Int

    // Get the maximum value of this object as a Number.
    def getMaximumAccessibleValue(): Number

    // Get the minimum value of this object as a Number.
    def getMinimumAccessibleValue(): Number

    // Returns the portion of the text that is selected.
    def getSelectedText(): String

    // Returns the end offset within the selected text.
    def getSelectionEnd(): Int

    // Returns the start offset within the selected text.
    def getSelectionStart(): Int

    // Returns the titled border text
    def getTitledBorderText(): String

    // Returns the tool tip text
    def getToolTipText(): String
}
