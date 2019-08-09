package javax.swing.plaf.basic

import java.awt.Dimension
import java.awt.event.ContainerListener
import java.lang.Object
import javax.swing.{JComponent, JMenuBar}
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, MenuBarUI}
import scala.scalanative.annotation.stub

/** A default L&F implementation of MenuBarUI.  This implementation
 *  is a "combined" view/controller.
 */
class BasicMenuBarUI extends MenuBarUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val changeListener: ChangeListener = ???

    /**  */
    @stub
    protected val containerListener: ContainerListener = ???

    /**  */
    @stub
    protected val menuBar: JMenuBar = ???

    /**  */
    @stub
    protected def createChangeListener(): ChangeListener = ???

    /**  */
    @stub
    protected def createContainerListener(): ContainerListener = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

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

object BasicMenuBarUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
