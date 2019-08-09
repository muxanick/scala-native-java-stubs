package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ViewportUI}
import scala.scalanative.annotation.stub

/** BasicViewport implementation */
class BasicViewportUI extends ViewportUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected def installDefaults(c: JComponent): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(c: JComponent): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicViewportUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
