package javax.swing

import java.awt.{Component, Container, Graphics, Insets}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.MenuBarUI

// An implementation of a menu bar. You add JMenu objects to the
// menu bar to construct a menu. When the user selects a JMenu
// object, its associated JPopupMenu is displayed, allowing the
// user to select one of the JMenuItems on it.
// 
// For information and examples of using menu bars see
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
// 
// Warning:
// By default, pressing the Tab key does not transfer focus from a 
// JMenuBar which is added to a container together with other Swing
// components, because the focusTraversalKeysEnabled property
// of JMenuBar is set to false. To resolve this,
// you should call the JMenuBar.setFocusTraversalKeysEnabled(true)
// method.
class JMenuBar extends JComponent with Accessible, with MenuElement {

    @stub
    // Appends the specified menu to the end of the menu bar.
    def add(c: JMenu): JMenu = ???

    @stub
    // Overrides JComponent.addNotify to register this
    // menu bar with the current keyboard manager.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JMenuBar.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Implemented to be a MenuElement.
    def getComponent(): Component = ???

    @stub
    // Deprecated. 
    //replaced by getComponent(int i)
    //
    def getComponentAtIndex(i: Int): Component = ???

    @stub
    // Returns the index of the specified component.
    def getComponentIndex(c: Component): Int = ???

    @stub
    // Gets the help menu for the menu bar.
    def getHelpMenu(): JMenu = ???

    @stub
    // Returns the margin between the menubar's border and
    // its menus.
    def getMargin(): Insets = ???

    @stub
    // Returns the menu at the specified position in the menu bar.
    def getMenu(index: Int): JMenu = ???

    @stub
    // Returns the number of items in the menu bar.
    def getMenuCount(): Int = ???

    @stub
    // Returns the model object that handles single selections.
    def getSelectionModel(): SingleSelectionModel = ???

    @stub
    // Implemented to be a MenuElement -- returns the
    // menus in this menu bar.
    def getSubElements(): Array[MenuElement] = ???

    @stub
    // Returns the menubar's current UI.
    def getUI(): MenuBarUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns true if the menu bars border should be painted.
    def isBorderPainted(): Boolean = ???

    @stub
    // Returns true if the menu bar currently has a component selected.
    def isSelected(): Boolean = ???

    @stub
    // Implemented to be a MenuElement -- does nothing.
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    @stub
    // Paints the menubar's border if BorderPainted
    // property is true.
    protected def paintBorder(g: Graphics): Unit = ???

    @stub
    // Returns a string representation of this JMenuBar.
    protected def paramString(): String = ???

    @stub
    // Subclassed to check all the child menus.
    protected def processKeyBinding(ks: KeyStroke, e: KeyEvent, condition: Int, pressed: Boolean): Boolean = ???

    @stub
    // Implemented to be a MenuElement -- does nothing.
    def processKeyEvent(e: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    @stub
    // Implemented to be a MenuElement -- does nothing.
    def processMouseEvent(event: MouseEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    @stub
    // Overrides JComponent.removeNotify to unregister this
    // menu bar with the current keyboard manager.
    def removeNotify(): Unit = ???

    @stub
    // Sets whether the border should be painted.
    def setBorderPainted(b: Boolean): Unit = ???

    @stub
    // Sets the help menu that appears when the user selects the
    // "help" option in the menu bar.
    def setHelpMenu(menu: JMenu): Unit = ???

    @stub
    // Sets the margin between the menubar's border and
    // its menus.
    def setMargin(m: Insets): Unit = ???

    @stub
    // Sets the currently selected component, producing a
    // a change to the selection model.
    def setSelected(sel: Component): Unit = ???

    @stub
    // Sets the model object to handle single selections.
    def setSelectionModel(model: SingleSelectionModel): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: MenuBarUI): Unit = ???
}
