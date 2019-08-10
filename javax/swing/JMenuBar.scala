package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Graphics, Insets}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import javax.swing.plaf.MenuBarUI
import scala.scalanative.annotation.stub

/** An implementation of a menu bar. You add JMenu objects to the
 *  menu bar to construct a menu. When the user selects a JMenu
 *  object, its associated JPopupMenu is displayed, allowing the
 *  user to select one of the JMenuItems on it.
 *  
 *  For information and examples of using menu bars see
 *  How to Use Menus,
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
 *  
 *  Warning:
 *  By default, pressing the Tab key does not transfer focus from a 
 *  JMenuBar which is added to a container together with other Swing
 *  components, because the focusTraversalKeysEnabled property
 *  of JMenuBar is set to false. To resolve this,
 *  you should call the JMenuBar.setFocusTraversalKeysEnabled(true)
 *  method.
 */
class JMenuBar extends JComponent with Accessible with MenuElement {

    /** Creates a new menu bar. */
    @stub
    def this() = ???

    /** This class implements accessibility support for the
     *  JMenuBar class.  It provides an implementation of the
     *  Java Accessibility API appropriate to menu bar user-interface
     *  elements.
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
    protected class AccessibleJMenuBar extends JComponent.AccessibleJComponent with AccessibleSelection {

        /**  */
        @stub
        protected def this() = ???

        /** Selects the nth menu in the menu bar, forcing it to
         *  pop up.
         */
        @stub
        def addAccessibleSelection(i: Int): Unit = ???

        /** Clears the selection in the object, so that nothing in the
         *  object is selected.
         */
        @stub
        def clearAccessibleSelection(): Unit = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the AccessibleSelection associated with this object. */
        @stub
        def getAccessibleSelection(): AccessibleSelection = ???

        /** Returns the currently selected menu if one is selected,
         *  otherwise null.
         */
        @stub
        def getAccessibleSelection(i: Int): Accessible = ???

        /** Returns 1 if a menu is currently selected in this menu bar. */
        @stub
        def getAccessibleSelectionCount(): Int = ???

        /** Get the accessible state set of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???

        /** Returns true if the current child of this object is selected. */
        @stub
        def isAccessibleChildSelected(i: Int): Boolean = ???

        /** Removes the nth selected item in the object from the object's
         *  selection.
         */
        @stub
        def removeAccessibleSelection(i: Int): Unit = ???

        /** Normally causes every selected item in the object to be selected
         *  if the object supports multiple selections.
         */
        @stub
        def selectAllAccessibleSelection(): Unit = ???
    }


    /** Appends the specified menu to the end of the menu bar. */
    @stub
    def add(c: JMenu): JMenu = ???

    /** Overrides JComponent.addNotify to register this
     *  menu bar with the current keyboard manager.
     */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this JMenuBar. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Implemented to be a MenuElement. */
    @stub
    def getComponent(): Component = ???

    /** Deprecated. 
     * replaced by getComponent(int i)
     * 
     */
    @stub
    def getComponentAtIndex(i: Int): Component = ???

    /** Returns the index of the specified component. */
    @stub
    def getComponentIndex(c: Component): Int = ???

    /** Gets the help menu for the menu bar. */
    @stub
    def getHelpMenu(): JMenu = ???

    /** Returns the margin between the menubar's border and
     *  its menus.
     */
    @stub
    def getMargin(): Insets = ???

    /** Returns the menu at the specified position in the menu bar. */
    @stub
    def getMenu(index: Int): JMenu = ???

    /** Returns the number of items in the menu bar. */
    @stub
    def getMenuCount(): Int = ???

    /** Returns the model object that handles single selections. */
    @stub
    def getSelectionModel(): SingleSelectionModel = ???

    /** Implemented to be a MenuElement -- returns the
     *  menus in this menu bar.
     */
    @stub
    def getSubElements(): Array[MenuElement] = ???

    /** Returns the menubar's current UI. */
    @stub
    def getUI(): MenuBarUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns true if the menu bars border should be painted. */
    @stub
    def isBorderPainted(): Boolean = ???

    /** Returns true if the menu bar currently has a component selected. */
    @stub
    def isSelected(): Boolean = ???

    /** Implemented to be a MenuElement -- does nothing. */
    @stub
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    /** Paints the menubar's border if BorderPainted
     *  property is true.
     */
    @stub
    protected def paintBorder(g: Graphics): Unit = ???

    /** Returns a string representation of this JMenuBar. */
    @stub
    protected def paramString(): String = ???

    /** Subclassed to check all the child menus. */
    @stub
    protected def processKeyBinding(ks: KeyStroke, e: KeyEvent, condition: Int, pressed: Boolean): Boolean = ???

    /** Implemented to be a MenuElement -- does nothing. */
    @stub
    def processKeyEvent(e: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    /** Implemented to be a MenuElement -- does nothing. */
    @stub
    def processMouseEvent(event: MouseEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    /** Overrides JComponent.removeNotify to unregister this
     *  menu bar with the current keyboard manager.
     */
    @stub
    def removeNotify(): Unit = ???

    /** Sets whether the border should be painted. */
    @stub
    def setBorderPainted(b: Boolean): Unit = ???

    /** Sets the help menu that appears when the user selects the
     *  "help" option in the menu bar.
     */
    @stub
    def setHelpMenu(menu: JMenu): Unit = ???

    /** Sets the margin between the menubar's border and
     *  its menus.
     */
    @stub
    def setMargin(m: Insets): Unit = ???

    /** Sets the currently selected component, producing a
     *  a change to the selection model.
     */
    @stub
    def setSelected(sel: Component): Unit = ???

    /** Sets the model object to handle single selections. */
    @stub
    def setSelectionModel(model: SingleSelectionModel): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: MenuBarUI): Unit = ???

    /** Resets the UI property with a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}
