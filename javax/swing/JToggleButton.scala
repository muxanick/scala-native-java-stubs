package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// An implementation of a two-state button.
// The JRadioButton and JCheckBox classes
// are subclasses of this class.
// For information on using them see
// How to Use Buttons, Check Boxes, and Radio Buttons,
// a section in The Java Tutorial.
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
class JToggleButton extends AbstractButton with Accessible {

    @stub
    // Creates an initially unselected toggle button
    // without setting the text or image.
    def this() = ???

    @stub
    // Creates a toggle button where properties are taken from the
    // Action supplied.
    def this(a: Action) = ???

    @stub
    // Creates an initially unselected toggle button
    // with the specified image but no text.
    def this(icon: Icon) = ???

    @stub
    // Creates a toggle button with the specified image
    // and selection state, but no text.
    def this(icon: Icon, selected: Boolean) = ???

    @stub
    // Creates an unselected toggle button with the specified text.
    def this(text: String) = ???

    @stub
    // Creates a toggle button with the specified text
    // and selection state.
    def this(text: String, selected: Boolean) = ???

    @stub
    // Creates a toggle button that has the specified text and image,
    // and that is initially unselected.
    def this(text: String, icon: Icon) = ???

    @stub
    // This class implements accessibility support for the
    // JToggleButton class.
    protected def JToggleButton.AccessibleJToggleButton: class = ???

    @stub
    // Gets the AccessibleContext associated with this JToggleButton.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns a string that specifies the name of the l&f class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JToggleButton.
    protected def paramString(): String = ???
}
