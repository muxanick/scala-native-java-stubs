package javax.swing.plaf.basic

import java.awt.{Color, Dimension, Font, Graphics, Rectangle}
import java.awt.event.MouseEvent
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JMenuItem, MenuElement, MenuSelectionManager}
import javax.swing.event.{MenuDragMouseListener, MenuKeyListener, MouseInputListener}
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}
import scala.scalanative.annotation.stub

/** BasicMenuItem implementation */
class BasicMenuItemUI extends MenuItemUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    protected class MouseInputHandler extends Object with MouseInputListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when the mouse button has been clicked (pressed
         *  and released) on a component.
         */
        @stub
        def mouseClicked(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse enters a component. */
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

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /** Accelerator delimiter string, such as '+' in 'Ctrl+C'. */
    @stub
    protected val acceleratorDelimiter: String = ???

    /**  */
    @stub
    protected val acceleratorFont: Font = ???

    /**  */
    @stub
    protected val acceleratorForeground: Color = ???

    /**  */
    @stub
    protected val acceleratorSelectionForeground: Color = ???

    /**  */
    @stub
    protected val arrowIcon: Icon = ???

    /**  */
    @stub
    protected val checkIcon: Icon = ???

    /**  */
    @stub
    protected val defaultTextIconGap: Int = ???

    /**  */
    @stub
    protected val disabledForeground: Color = ???

    /**  */
    @stub
    protected val menuDragMouseListener: MenuDragMouseListener = ???

    /**  */
    @stub
    protected val menuItem: JMenuItem = ???

    /**  */
    @stub
    protected val menuKeyListener: MenuKeyListener = ???

    /**  */
    @stub
    protected val mouseInputListener: MouseInputListener = ???

    /**  */
    @stub
    protected val oldBorderPainted: Boolean = ???

    /** PropertyChangeListener returned from
     *  createPropertyChangeListener.
     */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val selectionBackground: Color = ???

    /**  */
    @stub
    protected val selectionForeground: Color = ???

    /**  */
    @stub
    protected def createMenuDragMouseListener(c: JComponent): MenuDragMouseListener = ???

    /**  */
    @stub
    protected def createMenuKeyListener(c: JComponent): MenuKeyListener = ???

    /**  */
    @stub
    protected def createMouseInputListener(c: JComponent): MouseInputListener = ???

    /** Creates a PropertyChangeListener which will be added to
     *  the menu item.
     */
    @stub
    protected def createPropertyChangeListener(c: JComponent): PropertyChangeListener = ???

    /** Call this method when a menu item is to be activated. */
    @stub
    protected def doClick(msm: MenuSelectionManager): Unit = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    def getPath(): Array[MenuElement] = ???

    /**  */
    @stub
    protected def getPreferredMenuItemSize(c: JComponent, checkIcon: Icon, arrowIcon: Icon, defaultTextIconGap: Int): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /**  */
    @stub
    protected def installComponents(menuItem: JMenuItem): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Draws the background of the menu item. */
    @stub
    protected def paintBackground(g: Graphics, menuItem: JMenuItem, bgColor: Color): Unit = ???

    /**  */
    @stub
    protected def paintMenuItem(g: Graphics, c: JComponent, checkIcon: Icon, arrowIcon: Icon, background: Color, foreground: Color, defaultTextIconGap: Int): Unit = ???

    /** Renders the text of the current menu item. */
    @stub
    protected def paintText(g: Graphics, menuItem: JMenuItem, textRect: Rectangle, text: String): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(menuItem: JMenuItem): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /** We draw the background in paintMenuItem()
     *  so override update (which fills the background of opaque
     *  components by default) to just call paint().
     */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object BasicMenuItemUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
