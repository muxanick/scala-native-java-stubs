package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// An implementation of a "push" button.
// 
// Buttons can be configured, and to some degree controlled, by
// Actions.  Using an
// Action with a button has many benefits beyond directly
// configuring a button.  Refer to 
// Swing Components Supporting Action for more
// details, and you can find more information in How
// to Use Actions, a section in The Java Tutorial.
// 
// See How to Use Buttons, Check Boxes, and Radio Buttons
// in The Java Tutorial
// for information and examples of using buttons.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JButton extends AbstractButton with Accessible {

    @stub
    // Creates a button with no set text or icon.
    def this() = ???

    @stub
    // Creates a button where properties are taken from the
    // Action supplied.
    def this(a: Action) = ???

    @stub
    // Creates a button with an icon.
    def this(icon: Icon) = ???

    @stub
    // Creates a button with text.
    def this(text: String) = ???

    @stub
    // Gets the AccessibleContext associated with this
    // JButton.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns a string that specifies the name of the L&F class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Gets the value of the defaultButton property,
    // which if true means that this button is the current
    // default button for its JRootPane.
    def isDefaultButton(): Boolean = ???

    @stub
    // Gets the value of the defaultCapable property.
    def isDefaultCapable(): Boolean = ???

    @stub
    // Returns a string representation of this JButton.
    protected def paramString(): String = ???

    @stub
    // Overrides JComponent.removeNotify to check if
    // this button is currently set as the default button on the
    // RootPane, and if so, sets the RootPane's
    // default button to null to ensure the
    // RootPane doesn't hold onto an invalid button reference.
    def removeNotify(): Unit = ???

    @stub
    // Sets the defaultCapable property,
    // which determines whether this button can be
    // made the default button for its root pane.
    def setDefaultCapable(defaultCapable: Boolean): Unit = ???
}
