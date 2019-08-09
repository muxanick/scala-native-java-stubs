package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

/** A menu item that can be selected or deselected. If selected, the menu
 *  item typically appears with a checkmark next to it. If unselected or
 *  deselected, the menu item appears without a checkmark. Like a regular
 *  menu item, a check box menu item can have either text or a graphic
 *  icon associated with it, or both.
 *  
 *  Either isSelected/setSelected or
 *  getState/setState can be used
 *  to determine/specify the menu item's selection state. The
 *  preferred methods are isSelected and
 *  setSelected, which work for all menus and buttons.
 *  The getState and setState methods exist for
 *  compatibility with other component sets.
 *  
 *  Menu items can be configured, and to some degree controlled, by
 *  Actions.  Using an
 *  Action with a menu item has many benefits beyond directly
 *  configuring a menu item.  Refer to 
 *  Swing Components Supporting Action for more
 *  details, and you can find more information in How
 *  to Use Actions, a section in The Java Tutorial.
 *  
 *  For further information and examples of using check box menu items,
 *  see How to Use Menus,
 *  a section in The Java Tutorial.
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
class JCheckBoxMenuItem extends JMenuItem with SwingConstants with Accessible {

    /** Creates an initially unselected check box menu item with no set text or icon. */
    @stub
    def this() = ???

    /** Creates a menu item whose properties are taken from the
     *  Action supplied.
     */
    @stub
    def this(a: Action) = ???

    /** Creates an initially unselected check box menu item with an icon. */
    @stub
    def this(icon: Icon) = ???

    /** Creates an initially unselected check box menu item with text. */
    @stub
    def this(text: String) = ???

    /** Creates a check box menu item with the specified text and selection state. */
    @stub
    def this(text: String, b: Boolean) = ???

    /** Creates an initially unselected check box menu item with the specified text and icon. */
    @stub
    def this(text: String, icon: Icon) = ???

    /** Gets the AccessibleContext associated with this JCheckBoxMenuItem. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array (length 1) containing the check box menu item
     *  label or null if the check box is not selected.
     */
    @stub
    def getSelectedObjects(): Array[Object] = ???

    /** Returns the selected-state of the item. */
    @stub
    def getState(): Boolean = ???

    /** Returns the name of the L&F class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JCheckBoxMenuItem. */
    @stub
    protected def paramString(): String = ???
}
