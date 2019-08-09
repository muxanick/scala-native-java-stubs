package javax.swing.plaf.basic

import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{JColorChooser, JComponent}
import javax.swing.colorchooser.AbstractColorChooserPanel
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ColorChooserUI, ComponentUI}

/** Provides the basic look and feel for a JColorChooser.
 *  
 */
class BasicColorChooserUI extends ColorChooserUI {

    /** JColorChooser this BasicColorChooserUI is installed on. */
    @stub
    protected val chooser: JColorChooser = ???

    /**  */
    @stub
    protected val defaultChoosers: Array[AbstractColorChooserPanel] = ???

    /**  */
    @stub
    protected val previewListener: ChangeListener = ???

    /**  */
    @stub
    protected def createDefaultChoosers(): Array[AbstractColorChooserPanel] = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /**  */
    @stub
    protected def installPreviewPanel(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaultChoosers(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Removes installed preview panel from the UI delegate. */
    @stub
    protected def uninstallPreviewPanel(): Unit = ???
}

object BasicColorChooserUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
