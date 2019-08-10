package javax.swing.plaf.basic

import java.awt.{Color, Component, Container, Graphics, Insets, Point, Window}
import java.awt.event.{ContainerEvent, ContainerListener, FocusEvent, FocusListener, MouseEvent, WindowAdapter, WindowEvent, WindowListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{AbstractButton, JComponent, JFrame, JToolBar, KeyStroke, RootPaneContainer, SwingConstants}
import javax.swing.border.Border
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, ToolBarUI}
import scala.scalanative.annotation.stub

/** A Basic L&F implementation of ToolBarUI.  This implementation
 *  is a "combined" view/controller.
 *  
 */
class BasicToolBarUI extends ToolBarUI with SwingConstants {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicToolBarUI.
     */
    class DockingListener extends Object with MouseInputListener {

        /**  */
        @stub
        def this(t: JToolBar) = ???

        /**  */
        @stub
        protected val isDragging: Boolean = ???

        /**  */
        @stub
        protected val origin: Point = ???

        /**  */
        @stub
        protected val toolBar: JToolBar = ???

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


    /**  */
    protected class DragWindow extends Window {

        /**  */
        @stub
        def getBorderColor(): Color = ???

        /** Determines the insets of this container, which indicate the size
         *  of the container's border.
         */
        @stub
        def getInsets(): Insets = ???

        /**  */
        @stub
        def getOffset(): Point = ???

        /** Returns the orientation of the toolbar window when the toolbar is
         *  floating.
         */
        @stub
        def getOrientation(): Int = ???

        /** Paints the container. */
        @stub
        def paint(g: Graphics): Unit = ???

        /**  */
        @stub
        def setBorderColor(c: Color): Unit = ???

        /**  */
        @stub
        def setOffset(p: Point): Unit = ???

        /**  */
        @stub
        def setOrientation(o: Int): Unit = ???
    }


    /**  */
    protected class FrameListener extends WindowAdapter {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when a window is in the process of being closed. */
        @stub
        def windowClosing(w: WindowEvent): Unit = ???
    }


    /**  */
    protected class PropertyListener extends Object with PropertyChangeListener {

        /**  */
        @stub
        protected def this() = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???
    }


    /**  */
    protected class ToolBarContListener extends Object with ContainerListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when a component has been added to the container. */
        @stub
        def componentAdded(e: ContainerEvent): Unit = ???

        /** Invoked when a component has been removed from the container. */
        @stub
        def componentRemoved(e: ContainerEvent): Unit = ???
    }


    /**  */
    protected class ToolBarFocusListener extends Object with FocusListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when a component gains the keyboard focus. */
        @stub
        def focusGained(e: FocusEvent): Unit = ???

        /** Invoked when a component loses the keyboard focus. */
        @stub
        def focusLost(e: FocusEvent): Unit = ???
    }


    /**  */
    @stub
    protected val constraintBeforeFloating: String = ???

    /**  */
    @stub
    protected val dockingBorderColor: Color = ???

    /**  */
    @stub
    protected val dockingColor: Color = ???

    /**  */
    @stub
    protected val dockingListener: MouseInputListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val downKey: KeyStroke = ???

    /**  */
    @stub
    protected val dragWindow: BasicToolBarUI.DragWindow = ???

    /**  */
    @stub
    protected val floatingBorderColor: Color = ???

    /**  */
    @stub
    protected val floatingColor: Color = ???

    /**  */
    @stub
    protected val focusedCompIndex: Int = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val leftKey: KeyStroke = ???

    /**  */
    @stub
    protected val propertyListener: PropertyChangeListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val rightKey: KeyStroke = ???

    /**  */
    @stub
    protected val toolBar: JToolBar = ???

    /**  */
    @stub
    protected val toolBarContListener: ContainerListener = ???

    /**  */
    @stub
    protected val toolBarFocusListener: FocusListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val upKey: KeyStroke = ???

    /**  */
    @stub
    def canDock(c: Component, p: Point): Boolean = ???

    /**  */
    @stub
    protected def createDockingListener(): MouseInputListener = ???

    /**  */
    @stub
    protected def createDragWindow(toolbar: JToolBar): BasicToolBarUI.DragWindow = ???

    /** No longer used, use BasicToolBarUI.createFloatingWindow(JToolBar) */
    @stub
    protected def createFloatingFrame(toolbar: JToolBar): JFrame = ???

    /** Creates a window which contains the toolbar after it has been
     *  dragged out from its container
     */
    @stub
    protected def createFloatingWindow(toolbar: JToolBar): RootPaneContainer = ???

    /**  */
    @stub
    protected def createFrameListener(): WindowListener = ???

    /** Creates the non rollover border for toolbar components. */
    @stub
    protected def createNonRolloverBorder(): Border = ???

    /**  */
    @stub
    protected def createPropertyListener(): PropertyChangeListener = ???

    /** Creates a rollover border for toolbar components. */
    @stub
    protected def createRolloverBorder(): Border = ???

    /**  */
    @stub
    protected def createToolBarContListener(): ContainerListener = ???

    /**  */
    @stub
    protected def createToolBarFocusListener(): FocusListener = ???

    /**  */
    @stub
    protected def dragTo(position: Point, origin: Point): Unit = ???

    /**  */
    @stub
    protected def floatAt(position: Point, origin: Point): Unit = ???

    /** Gets the color displayed when over a docking area */
    @stub
    def getDockingColor(): Color = ???

    /** Gets the color displayed when over a floating area */
    @stub
    def getFloatingColor(): Color = ???

    /** Returns a non-rollover border for the button. */
    @stub
    protected def getNonRolloverBorder(b: AbstractButton): Border = ???

    /** Returns a rollover border for the button. */
    @stub
    protected def getRolloverBorder(b: AbstractButton): Border = ???

    /**  */
    @stub
    protected def installComponents(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Installs non-rollover borders on all the child components of the JComponent. */
    @stub
    protected def installNonRolloverBorders(c: JComponent): Unit = ???

    /** Installs normal borders on all the child components of the JComponent. */
    @stub
    protected def installNormalBorders(c: JComponent): Unit = ???

    /** Installs rollover borders on all the child components of the JComponent. */
    @stub
    protected def installRolloverBorders(c: JComponent): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    def isFloating(): Boolean = ???

    /** Returns a flag to determine whether rollover button borders
     *  are enabled.
     */
    @stub
    def isRolloverBorders(): Boolean = ???

    /**  */
    @stub
    protected def navigateFocusedComp(direction: Int): Unit = ???

    /** Paints the contents of the window used for dragging. */
    @stub
    protected def paintDragWindow(g: Graphics): Unit = ???

    /** Sets the border of the component to have a non-rollover border which
     *  was created by the createNonRolloverBorder() method.
     */
    @stub
    protected def setBorderToNonRollover(c: Component): Unit = ???

    /** Sets the border of the component to have a normal border. */
    @stub
    protected def setBorderToNormal(c: Component): Unit = ???

    /** Sets the border of the component to have a rollover border which
     *  was created by the createRolloverBorder() method.
     */
    @stub
    protected def setBorderToRollover(c: Component): Unit = ???

    /** Sets the color displayed when over a docking area */
    @stub
    def setDockingColor(c: Color): Unit = ???

    /**  */
    @stub
    def setFloating(b: Boolean, p: Point): Unit = ???

    /** Sets the color displayed when over a floating area */
    @stub
    def setFloatingColor(c: Color): Unit = ???

    /**  */
    @stub
    def setFloatingLocation(x: Int, y: Int): Unit = ???

    /**  */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Sets the flag for enabling rollover borders on the toolbar and it will
     *  also install the appropriate border depending on the state of the flag.
     */
    @stub
    def setRolloverBorders(rollover: Boolean): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(): Unit = ???

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
}

object BasicToolBarUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
