package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JRootPane}
import javax.swing.plaf.{ComponentUI, RootPaneUI}
import scala.scalanative.annotation.stub

/** Basic implementation of RootPaneUI, there is one shared between all
 *  JRootPane instances.
 */
class BasicRootPaneUI extends RootPaneUI with PropertyChangeListener {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected def installComponents(root: JRootPane): Unit = ???

    /**  */
    @stub
    protected def installDefaults(c: JRootPane): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(root: JRootPane): Unit = ???

    /**  */
    @stub
    protected def installListeners(root: JRootPane): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Invoked when a property changes on the root pane. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(root: JRootPane): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(root: JRootPane): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(root: JRootPane): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(root: JRootPane): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicRootPaneUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
