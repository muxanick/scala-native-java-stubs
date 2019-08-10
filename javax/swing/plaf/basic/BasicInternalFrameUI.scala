package javax.swing.plaf.basic

import java.awt.{Dimension, LayoutManager}
import java.awt.event.ComponentListener
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{DesktopManager, JComponent, JInternalFrame, KeyStroke}
import javax.swing.event.{MouseInputAdapter, MouseInputListener}
import javax.swing.plaf.{ComponentUI, InternalFrameUI}
import scala.scalanative.annotation.stub

/** A basic L&F implementation of JInternalFrame. */
class BasicInternalFrameUI extends InternalFrameUI {

    /**  */
    @stub
    def this(b: JInternalFrame) = ???

    /**  */
    protected type BasicInternalFrameListener = BasicInternalFrameUI_BasicInternalFrameListener

    /** Listens for border adjustments. */
    protected type BorderListener = BasicInternalFrameUI_BorderListener

    /**  */
    protected type ComponentHandler = BasicInternalFrameUI_ComponentHandler

    /**  */
    protected type GlassPaneDispatcher = BasicInternalFrameUI_GlassPaneDispatcher

    /**  */
    type InternalFrameLayout = BasicInternalFrameUI_InternalFrameLayout

    /**  */
    type InternalFramePropertyChangeListener = BasicInternalFrameUI_InternalFramePropertyChangeListener

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
