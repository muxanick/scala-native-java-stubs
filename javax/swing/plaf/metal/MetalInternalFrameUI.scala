package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.{JComponent, JInternalFrame}
import javax.swing.event.MouseInputAdapter
import javax.swing.plaf.{ComponentUI, InternalFrameUI}
import javax.swing.plaf.basic.BasicInternalFrameUI

/** Metal implementation of JInternalFrame.
 *  
 */
class MetalInternalFrameUI extends BasicInternalFrameUI {

    /** Returns the MouseInputAdapter that will be installed
     *  on the TitlePane.
     */
    @stub
    protected def createBorderListener(w: JInternalFrame): MouseInputAdapter = ???

    /**  */
    @stub
    protected def createNorthPane(w: JInternalFrame): JComponent = ???

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
    def setPalette(isPalette: Boolean): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object MetalInternalFrameUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
