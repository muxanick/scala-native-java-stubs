package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer}
import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

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

    /** Creates a toggle button with the specified text, image, and
     *  selection state.
     */
    @stub
    def this(text: String, icon: Icon, selected: Boolean) = ???

    /** This class implements accessibility support for the
     *  JToggleButton class.  It provides an implementation of the
     *  Java Accessibility API appropriate to toggle button user-interface
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
    protected class AccessibleJToggleButton extends AbstractButton.AccessibleAbstractButton with ItemListener {

        /**  */
        @stub
        def this() = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Fire accessible property change events when the state of the
         *  toggle button changes.
         */
        @stub
        def itemStateChanged(e: ItemEvent): Unit = ???
    }


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

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}

object JToggleButton {
    /** The ToggleButton model
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
    object ToggleButtonModel extends DefaultButtonModel {

        /** Creates a new ToggleButton Model */
        @stub
        def apply() = ???

        /** Checks if the button is selected. */
        @stub
        def isSelected(): Boolean = ???

        /** Sets the pressed state of the toggle button. */
        @stub
        def setPressed(b: Boolean): Unit = ???

        /** Sets the selected state of the button. */
        @stub
        def setSelected(b: Boolean): Unit = ???
    }

}
