package javax.swing.plaf.metal

import java.awt.Dimension
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, DesktopIconUI}
import javax.swing.plaf.basic.BasicDesktopIconUI

// Metal desktop icon.
class MetalDesktopIconUI extends BasicDesktopIconUI {

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
    // 
    protected def uninstallComponents(): Unit = ???
}

object MetalDesktopIconUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
