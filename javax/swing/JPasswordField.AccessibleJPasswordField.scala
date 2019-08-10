package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleText, AccessibleTextSequence}
import javax.swing.text.JTextComponent.AccessibleJTextComponent
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JPasswordField class.  It provides an implementation of the
 *  Java Accessibility API appropriate to password field user-interface
 *  elements.
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
protected class JPasswordField_AccessibleJPasswordField extends JTextField.AccessibleJTextField {

    /**  */
    @stub
    protected def AccessibleJPasswordField() = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the AccessibleText for the JPasswordField. */
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

    /** Returns the text between two indices. */
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
}
