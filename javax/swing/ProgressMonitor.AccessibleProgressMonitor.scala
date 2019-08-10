package javax.swing

import java.awt.{Point, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleText, AccessibleValue}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** AccessibleProgressMonitor implements accessibility
 *  support for the ProgressMonitor class.
 */
protected class ProgressMonitor_AccessibleProgressMonitor extends AccessibleContext with AccessibleText with ChangeListener with PropertyChangeListener {

    /** AccessibleProgressMonitor constructor */
    @stub
    protected def AccessibleProgressMonitor() = ???

    /** Returns the specified Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children of the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Gets the AccessibleComponent associated with this object that has a
     *  graphical representation.
     */
    @stub
    def getAccessibleComponent(): AccessibleComponent = ???

    /** Gets the accessibleDescription property of this object. */
    @stub
    def getAccessibleDescription(): String = ???

    /** Gets the 0-based index of this object in its accessible parent. */
    @stub
    def getAccessibleIndexInParent(): Int = ???

    /** Gets the accessibleName property of this object. */
    @stub
    def getAccessibleName(): String = ???

    /** Gets the Accessible parent of this object. */
    @stub
    def getAccessibleParent(): Accessible = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Gets the AccessibleText associated with this object presenting
     *  text on the display.
     */
    @stub
    def getAccessibleText(): AccessibleText = ???

    /** Gets the AccessibleValue associated with this object that supports a
     *  Numerical value.
     */
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

    /** Given a point in local coordinates, return the zero-based index
     *  of the character under that Point.
     */
    @stub
    def getIndexAtPoint(p: Point): Int = ???

    /** Gets the locale of the component. */
    @stub
    def getLocale(): Locale = ???

    /** Returns the portion of the text that is selected. */
    @stub
    def getSelectedText(): String = ???

    /** Returns the end offset within the selected text. */
    @stub
    def getSelectionEnd(): Int = ???

    /** Returns the start offset within the selected text. */
    @stub
    def getSelectionStart(): Int = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
