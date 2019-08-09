package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// An implementation of a check box -- an item that can be selected or
// deselected, and which displays its state to the user.
// By convention, any number of check boxes in a group can be selected.
// See How to Use Buttons, Check Boxes, and Radio Buttons
// in The Java Tutorial
// for examples and information on using check boxes.
// 
// Buttons can be configured, and to some degree controlled, by
// Actions.  Using an
// Action with a button has many benefits beyond directly
// configuring a button.  Refer to 
// Swing Components Supporting Action for more
// details, and you can find more information in How
// to Use Actions, a section in The Java Tutorial.
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
class JCheckBox extends JToggleButton with Accessible {

    @stub
    // Creates an initially unselected check box button with no text, no icon.
    def this() = ???

    @stub
    // Creates a check box where properties are taken from the
    // Action supplied.
    def this(a: Action) = ???

    @stub
    // Creates an initially unselected check box with an icon.
    def this(icon: Icon) = ???

    @stub
    // Creates a check box with an icon and specifies whether
    // or not it is initially selected.
    def this(icon: Icon, selected: Boolean) = ???

    @stub
    // Creates an initially unselected check box with text.
    def this(text: String) = ???

    @stub
    // Creates a check box with text and specifies whether
    // or not it is initially selected.
    def this(text: String, selected: Boolean) = ???

    @stub
    // Creates an initially unselected check box with
    // the specified text and icon.
    def this(text: String, icon: Icon) = ???

    @stub
    // Gets the AccessibleContext associated with this JCheckBox.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns a string that specifies the name of the L&F class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Gets the value of the borderPaintedFlat property.
    def isBorderPaintedFlat(): Boolean = ???

    @stub
    // Returns a string representation of this JCheckBox.
    protected def paramString(): String = ???

    @stub
    // Sets the borderPaintedFlat property,
    // which gives a hint to the look and feel as to the
    // appearance of the check box border.
    def setBorderPaintedFlat(b: Boolean): Unit = ???
}
