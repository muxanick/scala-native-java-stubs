package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** An implementation of a "push" button.
 *  
 *  Buttons can be configured, and to some degree controlled, by
 *  Actions.  Using an
 *  Action with a button has many benefits beyond directly
 *  configuring a button.  Refer to 
 *  Swing Components Supporting Action for more
 *  details, and you can find more information in How
 *  to Use Actions, a section in The Java Tutorial.
 *  
 *  See How to Use Buttons, Check Boxes, and Radio Buttons
 *  in The Java Tutorial
 *  for information and examples of using buttons.
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
class JButton extends AbstractButton with Accessible {

    /** Creates a button with no set text or icon. */
    @stub
    def this() = ???

    /** Creates a button where properties are taken from the
     *  Action supplied.
     */
    @stub
    def this(a: Action) = ???

    /** Creates a button with an icon. */
    @stub
    def this(icon: Icon) = ???

    /** Creates a button with text. */
    @stub
    def this(text: String) = ???

    /** Creates a button with initial text and an icon. */
    @stub
    def this(text: String, icon: Icon) = ???

    /** This class implements accessibility support for the
     *  JButton class.  It provides an implementation of the
     *  Java Accessibility API appropriate to button user-interface
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
    protected class AccessibleJButton extends AbstractButton.AccessibleAbstractButton {

        /**  */
        @stub
        protected def this() = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???
    }


    /** Gets the AccessibleContext associated with this
     *  JButton.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns a string that specifies the name of the L&F class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Gets the value of the defaultButton property,
     *  which if true means that this button is the current
     *  default button for its JRootPane.
     */
    @stub
    def isDefaultButton(): Boolean = ???

    /** Gets the value of the defaultCapable property. */
    @stub
    def isDefaultCapable(): Boolean = ???

    /** Returns a string representation of this JButton. */
    @stub
    protected def paramString(): String = ???

    /** Overrides JComponent.removeNotify to check if
     *  this button is currently set as the default button on the
     *  RootPane, and if so, sets the RootPane's
     *  default button to null to ensure the
     *  RootPane doesn't hold onto an invalid button reference.
     */
    @stub
    def removeNotify(): Unit = ???

    /** Sets the defaultCapable property,
     *  which determines whether this button can be
     *  made the default button for its root pane.
     */
    @stub
    def setDefaultCapable(defaultCapable: Boolean): Unit = ???

    /** Resets the UI property to a value from the current look and
     *  feel.
     */
    @stub
    def updateUI(): Unit = ???
}
