package javax.swing.plaf.metal

import java.awt.Dimension
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, DesktopIconUI}
import javax.swing.plaf.basic.BasicDesktopIconUI

/** Metal desktop icon. */
class MetalDesktopIconUI extends BasicDesktopIconUI {

    /** Desktop icons can not be resized. */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def installComponents(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(): Unit = ???
}

object MetalDesktopIconUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
