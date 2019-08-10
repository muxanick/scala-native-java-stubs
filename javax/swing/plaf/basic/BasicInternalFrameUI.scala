package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.awt.event.{ComponentEvent, ComponentListener, MouseAdapter, MouseEvent}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{DesktopManager, JComponent, JInternalFrame, KeyStroke, SwingConstants}
import javax.swing.event.{InternalFrameEvent, InternalFrameListener, MouseInputAdapter, MouseInputListener}
import javax.swing.plaf.{ComponentUI, InternalFrameUI}
import scala.scalanative.annotation.stub

/** A basic L&F implementation of JInternalFrame. */
class BasicInternalFrameUI extends InternalFrameUI {

    /**  */
    @stub
    def this(b: JInternalFrame) = ???

    /**  */
    protected class BasicInternalFrameListener extends Object with InternalFrameListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an internal frame is activated. */
        @stub
        def internalFrameActivated(e: InternalFrameEvent): Unit = ???

        /** Invoked when an internal frame has been closed. */
        @stub
        def internalFrameClosed(e: InternalFrameEvent): Unit = ???

        /** Invoked when an internal frame is in the process of being closed. */
        @stub
        def internalFrameClosing(e: InternalFrameEvent): Unit = ???

        /** Invoked when an internal frame is de-activated. */
        @stub
        def internalFrameDeactivated(e: InternalFrameEvent): Unit = ???

        /** Invoked when an internal frame is de-iconified. */
        @stub
        def internalFrameDeiconified(e: InternalFrameEvent): Unit = ???

        /** Invoked when an internal frame is iconified. */
        @stub
        def internalFrameIconified(e: InternalFrameEvent): Unit = ???

        /** Invoked when a internal frame has been opened. */
        @stub
        def internalFrameOpened(e: InternalFrameEvent): Unit = ???
    }


    /** Listens for border adjustments. */
    protected class BorderListener extends MouseInputAdapter with SwingConstants {

        /**  */
        @stub
        protected def this() = ???

        /**  */
        @stub
        protected val RESIZE_NONE: Int = ???

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
    protected class ComponentHandler extends Object with ComponentListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when the component has been made invisible. */
        @stub
        def componentHidden(e: ComponentEvent): Unit = ???

        /** Invoked when the component's position changes. */
        @stub
        def componentMoved(e: ComponentEvent): Unit = ???

        /** Invoked when a JInternalFrame's parent's size changes. */
        @stub
        def componentResized(e: ComponentEvent): Unit = ???

        /** Invoked when the component has been made visible. */
        @stub
        def componentShown(e: ComponentEvent): Unit = ???
    }


    /**  */
    protected class GlassPaneDispatcher extends Object with MouseInputListener {

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


    /**  */
    class InternalFrameLayout extends Object with LayoutManager {

        /**  */
        @stub
        def this() = ???

        /** If the layout manager uses a per-component string,
         *  adds the component comp to the layout,
         *  associating it
         *  with the string specified by name.
         */
        @stub
        def addLayoutComponent(name: String, c: Component): Unit = ???

        /** Lays out the specified container. */
        @stub
        def layoutContainer(c: Container): Unit = ???

        /** Calculates the minimum size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def minimumLayoutSize(c: Container): Dimension = ???

        /** Calculates the preferred size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def preferredLayoutSize(c: Container): Dimension = ???

        /** Removes the specified component from the layout. */
        @stub
        def removeLayoutComponent(c: Component): Unit = ???
    }


    /**  */
    class InternalFramePropertyChangeListener extends Object with PropertyChangeListener {

        /**  */
        @stub
        def this() = ???

        /** Detects changes in state from the JInternalFrame and handles
         *  actions.
         */
        @stub
        def propertyChange(evt: PropertyChangeEvent): Unit = ???
    }


    /**  */
    @stub
    protected val borderListener: MouseInputAdapter = ???

    /**  */
    @stub
    protected val componentListener: ComponentListener = ???

    /**  */
    @stub
    protected val eastPane: JComponent = ???

    /**  */
    @stub
    protected val frame: JInternalFrame = ???

    /**  */
    @stub
    protected val glassPaneDispatcher: MouseInputListener = ???

    /**  */
    @stub
    protected val internalFrameLayout: LayoutManager = ???

    /**  */
    @stub
    protected val northPane: JComponent = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3.
     * 
     */
    @stub
    protected val openMenuKey: KeyStroke = ???

    /**  */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val southPane: JComponent = ???

    /**  */
    @stub
    protected val titlePane: BasicInternalFrameTitlePane = ???

    /**  */
    @stub
    protected val westPane: JComponent = ???

    /** This method is called when the frame becomes selected. */
    @stub
    protected def activateFrame(f: JInternalFrame): Unit = ???

    /** This method is called when the user wants to close the frame. */
    @stub
    protected def closeFrame(f: JInternalFrame): Unit = ???

    /**  */
    @stub
    protected def createBorderListener(w: JInternalFrame): MouseInputAdapter = ???

    /**  */
    @stub
    protected def createComponentListener(): ComponentListener = ???

    /**  */
    @stub
    protected def createDesktopManager(): DesktopManager = ???

    /**  */
    @stub
    protected def createEastPane(w: JInternalFrame): JComponent = ???

    /**  */
    @stub
    protected def createGlassPaneDispatcher(): MouseInputListener = ???

    /**  */
    @stub
    protected def createInternalFrameListener(): Unit = ???

    /**  */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /**  */
    @stub
    protected def createNorthPane(w: JInternalFrame): JComponent = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def createSouthPane(w: JInternalFrame): JComponent = ???

    /**  */
    @stub
    protected def createWestPane(w: JInternalFrame): JComponent = ???

    /** This method is called when the frame is no longer selected. */
    @stub
    protected def deactivateFrame(f: JInternalFrame): Unit = ???

    /** This method is called when the user wants to deiconify the frame. */
    @stub
    protected def deiconifyFrame(f: JInternalFrame): Unit = ???

    /**  */
    @stub
    protected def deinstallMouseHandlers(c: JComponent): Unit = ???

    /** Returns the proper DesktopManager. */
    @stub
    protected def getDesktopManager(): DesktopManager = ???

    /**  */
    @stub
    def getEastPane(): JComponent = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(x: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(x: JComponent): Dimension = ???

    /**  */
    @stub
    def getNorthPane(): JComponent = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(x: JComponent): Dimension = ???

    /**  */
    @stub
    def getSouthPane(): JComponent = ???

    /**  */
    @stub
    def getWestPane(): JComponent = ???

    /** This method is called when the user wants to iconify the frame. */
    @stub
    protected def iconifyFrame(f: JInternalFrame): Unit = ???

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

    /**  */
    @stub
    protected def installMouseHandlers(c: JComponent): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    def isKeyBindingActive(): Boolean = ???

    /**  */
    @stub
    protected def isKeyBindingRegistered(): Boolean = ???

    /** This method is called when the user wants to maximize the frame. */
    @stub
    protected def maximizeFrame(f: JInternalFrame): Unit = ???

    /** This method is called when the user wants to minimize the frame. */
    @stub
    protected def minimizeFrame(f: JInternalFrame): Unit = ???

    /** Installs necessary mouse handlers on newPane
     *  and adds it to the frame.
     */
    @stub
    protected def replacePane(currentPane: JComponent, newPane: JComponent): Unit = ???

    /**  */
    @stub
    def setEastPane(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def setKeyBindingActive(b: Boolean): Unit = ???

    /**  */
    @stub
    protected def setKeyBindingRegistered(b: Boolean): Unit = ???

    /**  */
    @stub
    def setNorthPane(c: JComponent): Unit = ???

    /**  */
    @stub
    def setSouthPane(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def setupMenuCloseKey(): Unit = ???

    /**  */
    @stub
    protected def setupMenuOpenKey(): Unit = ???

    /**  */
    @stub
    def setWestPane(c: JComponent): Unit = ???

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

object BasicInternalFrameUI {
    /**  */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
