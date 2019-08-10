package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point, Rectangle}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleExtendedComponent, AccessibleIcon, AccessibleKeyBinding, AccessibleRelationSet, AccessibleRole, AccessibleText}
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** The class used to obtain the accessible role for this object.
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
protected class JLabel_AccessibleJLabel extends JComponent.AccessibleJComponent with AccessibleText with AccessibleExtendedComponent {

    /**  */
    @stub
    protected def AccessibleJLabel() = ???

    /** Get the AccessibleIcons associated with this object if one
     *  or more exist.
     */
    @stub
    def getAccessibleIcon(): Array[AccessibleIcon] = ???

    /** Returns key bindings associated with this object */
    @stub
    def getAccessibleKeyBinding(): AccessibleKeyBinding = ???

    /** Get the accessible name of this object. */
    @stub
    def getAccessibleName(): String = ???

    /** Get the AccessibleRelationSet associated with this object if one
     *  exists.
     */
    @stub
    def getAccessibleRelationSet(): AccessibleRelationSet = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the AccessibleText associated with this object presenting
     *  text on the display.
     */
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

    /** Return the zero-based offset of the caret. */
    @stub
    def getCaretPosition(): Int = ???

    /** Return the AttributeSet for a given character at a given index */
    @stub
    def getCharacterAttribute(i: Int): AttributeSet = ???

    /** Returns the bounding box of the character at the given
     *  index in the string.
     */
    @stub
    def getCharacterBounds(i: Int): Rectangle = ???

    /** Return the number of characters (valid indicies) */
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

    /** Returns the titled border text */
    @stub
    def getTitledBorderText(): String = ???

    /** Returns the tool tip text */
    @stub
    def getToolTipText(): String = ???
}
