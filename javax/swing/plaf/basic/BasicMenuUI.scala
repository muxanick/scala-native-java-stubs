package javax.swing.plaf.basic

import java.awt.Dimension
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{JComponent, JMenu}
import javax.swing.event.{ChangeListener, MenuDragMouseListener, MenuKeyListener, MenuListener, MouseInputListener}
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
     *  is now obsolete.
     */
    @stub
    object ChangeHandler extends BasicMenuUI.ChangeHandler

    /** Instantiated and used by a menu item to handle the current menu selection
     *  from mouse events.
     */
    @stub
    protected object MouseInputHandler extends BasicMenuUI.MouseInputHandler

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
