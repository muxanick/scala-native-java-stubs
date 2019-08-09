package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

/** An implementation of a two-state button.
 *  The JRadioButton and JCheckBox classes
 *  are subclasses of this class.
 *  For information on using them see
 *  How to Use Buttons, Check Boxes, and Radio Buttons,
 *  a section in The Java Tutorial.
 *  
 *  Buttons can be configured, and to some degree controlled, by
 *  Actions.  Using an
 *  Action with a button has many benefits beyond directly
 *  configuring a button.  Refer to 
 *  Swing Components Supporting Action for more
 *  details, and you can find more information in How
 *  to Use Actions, a section in The Java Tutorial.
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
class JToggleButton extends AbstractButton with Accessible {

    /** Creates an initially unselected toggle button
     *  without setting the text or image.
     */
    @stub
    def this() = ???

    /** Creates a toggle button where properties are taken from the
     *  Action supplied.
     */
    @stub
    def this(a: Action) = ???

    /** Creates an initially unselected toggle button
     *  with the specified image but no text.
     */
    @stub
    def this(icon: Icon) = ???

    /** Creates a toggle button with the specified image
     *  and selection state, but no text.
     */
    @stub
    def this(icon: Icon, selected: Boolean) = ???

    /** Creates an unselected toggle button with the specified text. */
    @stub
    def this(text: String) = ???

    /** Creates a toggle button with the specified text
     *  and selection state.
     */
    @stub
    def this(text: String, selected: Boolean) = ???

    /** Creates a toggle button that has the specified text and image,
     *  and that is initially unselected.
     */
    @stub
    def this(text: String, icon: Icon) = ???

    /** This class implements accessibility support for the
     *  JToggleButton class.
     */
    @stub
    protected object AccessibleJToggleButton extends JToggleButton.AccessibleJToggleButton

    /** Gets the AccessibleContext associated with this JToggleButton. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns a string that specifies the name of the l&f class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JToggleButton. */
    @stub
    protected def paramString(): String = ???
}
