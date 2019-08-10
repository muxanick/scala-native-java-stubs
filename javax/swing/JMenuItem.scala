package javax.swing

import java.awt.{Component, Container}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{MenuDragMouseEvent, MenuDragMouseListener, MenuKeyEvent, MenuKeyListener}
import javax.swing.plaf.MenuItemUI
import scala.scalanative.annotation.stub

/** An implementation of an item in a menu. A menu item is essentially a button
 *  sitting in a list. When the user selects the "button", the action
 *  associated with the menu item is performed. A JMenuItem
 *  contained in a JPopupMenu performs exactly that function.
 *  
 *  Menu items can be configured, and to some degree controlled, by
 *  Actions.  Using an
 *  Action with a menu item has many benefits beyond directly
 *  configuring a menu item.  Refer to 
 *  Swing Components Supporting Action for more
 *  details, and you can find more information in How
 *  to Use Actions, a section in The Java Tutorial.
 *  
 *  For further documentation and for examples, see
 *  How to Use Menus
 *  in The Java Tutorial.
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
class JMenuItem extends AbstractButton with Accessible with MenuElement {

    /** Creates a JMenuItem with no set text or icon. */
    @stub
    def this() = ???

    /** Creates a menu item whose properties are taken from the
     *  specified Action.
     */
    @stub
    def this(a: Action) = ???

    /** Creates a JMenuItem with the specified icon. */
    @stub
    def this(icon: Icon) = ???

    /** Creates a JMenuItem with the specified text. */
    @stub
    def this(text: String) = ???

    /** Creates a JMenuItem with the specified text and icon. */
    @stub
    def this(text: String, icon: Icon) = ???

    /** Creates a JMenuItem with the specified text and
     *  keyboard mnemonic.
     */
    @stub
    def this(text: String, mnemonic: Int) = ???

    /** This class implements accessibility support for the
     *  JMenuItem class.
     */
    protected type AccessibleJMenuItem = JMenuItem_AccessibleJMenuItem

    /** Updates the button's state in response to property changes in the
     *  associated action.
     */
    @stub
    protected def actionPropertyChanged(action: Action, propertyName: String): Unit = ???

    /** Adds a MenuDragMouseListener to the menu item. */
    @stub
    def addMenuDragMouseListener(l: MenuDragMouseListener): Unit = ???

    /** Adds a MenuKeyListener to the menu item. */
    @stub
    def addMenuKeyListener(l: MenuKeyListener): Unit = ???

    /** Sets the properties on this button to match those in the specified
     *  Action.
     */
    @stub
    protected def configurePropertiesFromAction(a: Action): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuDragMouseDragged(event: MenuDragMouseEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuDragMouseEntered(event: MenuDragMouseEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuDragMouseExited(event: MenuDragMouseEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuDragMouseReleased(event: MenuDragMouseEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuKeyPressed(event: MenuKeyEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuKeyReleased(event: MenuKeyEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuKeyTyped(event: MenuKeyEvent): Unit = ???

    /** Returns the KeyStroke which serves as an accelerator
     *  for the menu item.
     */
    @stub
    def getAccelerator(): KeyStroke = ???

    /** Returns the AccessibleContext associated with this
     *  JMenuItem.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the java.awt.Component used to paint
     *  this object.
     */
    @stub
    def getComponent(): Component = ???

    /** Returns an array of all the MenuDragMouseListeners added
     *  to this JMenuItem with addMenuDragMouseListener().
     */
    @stub
    def getMenuDragMouseListeners(): Array[MenuDragMouseListener] = ???

    /** Returns an array of all the MenuKeyListeners added
     *  to this JMenuItem with addMenuKeyListener().
     */
    @stub
    def getMenuKeyListeners(): Array[MenuKeyListener] = ???

    /** This method returns an array containing the sub-menu
     *  components for this menu component.
     */
    @stub
    def getSubElements(): Array[MenuElement] = ???

    /** Returns the suffix used to construct the name of the L&F class used to
     *  render this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Initializes the menu item with the specified text and icon. */
    @stub
    protected def init(text: String, icon: Icon): Unit = ???

    /** Returns whether the menu item is "armed". */
    @stub
    def isArmed(): Boolean = ???

    /** Called by the MenuSelectionManager when the
     *  MenuElement is selected or unselected.
     */
    @stub
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    /** Returns a string representation of this JMenuItem. */
    @stub
    protected def paramString(): String = ???

    /** Processes a key event forwarded from the
     *  MenuSelectionManager and changes the menu selection,
     *  if necessary, by using MenuSelectionManager's API.
     */
    @stub
    def processKeyEvent(e: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    /** Handles mouse drag in a menu. */
    @stub
    def processMenuDragMouseEvent(e: MenuDragMouseEvent): Unit = ???

    /** Handles a keystroke in a menu. */
    @stub
    def processMenuKeyEvent(e: MenuKeyEvent): Unit = ???

    /** Processes a mouse event forwarded from the
     *  MenuSelectionManager and changes the menu
     *  selection, if necessary, by using the
     *  MenuSelectionManager's API.
     */
    @stub
    def processMouseEvent(e: MouseEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    /** Removes a MenuDragMouseListener from the menu item. */
    @stub
    def removeMenuDragMouseListener(l: MenuDragMouseListener): Unit = ???

    /** Removes a MenuKeyListener from the menu item. */
    @stub
    def removeMenuKeyListener(l: MenuKeyListener): Unit = ???

    /** Sets the key combination which invokes the menu item's
     *  action listeners without navigating the menu hierarchy.
     */
    @stub
    def setAccelerator(keyStroke: KeyStroke): Unit = ???

    /** Identifies the menu item as "armed". */
    @stub
    def setArmed(b: Boolean): Unit = ???

    /** Enables or disables the menu item. */
    @stub
    def setEnabled(b: Boolean): Unit = ???

    /** Sets the model that this button represents. */
    @stub
    def setModel(newModel: ButtonModel): Unit = ???

    /** Sets the look and feel object that renders this component. */
    @stub
    def setUI(ui: MenuItemUI): Unit = ???

    /** Resets the UI property with a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}
