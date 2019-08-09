package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// An implementation of a radio button menu item.
// A JRadioButtonMenuItem is
// a menu item that is part of a group of menu items in which only one
// item in the group can be selected. The selected item displays its
// selected state. Selecting it causes any other selected item to
// switch to the unselected state.
// To control the selected state of a group of radio button menu items,
// use a ButtonGroup object.
// 
// Menu items can be configured, and to some degree controlled, by
// Actions.  Using an
// Action with a menu item has many benefits beyond directly
// configuring a menu item.  Refer to 
// Swing Components Supporting Action for more
// details, and you can find more information in How
// to Use Actions, a section in The Java Tutorial.
// 
// For further documentation and examples see
// How to Use Menus,
// a section in The Java Tutorial.
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
class JRadioButtonMenuItem extends JMenuItem with Accessible {

    @stub
    // Creates a JRadioButtonMenuItem with no set text or icon.
    def this() = ???

    @stub
    // Creates a radio button menu item whose properties are taken from the
    // Action supplied.
    def this(a: Action) = ???

    @stub
    // Creates a JRadioButtonMenuItem with an icon.
    def this(icon: Icon) = ???

    @stub
    // Creates a radio button menu item with the specified image
    // and selection state, but no text.
    def this(icon: Icon, selected: Boolean) = ???

    @stub
    // Creates a JRadioButtonMenuItem with text.
    def this(text: String) = ???

    @stub
    // Creates a radio button menu item with the specified text
    // and selection state.
    def this(text: String, selected: Boolean) = ???

    @stub
    // Creates a radio button menu item with the specified text
    // and Icon.
    def this(text: String, icon: Icon) = ???

    @stub
    // Gets the AccessibleContext associated with this JRadioButtonMenuItem.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???
}
