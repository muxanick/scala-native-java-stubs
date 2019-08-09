package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.AccessibleContext
import javax.swing.text.{Document, JTextComponent}
import scala.scalanative.annotation.stub

/** JPasswordField is a lightweight component that allows
 *  the editing of a single line of text where the view indicates
 *  something was typed, but does not show the original characters.
 *  You can find further information and examples in
 *  How to Use Text Fields,
 *  a section in The Java Tutorial.
 *  
 *  JPasswordField is intended
 *  to be source-compatible with java.awt.TextField
 *  used with echoChar set.  It is provided separately
 *  to make it easier to safely change the UI for the
 *  JTextField without affecting password entries.
 *  
 *  NOTE:
 *  By default, JPasswordField disables input methods; otherwise, input
 *  characters could be visible while they were composed using input methods.
 *  If an application needs the input methods support, please use the
 *  inherited method, enableInputMethods(true).
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JPasswordField extends JTextField {

    /** Constructs a new JPasswordField,
     *  with a default document, null starting
     *  text string, and 0 column width.
     */
    @stub
    def this() = ???

    /** Constructs a new JPasswordField that uses the
     *  given text storage model and the given number of columns.
     */
    @stub
    def this(doc: Document, txt: String, columns: Int) = ???

    /** Constructs a new empty JPasswordField with the specified
     *  number of columns.
     */
    @stub
    def this(columns: Int) = ???

    /** Constructs a new JPasswordField initialized
     *  with the specified text.
     */
    @stub
    def this(text: String) = ???

    /** Constructs a new JPasswordField initialized with
     *  the specified text and columns.
     */
    @stub
    def this(text: String, columns: Int) = ???

    /** This class implements accessibility support for the
     *  JPasswordField class.
     */
    @stub
    protected object AccessibleJPasswordField extends JPasswordField.AccessibleJPasswordField

    /** Invokes provideErrorFeedback on the current
     *  look and feel, which typically initiates an error beep.
     */
    @stub
    def copy(): Unit = ???

    /** Invokes provideErrorFeedback on the current
     *  look and feel, which typically initiates an error beep.
     */
    @stub
    def cut(): Unit = ???

    /** Returns true if this JPasswordField has a character
     *  set for echoing.
     */
    @stub
    def echoCharIsSet(): Boolean = ???

    /** Returns the AccessibleContext associated with this
     *  JPasswordField.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the character to be used for echoing. */
    @stub
    def getEchoChar(): Char = ???

    /** Returns the text contained in this TextComponent. */
    @stub
    def getPassword(): Array[Char] = ???

    /** Deprecated. 
     * As of Java 2 platform v1.2,
     *  replaced by getPassword.
     * 
     */
    @stub
    def getText(): String = ???

    /** Deprecated. 
     * As of Java 2 platform v1.2,
     *  replaced by getPassword.
     * 
     */
    @stub
    def getText(offs: Int, len: Int): String = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JPasswordField. */
    @stub
    protected def paramString(): String = ???

    /** Sets the echo character for this JPasswordField. */
    @stub
    def setEchoChar(c: Char): Unit = ???

    /** Reloads the pluggable UI. */
    @stub
    def updateUI(): Unit = ???
}
