package javax.swing.plaf.basic

import java.awt.{Dimension, Insets}
import java.lang.Object
import javax.swing.{JComponent, JInternalFrame, JInternalFrame.JDesktopIcon}
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, DesktopIconUI}

// Basic L&F for a minimized window on a desktop.
class BasicDesktopIconUI extends DesktopIconUI {

    @stub
    // 
    protected def desktopIcon: JInternalFrame.JDesktopIcon = ???

    @stub
    // 
    protected def frame: JInternalFrame = ???

    @stub
    // 
    protected def createMouseInputListener(): MouseInputListener = ???

    @stub
    // 
    def deiconize(): Unit = ???

    @stub
    // 
    def getInsets(c: JComponent): Insets = ???

    @stub
    // Desktop icons can not be resized.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def installComponents(): Unit = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // 
    protected def uninstallComponents(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicDesktopIconUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
