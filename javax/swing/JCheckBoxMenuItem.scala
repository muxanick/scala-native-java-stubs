package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// A menu item that can be selected or deselected. If selected, the menu
// item typically appears with a checkmark next to it. If unselected or
// deselected, the menu item appears without a checkmark. Like a regular
// menu item, a check box menu item can have either text or a graphic
// icon associated with it, or both.
// 
// Either isSelected/setSelected or
// getState/setState can be used
// to determine/specify the menu item's selection state. The
// preferred methods are isSelected and
// setSelected, which work for all menus and buttons.
// The getState and setState methods exist for
// compatibility with other component sets.
// 
// Menu items can be configured, and to some degree controlled, by
// Actions.  Using an
// Action with a menu item has many benefits beyond directly
// configuring a menu item.  Refer to 
// Swing Components Supporting Action for more
// details, and you can find more information in How
// to Use Actions, a section in The Java Tutorial.
// 
// For further information and examples of using check box menu items,
// see How to Use Menus,
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
class JCheckBoxMenuItem extends JMenuItem with SwingConstants, with Accessible {

    @stub
    // Creates an initially unselected check box menu item with no set text or icon.
    def this() = ???

    @stub
    // Creates a menu item whose properties are taken from the
    // Action supplied.
    def this(a: Action) = ???

    @stub
    // Creates an initially unselected check box menu item with an icon.
    def this(icon: Icon) = ???

    @stub
    // Creates an initially unselected check box menu item with text.
    def this(text: String) = ???

    @stub
    // Creates a check box menu item with the specified text and selection state.
    def this(text: String, b: Boolean) = ???

    @stub
    // Creates an initially unselected check box menu item with the specified text and icon.
    def this(text: String, icon: Icon) = ???

    @stub
    // Gets the AccessibleContext associated with this JCheckBoxMenuItem.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns an array (length 1) containing the check box menu item
    // label or null if the check box is not selected.
    def getSelectedObjects(): Array[Object] = ???

    @stub
    // Returns the selected-state of the item.
    def getState(): Boolean = ???

    @stub
    // Returns the name of the L&F class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JCheckBoxMenuItem.
    protected def paramString(): String = ???
}
