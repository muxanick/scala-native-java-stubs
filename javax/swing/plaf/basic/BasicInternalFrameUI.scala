package javax.swing.plaf.basic

import java.awt.{Dimension, LayoutManager}
import java.awt.event.ComponentListener
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{DesktopManager, JComponent, JInternalFrame, KeyStroke}
import javax.swing.event.{MouseInputAdapter, MouseInputListener}
import javax.swing.plaf.{ComponentUI, InternalFrameUI}

// A basic L&F implementation of JInternalFrame.
class BasicInternalFrameUI extends InternalFrameUI {

    @stub
    // 
    protected def BasicInternalFrameUI.BasicInternalFrameListener: class = ???

    @stub
    // Listens for border adjustments.
    protected def BasicInternalFrameUI.BorderListener: class = ???

    @stub
    // 
    protected def BasicInternalFrameUI.ComponentHandler: class = ???

    @stub
    // 
    protected def BasicInternalFrameUI.GlassPaneDispatcher: class = ???

    @stub
    // 
    def BasicInternalFrameUI.InternalFrameLayout: class = ???

    @stub
    // 
    protected def borderListener: MouseInputAdapter = ???

    @stub
    // 
    protected def componentListener: ComponentListener = ???

    @stub
    // 
    protected def eastPane: JComponent = ???

    @stub
    // 
    protected def frame: JInternalFrame = ???

    @stub
    // 
    protected def glassPaneDispatcher: MouseInputListener = ???

    @stub
    // 
    protected def internalFrameLayout: LayoutManager = ???

    @stub
    // 
    protected def northPane: JComponent = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.3.
    //
    protected def openMenuKey: KeyStroke = ???

    @stub
    // 
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def southPane: JComponent = ???

    @stub
    // 
    protected def titlePane: BasicInternalFrameTitlePane = ???

    @stub
    // This method is called when the frame becomes selected.
    protected def activateFrame(f: JInternalFrame): Unit = ???

    @stub
    // This method is called when the user wants to close the frame.
    protected def closeFrame(f: JInternalFrame): Unit = ???

    @stub
    // 
    protected def createBorderListener(w: JInternalFrame): MouseInputAdapter = ???

    @stub
    // 
    protected def createComponentListener(): ComponentListener = ???

    @stub
    // 
    protected def createDesktopManager(): DesktopManager = ???

    @stub
    // 
    protected def createEastPane(w: JInternalFrame): JComponent = ???

    @stub
    // 
    protected def createGlassPaneDispatcher(): MouseInputListener = ???

    @stub
    // 
    protected def createInternalFrameListener(): Unit = ???

    @stub
    // 
    protected def createLayoutManager(): LayoutManager = ???

    @stub
    // 
    protected def createNorthPane(w: JInternalFrame): JComponent = ???

    @stub
    // 
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // 
    protected def createSouthPane(w: JInternalFrame): JComponent = ???

    @stub
    // 
    protected def createWestPane(w: JInternalFrame): JComponent = ???

    @stub
    // This method is called when the frame is no longer selected.
    protected def deactivateFrame(f: JInternalFrame): Unit = ???

    @stub
    // This method is called when the user wants to deiconify the frame.
    protected def deiconifyFrame(f: JInternalFrame): Unit = ???

    @stub
    // 
    protected def deinstallMouseHandlers(c: JComponent): Unit = ???

    @stub
    // Returns the proper DesktopManager.
    protected def getDesktopManager(): DesktopManager = ???

    @stub
    // 
    def getEastPane(): JComponent = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(x: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(x: JComponent): Dimension = ???

    @stub
    // 
    def getNorthPane(): JComponent = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(x: JComponent): Dimension = ???

    @stub
    // 
    def getSouthPane(): JComponent = ???

    @stub
    // 
    def getWestPane(): JComponent = ???

    @stub
    // This method is called when the user wants to iconify the frame.
    protected def iconifyFrame(f: JInternalFrame): Unit = ???

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
    // 
    protected def installMouseHandlers(c: JComponent): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // 
    def isKeyBindingActive(): Boolean = ???

    @stub
    // 
    protected def isKeyBindingRegistered(): Boolean = ???

    @stub
    // This method is called when the user wants to maximize the frame.
    protected def maximizeFrame(f: JInternalFrame): Unit = ???

    @stub
    // This method is called when the user wants to minimize the frame.
    protected def minimizeFrame(f: JInternalFrame): Unit = ???

    @stub
    // Installs necessary mouse handlers on newPane
    // and adds it to the frame.
    protected def replacePane(currentPane: JComponent, newPane: JComponent): Unit = ???

    @stub
    // 
    def setEastPane(c: JComponent): Unit = ???

    @stub
    // 
    protected def setKeyBindingActive(b: Boolean): Unit = ???

    @stub
    // 
    protected def setKeyBindingRegistered(b: Boolean): Unit = ???

    @stub
    // 
    def setNorthPane(c: JComponent): Unit = ???

    @stub
    // 
    def setSouthPane(c: JComponent): Unit = ???

    @stub
    // 
    protected def setupMenuCloseKey(): Unit = ???

    @stub
    // 
    protected def setupMenuOpenKey(): Unit = ???

    @stub
    // 
    def setWestPane(c: JComponent): Unit = ???

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

object BasicInternalFrameUI {
    @stub
    // 
    def createUI(b: JComponent): ComponentUI = ???
}
