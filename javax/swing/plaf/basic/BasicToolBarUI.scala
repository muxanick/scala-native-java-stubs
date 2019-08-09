package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics, Point}
import java.awt.event.{ContainerListener, FocusListener, WindowListener}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{AbstractButton, JComponent, JFrame, JToolBar, KeyStroke, RootPaneContainer, SwingConstants}
import javax.swing.border.Border
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, ToolBarUI}

// A Basic L&F implementation of ToolBarUI.  This implementation
// is a "combined" view/controller.
// 
class BasicToolBarUI extends ToolBarUI with SwingConstants {

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicToolBarUI.DockingListener: class = ???

    @stub
    // 
    protected def BasicToolBarUI.DragWindow: class = ???

    @stub
    // 
    protected def BasicToolBarUI.FrameListener: class = ???

    @stub
    // 
    protected def BasicToolBarUI.PropertyListener: class = ???

    @stub
    // 
    protected def BasicToolBarUI.ToolBarContListener: class = ???

    @stub
    // 
    protected def constraintBeforeFloating: String = ???

    @stub
    // 
    protected def dockingBorderColor: Color = ???

    @stub
    // 
    protected def dockingColor: Color = ???

    @stub
    // 
    protected def dockingListener: MouseInputListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def downKey: KeyStroke = ???

    @stub
    // 
    protected def dragWindow: BasicToolBarUI.DragWindow = ???

    @stub
    // 
    protected def floatingBorderColor: Color = ???

    @stub
    // 
    protected def floatingColor: Color = ???

    @stub
    // 
    protected def focusedCompIndex: Int = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def leftKey: KeyStroke = ???

    @stub
    // 
    protected def propertyListener: PropertyChangeListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def rightKey: KeyStroke = ???

    @stub
    // 
    protected def toolBar: JToolBar = ???

    @stub
    // 
    protected def toolBarContListener: ContainerListener = ???

    @stub
    // 
    protected def toolBarFocusListener: FocusListener = ???

    @stub
    // 
    def canDock(c: Component, p: Point): Boolean = ???

    @stub
    // 
    protected def createDockingListener(): MouseInputListener = ???

    @stub
    // 
    protected def createDragWindow(toolbar: JToolBar): BasicToolBarUI.DragWindow = ???

    @stub
    // No longer used, use BasicToolBarUI.createFloatingWindow(JToolBar)
    protected def createFloatingFrame(toolbar: JToolBar): JFrame = ???

    @stub
    // Creates a window which contains the toolbar after it has been
    // dragged out from its container
    protected def createFloatingWindow(toolbar: JToolBar): RootPaneContainer = ???

    @stub
    // 
    protected def createFrameListener(): WindowListener = ???

    @stub
    // Creates the non rollover border for toolbar components.
    protected def createNonRolloverBorder(): Border = ???

    @stub
    // 
    protected def createPropertyListener(): PropertyChangeListener = ???

    @stub
    // Creates a rollover border for toolbar components.
    protected def createRolloverBorder(): Border = ???

    @stub
    // 
    protected def createToolBarContListener(): ContainerListener = ???

    @stub
    // 
    protected def createToolBarFocusListener(): FocusListener = ???

    @stub
    // 
    protected def dragTo(position: Point, origin: Point): Unit = ???

    @stub
    // 
    protected def floatAt(position: Point, origin: Point): Unit = ???

    @stub
    // Gets the color displayed when over a docking area
    def getDockingColor(): Color = ???

    @stub
    // Gets the color displayed when over a floating area
    def getFloatingColor(): Color = ???

    @stub
    // Returns a non-rollover border for the button.
    protected def getNonRolloverBorder(b: AbstractButton): Border = ???

    @stub
    // Returns a rollover border for the button.
    protected def getRolloverBorder(b: AbstractButton): Border = ???

    @stub
    // 
    protected def installComponents(): Unit = ???

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
    // Installs non-rollover borders on all the child components of the JComponent.
    protected def installNonRolloverBorders(c: JComponent): Unit = ???

    @stub
    // Installs normal borders on all the child components of the JComponent.
    protected def installNormalBorders(c: JComponent): Unit = ???

    @stub
    // Installs rollover borders on all the child components of the JComponent.
    protected def installRolloverBorders(c: JComponent): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // 
    def isFloating(): Boolean = ???

    @stub
    // Returns a flag to determine whether rollover button borders
    // are enabled.
    def isRolloverBorders(): Boolean = ???

    @stub
    // 
    protected def navigateFocusedComp(direction: Int): Unit = ???

    @stub
    // Paints the contents of the window used for dragging.
    protected def paintDragWindow(g: Graphics): Unit = ???

    @stub
    // Sets the border of the component to have a non-rollover border which
    // was created by the createNonRolloverBorder() method.
    protected def setBorderToNonRollover(c: Component): Unit = ???

    @stub
    // Sets the border of the component to have a normal border.
    protected def setBorderToNormal(c: Component): Unit = ???

    @stub
    // Sets the border of the component to have a rollover border which
    // was created by the createRolloverBorder() method.
    protected def setBorderToRollover(c: Component): Unit = ???

    @stub
    // Sets the color displayed when over a docking area
    def setDockingColor(c: Color): Unit = ???

    @stub
    // 
    def setFloating(b: Boolean, p: Point): Unit = ???

    @stub
    // Sets the color displayed when over a floating area
    def setFloatingColor(c: Color): Unit = ???

    @stub
    // 
    def setFloatingLocation(x: Int, y: Int): Unit = ???

    @stub
    // 
    def setOrientation(orientation: Int): Unit = ???

    @stub
    // Sets the flag for enabling rollover borders on the toolbar and it will
    // also install the appropriate border depending on the state of the flag.
    def setRolloverBorders(rollover: Boolean): Unit = ???

    @stub
    // 
    protected def uninstallComponents(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicToolBarUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
