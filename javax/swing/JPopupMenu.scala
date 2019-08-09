package javax.swing

import java.awt.{Component, Container, Dimension, Graphics, Insets}
import java.awt.event.{FocusEvent, KeyEvent, MouseEvent}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{MenuKeyListener, PopupMenuListener}
import javax.swing.plaf.PopupMenuUI
import scala.scalanative.annotation.stub

/** An implementation of a popup menu -- a small window that pops up
 *  and displays a series of choices. A JPopupMenu is used for the
 *  menu that appears when the user selects an item on the menu bar.
 *  It is also used for "pull-right" menu that appears when the
 *  selects a menu item that activates it. Finally, a JPopupMenu
 *  can also be used anywhere else you want a menu to appear.  For
 *  example, when the user right-clicks in a specified area.
 *  
 *  For information and examples of using popup menus, see
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
class JPopupMenu extends JComponent with Accessible with MenuElement {

    /** Constructs a JPopupMenu without an "invoker". */
    @stub
    def this() = ???

    /** Constructs a JPopupMenu with the specified title. */
    @stub
    def this(label: String) = ???

    /** This class implements accessibility support for the
     *  JPopupMenu class.
     */
    @stub
    protected object AccessibleJPopupMenu extends JPopupMenu.AccessibleJPopupMenu

    /** Appends a new menu item to the end of the menu which
     *  dispatches the specified Action object.
     */
    @stub
    def add(a: Action): JMenuItem = ???

    /** Appends the specified menu item to the end of this menu. */
    @stub
    def add(menuItem: JMenuItem): JMenuItem = ???

    /** Creates a new menu item with the specified text and appends
     *  it to the end of this menu.
     */
    @stub
    def add(s: String): JMenuItem = ???

    /** Adds a MenuKeyListener to the popup menu. */
    @stub
    def addMenuKeyListener(l: MenuKeyListener): Unit = ???

    /** Adds a PopupMenu listener. */
    @stub
    def addPopupMenuListener(l: PopupMenuListener): Unit = ???

    /** Appends a new separator at the end of the menu. */
    @stub
    def addSeparator(): Unit = ???

    /** Returns a properly configured PropertyChangeListener
     *  which updates the control as changes to the Action occur.
     */
    @stub
    protected def createActionChangeListener(b: JMenuItem): PropertyChangeListener = ???

    /** Factory method which creates the JMenuItem for
     *  Actions added to the JPopupMenu.
     */
    @stub
    protected def createActionComponent(a: Action): JMenuItem = ???

    /** Notifies PopupMenuListeners that this popup menu is
     *  cancelled.
     */
    @stub
    protected def firePopupMenuCanceled(): Unit = ???

    /** Notifies PopupMenuListeners that this popup menu will
     *  become invisible.
     */
    @stub
    protected def firePopupMenuWillBecomeInvisible(): Unit = ???

    /** Notifies PopupMenuListeners that this popup menu will
     *  become visible.
     */
    @stub
    protected def firePopupMenuWillBecomeVisible(): Unit = ???

    /** Gets the AccessibleContext associated with this JPopupMenu. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns this JPopupMenu component. */
    @stub
    def getComponent(): Component = ???

    /** Deprecated. 
     * replaced by Container.getComponent(int)
     * 
     */
    @stub
    def getComponentAtIndex(i: Int): Component = ???

    /** Returns the index of the specified component. */
    @stub
    def getComponentIndex(c: Component): Int = ???

    /** Returns the component which is the 'invoker' of this
     *  popup menu.
     */
    @stub
    def getInvoker(): Component = ???

    /** Returns the popup menu's label */
    @stub
    def getLabel(): String = ???

    /** Returns the margin, in pixels, between the popup menu's border and
     *  its containers.
     */
    @stub
    def getMargin(): Insets = ???

    /** Returns an array of all the MenuKeyListeners added
     *  to this JPopupMenu with addMenuKeyListener().
     */
    @stub
    def getMenuKeyListeners(): Array[MenuKeyListener] = ???

    /** Returns an array of all the PopupMenuListeners added
     *  to this JMenuItem with addPopupMenuListener().
     */
    @stub
    def getPopupMenuListeners(): Array[PopupMenuListener] = ???

    /** Returns the model object that handles single selections. */
    @stub
    def getSelectionModel(): SingleSelectionModel = ???

    /** Returns an array of MenuElements containing the submenu
     *  for this menu component.
     */
    @stub
    def getSubElements(): Array[MenuElement] = ???

    /** Returns the look and feel (L&F) object that renders this component. */
    @stub
    def getUI(): PopupMenuUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Inserts a menu item for the specified Action object at
     *  a given position.
     */
    @stub
    def insert(a: Action, index: Int): Unit = ???

    /** Inserts the specified component into the menu at a given
     *  position.
     */
    @stub
    def insert(component: Component, index: Int): Unit = ???

    /** Checks whether the border should be painted. */
    @stub
    def isBorderPainted(): Boolean = ???

    /** Gets the lightWeightPopupEnabled property. */
    @stub
    def isLightWeightPopupEnabled(): Boolean = ???

    /** Returns true if the MouseEvent is considered a popup trigger
     *  by the JPopupMenu's currently installed UI.
     */
    @stub
    def isPopupTrigger(e: MouseEvent): Boolean = ???

    /** Returns true if the popup menu is visible (currently
     *  being displayed).
     */
    @stub
    def isVisible(): Boolean = ???

    /** Messaged when the menubar selection changes to activate or
     *  deactivate this menu.
     */
    @stub
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    /** Lays out the container so that it uses the minimum space
     *  needed to display its contents.
     */
    @stub
    def pack(): Unit = ???

    /** Paints the popup menu's border if the borderPainted
     *  property is true.
     */
    @stub
    protected def paintBorder(g: Graphics): Unit = ???

    /** Returns a string representation of this JPopupMenu. */
    @stub
    protected def paramString(): String = ???

    /** Processes focus events occurring on this component by
     *  dispatching them to any registered
     *  FocusListener objects.
     */
    @stub
    protected def processFocusEvent(evt: FocusEvent): Unit = ???

    /** Processes key stroke events such as mnemonics and accelerators. */
    @stub
    protected def processKeyEvent(evt: KeyEvent): Unit = ???

    /** Processes a key event forwarded from the
     *  MenuSelectionManager and changes the menu selection,
     *  if necessary, by using MenuSelectionManager's API.
     */
    @stub
    def processKeyEvent(e: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    /** This method is required to conform to the
     *  MenuElement interface, but it not implemented.
     */
    @stub
    def processMouseEvent(event: MouseEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    /** Removes the component at the specified index from this popup menu. */
    @stub
    def remove(pos: Int): Unit = ???

    /** Removes a MenuKeyListener from the popup menu. */
    @stub
    def removeMenuKeyListener(l: MenuKeyListener): Unit = ???

    /** Removes a PopupMenu listener. */
    @stub
    def removePopupMenuListener(l: PopupMenuListener): Unit = ???

    /** Sets whether the border should be painted. */
    @stub
    def setBorderPainted(b: Boolean): Unit = ???

    /** Sets the invoker of this popup menu -- the component in which
     *  the popup menu menu is to be displayed.
     */
    @stub
    def setInvoker(invoker: Component): Unit = ???

    /** Sets the popup menu's label. */
    @stub
    def setLabel(label: String): Unit = ???

    /** Sets the value of the lightWeightPopupEnabled property,
     *  which by default is true.
     */
    @stub
    def setLightWeightPopupEnabled(aFlag: Boolean): Unit = ???

    /** Sets the location of the upper left corner of the
     *  popup menu using x, y coordinates.
     */
    @stub
    def setLocation(x: Int, y: Int): Unit = ???

    /** Sets the size of the Popup window using a Dimension object. */
    @stub
    def setPopupSize(d: Dimension): Unit = ???

    /** Sets the size of the Popup window to the specified width and
     *  height.
     */
    @stub
    def setPopupSize(width: Int, height: Int): Unit = ???

    /** Sets the currently selected component,  This will result
     *  in a change to the selection model.
     */
    @stub
    def setSelected(sel: Component): Unit = ???

    /** Sets the model object to handle single selections. */
    @stub
    def setSelectionModel(model: SingleSelectionModel): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: PopupMenuUI): Unit = ???

    /** Sets the visibility of the popup menu. */
    @stub
    def setVisible(b: Boolean): Unit = ???

    /** Displays the popup menu at the position x,y in the coordinate
     *  space of the component invoker.
     */
    @stub
    def show(invoker: Component, x: Int, y: Int): Unit = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}

object JPopupMenu {
    /** A popup menu-specific separator. */
    @stub
    object Separator extends JPopupMenu.Separator

    /** Gets the defaultLightWeightPopupEnabled property,
     *   which by default is true.
     */
    @stub
    def getDefaultLightWeightPopupEnabled(): Boolean = ???

    /** Sets the default value of the lightWeightPopupEnabled
     *   property.
     */
    @stub
    def setDefaultLightWeightPopupEnabled(aFlag: Boolean): Unit = ???
}
