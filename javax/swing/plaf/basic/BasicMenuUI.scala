package javax.swing.plaf.basic

import java.awt.Dimension
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{JComponent, JMenu}
import javax.swing.event.{ChangeListener, MenuDragMouseListener, MenuKeyListener, MenuListener, MouseInputListener}
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}

// A default L&F implementation of MenuUI.  This implementation
// is a "combined" view/controller.
class BasicMenuUI extends BasicMenuItemUI {

    @stub
    // As of Java 2 platform 1.4, this previously undocumented class
    // is now obsolete.
    def BasicMenuUI.ChangeHandler: class = ???

    @stub
    // 
    protected def changeListener: ChangeListener = ???

    @stub
    // 
    protected def createChangeListener(c: JComponent): ChangeListener = ???

    @stub
    // 
    protected def createMenuDragMouseListener(c: JComponent): MenuDragMouseListener = ???

    @stub
    // 
    protected def createMenuKeyListener(c: JComponent): MenuKeyListener = ???

    @stub
    // 
    protected def createMenuListener(c: JComponent): MenuListener = ???

    @stub
    // 
    protected def createMouseInputListener(c: JComponent): MouseInputListener = ???

    @stub
    // Creates a PropertyChangeListener which will be added to
    // the menu item.
    protected def createPropertyChangeListener(c: JComponent): PropertyChangeListener = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def getPropertyPrefix(): String = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // 
    protected def setupPostTimer(menu: JMenu): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???
}

object BasicMenuUI {
    @stub
    // 
    def createUI(x: JComponent): ComponentUI = ???
}
