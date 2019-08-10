package javax.swing.plaf.basic

import java.awt.{Component, Dimension}
import java.awt.event.MouseEvent
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{JComponent, JMenu}
import javax.swing.event.{ChangeEvent, ChangeListener, MenuDragMouseListener, MenuKeyListener, MenuListener, MouseInputListener}
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}
import scala.scalanative.annotation.stub

/** A default L&F implementation of MenuUI.  This implementation
 *  is a "combined" view/controller.
 */
class BasicMenuUI extends BasicMenuItemUI {

    /**  */
    @stub
    def this() = ???

    /** As of Java 2 platform 1.4, this previously undocumented class
     *  is now obsolete. KeyBindings are now managed by the popup menu.
     */
    class ChangeHandler extends Object with ChangeListener {

        /**  */
        @stub
        def this(m: JMenu, ui: BasicMenuUI) = ???

        /**  */
        @stub
        val isSelected: Boolean = ???

        /**  */
        @stub
        val menu: JMenu = ???

        /**  */
        @stub
        val ui: BasicMenuUI = ???

        /**  */
        @stub
        val wasFocused: Component = ???

        /** Invoked when the target of the listener has changed its state. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


    /** Instantiated and used by a menu item to handle the current menu selection
     *  from mouse events. A MouseInputHandler processes and forwards all mouse events
     *  to a shared instance of the MenuSelectionManager.
     *  
     *  This class is protected so that it can be subclassed by other look and
     *  feels to implement their own mouse handling behavior. All overridden
     *  methods should call the parent methods so that the menu selection
     *  is correct.
     */
    protected class MouseInputHandler extends Object with MouseInputListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when the mouse button has been clicked (pressed
         *  and released) on a component.
         */
        @stub
        def mouseClicked(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button is pressed on the menu and then dragged. */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the cursor enters the menu. */
        @stub
        def mouseEntered(e: MouseEvent): Unit = ???

        /** Invoked when the mouse exits a component. */
        @stub
        def mouseExited(e: MouseEvent): Unit = ???

        /** Invoked when the mouse cursor has been moved onto a component
         *  but no buttons have been pushed.
         */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???

        /** Invoked when the mouse has been clicked on the menu. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when the mouse has been released on the menu. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /**  */
    @stub
    protected val changeListener: ChangeListener = ???

    /**  */
    @stub
    protected val menuListener: MenuListener = ???

    /**  */
    @stub
    protected def createChangeListener(c: JComponent): ChangeListener = ???

    /**  */
    @stub
    protected def createMenuDragMouseListener(c: JComponent): MenuDragMouseListener = ???

    /**  */
    @stub
    protected def createMenuKeyListener(c: JComponent): MenuKeyListener = ???

    /**  */
    @stub
    protected def createMenuListener(c: JComponent): MenuListener = ???

    /**  */
    @stub
    protected def createMouseInputListener(c: JComponent): MouseInputListener = ???

    /** Creates a PropertyChangeListener which will be added to
     *  the menu item.
     */
    @stub
    protected def createPropertyChangeListener(c: JComponent): PropertyChangeListener = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /**  */
    @stub
    protected def setupPostTimer(menu: JMenu): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object BasicMenuUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
