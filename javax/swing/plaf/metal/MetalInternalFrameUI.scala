package javax.swing.plaf.metal

import java.lang.{Object, String}
import javax.swing.{JComponent, JInternalFrame}
import javax.swing.event.MouseInputAdapter
import javax.swing.plaf.{ComponentUI, InternalFrameUI}
import javax.swing.plaf.basic.BasicInternalFrameUI
import scala.scalanative.annotation.stub

/** Metal implementation of JInternalFrame.
 *  
 */
class MetalInternalFrameUI extends BasicInternalFrameUI {

    /**  */
    @stub
    def this(b: JInternalFrame) = ???

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

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object MetalInternalFrameUI {
    /**  */
    @stub
    protected val IS_PALETTE: String = ???

    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
