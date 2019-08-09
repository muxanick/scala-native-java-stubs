package javax.swing.plaf.basic

import java.awt.{Color, Dimension, Font, Graphics, Rectangle}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JMenuItem, MenuElement, MenuSelectionManager}
import javax.swing.event.{MenuDragMouseListener, MenuKeyListener, MouseInputListener}
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}

// BasicMenuItem implementation
class BasicMenuItemUI extends MenuItemUI {

    @stub
    // Accelerator delimiter string, such as '+' in 'Ctrl+C'.
    protected def acceleratorDelimiter: String = ???

    @stub
    // 
    protected def acceleratorFont: Font = ???

    @stub
    // 
    protected def acceleratorForeground: Color = ???

    @stub
    // 
    protected def acceleratorSelectionForeground: Color = ???

    @stub
    // 
    protected def arrowIcon: Icon = ???

    @stub
    // 
    protected def checkIcon: Icon = ???

    @stub
    // 
    protected def defaultTextIconGap: Int = ???

    @stub
    // 
    protected def disabledForeground: Color = ???

    @stub
    // 
    protected def menuDragMouseListener: MenuDragMouseListener = ???

    @stub
    // 
    protected def menuItem: JMenuItem = ???

    @stub
    // 
    protected def menuKeyListener: MenuKeyListener = ???

    @stub
    // 
    protected def mouseInputListener: MouseInputListener = ???

    @stub
    // 
    protected def oldBorderPainted: Boolean = ???

    @stub
    // PropertyChangeListener returned from
    // createPropertyChangeListener.
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def selectionBackground: Color = ???

    @stub
    // 
    protected def createMenuDragMouseListener(c: JComponent): MenuDragMouseListener = ???

    @stub
    // 
    protected def createMenuKeyListener(c: JComponent): MenuKeyListener = ???

    @stub
    // 
    protected def createMouseInputListener(c: JComponent): MouseInputListener = ???

    @stub
    // Creates a PropertyChangeListener which will be added to
    // the menu item.
    protected def createPropertyChangeListener(c: JComponent): PropertyChangeListener = ???

    @stub
    // Call this method when a menu item is to be activated.
    protected def doClick(msm: MenuSelectionManager): Unit = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // 
    def getPath(): Array[MenuElement] = ???

    @stub
    // 
    protected def getPreferredMenuItemSize(c: JComponent, checkIcon: Icon, arrowIcon: Icon, defaultTextIconGap: Int): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def getPropertyPrefix(): String = ???

    @stub
    // 
    protected def installComponents(menuItem: JMenuItem): Unit = ???

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
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Draws the background of the menu item.
    protected def paintBackground(g: Graphics, menuItem: JMenuItem, bgColor: Color): Unit = ???

    @stub
    // 
    protected def paintMenuItem(g: Graphics, c: JComponent, checkIcon: Icon, arrowIcon: Icon, background: Color, foreground: Color, defaultTextIconGap: Int): Unit = ???

    @stub
    // Renders the text of the current menu item.
    protected def paintText(g: Graphics, menuItem: JMenuItem, textRect: Rectangle, text: String): Unit = ???

    @stub
    // 
    protected def uninstallComponents(menuItem: JMenuItem): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicMenuItemUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
