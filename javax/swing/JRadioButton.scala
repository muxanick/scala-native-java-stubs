package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// An implementation of a radio button -- an item that can be selected or
// deselected, and which displays its state to the user.
// Used with a ButtonGroup object to create a group of buttons
// in which only one button at a time can be selected. (Create a ButtonGroup
// object and use its add method to include the JRadioButton objects
// in the group.)
// 
// Note:
// The ButtonGroup object is a logical grouping -- not a physical grouping.
// To create a button panel, you should still create a JPanel or similar
// container-object and add a Border to it to set it off from surrounding
// components.
// 
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
// for further documentation.
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
class JRadioButton extends JToggleButton with Accessible {

    @stub
    // Creates an initially unselected radio button
    // with no set text.
    def this() = ???

    @stub
    // Creates a radiobutton where properties are taken from the
    // Action supplied.
    def this(a: Action) = ???

    @stub
    // Creates an initially unselected radio button
    // with the specified image but no text.
    def this(icon: Icon) = ???

    @stub
    // Creates a radio button with the specified image
    // and selection state, but no text.
    def this(icon: Icon, selected: Boolean) = ???

    @stub
    // Creates an unselected radio button with the specified text.
    def this(text: String) = ???

    @stub
    // Creates a radio button with the specified text
    // and selection state.
    def this(text: String, selected: Boolean) = ???

    @stub
    // Creates a radio button that has the specified text and image,
    // and that is initially unselected.
    def this(text: String, icon: Icon) = ???

    @stub
    // Gets the AccessibleContext associated with this JRadioButton.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the name of the L&F class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JRadioButton.
    protected def paramString(): String = ???
}