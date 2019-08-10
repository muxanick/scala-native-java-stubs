package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics, Point}
import java.awt.event.{ContainerListener, FocusListener, WindowListener}
import java.beans.PropertyChangeListener
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

    /** This class should be treated as a "protected" inner class. */
    type DockingListener = BasicToolBarUI_DockingListener

    /**  */
    protected type DragWindow = BasicToolBarUI_DragWindow

    /**  */
    protected type FrameListener = BasicToolBarUI_FrameListener

    /**  */
    protected type PropertyListener = BasicToolBarUI_PropertyListener

    /**  */
    protected type ToolBarContListener = BasicToolBarUI_ToolBarContListener

    /**  */
    protected type ToolBarFocusListener = BasicToolBarUI_ToolBarFocusListener

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
