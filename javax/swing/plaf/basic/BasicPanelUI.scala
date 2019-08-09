package javax.swing.plaf.basic

import java.awt.Component.BaselineResizeBehavior
import java.lang.Object
import javax.swing.{JComponent, JPanel}
import javax.swing.plaf.{ComponentUI, PanelUI}
import scala.scalanative.annotation.stub

/** BasicPanel implementation */
class BasicPanelUI extends PanelUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /**  */
    @stub
    protected def installDefaults(p: JPanel): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(p: JPanel): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicPanelUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
